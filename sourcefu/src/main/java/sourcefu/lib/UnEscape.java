package sourcefu.lib;

public class UnEscape {
	/*
	 *
	 * unescape_perl_string()
	 *
	 *      Tom Christiansen <tchrist@perl.com>
	 *      Sun Nov 28 12:55:24 MST 2010
	 *
	 * It's completely ridiculous that there's no standard
	 * unescape_java_string function.  Since I have to do the
	 * damn thing myself, I might as well make it halfway useful
	 * by supporting things Java was too stupid to consider in
	 * strings:
	 * 
	 *   => "?" items  are additions to Java string escapes
	 *                 but normal in Java regexes
	 *
	 *   => "!" items  are also additions to Java regex escapes
	 *   
	 * Standard singletons: ?\a ?\e \f \n \r \t
	 * 
	 *      NB: \b is unsupported as backspace so it can pass-through
	 *          to the regex translator untouched; I refuse to make anyone
	 *          doublebackslash it as doublebackslashing is a Java idiocy
	 *          I desperately wish would die out.  There are plenty of
	 *          other ways to write it:
	 *
	 *              \cH, \12, \012, \x08 \x{8}, \u0008, \U00000008
	 *
	 * Octal escapes: \0 \0N \0NN \N \NN \NNN
	 *    Can range up to !\777 not \377
	 *    
	 *      TODO: add !\o{NNNNN}
	 *          last Unicode is 4177777
	 *          maxint is 37777777777
	 *
	 * Control chars: ?\cX
	 *      Means: ord(X) ^ ord('@')
	 *
	 * Old hex escapes: \xXX
	 *      unbraced must be 2 xdigits
	 *
	 * Perl hex escapes: !\x{XXX} braced may be 1-8 xdigits
	 *       NB: proper Unicode never needs more than 6, as highest
	 *           valid codepoint is 0x10FFFF, not maxint 0xFFFFFFFF
	 *
	 * Lame Java escape: \[IDIOT JAVA PREPROCESSOR]uXXXX must be
	 *                   exactly 4 xdigits;
	 *
	 *       I can't write XXXX in this comment where it belongs
	 *       because the damned Java Preprocessor can't mind its
	 *       own business.  Idiots!
	 *
	 * Lame Python escape: !\UXXXXXXXX must be exactly 8 xdigits
	 * 
	 * TODO: Perl translation escapes: \Q \U \L \E \[IDIOT JAVA PREPROCESSOR]u \l
	 *       These are not so important to cover if you're passing the
	 *       result to Pattern.compile(), since it handles them for you
	 *       further downstream.  Hm, what about \[IDIOT JAVA PREPROCESSOR]u?
	 *
	 */

