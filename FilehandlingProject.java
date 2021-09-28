package org;
import java.io.*;
public class FilehandlingProject {
	public static void main(String[] args)  {
		File f = new File("textFile.txt");
		FileWriter fw= null;
		FileReader fr=null;
		  try {
			fw=new FileWriter(f,true);
			fr=new FileReader(f);
			fw.write("This program is to write ,append and to read the files\n");
			fw.flush();
			int ch=fr.read();
			while(ch!=-1) {
				System.out.print((char)ch);
				ch=fr.read();

			}
			System.out.println();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  finally {
			  try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
	
	}
  
}
