package petrik.dev.koczkaBased.util;

public class Quot {
    String[] messages = {"Soha ne feled el levédeni a telnet portodat!!", "Tudja az üvegbeton életett is menthet!", "Ha valaha is gondot okoz a relé müködése csak gondoljon a teknősőkre!"};
    public String getQuot() throws Exception {
        return generateMessage();
    }
    private String generateMessage() throws Exception {
        //random number
        int random = (int) (Math.random() * this.messages.length);
        //return a random message
        return this.messages[random];
    }
}
