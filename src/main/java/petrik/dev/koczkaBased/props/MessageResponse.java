package petrik.dev.koczkaBased.props;

// Egy egyszerű POJO osztály az üzenet számára
public class MessageResponse {
    private String msg;

    public MessageResponse(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}