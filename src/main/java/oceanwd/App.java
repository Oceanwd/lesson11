package oceanwd;

import oceanwd.util.NoteBookConsoleView;
import oceanwd.util.NoteBookProvider;

public class App 
{
    public static void main( String[] args )
    {
        NoteBookProvider instance = NoteBookProvider.getInstance();

        System.out.println("- Случайная запись -");
        NoteBookConsoleView.print(instance.getRandomNote());

        System.out.println("- Несколько случайных записей -");
        NoteBookConsoleView.print(instance.getRandomNote(), instance.getRandomNote(), instance.getRandomNote());

        System.out.println("- Случайный блокнот -");
        NoteBookConsoleView.print(instance.getRandomNoteBook());

        System.out.println("- Все блокноты -");
        NoteBookConsoleView.print(instance.getNoteBooks());
    }
}
