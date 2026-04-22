public class LinkedListQueue<T> extends AQueue<T> {

    private Node<T> head;
    private Node<T> tail;

    public LinkedListQueue() {
        head = null;
        tail = null;
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }

        T value = head.getElement();
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        return value;
    }

    @Override
    public void display() {
        Node<T> current = head;

        while (current != null) {
            System.out.println("Node: " + current.getElement());
            current = current.getNext();
        }
    }
}