import java.util.*;
public class StreamAvg {

	public static void main(String[] args) {
     
	Arrays.stream(new int[] {1,2,3,4})
	.map(x->x*x)
	.average()
	.ifPresent(System.out::println);
		
	}

}
