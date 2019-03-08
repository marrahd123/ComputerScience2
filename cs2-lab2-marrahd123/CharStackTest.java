import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharStackTest{

  @Test
  public void testPop() {
    CharStack stack = new CharStack();
    stack.push ('a');
    stack.push ('b');
    stack.push ('c');
    assertEquals('c', stack.pop());
    assertEquals('b', stack.pop());
    assertEquals('a', stack.pop());
  }
}
