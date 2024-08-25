package com.neotech.lesson24;

public class ChemistryTeacher extends Teacher {
	

        public ChemistryTeacher(int lessonMinutes, String relax) {
            super("Chemistry", lessonMinutes, relax);
        }

        public void annoying() {
            System.out.println("Chemistry teachers can be annoying!!");
        }
    }


