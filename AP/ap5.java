import java.util.Scanner;

/*
 * Construct a number generator to accept three digits (i.e. 0 - 9) and print all its possible combinations. 
 * (For example if the three digits are 1, 2, 3 than all possible combinations are: 123, 132,213, 231, 312, 321.)
 */
public class ap5 {
    public static void main(String[] args) {
        int[] arr  = new int[3];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = x.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    if(arr[i] != arr[j] && arr[j] != arr[j2] && arr[i] != arr[j2]){
                        System.out.println(arr[i] + ""+ arr[j] + ""+ arr[j2]);
                    }
                }
            }
        }

    }
}
