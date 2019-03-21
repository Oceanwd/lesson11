package oceanwd.util;

import oceanwd.entity.Note;
import oceanwd.entity.NoteBook;
import oceanwd.entity.NoteType;

import java.util.Date;
import java.util.Random;

public class InMemoryNoteBookProvider implements NoteBookProvider{
    private static InMemoryNoteBookProvider instance;
    private InMemoryNoteBookProvider(){};

    public static InMemoryNoteBookProvider getInstance(){
        if(instance == null){
            instance = new InMemoryNoteBookProvider();
        }
        return instance;
    }

    private NoteBook[] noteBook;

    {
        noteBook = new NoteBook[]{
            new NoteBook(new Note[]{
                new Note("Запись 1", new Date(), NoteType.NOTE),
                new Note("Запись 2", new Date(), NoteType.NOTE)
            }),
            new NoteBook(new Note[]{
                new Note("Запись 3", new Date(), NoteType.NOTE),
                new Note("Запись 4", new Date(), NoteType.NOTE)
            }),
            new NoteBook(new Note[]{
                new Note("Запись 5", new Date(), NoteType.NOTE),
                new Note("Запись 6", new Date(), NoteType.NOTE)
            })
        };
    }

    @Override
    public Note getRandomNote() {
        NoteBook random = getRandomNoteBook();
        int randomNote = new Random().nextInt(random.amountOfNotes());
        return random.getNotes()[randomNote];
    }

    @Override
    public NoteBook getRandomNoteBook() {
        int randomNoteBook = new Random().nextInt(noteBook.length);
        return noteBook[randomNoteBook];
    }

    @Override
    public NoteBook[] getNoteBooks() {
        return noteBook;
    }
}
