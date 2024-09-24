
class  Driver{

    public static void main (String[] args) {

        Circle firstC, secondC;
        Cylinder cylinderFirst, cylinderSecond;

        firstC = new Circle(1);
        secondC = new Circle(5);
        cylinderFirst = new Cylinder();
        cylinderSecond = new Cylinder(5,5);

        System.out.println(firstC);
        System.out.println("Radius = " + firstC.getRadius() + " units"); 
        System.out.println("Area = " + firstC.getArea() + " units^2");
        System.out.println("Circumference = " + firstC.getCircumference() + " units");
        
        System.out.println(" ");
        
        System.out.println(secondC);
        System.out. println("Radius = " + secondC.getRadius() + " units");
        System.out.println("Circumference = " + secondC.getCircumference() + " units");
        System.out.println("Area = " + secondC.getArea() + " units^2");
        
        System.out.println(" ");
        
        System.out.println(cylinderFirst);
        System.out.println("Radius = " + cylinderFirst.Base() + " units"); 
        System.out.println("Height = " + cylinderFirst.getHeight() + " units");
        System.out.println("Surface Area = " + cylinderFirst.getSurfaceArea() + " units^2");
        System.out.println("Volume = " + cylinderSecond.getVolume() + " units"); 
        
        System.out.println(" ");
        
        System.out.println(cylinderSecond);
        System.out. println("Radius = " + cylinderSecond.Base() + " units");
        System.out.println("Height = " + cylinderSecond.getHeight() + " units");
        System.out.println("SurfaceArea = " + cylinderSecond.getSurfaceArea() + " units^2");
        System.out.println("Volume = " + cylinderSecond.getVolume() + " units"); 

    }

}