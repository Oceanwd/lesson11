package RomaParanin.entity;

import java.util.Arrays;

public class NoteBook {

    private Note[] notes;

    public NoteBook (Note[] notes){
        this.notes = notes;
    }

    public Note[] getNotes() {
        return notes;
    }

    public int amountOfNotes() {
        return notes.length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        NoteBook other = (NoteBook) obj;
        return Arrays.equals(notes, other.notes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(notes);
    }

    @Override
    public String toString() {
        return "Notes are: " + Arrays.toString(notes);
    }
}