
class Cylinder {

    Circle base;
    double height; 
    double pie = 3.14159;

    public Cylinder(){

        base = new Circle(1); 
        height = 1; 

    }

    public Cylinder(double r, double h){

        base = new Circle(r);
        height = h;

    }

    public String toString(){

        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " units and a height of " + height + " units"; 

    }

    Circle Base(){
        return base.getRadius();
    }
    
    double getHeight(){
        return height;
    }    
    
    double getSurfaceArea(){

        return base.getCircumference()*height + 2*base.getArea();    

    }
    
    double getVolume(){
        return base.getArea()*height;   
    }
}