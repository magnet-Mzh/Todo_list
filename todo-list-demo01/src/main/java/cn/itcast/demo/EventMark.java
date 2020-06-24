package cn.itcast.demo;

public class EventMark {
    private  String  thing;
    private  boolean unfinshed;

    public EventMark() {

    }

    public EventMark(String thing, boolean unfinshed) {
        this.thing = thing;
        this.unfinshed = unfinshed;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public boolean isUnfinshed() {
        return unfinshed;
    }

    public void setUnfinshed(boolean unfinshed) {
        this.unfinshed = unfinshed;
    }
}
