package RomaParanin.entity;

import java.util.Date;
import java.util.Objects;

public class Note {

    private String text;
    private Date date;
    private NoteType noteType;

    public Note (String text, Date date, NoteType noteType){
        this.text = text;
        this.date = date;
        this.noteType = noteType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Note other = (Note) obj;
        return text.equals(other.text) && date.equals(other.date) && noteType == other.noteType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, date, noteType);
    }

    @Override
    public String toString() {
        return "Text is: " + text + ". Date is: " + date + ". Type is: " + NoteType.getRusName(noteType);
    }
}
