public class BubbleSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] unsortedArray = {20,4,6,8,2,9,3,10,1,15,3};

        //display unsorted array
        System.out.println("Unsorted Array: ");
        for(int i : unsortedArray) {
            System.out.println(i);
        }
        System.out.println("");

        //sort Array and save it in a new variable
        int[] sortedArray = sort(unsortedArray);

        //display sorted array
        System.out.println("Sorted Array:");
        for(int i : sortedArray) {
            System.out.println(i);
        }
    }

    public static int[] sort (int[] arr) {
        for(int outer = 0; outer < arr.length; outer++) {
            for(int inner = 1; inner < arr.length - outer; inner++) {
                if(arr[inner - 1] > arr[inner]) {
                    //swap
                    int temp = arr[inner -1];
                    arr[inner-1] = arr[inner];
                    arr[inner] = temp;
                }
            }
        }
        return arr;
    }
}

