import java.util.Arrays;

public class lambdastring {

	public static void main(String[] args) {

		String[] names = {"asd", "sds", "sadd", "sacd" };
		Arrays.stream(names)
		.filter(x-> x.startsWith("s"))
		.sorted()
		.forEach(System.out::println);
	}

}
