package sourcefu.lib;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Printing {

	public void printSidebySide(String s1, String s2) {
		String[] lines1 = s1.split("\n");
		String[] lines2 = s2.split("\n");
		
		if(lines1.length > lines2.length) {
			for(int i=0;i<lines2.length;i++) {
				System.out.printf("%-70.70s    ||    %-70.70s\n",lines1[i].replace("\t", "  "),lines2[i].replace("\t","  "));
			}
			for(int j=0;j<lines1.length-lines2.length;j++) {
				System.out.printf("%-70.70s    ||    %-70.70s\n",lines1[lines2.length+j].replace("\t", "  ")," ");
			}
		}else if(lines2.length > lines1.length) {
			for(int i=0;i<lines1.length;i++) {
				System.out.printf("%-70.70s    ||    %-70.70s\n",lines1[i].replace("\t", "  "),lines2[i].replace("\t","  "));
			}
			for(int j=0;j<lines2.length-lines1.length;j++) {
				System.out.printf("%-70.70s    ||    %-70.70s\n"," ",lines2[lines1.length+j].replace("\t","  "));
			}
		}else {
			for(int i=0;i<lines1.length;i++) {
				System.out.printf("%-70.70s    ||    %-70.70s\n",lines1[i].replace("\t", "  "),lines2[i].replace("\t","  "));
			}
		}
	}
	
	public void printToFile(String data, String path) {
		byte[] datab = data.getBytes(Charset.forName("UTF-8"));
		Path filePath = Paths.get(path);
		try {
			Files.write(filePath, datab);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
