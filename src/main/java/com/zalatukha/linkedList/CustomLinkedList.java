package com.zalatukha.linkedList;

public class CustomLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    public int size;

    public CustomLinkedList() {
    }

    public void add(T elementToAdd) {
        Node<T> newNode = new Node<>(elementToAdd);

        if (head == null) {
            newNode.setPrevious(null);
            newNode.setNext(null);
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public void addByIndex(T element, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        if (index == size) {
            add(element);
            return;
        }
        Node<T> newNode = new Node<>(element);
        if (index == 0) {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        } else {
            Node<T> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }

            Node<T> previousNode = currentNode.getPrevious();
            previousNode.setNext(newNode);
            currentNode.setPrevious(newNode);

            newNode.setPrevious(previousNode);
            newNode.setNext(currentNode);
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        Node<T> nodeToRemove;
        if (index == 0) {
            nodeToRemove = tail;
            Node<T> nextNode = head.getNext();
            nextNode.setPrevious(null);
            head = nextNode;
        } else if (index == (size - 1)) {
            nodeToRemove = head;
            Node<T> prevNode = tail.getPrevious();
            prevNode.setNext(null);
            tail = prevNode;
        } else {
            nodeToRemove = head;
            for (int i = 0; i < index; i++) {
                nodeToRemove = nodeToRemove.getNext();
            }
            Node<T> previousNode = nodeToRemove.getPrevious();
            Node<T> nextNode = nodeToRemove.getNext();
            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);
        }
        size--;
        return nodeToRemove.getElement();
    }

    public T getByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index");
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getElement();
    }

    public void clearList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void reverseList() {
        Node<T> currentNode = head;
        Node<T> nextNode = head.getNext();
        tail = head;
        tail.setPrevious(head.getNext());
        tail.setNext(null);

        while (nextNode != null) {
            Node<T> tempNode = nextNode;
            nextNode = nextNode.getNext();
            tempNode.setNext(currentNode);
            currentNode = tempNode;
        }
        head = currentNode;
        head.setPrevious(null);
    }

    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    private class Node<T> {
        private T element;
        private Node next;
        private Node previous;
        private int index;

        public Node() {
        }

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

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

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    '}';
        }
    }
}
