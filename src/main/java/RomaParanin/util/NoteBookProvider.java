package RomaParanin.util;

import RomaParanin.entity.Note;
import RomaParanin.entity.NoteBook;

public interface NoteBookProvider {
    NoteBook getRandomNoteBook();
    Note getRandomNote();
    NoteBook[] getNoteBooks();
}