	public final static
	String unescape_perl_string(String oldstr) {

	    /*
	     * In contrast to fixing Java's broken regex charclasses,
	     * this one need be no bigger, as unescaping shrinks the string
	     * here, where in the other one, it grows it.
	     */

	    StringBuffer newstr = new StringBuffer(oldstr.length());

	    boolean saw_backslash = false;

	    for (int i = 0; i < oldstr.length(); i++) {
	        int cp = oldstr.codePointAt(i);
	        if (oldstr.codePointAt(i) > Character.MAX_VALUE) {
	            i++; /****WE HATES UTF-16! WE HATES IT FOREVERSES!!!****/
	        }

	        if (!saw_backslash) {
	            if (cp == '\\') {
	                saw_backslash = true;
	            } else {
	                newstr.append(Character.toChars(cp));
	            }
	            continue; /* switch */
	        }

	        if (cp == '\\') {
	            saw_backslash = false;
	            newstr.append('\\');
	            newstr.append('\\');
	            continue; /* switch */
	        }

	        switch (cp) {

	            case 'r':  newstr.append('\r');
	                       break; /* switch */

	            case 'n':  newstr.append('\n');
	                       break; /* switch */

	            case 'f':  newstr.append('\f');
	                       break; /* switch */

	            /* PASS a \b THROUGH!! */
	            case 'b':  newstr.append("\\b");
	                       break; /* switch */

	            case 't':  newstr.append('\t');
	                       break; /* switch */

	            case 'a':  newstr.append('\007');
	                       break; /* switch */

	            case 'e':  newstr.append('\033');
	                       break; /* switch */

	            /*
	             * A "control" character is what you get when you xor its
	             * codepoint with '@'==64.  This only makes sense for ASCII,
	             * and may not yield a "control" character after all.
	             *
	             * Strange but true: "\c{" is ";", "\c}" is "=", etc.
	             */
	            case 'c':   {
	                if (++i == oldstr.length()) { die("trailing \\c"); }
	                cp = oldstr.codePointAt(i);
	                /*
	                 * don't need to grok surrogates, as next line blows them up
	                 */
	                if (cp > 0x7f) { die("expected ASCII after \\c"); }
	                newstr.append(Character.toChars(cp ^ 64));
	                break; /* switch */
	            }

	            case '8':
	            case '9': die("illegal octal digit");
	                      /* NOTREACHED */

	    /*
	     * may be 0 to 2 octal digits following this one
	     * so back up one for fallthrough to next case;
	     * unread this digit and fall through to next case.
	     */
	            case '1':
	            case '2':
	            case '3':
	            case '4':
	            case '5':
	            case '6':
	            case '7': --i;
	                      /* FALLTHROUGH */

	            /*
	             * Can have 0, 1, or 2 octal digits following a 0
	             * this permits larger values than octal 377, up to
	             * octal 777.
	             */
	            case '0': {
	                if (i+1 == oldstr.length()) {
	                    /* found \0 at end of string */
	                    newstr.append(Character.toChars(0));
	                    break; /* switch */
	                }
	                i++;
	                int digits = 0;
	                int j;
	                for (j = 0; j <= 2; j++) {
	                    if (i+j == oldstr.length()) {
	                        break; /* for */
	                    }
	                    /* safe because will unread surrogate */
	                    int ch = oldstr.charAt(i+j);
	                    if (ch < '0' || ch > '7') {
	                        break; /* for */
	                    }
	                    digits++;
	                }
	                if (digits == 0) {
	                    --i;
	                    newstr.append('\0');
	                    break; /* switch */
	                }
	                int value = 0;
	                try {
	                    value = Integer.parseInt(
	                                oldstr.substring(i, i+digits), 8);
	                } catch (NumberFormatException nfe) {
	                    die("invalid octal value for \\0 escape");
	                }
	                newstr.append(Character.toChars(value));
	                i += digits-1;
	                break; /* switch */
	            } /* end case '0' */

	            case 'x':  {
	                if (i+2 > oldstr.length()) {
	                    die("string too short for \\x escape");
	                }
	                i++;
	                boolean saw_brace = false;
	                if (oldstr.charAt(i) == '{') {
	                        /* ^^^^^^ ok to ignore surrogates here */
	                    i++;
	                    saw_brace = true;
	                }
	                int j;
	                for (j = 0; j < 8; j++) {

	                    if (!saw_brace && j == 2) {
	                        break;  /* for */
	                    }

	                    /*
	                     * ASCII test also catches surrogates
	                     */
	                    int ch = oldstr.charAt(i+j);
	                    if (ch > 127) {
	                        die("illegal non-ASCII hex digit in \\x escape");
	                    }

	                    if (saw_brace && ch == '}') { break; /* for */ }

	                    if (! ( (ch >= '0' && ch <= '9')
	                                ||
	                            (ch >= 'a' && ch <= 'f')
	                                ||
	                            (ch >= 'A' && ch <= 'F')
	                          )
	                       )
	                    {
	                        die(String.format(
	                            "illegal hex digit #%d '%c' in \\x", ch, ch));
	                    }

	                }
	                if (j == 0) { die("empty braces in \\x{} escape"); }
	                int value = 0;
	                try {
	                    value = Integer.parseInt(oldstr.substring(i, i+j), 16);
	                } catch (NumberFormatException nfe) {
	                    die("invalid hex value for \\x escape");
	                }
	                newstr.append(Character.toChars(value));
	                if (saw_brace) { j++; }
	                i += j-1;
	                break; /* switch */
	            }

	            case 'u': {
	                if (i+4 > oldstr.length()) {
	                    die("string too short for \\u escape");
	                }
	                i++;
	                int j;
	                for (j = 0; j < 4; j++) {
	                    /* this also handles the surrogate issue */
	                    if (oldstr.charAt(i+j) > 127) {
	                        die("illegal non-ASCII hex digit in \\u escape");
	                    }
	                }
	                int value = 0;
	                try {
	                    value = Integer.parseInt( oldstr.substring(i, i+j), 16);
	                } catch (NumberFormatException nfe) {
	                    die("invalid hex value for \\u escape");
	                }
	                newstr.append(Character.toChars(value));
	                i += j-1;
	                break; /* switch */
	            }

	            case 'U': {
	                if (i+8 > oldstr.length()) {
	                    die("string too short for \\U escape");
	                }
	                i++;
	                int j;
	                for (j = 0; j < 8; j++) {
	                    /* this also handles the surrogate issue */
	                    if (oldstr.charAt(i+j) > 127) {
	                        die("illegal non-ASCII hex digit in \\U escape");
	                    }
	                }
	                int value = 0;
	                try {
	                    value = Integer.parseInt(oldstr.substring(i, i+j), 16);
	                } catch (NumberFormatException nfe) {
	                    die("invalid hex value for \\U escape");
	                }
	                newstr.append(Character.toChars(value));
	                i += j-1;
	                break; /* switch */
	            }

	            default:   newstr.append('\\');
	                       newstr.append(Character.toChars(cp));
	           /*
	            * say(String.format(
	            *       "DEFAULT unrecognized escape %c passed through",
	            *       cp));
	            */
	                       break; /* switch */

	        }
	        saw_backslash = false;
	    }

	    /* weird to leave one at the end */
	    if (saw_backslash) {
	        newstr.append('\\');
	    }

	    return newstr.toString();
	}

	/*
	 * Return a string "U+XX.XXX.XXXX" etc, where each XX set is the
	 * xdigits of the logical Unicode code point. No bloody brain-damaged
	 * UTF-16 surrogate crap, just true logical characters.
	 */
	 public final static
	 String uniplus(String s) {
	     if (s.length() == 0) {
	         return "";
	     }
	     /* This is just the minimum; sb will grow as needed. */
	     StringBuffer sb = new StringBuffer(2 + 3 * s.length());
	     sb.append("U+");
	     for (int i = 0; i < s.length(); i++) {
	         sb.append(String.format("%X", s.codePointAt(i)));
	         if (s.codePointAt(i) > Character.MAX_VALUE) {
	             i++; /****WE HATES UTF-16! WE HATES IT FOREVERSES!!!****/
	         }
	         if (i+1 < s.length()) {
	             sb.append(".");
	         }
	     }
	     return sb.toString();
	 }

	 private static final
	 void die(String foa) {
	     throw new IllegalArgumentException(foa);
	 }

	 private static final
	 void say(String what) {
	     System.out.println(what);
	 }
}
