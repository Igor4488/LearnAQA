package Tests.Interface_learning1;

import java.util.Objects;

public class SquareArea implements HasArea{
    private float a;
    private float squareArea;


    public SquareArea(float a) {
        this.squareArea = squareArea;
        this.a = a;
    }

    public void getMyArea() {
        this.squareArea = a * a;
        System.out.println(this.squareArea);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareArea that = (SquareArea) o;
        return Float.compare(a, that.a) == 0 && Float.compare(squareArea, that.squareArea) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, squareArea);
    }

    @Override
    public String toString() {
        return "SquareArea{" +
                "a=" + a +
                ", squareArea=" + squareArea +
                '}';
    }
}
