public enum Season {
    WINTER("I love Winter"),
    SUMMER("I hate summer"),
    MONSOON("Monsoon is ok");

    String msg ;

    Season(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}