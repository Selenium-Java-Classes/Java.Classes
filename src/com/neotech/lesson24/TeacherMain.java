package com.neotech.lesson24;

public class TeacherMain {
	
	public static void main(String[] args) {
	       
		MathTeacher mathTeacher = new MathTeacher(60, "Relaxing");
	        mathTeacher.solveProblems();

	        ChemistryTeacher chemistryTeacher = new ChemistryTeacher(30, "Relaxing");
	        chemistryTeacher.annoying();

	        PianoTeacher pianoTeacher = new PianoTeacher(45, "Relaxing");
	        pianoTeacher.playSong();
	        
	    }
	
	
}

