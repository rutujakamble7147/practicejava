
enum Direction {
    NORTH("I can see Sun."),
    SOUTH("I can still see Sun"),
    WEST("Sun sets in West."),
    EAST("Sun rises from East.");

    //instance variable
    String msg;

    Direction(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}