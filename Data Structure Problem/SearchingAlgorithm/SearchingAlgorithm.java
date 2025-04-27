package SearchingAlgorithm;

public class SearchingAlgorithm {

    int[] data;

    public SearchingAlgorithm(int[] data) {
        this.data = data;
    }

    void linearSearch(int item) {
        int index = 0;
        int num = 0;
        boolean found = false;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == item) {
                index = i;
                num = data[i];
                found = true;
                break;
            }
        }

        if(found == true) {
            System.out.println("Linear Searching index is "+ index +" number is  "+ num);
        }
        else {
            System.out.println("Not found");
        }
    }

    void binarySearch(int item) {

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data.length - 1 - i; j++) {
                if(data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted data : ");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();

        int low = 0;
        int high = data.length - 1;
        int index = 0;
        int num = 0;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(item == data[mid]) {
                index = mid;
                num = data[mid];
                found = true;
                break;
            }
            else if(item < data[mid]) {
                high = mid - 1;
            }
            else {
                low = mid+1;
            }
        }

        if(found == true) {
            System.out.print("Binary Searching index is "+ index +" number is "+ num);
        }
        else {
            System.out.println("Not found");
        }
    }
}
