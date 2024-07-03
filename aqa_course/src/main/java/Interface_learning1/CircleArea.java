package Interface_learning1;

import java.util.Objects;

public class CircleArea implements HasArea{

    private float pi = 3.1415f;
    private float circleArea;
    private float r;

    public CircleArea(float r){
        this.circleArea = circleArea;
        this.pi = pi;
        this.r = r;
    }


    public void getMyArea() {
        circleArea = pi * r * r;
        System.out.println(circleArea);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleArea that = (CircleArea) o;
        return Float.compare(pi, that.pi) == 0 && Float.compare(circleArea, that.circleArea) == 0 && Float.compare(r, that.r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pi, circleArea, r);
    }

    @Override
    public String toString() {
        return "CircleArea{" +
                "pi=" + pi +
                ", circleArea=" + circleArea +
                ", r=" + r +
                '}';
    }
}
