package lab17;

public class Task3_List {
    public Task3_Node head;
    public int size = 0;

    public void add(Task3_Node newNode) {
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Task3_Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    public boolean remove(String name) {
        if (head == null) return false;

        if (head.name.equals(name)) {
            if (size == 1) { head = null; }
            else {
                Task3_Node last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            }
            size--;
            return true;
        }

        Task3_Node current = head;
        while (current.next != head) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        Task3_Node current = head;
        do {
            current.print();
            current = current.next;
        } while (current != head);
        System.out.println("(обратно к " + head.name + ")");
    }

    public void clear() { head = null; size = 0; }
    public boolean isEmpty() { return head == null; }
}