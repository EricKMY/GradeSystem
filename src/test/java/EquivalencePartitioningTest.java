import org.junit.Test;
import static org.junit.Assert.*;

public class EquivalencePartitioningTest {

    private final GradingSystem gradingSystem = new GradingSystem();

    @Test
    public void invalid() {
        assertEquals('X', gradingSystem.letterGard(101));
        assertEquals('X', gradingSystem.letterGard(-1));
    }

    @Test
    public void gradeA() {
        assertEquals('A', gradingSystem.letterGard(95));
    }

    @Test
    public void gradeB() {
        assertEquals('B', gradingSystem.letterGard(85));
    }

    @Test
    public void gradeC() {
        assertEquals('C', gradingSystem.letterGard(75));
    }

    @Test
    public void gradeD() {
        assertEquals('D', gradingSystem.letterGard(65));
    }

    @Test
    public void gradeF() {
        assertEquals('F', gradingSystem.letterGard(30));
    }
}
