public class DP1{
    public static void main(String[] args) {
    var gc1=new GravityCalculator();
    System.out.println(gc1.finalPosition(10,5));
    System.out.println(gc1.initialVelocity(0));
    }
}
class GravityCalculator{
    double ix=0; //initial position
    double iv=0; // initial velocity
    double time=10; // in seconds
    double fv=0.0; //final velocity
    double fx=0.0; //final position
    public final double a= -9.81; //acceleration
    public final double g=9.8;// m/s
        
    public double finalVelocity(double initialVelocity, int time){
        return initialVelocity+g*time;
    }
    public double finalPosition(int time, double initialVelocity){
        fx= 0.5*a*time*time+finalVelocity(initialVelocity,time);
        return fx-ix;
    }
    public double initialVelocity(int t){
        double result=0;
        try {
        double result1=(fx-ix-0.5*a*time*time);
        result=result1/t;
        throw new ArithmeticException("Demo");
        } catch (ArithmeticException e) {
            System.out.println("divide by Zero exception Time should be greater than 0 ");
            result = -1;
        }finally{
            System.out.println("final block");
        }
        return result;
    }
}