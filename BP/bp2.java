import java.util.*;
public class bp2
{
public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,2,3,54,9,87,6,46};
		Arrays.sort(arr);
		int count =0;
		int[] dup =new int[arr.length/2];
		for(int i =1 ;i< arr.length ;i++){
			if(arr[i] == arr[i-1]){
				dup[count] = arr[i];
				count++;
			}				
		}
		System.out.println("the number of duplicate are : "+count);
		System.out.println("the duplicates are");
		for(int i= 0;i<count;i++){
			System.out.println(dup[i]);
		}
	}
}