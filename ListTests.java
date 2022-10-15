import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {
    
    @Test
    public void testFilter(){
        StringChecker sc = new Checker();
        ArrayList<String> input = new ArrayList<>();
        input.add(0, "1");
        input.add(1, "2");
        input.add(2, "3");
        ArrayList<String> expected = new ArrayList<>();
        expected.add(0, "2");
        expected.add(1, "3");
        assertEquals(expected, ListExamples.filter(input, sc));
    }
}
