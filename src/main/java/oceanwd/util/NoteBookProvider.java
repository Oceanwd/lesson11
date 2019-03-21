package oceanwd.util;

import oceanwd.entity.Note;
import oceanwd.entity.NoteBook;

public interface NoteBookProvider {
    NoteBook getRandomNoteBook();
    Note getRandomNote();
    NoteBook[] getNoteBooks();
}
