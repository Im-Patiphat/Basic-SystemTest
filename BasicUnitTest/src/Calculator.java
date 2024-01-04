public class Calculator {
	private int num1 ;
	private int num2 ;
	private int result ;
	
	public void add () {
		result  = num1 +num2;
	}
	public void multiply () {
		result = num1+ num2;
	}
	public int showResult() {
		return result;
	}
	public void setValue(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
}