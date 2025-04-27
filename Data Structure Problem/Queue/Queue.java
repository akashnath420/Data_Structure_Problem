public class Queue {
    int[] queue;
    int front;
    int rear;
    int size;

    Queue(int[] queue) {
        this.queue = queue;
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enQueue(int item) {
        if(size == queue.length) {
            System.out.println("The queue is full");
        }
        else {
            queue[rear] = item;
            rear = (rear + 1) % queue.length;
            size++;
        }
    }

    public void deQueue() {
        if(size == 0) {
            System.out.println("The queue is empty");
        }
        else {
            front = (front + 1) % queue.length;
            size--;
        }
    }

    public void print() {
        if(size == 0) {
            System.out.print("List is empty");
            return;
        }
        int j = size;
        for(int i = front; j != 0; j--) {
            System.out.print(queue[i] +" ");
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }
}
