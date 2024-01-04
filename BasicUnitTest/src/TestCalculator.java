
public class TestCalculator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setValue(4, 3);
		c1.add();
		System.out.println(c1.showResult());
		c1.multiply();
		System.out.println(c1.showResult());
		c1.setValue(5, 5);
		c1.add();
		System.out.println(c1.showResult());
		c1.multiply();
		System.out.println(c1.showResult());
		
	}
}
