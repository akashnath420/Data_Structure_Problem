public class Sorting {
    int[] data;

    Sorting(int[] data) {
        this.data = data;
    }

    public void bubbleSorting() {
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = 0; j < data.length - 1 - i; j++) {
                if(data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        System.out.print("Bubble Sorting : ");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();
    }

    public void selectionSorting() {

        for(int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < data.length; j++) {
                if(data[minIndex] > data[j]) {
                    minIndex = j;
                }
            }

            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }

        System.out.print("Selection Sorting : ");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();
    }
}