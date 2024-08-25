package com.neotech.lesson24;

public class MathTeacher extends Teacher {


        public MathTeacher(int lessonMinutes, String relax) {
            super("Math", lessonMinutes, relax);
        }

        public void solveProblems() {
            System.out.println("Math teacher is solving practice problems in a fun way.");
        }
    }

