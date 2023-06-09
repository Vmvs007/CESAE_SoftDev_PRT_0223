import org.junit.jupiter.api.Test;

import static org.example.Main.multi;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit5ExampleTest {
    @Test
    void testeSoma(){
        assertEquals(2,1+1);
    }

    @Test
    void testeMulti(){
        assertEquals(0, multi(10,0),"10 x 0 é 0");
    }
}
