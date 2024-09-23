
class Circle {

    double radius;
    double pie = 3.14159;

    public Circle(){

        radius = 1;    

    }

    public Circle(double r){  
        //parameterized 
        radius = r;
    }

    public String toString(){

        return "Hello, I am a circle with a radius of " + radius; 

    }

    double getRadius(){
        return radius;
    }
    double getCircumference(){
        return radius*2*pie;
    }

    double getArea(){

        return radius*radius*pie;
    }
}