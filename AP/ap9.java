import java.util.Scanner;

public class ap9{

    public static void main(String[] args){

        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        
        double interest = (p * r * t) / 100;
        System.out.println("simple interest : " + interest);

        System.out.println(" to calculate compund interest insert n ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        sc.close();

        interest = p * (Math.pow((1 + r/100), (t * n))) - p;
        System.out.println("Compound Interest: " + interest);

        double  v = p * Math.pow(1 + r , t);
        System.out.println("final value : " + v);

    }
}
