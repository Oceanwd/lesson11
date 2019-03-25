package RomaParanin;

import RomaParanin.entity.Note;
import RomaParanin.util.CrazyLogger;
import RomaParanin.util.InMemoryNoteBookProvider;
import RomaParanin.util.NoteBookView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args )throws IOException {

        InMemoryNoteBookProvider instance = InMemoryNoteBookProvider.getInstance();
        CrazyLogger logger = CrazyLogger.getInstance();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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

        System.out.println();
        logger.addMessage("первое добавленное сообщение");
        logger.addMessage("второе добавленное сообщение");
        logger.addMessage("третье добавленное сообщение");

        System.out.println("- Вывод всех сообщений-");
        logger.viewAllMessages();
        System.out.println();

        System.out.println("- Введите критерий поиска -");
        logger.findSuitableMessage(reader.readLine());
    }
}
