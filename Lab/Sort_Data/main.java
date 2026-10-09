package Lab.Sort_Data;


public class main {
   
    
    public static void main(String[] args) {
        TimeTracker time = new TimeTracker();
         long arr [] = new long[]{500, 1000,10000 , 50000 ,100000};
        //  int [] arr = {20};

        for(long array : arr){

            random_data data = new random_data((int) array);


            int[] bubble = data.Get_CopyArray();
             time.start();
            Algorithm.Bubble_Sort(bubble);
            double bubble_time = time.stop();

            int[] quick = data.Get_CopyArray();
             time.start();
            Algorithm.quickSort(quick);
            double quick_time = time.stop();

            int[] insertion = data.Get_CopyArray();
             time.start();
            Algorithm.Insertion_Sort(insertion);
            double insertion_time = time.stop();

            int[] selection = data.Get_CopyArray();
             time.start();
            Algorithm.Selection_Sort(selection);
            double selection_time = time.stop();
            
            System.out.println("Size: " + array + " | Bubble Sort Time: " + bubble_time + " ms");
            System.out.println("Size: " + array + " | Selection Sort Time: " + selection_time + " ms");
            System.out.println("Size: " + array + " | Insertion Sort Time: " + insertion_time + " ms");
            System.out.println("Size: " + array + " | Quick Sort Time: " + quick_time + " ms");
            System.out.println("=======================================================================");
            


        }


        
    } 
}
