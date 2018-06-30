import java.util.Arrays;
import java.util.*;

public class sort_unique {

	public static ArrayList arry(int[] given ) {
		
		Arrays.sort(given);
		
		ArrayList<Integer> Distinct = new ArrayList<Integer>();
		for(int i=0;i<given.length-1;i++) {
			
			if(given[i]!=given[i+1]) {
				Distinct.add(given[i]);
			}
			
			
		}
		//if(given[given.length-1]==given[given.length-2]) {
			Distinct.add(given[given.length-1]);
	//	}
		
		return Distinct;
	}
	
	
	
	public static void main(String[] args) {

		 int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10,125,126,125,126,};
		 
		 System.out.println(" "+arry(arr));
		
	}

}
