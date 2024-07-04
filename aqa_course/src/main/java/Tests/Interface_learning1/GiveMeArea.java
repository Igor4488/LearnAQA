package Tests.Interface_learning1;

public class GiveMeArea {
    private HasArea hasArea;

    public GiveMeArea (HasArea hasArea){
        this.hasArea = hasArea;
    }
    public void ar(CircleArea circleArea){
        hasArea.getMyArea();
    };

}
