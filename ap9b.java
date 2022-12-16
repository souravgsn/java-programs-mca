import java.util.Scanner;
public class ap9b {

    public static double si(double p,double r , double t) {
        return (p * r * t) / 100;
    }
    public static double ci(double p,double r , double t,double n) {
         return p * (Math.pow((1 + r/100), (t * n))) - p;
    }
    public static double v(double p,double r , double t) {
        return  p * Math.pow(1 + r , t);
   }

   public static void main(String[] args){
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        System.out.println("simple interest : " + si(p,r,t));
        System.out.println(" to calculate compund interest insert n ");
        
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println("Compound Interest: " + ci(p,r,t,n));
        System.out.println("final value : " + v(p,r,t));

    }
}
