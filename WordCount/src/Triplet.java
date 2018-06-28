//Given an array of distinct elements. The task is to find triplets in array whose sum is zero.
public class Triplet {

	public static void triplate(int[] arry) {
		boolean var;
		for(int i=0;i<arry.length-2;i++) {
			for(int j=1;i<arry.length-1;i++) {
				
				for(int k=2;i<arry.length;i++) {
					
					if((arry[i]+arry[j]+arry[k])==0) {
						System.out.println(arry[i]+" "+arry[j]+" "+arry[k]);
						var=true;
					}
					
					
				}
			}
			
		}
		if(var=false) {
			System.out.println("not fount");
		}
		
	}
	
	
	public static void main(String[] args) {

		int[] rr = {0,-1,2,-3,1};
		
		triplate(rr);
		
		
		
		
		
	}

}
