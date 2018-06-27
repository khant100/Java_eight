@Functional
interface PrintInt{
	public void show (int i);
}


public class Lamda_list {

	public static void main(String[] args) {
		
		PrintInt obj;
		obj= () -> System.out.println("i ="+i);
		
		obj.show(10);
		
	}

}
