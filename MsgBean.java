public class MsgBean {
    private String msg;
    private String nickName;

    public MsgBean() {
    }

    public MsgBean(String nickName, String msg) {
        this.nickName = nickName;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
