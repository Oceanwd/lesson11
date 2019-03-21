package RomaParanin.util;

import RomaParanin.entity.Note;
import RomaParanin.entity.NoteBook;

public abstract class NoteBookView {
    public abstract void print(Note note);

    public static void print(Note... notes){
        for(Note note : notes){
            System.out.println(note.toString());
        }
    }

    public static void print(NoteBook noteBook){
        System.out.println(noteBook.toString());
    }

    public static void print(NoteBook[] noteBooks){
        for(NoteBook noteBook : noteBooks){
            System.out.println(noteBook.toString());
        }
    }
}
