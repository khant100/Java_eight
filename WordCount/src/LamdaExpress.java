@Functional
interface Print
{
	void show();
    //void run();
}
public class LamdaExpress {

	public static void main(String[] args) {
		
	 Print obj; 
	 obj = () -> System.out.println("hi");
		
      obj.show();
	}

}
