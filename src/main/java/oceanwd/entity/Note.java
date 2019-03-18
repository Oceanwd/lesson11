package oceanwd.entity;

import java.util.Date;
import java.util.Objects;


public class Note {

    private String text;
    private Date date;

    public Note (String text, Date date){
        this.text = text;
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Note other = (Note) obj;
        return text.equals(other.text) && date.equals(other.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, date);
    }

    @Override
    public String toString() {
        return "Text is: " + text + ". Date is: " + date;
    }
}
