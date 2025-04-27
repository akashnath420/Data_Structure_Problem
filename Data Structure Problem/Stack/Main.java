public class Main {
    public static void main(String[] args) {

        int[] stack = new int[5];

        Stack list = new Stack(stack);

        System.out.print("Stack List is : ");
        list.push((int)(1 + 10*Math.random()));
        list.push((int)(1 + 10*Math.random()));
        list.push((int)(1 + 10*Math.random()));
        list.push((int)(1 + 10*Math.random()));
        list.push((int)(1 + 10*Math.random()));
        list.print();

        System.out.print("Remove Stack list is : ");
        list.pop();
        list.pop();
        list.print();

        System.out.print("Added Stack list is : ");
        list.push((int)(1 + 10*Math.random()));
        list.push((int)(1 + 10*Math.random()));
        list.print();
    }
}