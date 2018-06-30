import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Sort_arry {

	public static String[] sortArray(String[] arr) {
		String[] temp = new String[arr.length];
		
		List lm ,lm2;
		lm = new LinkedList<String>();
		lm2=new LinkedList<String>();
		for(int i=0;i<arr.length;i++) {
			
			if(Character.isAlphabetic(arr[i].charAt(0))) {
				lm.add(arr[i]);
			}else {
				lm2.add(arr[i]);
			}
		}
		
		
		lm.addAll(lm2);
		String[] abc = (String[]) lm.toArray(new String[lm.size()]);
		
		return abc ;
	}
	
	
	public static void main(String[] args) {

		String[] examples = { "1some", "2some", "20some", "21some", "3some", "some", "1abc", "abc" };
		for(int i=0;i<examples.length;i++) {
			System.out.println(" "+sortArray(examples)[i]);
		}
	
	}

}
