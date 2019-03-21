package oceanwd.entity;

public enum NoteType {
    NOTE,
    TASK;

    public static String getRusName(NoteType noteType){
        String type = " ";
        if(noteType == NOTE) {
            type = ("Запись");
        }
        else {
            type = ("Задача");
            }
        return type;
    }
}
