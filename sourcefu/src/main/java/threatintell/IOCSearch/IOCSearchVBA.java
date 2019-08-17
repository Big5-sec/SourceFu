package threatintell.IOCSearch;

import java.util.ArrayList;
import java.util.List;

public class IOCSearchVBA {
	
	List<String> InterestingFunc = new ArrayList<String>();
    /*log_funcs = ["CreateProcessA", "CreateProcessW", ".run", "CreateObject",
                 "Open", ".Open", "GetObject", "Create", ".Create", "Environ",
                 "CreateTextFile", ".CreateTextFile", ".Eval", "Run",
                 "SetExpandedStringValue", "WinExec", "FileExists", "SaveAs",
                 "FileCopy", "Load", "ShellExecute"]*/
	/*
	UTOEXEC_KEYWORDS = {
		    # MS Word:
		    'Runs when the Word document is opened':
		        ('AutoExec', 'AutoOpen', 'DocumentOpen'),
		    'Runs when the Word document is closed':
		        ('AutoExit', 'AutoClose', 'Document_Close', 'DocumentBeforeClose'),
		    'Runs when the Word document is modified':
		        ('DocumentChange',),
		    'Runs when a new Word document is created':
		        ('AutoNew', 'Document_New', 'NewDocument'),

		    # MS Word and Publisher:
		    'Runs when the Word or Publisher document is opened':
		        ('Document_Open',),
		    'Runs when the Publisher document is closed':
		        ('Document_BeforeClose',),

		    # MS Excel:
		    'Runs when the Excel Workbook is opened':
		        ('Auto_Open', 'Workbook_Open', 'Workbook_Activate', 'Auto_Ope'),
		        # TODO: "Auto_Ope" is temporarily here because of a bug in plugin_biff, which misses the last byte in "Auto_Open"...
		    'Runs when the Excel Workbook is closed':
		        ('Auto_Close', 'Workbook_Close'),

		    # any MS Office application:
		    'Runs when the file is opened (using InkPicture ActiveX object)':
		        # ref:https://twitter.com/joe4security/status/770691099988025345
		        (r'\w+_Painted',),
		    'Runs when the file is opened and ActiveX objects trigger events':
		        (r'\w+_(?:GotFocus|LostFocus|MouseHover)',),
		}

		# Suspicious Keywords that may be used by malware
		# See VBA language reference: http://msdn.microsoft.com/en-us/library/office/jj692818%28v=office.15%29.aspx
		SUSPICIOUS_KEYWORDS = {
		    #TODO: use regex to support variable whitespaces
		    'May read system environment variables':
		        ('Environ',),
		    'May open a file':
		        ('Open',),
		    'May write to a file (if combined with Open)':
		    #TODO: regex to find Open+Write on same line
		        ('Write', 'Put', 'Output', 'Print #'),
		    'May read or write a binary file (if combined with Open)':
		    #TODO: regex to find Open+Binary on same line
		        ('Binary',),
		    'May copy a file':
		        ('FileCopy', 'CopyFile'),
		    #FileCopy: http://msdn.microsoft.com/en-us/library/office/gg264390%28v=office.15%29.aspx
		    #CopyFile: http://msdn.microsoft.com/en-us/library/office/gg264089%28v=office.15%29.aspx
		    'May delete a file':
		        ('Kill',),
		    'May create a text file':
		        ('CreateTextFile', 'ADODB.Stream', 'WriteText', 'SaveToFile'),
		    #CreateTextFile: http://msdn.microsoft.com/en-us/library/office/gg264617%28v=office.15%29.aspx
		    #ADODB.Stream sample: http://pastebin.com/Z4TMyuq6
		    # ShellExecute: https://twitter.com/StanHacked/status/1075088449768693762
		    'May run an executable file or a system command':
		        ('Shell', 'vbNormal', 'vbNormalFocus', 'vbHide', 'vbMinimizedFocus', 'vbMaximizedFocus', 'vbNormalNoFocus',
		         'vbMinimizedNoFocus', 'WScript.Shell', 'Run', 'ShellExecute', 'ShellExecuteA', 'shell32'),
		    # MacScript: see https://msdn.microsoft.com/en-us/library/office/gg264812.aspx
		    'May run an executable file or a system command on a Mac':
		        ('MacScript',),
		    'May run an executable file or a system command on a Mac (if combined with libc.dylib)':
		        ('system', 'popen', r'exec[lv][ep]?'),
		    #Shell: http://msdn.microsoft.com/en-us/library/office/gg278437%28v=office.15%29.aspx
		    #WScript.Shell+Run sample: http://pastebin.com/Z4TMyuq6
		    'May run PowerShell commands':
		    #sample: https://malwr.com/analysis/M2NjZWNmMjA0YjVjNGVhYmJlZmFhNWY4NmQxZDllZTY/
		    #also: https://bitbucket.org/decalage/oletools/issues/14/olevba-library-update-ioc
		    # ref: https://blog.netspi.com/15-ways-to-bypass-the-powershell-execution-policy/
		    # TODO: add support for keywords starting with a non-alpha character, such as "-noexit"
		    # TODO: '-command', '-EncodedCommand', '-scriptblock'
		        ('PowerShell', 'noexit', 'ExecutionPolicy', 'noprofile', 'command', 'EncodedCommand',
		         'invoke-command', 'scriptblock', 'Invoke-Expression', 'AuthorizationManager'),
		    'May run an executable file or a system command using PowerShell':
		        ('Start-Process',),
		    'May run an executable file or a system command using Excel 4 Macros (XLM/XLF)':
		        ('EXEC',),
		    'May hide the application':
		        ('Application.Visible', 'ShowWindow', 'SW_HIDE'),
		    'May create a directory':
		        ('MkDir',),
		    'May save the current workbook':
		        ('ActiveWorkbook.SaveAs',),
		    'May change which directory contains files to open at startup':
		    #TODO: confirm the actual effect
		        ('Application.AltStartupPath',),
		    'May create an OLE object':
		        ('CreateObject',),
		    'May create an OLE object using PowerShell':
		        ('New-Object',),
		    'May run an application (if combined with CreateObject)':
		        ('Shell.Application',),
		    'May run an Excel 4 Macro (aka XLM/XLF)':
		        ('ExecuteExcel4Macro',),
		    'May enumerate application windows (if combined with Shell.Application object)':
		        ('Windows', 'FindWindow'),
		    'May run code from a DLL':
		    #TODO: regex to find declare+lib on same line - see mraptor
		        ('Lib',),
		    'May run code from a library on a Mac':
		    #TODO: regex to find declare+lib on same line - see mraptor
		        ('libc.dylib', 'dylib'),
		    'May run code from a DLL using Excel 4 Macros (XLM/XLF)':
		        ('REGISTER',),
		    'May inject code into another process':
		        ('CreateThread', 'CreateUserThread', 'VirtualAlloc', # (issue #9) suggested by Davy Douhine - used by MSF payload
		        'VirtualAllocEx', 'RtlMoveMemory', 'WriteProcessMemory',
		        'SetContextThread', 'QueueApcThread', 'WriteVirtualMemory', 'VirtualProtect'
		        ),
		    'May run a shellcode in memory':
		        ('EnumSystemLanguageGroupsW?', # Used by Hancitor in Oct 2016
		         'EnumDateFormats(?:W|(?:Ex){1,2})?'), # see https://msdn.microsoft.com/en-us/library/windows/desktop/dd317810(v=vs.85).aspx
		    'May download files from the Internet':
		    #TODO: regex to find urlmon+URLDownloadToFileA on same line
		        ('URLDownloadToFileA', 'Msxml2.XMLHTTP', 'Microsoft.XMLHTTP',
		         'MSXML2.ServerXMLHTTP', # suggested in issue #13
		         'User-Agent', # sample from @ozhermit: http://pastebin.com/MPc3iV6z
		        ),
		    'May download files from the Internet using PowerShell':
		    #sample: https://malwr.com/analysis/M2NjZWNmMjA0YjVjNGVhYmJlZmFhNWY4NmQxZDllZTY/
		        ('Net.WebClient', 'DownloadFile', 'DownloadString'),
		    'May control another application by simulating user keystrokes':
		        ('SendKeys', 'AppActivate'),
		    #SendKeys: http://msdn.microsoft.com/en-us/library/office/gg278655%28v=office.15%29.aspx
		    'May attempt to obfuscate malicious function calls':
		        ('CallByName',),
		    #CallByName: http://msdn.microsoft.com/en-us/library/office/gg278760%28v=office.15%29.aspx
		    'May attempt to obfuscate specific strings (use option --deobf to deobfuscate)':
		    #TODO: regex to find several Chr*, not just one
		        ('Chr', 'ChrB', 'ChrW', 'StrReverse', 'Xor'),
		    #Chr: http://msdn.microsoft.com/en-us/library/office/gg264465%28v=office.15%29.aspx
		    'May read or write registry keys':
		    #sample: https://malwr.com/analysis/M2NjZWNmMjA0YjVjNGVhYmJlZmFhNWY4NmQxZDllZTY/
		        ('RegOpenKeyExA', 'RegOpenKeyEx', 'RegCloseKey'),
		    'May read registry keys':
		    #sample: https://malwr.com/analysis/M2NjZWNmMjA0YjVjNGVhYmJlZmFhNWY4NmQxZDllZTY/
		        ('RegQueryValueExA', 'RegQueryValueEx',
		         'RegRead',  #with Wscript.Shell
		        ),
		    'May detect virtualization':
		    # sample: https://malwr.com/analysis/M2NjZWNmMjA0YjVjNGVhYmJlZmFhNWY4NmQxZDllZTY/
		        (r'SYSTEM\ControlSet001\Services\Disk\Enum', 'VIRTUAL', 'VMWARE', 'VBOX'),
		    'May detect Anubis Sandbox':
		    # sample: https://malwr.com/analysis/M2NjZWNmMjA0YjVjNGVhYmJlZmFhNWY4NmQxZDllZTY/
		    # NOTES: this sample also checks App.EXEName but that seems to be a bug, it works in VB6 but not in VBA
		    # ref: http://www.syssec-project.eu/m/page-media/3/disarm-raid11.pdf
		        ('GetVolumeInformationA', 'GetVolumeInformation',  # with kernel32.dll
		         '1824245000', r'HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\ProductId',
		         '76487-337-8429955-22614', 'andy', 'sample', r'C:\exec\exec.exe', 'popupkiller'
		        ),
		    'May detect Sandboxie':
		    # sample: https://malwr.com/analysis/M2NjZWNmMjA0YjVjNGVhYmJlZmFhNWY4NmQxZDllZTY/
		    # ref: http://www.cplusplus.com/forum/windows/96874/
		        ('SbieDll.dll', 'SandboxieControlWndClass'),
		    'May detect Sunbelt Sandbox':
		    # ref: http://www.cplusplus.com/forum/windows/96874/
		        (r'C:\file.exe',),
		    'May detect Norman Sandbox':
		    # ref: http://www.cplusplus.com/forum/windows/96874/
		        ('currentuser',),
		    'May detect CW Sandbox':
		    # ref: http://www.cplusplus.com/forum/windows/96874/
		        ('Schmidti',),
		    'May detect WinJail Sandbox':
		    # ref: http://www.cplusplus.com/forum/windows/96874/
		        ('Afx:400000:0',),
		    'May attempt to disable VBA macro security and Protected View':
		    # ref: http://blog.trendmicro.com/trendlabs-security-intelligence/qkg-filecoder-self-replicating-document-encrypting-ransomware/
		    # ref: https://thehackernews.com/2017/11/ms-office-macro-malware.html
		        ('AccessVBOM', 'VBAWarnings', 'ProtectedView', 'DisableAttachementsInPV', 'DisableInternetFilesInPV',
		         'DisableUnsafeLocationsInPV', 'blockcontentexecutionfrominternet'),
		    'May attempt to modify the VBA code (self-modification)':
		        ('VBProject', 'VBComponents', 'CodeModule', 'AddFromString'),
		}

		# Suspicious Keywords to be searched for directly as strings, without regex
		SUSPICIOUS_KEYWORDS_NOREGEX = {
		    'May use special characters such as backspace to obfuscate code when printed on the console':
		        ('\b',),
		}

		# Regular Expression for a URL:
		# http://en.wikipedia.org/wiki/Uniform_resource_locator
		# http://www.w3.org/Addressing/URL/uri-spec.html
		#TODO: also support username:password@server
		#TODO: other protocols (file, gopher, wais, ...?)
		SCHEME = r'\b(?:http|ftp)s?'
		# see http://en.wikipedia.org/wiki/List_of_Internet_top-level_domains
		TLD = r'(?:xn--[a-zA-Z0-9]{4,20}|[a-zA-Z]{2,20})'
		DNS_NAME = r'(?:[a-zA-Z0-9\-\.]+\.' + TLD + ')'
		#TODO: IPv6 - see https://www.debuggex.com/
		# A literal numeric IPv6 address may be given, but must be enclosed in [ ] e.g. [db8:0cec::99:123a]
		NUMBER_0_255 = r'(?:25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])'
		IPv4 = r'(?:' + NUMBER_0_255 + r'\.){3}' + NUMBER_0_255
		# IPv4 must come before the DNS name because it is more specific
		SERVER = r'(?:' + IPv4 + '|' + DNS_NAME + ')'
		PORT = r'(?:\:[0-9]{1,5})?'
		SERVER_PORT = SERVER + PORT
		URL_PATH = r'(?:/[a-zA-Z0-9\-\._\?\,\'/\\\+&%\$#\=~]*)?'  # [^\.\,\)\(\s"]
		URL_RE = SCHEME + r'\://' + SERVER_PORT + URL_PATH
		re_url = re.compile(URL_RE)


		# Patterns to be extracted (IP addresses, URLs, etc)
		# From patterns.py in balbuzard
		RE_PATTERNS = (
		    ('URL', re.compile(URL_RE)),
		    ('IPv4 address', re.compile(IPv4)),
		    # TODO: add IPv6
		    ('E-mail address', re.compile(r'(?i)\b[A-Z0-9._%+-]+@' + SERVER + '\b')),
		    # ('Domain name', re.compile(r'(?=^.{1,254}$)(^(?:(?!\d+\.|-)[a-zA-Z0-9_\-]{1,63}(?<!-)\.?)+(?:[a-zA-Z]{2,})$)')),
		    # Executable file name with known extensions (except .com which is present in many URLs, and .application):
		    ("Executable file name", re.compile(
		        r"(?i)\b\w+\.(EXE|PIF|GADGET|MSI|MSP|MSC|VBS|VBE|VB|JSE|JS|WSF|WSC|WSH|WS|BAT|CMD|DLL|SCR|HTA|CPL|CLASS|JAR|PS1XML|PS1|PS2XML|PS2|PSC1|PSC2|SCF|LNK|INF|REG)\b")),
		    # Sources: http://www.howtogeek.com/137270/50-file-extensions-that-are-potentially-dangerous-on-windows/
		    # TODO: https://support.office.com/en-us/article/Blocked-attachments-in-Outlook-3811cddc-17c3-4279-a30c-060ba0207372#__attachment_file_types
		    # TODO: add win & unix file paths
		    #('Hex string', re.compile(r'(?:[0-9A-Fa-f]{2}){4,}')),
		)

		# regex to detect strings encoded in hexadecimal
		re_hex_string = re.compile(r'(?:[0-9A-Fa-f]{2}){4,}')

		# regex to detect strings encoded in base64
		#re_base64_string = re.compile(r'"(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?"')
		# better version from balbuzard, less false positives:
		# (plain version without double quotes, used also below in quoted_base64_string)
		BASE64_RE = r'(?:[A-Za-z0-9+/]{4}){1,}(?:[A-Za-z0-9+/]{2}[AEIMQUYcgkosw048]=|[A-Za-z0-9+/][AQgw]==)?'
		re_base64_string = re.compile('"' + BASE64_RE + '"')
		# white list of common strings matching the base64 regex, but which are not base64 strings (all lowercase):
		BASE64_WHITELIST = set(['thisdocument', 'thisworkbook', 'test', 'temp', 'http', 'open', 'exit'])

		# regex to detect strings encoded with a specific Dridex algorithm
		# (see https://github.com/JamesHabben/MalwareStuff)
		re_dridex_string = re.compile(r'"[0-9A-Za-z]{20,}"')
		# regex to check that it is not just a hex string:
		re_nothex_check = re.compile(r'[G-Zg-z]')

		# regex to extract printable strings (at least 5 chars) from VBA Forms:
		# (must be bytes for Python 3)
		re_printable_string = re.compile(b'[\\t\\r\\n\\x20-\\xFF]{5,}')
*/

}
