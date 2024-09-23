
class  Driver{

    public static void main (String[] args) {

        Circle firstC, secondC;

        firstC = new Circle(1);
        secondC = new Circle(5);

        System.out.println(firstC);
        System.out.println("Radius = " + firstC.getRadius() + " units"); 
        System.out.println("Area = " + firstC.getArea() + " units^2");
        System.out.println("Circumference = " + firstC.getCircumference() + " units");

        System.out.println(secondC);
        System.out. println("Radius = " + secondC.getRadius() + " units");
        System.out.println("Circumference = " + secondC.getCircumference() + " units");
        System.out.println("Area = " + secondC.getArea() + " units^2");
       
    }

}