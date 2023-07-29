package petrik.dev.koczkaBased.util;

public class Quot {

    //constructor needed for later implementation of multiple teachers

    String[] messages = {"Soha ne feled el levédeni a telnet portodat!!", "Tudja az üvegbeton életett is menthet!", "Ha valaha is gondot okoz a relé müködése csak gondoljon a teknősőkre!", "Aki almát eszik az egészséges marad! Ezt jegyezze meg!", "Egy kis áramkör is lehet hibás, ha hülye aki csinálja,", "Okoskák inkább csöndbe maradjanak!", "Ne feledjék amit holnap el tudnak halasztani azon ma nem éri meg gondolkodni!"};
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
