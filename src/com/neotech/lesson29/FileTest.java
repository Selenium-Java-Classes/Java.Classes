package com.neotech.lesson29;

public class FileTest {
	
	public static void main(String[] args) {
		
		File [] files = {new JavaFile(), new WordFile(), new PdfFile()};
		
		for(File f : files) {
			f.close();
			f.edit();
			f.open();
			System.out.println();
		}
		
	}

}
