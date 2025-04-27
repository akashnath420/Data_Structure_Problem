public class Algorithm  {
    int[] data;
    int size;
    int front;
    int rear;

    Algorithm(int[] data) {
        this.data = data;
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enqueue(int item) {
        if(size == data.length) {
            System.out.println("Queue is full");
        }
        else {
            data[rear] = item;
            rear = (1 + rear) % data.length;
        }
        size++;
    }

    public void dequeue() {
        if(size == 0) {
            System.out.println("Queue is empty");
        }
        else  {
            front = (1 + front) % data.length;
        }
        size--;
    }

    public void print() {
        if(size == 0) {
            System.out.println("Empty");
        }
            int j = size;
            for(int i = front; j != 0; j--) {
                System.out.print(data[i] +" ");
                i = (1 + i) % data.length;
        }
        System.out.println();
    }

}
