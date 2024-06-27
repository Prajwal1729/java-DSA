public class sorting_algorithms {

    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Bubble sort: T.C: O(N^2)
        int arr[] = {7,8,3,1,2};
        
        // for(int i = 0;i<arr.length-1;i++){
        //      for(int j = 0;j<arr.length-i-1;j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;

        //         }
        //      }
        // }

        // seletion sort: T.C = O(n^2)

        // for(int i = 0;i<arr.length-1;i++){
        //     int min_idx = i;
        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[min_idx] > arr[j]){
        //             min_idx = j;
        //         }
        //     }
        //     int temp = arr[min_idx];
        //     arr[min_idx] =arr[i];
        //     arr[i] = temp;
        // }

        // Insertion sort: O(n^2)

        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            int j = i - 1;
            while(j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        
        printArray(arr);

    }
}
