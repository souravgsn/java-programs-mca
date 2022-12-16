import java.util.Scanner;

public class ap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        float bp = sc.nextFloat();
        if(bp < 8) {
            System.out.println("wage should be greater than $8 ");
        }
        if(hr > 60) {
            System.err.println("no of hours greater than 60");
            System.exit(0);
        }
        int bhr = 0;
        if(hr>40){
            Double bs;
            bhr = hr - 40;
            bs = (40.0 * bp) + (bhr * bp * 1.5); 
            System.out.println("The employe gets paid : " + bs );
        }
        else{
            System.out.println("The employe gets paid : " + hr * bp );
        }
    }
}
