package Interface_learning1;

public class Area {

    public static void main(String[] args) {

        CircleArea circleArea1 = new CircleArea(15f);
        CircleArea circleArea2 = new CircleArea(18f);
        SquareArea squareArea1 = new SquareArea(15f);

        squareArea1.getMyArea();
        circleArea1.getMyArea();

        HasArea hasArea1 = new CircleArea(20f);
        HasArea hasArea2 = new SquareArea(20f);

        hasArea1.getMyArea();
        hasArea2.getMyArea();

        GiveMeArea giveMeArea = new GiveMeArea(new CircleArea(25f));
        giveMeArea.ar(circleArea1);
        giveMeArea.ar(circleArea2);


//        CircleArea circle3 = new CircleArea(25f);
//        SquareArea square3 = new SquareArea(25f);




    }

}
