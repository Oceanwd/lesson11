package RomaParanin.util;

public class CrazyLogger {
    private static CrazyLogger instance;
    private final StringBuilder logger = new StringBuilder();
    private DateSetter dateSetter = DateSetter.getDateSetterInstance();


    private CrazyLogger(){}

    public static CrazyLogger getInstance(){
        if(instance == null){
            instance = new CrazyLogger();
        }
        return instance;
    }

    public void addMessage(String message){
        logger.append(dateSetter.getDate()).append("/n").append("Message is: ").append(message).append("/n");
    }

    public void findSuitableMessage (String partOfMessage){
        String[] strings = logger.toString().split("/n");
        if(logger.length() < 0) System.out.println("empty log");
        for(String string : strings) {
            if(string.contains(partOfMessage)) {
                System.out.println(string);
            }
        }
    }

    public void viewAllMessages(){
        for(String message : logger.toString().split("/n")){
            System.out.println(message);
        }
    }


}
