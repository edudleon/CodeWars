package season1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class SpinWordsTest {

	 @Test
	    public void test() {
	      assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
	      assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
	      assertEquals("This is aciremA", new SpinWords().spinWords("This is America"));
	      assertEquals("En las serbmuc de un edrev etiuqzem", new SpinWords().spinWords("En las cumbres de un verde mezquite"));
	      assertNotEquals("aloh", new SpinWords().spinWords("hola         "));
	    }
}
