package petrik.dev.koczkaBased.util;

public class Quot {
    public String getQuot() throws Exception {
        return generateMessage();
    }
    private String generateMessage() throws Exception {
        //list of messages
        String[] messages = {"alma", "körte", "barack"};
        //random number
        int random = (int) (Math.random() * messages.length);
        //return a random message
        return messages[random];
    }
}
