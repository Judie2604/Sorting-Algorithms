import java.util.*;
public class SelectionSort{
    void selectionsort(int arr[]){
        int len = arr.length;
        for(int i = 0 ; i < len - 1  ; i++){
              int small = i;
            for(int j = i+1 ; j < len  ; j++){
              
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        System.out.println("The sorted array :");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = rand.nextInt(50);
    }
    System.out.println(Arrays.toString(arr));
    SelectionSort obj = new SelectionSort();
    obj.selectionsort(arr);
    sc.close();
}
}