import org.junit.Test;
import static org.junit.Assert.*;

public class BoundaryValueAnalysisTest {

    private final GradingSystem gradingSystem = new GradingSystem();

    @Test
    public void invalid() {
        assertEquals('X', gradingSystem.letterGard(101));
        assertEquals('X', gradingSystem.letterGard(-1));
    }

    @Test
    public void gradeA() {
        assertEquals('A', gradingSystem.letterGard(100));
        assertEquals('A', gradingSystem.letterGard(90));
    }

    @Test
    public void gradeB() {
        assertEquals('B', gradingSystem.letterGard(89));
        assertEquals('B', gradingSystem.letterGard(80));
    }

    @Test
    public void gradeC() {
        assertEquals('C', gradingSystem.letterGard(79));
        assertEquals('C', gradingSystem.letterGard(70));
    }

    @Test
    public void gradeD() {
        assertEquals('D', gradingSystem.letterGard(69));
        assertEquals('D', gradingSystem.letterGard(60));
    }

    @Test
    public void gradeF() {
        assertEquals('F', gradingSystem.letterGard(59));
        assertEquals('F', gradingSystem.letterGard(0));
    }
}
