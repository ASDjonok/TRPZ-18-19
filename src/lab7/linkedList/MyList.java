package lab7.linkedList;

import lab6.МузичнаКомпозиція;

import java.util.*;

public class MyList implements List<МузичнаКомпозиція> {

    private Node head;
    private Node tail;
    private int size = 0;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<МузичнаКомпозиція> iterator() {
        return new Iterator<МузичнаКомпозиція>() {
            private Node currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public МузичнаКомпозиція next() {
                Node result = currentNode;
                if (currentNode != null) {
                    currentNode = currentNode.getNext();
                } else {
                    throw new NoSuchElementException();
                }
                return result.getData();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(МузичнаКомпозиція музичнаКомпозиція) {
        Node node = new Node();
        node.setData(музичнаКомпозиція);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends МузичнаКомпозиція> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends МузичнаКомпозиція> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public МузичнаКомпозиція get(int index) {
        return null;
    }

    @Override
    public МузичнаКомпозиція set(int index, МузичнаКомпозиція element) {
        return null;
    }

    @Override
    public void add(int index, МузичнаКомпозиція element) {

    }

    @Override
    public МузичнаКомпозиція remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<МузичнаКомпозиція> listIterator() {
        return new ListIterator<МузичнаКомпозиція>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public МузичнаКомпозиція next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public МузичнаКомпозиція previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(МузичнаКомпозиція музичнаКомпозиція) {

            }

            @Override
            public void add(МузичнаКомпозиція музичнаКомпозиція) {

            }
        };
    }

    @Override
    public ListIterator<МузичнаКомпозиція> listIterator(int index) {
        return null;
    }

    @Override
    public List<МузичнаКомпозиція> subList(int fromIndex, int toIndex) {
        return null;
    }
}
