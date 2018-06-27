import java.lang.*;
import java.util.*;
import java.util.stream.IntStream;
import java.nio.*;





	
		
public class lambdaStream_Int {

	public static void main(String[] args) {

		IntStream.range(1,100)
		.skip(40)
		.forEach(x->System.out.println(x));
	}

}
