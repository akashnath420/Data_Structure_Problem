import java.util.Scanner;

class LinkedListAlgorithm {
    Node start;
    int size = 0;

    public LinkedListAlgorithm() {
        start = null;
    }

    public Node getNode() {
        Node newNode = new Node();
        newNode.value = (int)(1 + 10 * Math.random());
        newNode.next = null;

        return newNode;
    }
    public void addFirst() {
        Node newNode = getNode();

        if(start == null) {
            start = newNode;
        }
        else {
            newNode.next = start;
            start = newNode;

        }
    }

    public void addLast() {
        Node newNode = getNode();
        Node temp = start;

        if(start == null) {
            start = newNode;
        }
        else  {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addMiddle() {
        Node newNode = getNode();
        Node temp = start;

        if(start == null) {
            start = newNode;
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the position of the value : ");
            int n = sc.nextInt();
            if(n > 1 &&  n < count()) {
                for(int i = 1; i < n - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
            else {
                System.out.println("Wrong position!");
            }
        }
    }

    public void deleteFirst() {
        if (start == null) {
            System.out.println("List is empty");
        }
        else {
            start = start.next;
        }
    }

    public void deleteLast() {
        Node temp, prev;
        prev = temp = start;
        if(start == null) {
            System.out.println("List is empty");
        }
        else {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
        if(start != null) {
            deleteFirst();
        }
    }

    public void deleteMiddle() {
        Node temp, prev;
        prev = temp = start;

        if(start == null) {
            System.out.println("List is empty");
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of position : ");
            int n = sc.nextInt();
            if(n > 1 && n < count() - 1) {
                for(int i = 1; i < n - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            else {
                System.out.println("wrong position!");
            }
        }
    }

    public void print() {
        Node temp = start;

        while(temp != null) {
            if(temp.next != null) {
                System.out.print(temp.value +" -->> ");
            }
            else {
                System.out.print(temp.value);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public int count() {
        Node temp = start;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }
}