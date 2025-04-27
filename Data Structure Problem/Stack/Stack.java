public class Stack {
    int[] stack;
    int top;

    Stack(int[] stack) {
        this.stack = stack;
        top = 0;
    }

    public void push(int item) {
        if(top == stack.length) {
            System.out.println("Stack list is full");
        }
        else {
            stack[top] = item;
            top++;
        }
    }

    public void pop() {
        if(top == 0) {
            System.out.println("Stack list is empty");
        }
        else {
            top--;
        }
    }

    public void print() {
        if(top == 0) {
            System.out.println("Stack list is empty");
        }
        else {
            for(int i = 0; i < top; i++) {
                System.out.print(stack[i] +" ");
            }
            System.out.println();
        }
    }
}
