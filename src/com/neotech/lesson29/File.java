package com.neotech.lesson29;

/*Create a class File that will have the following behaviors: open, edit, close. 
 * Edit and close are implemented method while open is an abstract.*/

public abstract class File {
	
    public abstract void open();

    public void edit() {
        System.out.println("File editing section.");
    }

    public void close() {
        System.out.println("File closing section.");
    }
}

/* Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour */

class JavaFile extends File {

    public void open() {
        System.out.println("Open the .java file using --> Notepad++ or Sublime Text.");
    }
}

class WordFile extends File {

    public void open() {
        System.out.println("Open the .doc file using -->  Microsoft Word.");
    }
}


class PdfFile extends File {

    public void open() {
        System.out.println("Open the .pdf file using --> Adobe Acrobat.");
    }
}
