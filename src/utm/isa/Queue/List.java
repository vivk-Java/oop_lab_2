package utm.isa.Queue;

import java.util.Arrays;

public class List<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;
    private int size = 0;

    public List() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public List(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + size);
        }

        this.elements = new Object[size];
        this.size = 0;
    }

    public void add(E object) {
        if (this.size + 1 > this.elements.length) {
            resizeArray();
        }

        this.elements[this.size] = object;
        this.size++;
    }

    public void add(int index, E object) {
        if (this.size + 1 > this.elements.length) {
            resizeArray();
        }

        System.arraycopy(this.elements,
                index,
                this.elements,
                index + 1,
                (this.elements.length - 1) - index);
        this.elements[index] = object;
        this.size++;
    }

    public E get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + " : Size : " + this.size);
        }
        return (E) this.elements[index];
    }

    public E remove(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + " : Size : " + this.size);
        }

        Object elem = this.elements[index];
        int modifiedIndex = this.elements.length - (index + 1);
        System.arraycopy(this.elements, index + 1, this.elements, index, modifiedIndex);
        this.size--;
        return (E) elem;
    }

    public int size() {
        return this.size;
    }

    private void resizeArray() {
        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[elements=[");
        for(int i = 0; i < this.size ;i++) {
            sb.append(this.elements[i].toString());
            if(i < this.size - 1){
                sb.append(",");
            }
        }
        sb.append("], size=[" + this.size + "]]");
        return sb.toString();
    }
}
