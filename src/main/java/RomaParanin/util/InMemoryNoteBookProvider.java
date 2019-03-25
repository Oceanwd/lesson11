package RomaParanin.util;

import RomaParanin.entity.Note;
import RomaParanin.entity.NoteBook;
import RomaParanin.entity.NoteType;

import java.util.Random;

public class InMemoryNoteBookProvider implements NoteBookProvider{
    private static InMemoryNoteBookProvider instance;
    DateSetter date = DateSetter.getDateSetterInstance();
    private InMemoryNoteBookProvider(){}

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
                new Note("Запись 1", date.getDate(), NoteType.NOTE),
                new Note("Запись 2", date.getDate(), NoteType.NOTE)
            }),
            new NoteBook(new Note[]{
                new Note("Запись 3", date.getDate(), NoteType.NOTE),
                new Note("Запись 4", date.getDate(), NoteType.NOTE)
            }),
            new NoteBook(new Note[]{
                new Note("Запись 5", date.getDate(), NoteType.NOTE),
                new Note("Запись 6", date.getDate(), NoteType.NOTE)
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
