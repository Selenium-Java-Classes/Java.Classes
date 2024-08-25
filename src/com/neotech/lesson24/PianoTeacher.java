package com.neotech.lesson24;

public class PianoTeacher extends Teacher {

        public PianoTeacher(int lessonMinutes, String relax) {
            super("Piano", lessonMinutes, relax);
        }

        public void playSong() {
            System.out.println("Piano teacher is playing songs with her all emotions.");
        }
    }


