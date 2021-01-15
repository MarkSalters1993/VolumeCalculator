import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void test_calculateSphereVolume_radius1() {
        assertEquals(4.19, calculator.calculateSphereVolume(1), 1);
    }

    @Test
    public void test_calculateSphereVolume_radius5() {
        assertEquals(523.6, calculator.calculateSphereVolume(5), 1);
    }

    @Test
    public void test_calculateCubeVolume_width1() {
        assertEquals(1, calculator.calculateCubeVolume(1), 1);
    }

    @Test
    public void test_calculateCubeVolume_width5() {
        assertEquals(125, calculator.calculateCubeVolume(5), 1);
    }

    @Test
    public void test_calculateTetrahedronVolume_edge1() {
        assertEquals(0.12, calculator.calculateTetrahedronVolume(1), 1);
    }

    @Test
    public void test_calculateTetrahedronVolume_edge5() {
        assertEquals(14.73, calculator.calculateTetrahedronVolume(5), 1);
    }
}
