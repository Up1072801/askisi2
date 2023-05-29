package gr.upatras.junit.first;

public class MyMain {
	public static void main(String[]args) {
		Subtraction m = new Subtraction();
		String result = m.subtraction( 10 , 5);
		System.out.println( " The Result is:" + result);
	}

}
