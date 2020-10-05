package utm.isa.Queue;

public class Queue<E> {
    private final List<E> queue;
    private final long size;

    private final int head = 0;
    private int tail = 0;

    public Queue() {
        this.queue = new List<E>();
        this.size = Long.MAX_VALUE;
    }

    public Queue(int size) {
        this.queue = new List<E>(size);
        this.size = (long) size;
    }

    public void push(E elem) throws Exception {
        if (isFull()) {
            throw new Exception("The queue is full");
        }

        queue.add(tail, elem);
        tail++;
    }

    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("The queue is empty");
        }

        E elem = (E) queue.get(head);
        queue.remove(head);
        tail--;

        return elem;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return tail == size;
    }

    public String toString() {
        return getClass().getName() + "[queue=" + this.queue +
                ",size=" + this.size +
                ",head=" + this.head +
                ",tail=" + this.tail + "]";
    }
}
