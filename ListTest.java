import static org.junit.Assert.*;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;





public class ListTest {
    
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<>();
        input1.add("cool");
        input1.add("color");
        input1.add("hello");
        
        assertArrayEquals(input1.toArray() , ListExamples.filter(input1, new myChecker()).toArray());
    }

    @Test
    public void testMerge(){
        List<String> input1 = new ArrayList<>();
        input1.add("color");
        input1.add("cool");
        input1.add("elongate");
        input1.add("hello");
        List<String> input1 = new ArrayList<>();
        assertArrayEquals(input1.toArray() , ListExamples.filter(input1, new myChecker()).toArray());
    }
    
}
