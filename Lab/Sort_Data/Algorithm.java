package Lab.Sort_Data;

public class Algorithm {

    public static void Bubble_Sort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j+1] < arr[j]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // System.out.print("Bubble Sort : ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

    }


    public static void Insertion_Sort(int[] arr) {
        int n = arr.length;

        for(int i = 1 ; i < n-1 ;i++){
            int v = arr[i];
            int j = i - 1;
                while (j >= 0 && arr[j] > v) {
                    arr[j+1] = arr[j];
                    j = j-1;
                }
                arr[j+1] = v;
        }
    //  System.out.print("Insertion_Sort : ");
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    }

    public static void Selection_Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        // System.out.print("Selection_Sort : ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    }


     public static void quickSort(int[] Arr) {
        if (Arr != null && Arr.length > 1) {
            quickSort(Arr, 0, Arr.length - 1);
        }
    }

      public static void quickSort(int[] Arr,int l,int r){
        if (l<r){
            int s = partition(Arr,l,r);
            quickSort(Arr, l, s - 1); // เรียงซีกซ้าย
            quickSort(Arr, s + 1, r);
        }
    }
    private static int partition(int Arr[],int l,int r){ //HoarePartition
        int pivot=Arr[l];
        int i=l; int j=r+1 ;
        do {
            do {
                i++;
            } while (i<r && Arr[i]<pivot);  //until (A[i] >= pivot);
            do {
                j--;
            } while (Arr[j] > pivot); //until (A[j] <= pivot);
            //temp swap
            int temp=Arr[i]; Arr[i]=Arr[j]; Arr[j]=temp;
        } while (i < j); //until while(i>=j);
        //recover swap
        int temp=Arr[i]; Arr[i]=Arr[j]; Arr[j]=temp;
        //swap l and j
        temp=Arr[l]; Arr[l]=Arr[j]; Arr[j]=temp;
        return j;//index spilt postion
    }
}

