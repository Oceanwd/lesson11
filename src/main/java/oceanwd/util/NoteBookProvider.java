package oceanwd.util;

import oceanwd.entity.Note;
import oceanwd.entity.NoteBook;

import java.util.Date;
import java.util.Random;

public class NoteBookProvider {
    private static NoteBookProvider instance;


    private NoteBookProvider() {}

    public static NoteBookProvider getInstance() {
        if (instance == null) {
            instance = new NoteBookProvider();
        }
        return instance;
    }

    private NoteBook[] noteBook;

    {
        noteBook = new NoteBook[] {
            new NoteBook (new Note[] {
                new Note("Запись 1", new Date()),
                new Note("Запись 2", new Date())
            }),
            new NoteBook (new Note[] {
                new Note("Запись 3", new Date()),
                new Note("Запись 4", new Date())
            }),
            new NoteBook (new Note[]{
                new Note("Запись 5", new Date()),
                new Note("Запись 6", new Date())
            })
        };
    }

    public Note getRandomNote(){
        NoteBook random = getRandomNoteBook();
        int randomNote = new Random().nextInt(random.amountOfNotes());
        return random.getNotes()[randomNote];
    }

    public NoteBook getRandomNoteBook(){
        int randomNoteBook = new Random().nextInt(noteBook.length);
        return noteBook[randomNoteBook];
    }

    public NoteBook[] getNoteBooks(){
        return noteBook;
    }
}
