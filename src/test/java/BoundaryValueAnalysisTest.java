import org.junit.Test;
import static org.junit.Assert.*;

public class BoundaryValueAnalysisTest {

    private final letterGrade letterGrade = new letterGrade();

    @Test
    public void invalid() {
        assertEquals('X', letterGrade.grade(101));
        assertEquals('X', letterGrade.grade(-1));
    }

    @Test
    public void gradeA() {
        assertEquals('A', letterGrade.grade(100));
        assertEquals('A', letterGrade.grade(90));
    }

    @Test
    public void gradeB() {
        assertEquals('B', letterGrade.grade(89));
        assertEquals('B', letterGrade.grade(80));
    }

    @Test
    public void gradeC() {
        assertEquals('C', letterGrade.grade(79));
        assertEquals('C', letterGrade.grade(70));
    }

    @Test
    public void gradeD() {
        assertEquals('D', letterGrade.grade(69));
        assertEquals('D', letterGrade.grade(60));
    }

    @Test
    public void gradeF() {
        assertEquals('F', letterGrade.grade(59));
        assertEquals('F', letterGrade.grade(0));
    }
}
