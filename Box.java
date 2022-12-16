/*
     AP6

 *  A java standalone application makes use of a parameterized method inside a class.
 *  Take the following case: 
 *  Create a class Box and define a method in this class which will return the volume of the box.
 *  Initialize two objects for your class and print out the volumes respectively.
 */

public class Box {
    public
    float l,b,h;
    public Box(float l , float b ,float h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public float getVolume(){
        return l*b*h;
    }
    public static void main(String[] args) {
        Box b = new Box(5f,6f,0.576f);
        Box c = new Box(2f,4f,10);        
    
        System.out.println(b.getVolume());
        System.out.println(c.getVolume());
        
    }  
}


