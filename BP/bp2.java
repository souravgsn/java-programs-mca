import java.util.*;
public class duplicateFinder
{
public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,2,3,54,9,87,6,46};
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int x : arr) {
			if(map.containsKey(x)){
				map.put(x,map.get(x)+1);
			}else{
				map.put(x,1);
			}
		}
		int count =0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {	
			if(entry.getValue() != 1){
            	System.out.println(entry.getKey() + " " + entry.getValue());
				count++;	
			}
        }
		System.out.println("no of duplicates are : "+ count);

	}
}