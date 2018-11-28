package Practice5;

//Create your own LinkedList implementation with the following functionality:
//add an element;
//remove an element;
//reverse elements;
//iterate over the list (create your own Iterator implementation for that)

public class LinkedList<T> {

    class Node<T> {

        private T value;
        private Node<T> prev;
        private Node<T> next;

        public Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }

    private Node<T> start;

    public void add(T t) {
        if(start == null)
            start = new Node<>(t, null, null);
        else
            getLastNode().next = new Node<T>(t, getLastNode(), null);
    }

    public void add(T t, int pos) {
        try {
            if(pos < 0 || pos > getCount()){
                throw new Exception("Position out of range");
            }
            if(start == null)
                start = new Node<>(t, null, null);
            else{
                Node<T> cur = start;
                if(pos == 0) {
                    start = new Node<T>(t, null, cur);
                    cur.prev = start;
                }
                else if(pos == getCount())
                    getLastNode().next = new Node<T>(t, getLastNode(), null);
                else {
                    int i = 0;
                    while(i < pos){
                        cur = cur.next;
                        i++;
                    }
                    cur.prev.next = new Node<T>(t, cur.prev, cur);
                    cur.prev = cur.prev.next;
                }

            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void remove(int pos){
        Node<T> removed = getNode(pos);
        if(pos == 0){
            removed.next.prev = null;
            start = removed.next;
        }
        else if(pos == getCount() - 1){
            removed.prev.next = null;
        }
        else{
            removed.prev.next = removed.next;
            removed.next.prev = removed.prev;
        }
    }

    public void reverse(){
        if(getCount() <= 1)
            return;
        start = getLastNode();
        start.next = start.prev;
        Node<T> cur = start.next;
        while(cur.prev != null){
            Node<T> tmp = cur.prev;
            cur.prev = cur.next;
            cur.next = tmp;
            cur = cur.next;
        }
        Node<T> tmp = cur.prev;
        cur.prev = cur.next;
        cur.next = tmp;
    }

    public T getFirst(){
        return start.value;
    }

    private Node<T> getNode(int pos){
        if(start == null)
            return null;
        int i = 0;
        Node<T> cur = start;
        while(i++ < pos){
            cur = cur.next;
        }
        return cur;
    }

    public T get(int pos){
        return getNode(pos).value;
    }

    public T getLast(){
        return getLastNode().value;
    }

    private Node<T> getLastNode() {
        Node<T> cur = start;
        while(cur.next != null){
            cur = cur.next;
        }
        return cur;
    }

    public int getCount(){
        if(start == null)
            return 0;
        int count = 1;
        Node<T> cur = start;
        while(cur.next != null){
            cur = cur.next;
            count++;
        }
        return count;
    }

    public void print(){
        Node<T> cur = start;
        System.out.print("[" + cur.value.toString());
        if(cur.next != null)
            System.out.print(", ");
        while(cur.next != null){
            cur = cur.next;
            System.out.print(cur.value.toString());
            if(cur.next != null)
                System.out.print(", ");
        }
        System.out.print("]\n");
    }

    public void reversePrint(){
        Node<T> cur = getLastNode();
        System.out.print("[" + cur.value.toString());
        if(cur.prev != null)
            System.out.print(", ");
        while(cur.prev != null){
            cur = cur.prev;
            System.out.print(cur.value.toString());
            if(cur.prev != null)
                System.out.print(", ");
        }
        System.out.print("]\n");
    }
}
