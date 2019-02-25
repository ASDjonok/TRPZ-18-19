package lab7.linkedList;

//import lab6.МузичнаКомпозиція;

//import lab6.МузичнаКомпозиція;

import lab6.МузичнаКомпозиція;

public class Node {
    private Node next;
    private Node previous;
    private МузичнаКомпозиція data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public МузичнаКомпозиція getData() {
        return data;
    }

    public void setData(МузичнаКомпозиція data) {
        this.data = data;
    }
}
