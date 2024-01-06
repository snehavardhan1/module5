import org.example.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculatortest {

    @Test
    public void testadd(){
        Calculator cal = new Calculator();
       int result = cal.add(5,6);
       assertEquals(11,result);
    }

    @Test
    public void testsubtract(){
        Calculator cal = new Calculator();
        int result = cal.subtract(7,6);
        assertEquals(1,result);
    }

    @Test
    public void testmultiply(){
        Calculator cal = new Calculator();
        int result = cal.multiply(7,6);
        assertEquals(42,result);
    }

    @Test
    public void testDivide(){
        Calculator cal = new Calculator();
        int result = cal.divide(20,4);
        assertEquals(0,result);
    }

    @Test
    public void testpower(){
        Calculator cal = new Calculator();
        int result = cal.power(2,3);
        assertEquals(1,result);
    }
}
