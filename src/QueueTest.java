import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QueueTest {

    @Test
    void enqueue() {
       Queue q = new Queue();
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);

       assertEquals(Arrays.asList(2,3,4), q.list);

    }

    @Test
    void dequeue() {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue();
        assertEquals(Arrays.asList(3,4), q.list);
    }
}