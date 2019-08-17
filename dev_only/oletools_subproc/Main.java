package testoletools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        String s = null;
        List<String> output = new ArrayList<String>();

        try {
            Process p = Runtime.getRuntime().exec("olevba -c /home/nico/SourceFu/tests/VBA/obfuscators/JO-Obfuscator/sourcefu_example.docm");
            int exitval = p.waitFor();
            if(exitval !=0) {
            	System.out.println("fail running process");
            	System.exit(2);
            }
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));

            // read the output from the command
            //System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                //System.out.println(s);
                output.add(s);
            }
            
            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            
        }
        catch (IOException | InterruptedException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
        
        for (int i=0;i<5;i++) {
        	output.remove(0);
        }
        
        List<String> toRemove = new ArrayList<String>();
        for(String str:output) {
        	if(str.startsWith("VBA MACRO")) {
        		toRemove.add(str);
        	}
        	if(str.startsWith("in file:")) {
        		toRemove.add(str);
        	}
        	if(str.startsWith("(empty macro)")) {
        		toRemove.add(str);
        	}
        	if(str.startsWith("------------------------------------------------")) {
        		toRemove.add(str);
        	}
        	if(str.startsWith("- - - - - - - - - - - - - - - - - - - - - - - - ")) {
        		toRemove.add(str);
        	}
        }
        
        output.removeAll(toRemove);
        
        System.out.println(String.join(System.getProperty("line.separator"),output));
        
        
    }
	
}
