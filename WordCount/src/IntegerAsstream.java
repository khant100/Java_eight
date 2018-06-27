import java.lang.*;
import java.util.*;
import java.util.stream.IntStream;
import java.nio.*;



public class IntegerAsstream {

	public static void main(String[] args) {

		IntStream.range(1,100)
		.forEach(System.out::println);
		//System.out.println();
		
	}

}
