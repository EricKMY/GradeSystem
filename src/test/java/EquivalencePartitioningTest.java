import org.junit.Test;
import static org.junit.Assert.*;

public class EquivalencePartitioningTest {

    private final letterGrade letterGrade = new letterGrade();

    @Test
    public void invalid() {
        assertEquals('X', letterGrade.grade(101));
        assertEquals('X', letterGrade.grade(-1));
    }

    @Test
    public void gradeA() {
        assertEquals('A', letterGrade.grade(95));
    }

    @Test
    public void gradeB() {
        assertEquals('B', letterGrade.grade(85));
    }

    @Test
    public void gradeC() {
        assertEquals('C', letterGrade.grade(75));
    }

    @Test
    public void gradeD() {
        assertEquals('D', letterGrade.grade(65));
    }

    @Test
    public void gradeF() {
        assertEquals('F', letterGrade.grade(30));
    }
}
