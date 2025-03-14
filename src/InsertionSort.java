import java.util.*;
class InsertionSort {
    void insertionSort(int arr[]){
        int len = arr.length;
        for(int i = 1 ; i < len ; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+ 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("The sorted array : "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
        arr[i] = rand.nextInt(50);
        }
          System.out.println("The unsorted Array : "+Arrays.toString(arr));
    InsertionSort obj = new InsertionSort();
    obj.insertionSort(arr);
    sc.close();
    }
  
}
