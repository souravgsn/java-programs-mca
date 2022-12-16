import java.util.Scanner;

public class ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
         for(int i =1 ; i<=n ; i++){
            if(i<n){
            System.out.print(1 + "/" + i + "+ ");
            }else{
                System.out.print(1 + "/" + i + " = ");
            }
            float r = 1f/i;
            sum += r;
        }

        System.out.println(sum);
    }
}
