import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloGoogleTest {

    @Test
    public void testHelloGoogle() {
        try {
            new HelloGoogle();
        } catch (Exception e) {
            fail("Construction failed. ");
        }
    }

    @Test
    public void testMain() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        HelloGoogle.main(null);
        assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        System.setOut(null);
    }


}