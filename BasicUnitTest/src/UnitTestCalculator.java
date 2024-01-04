import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestCalculator {

	@Test
    void testAdd() {
		Calculator c1 = new Calculator();
        c1.setValue(7, 3);
        c1.add();
        assertEquals(7, c1.showResult());
        c1.setValue(5, 5);
        c1.add();
        assertEquals(10, c1.showResult());
    }

    @Test
    void testMultiply() {
    	Calculator c1 = new Calculator();
        c1.setValue(7, 3);
        c1.multiply();
        assertEquals(21, c1.showResult());
        c1.setValue(5, 5);
        c1.multiply();
        assertEquals(25, c1.showResult());
    }

}
