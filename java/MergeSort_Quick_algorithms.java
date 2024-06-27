public class MergeSort_Quick_algorithms {
    public static void conquer(int arr[],int s,int mid,int e){
         int merge[] = new int[e-s+1];
         int idx1 = s;
         int idx2 = mid+1;
         int x = 0;

         while(idx1 <= mid && idx2 <=e){
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }
            else{
                merge[x++] = arr[idx2++];
            }
         }

         while(idx1<=mid){
            merge[x++] = arr[idx1++];
         }
         while(idx2<=e){
            merge[x++] = arr[idx2++];
         }

         for(int i = 0,j=s;i<merge.length;i++,j++){
              arr[j] = merge[i];
         }

    }
    public static void divide(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid = (s+e)/2;
        divide(arr, s, mid);
        divide(arr, mid+1, e);
        conquer(arr, s, mid, e);
    }

    public static int partition(int arr[],int l,int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j = l;j<h;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[h] = temp;
        return i;
    }
    public static void quickSort(int arr[],int l,int h){
       if(l<h){
          int pi = partition(arr,l,h);
          quickSort(arr, l, pi-1);
          quickSort(arr, pi+1,h);
       }

    }
    public static void main(String[] args) {
        // Merge Sort:
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        // divide(arr, 0, n-1);
        // for(int i = 0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // Quick sort:
        quickSort(arr, 0, n-1);
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();


    }
    
}
