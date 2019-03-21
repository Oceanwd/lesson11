package RomaParanin;

import RomaParanin.entity.Note;
import RomaParanin.util.InMemoryNoteBookProvider;
import RomaParanin.util.NoteBookView;

public class App 
{
    public static void main( String[] args )
    {
        InMemoryNoteBookProvider instance = InMemoryNoteBookProvider.getInstance();
        NoteBookView NBV = new NoteBookView() {
            public void print(Note note) {
                System.out.println(note.toString());
            }
        };

        System.out.println("- Случайная запись -");
        NBV.print(instance.getRandomNote());

        System.out.println("- Несколько случайных записей -");
        NBV.print(instance.getRandomNote(), instance.getRandomNote(), instance.getRandomNote());

        System.out.println("- Случайный блокнот -");
        NBV.print(instance.getRandomNoteBook());

        System.out.println("- Все блокноты -");
        NBV.print(instance.getNoteBooks());
    }
}
