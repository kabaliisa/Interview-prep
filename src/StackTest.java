import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack s = new Stack();
        assertEquals(s.push(2),2 );
    }

    @Test
    void pop() {
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        s.push(8);

        assertEquals(s.pop(), 8);
    }

    @Test
    void peek() {
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        s.push(8);

        assertEquals(s.peek(), 8);
    }
}