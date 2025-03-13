import java.util.*;
public class Bubblesort{
    void bubblesort(int arr[]){
        int len = arr.length;
        for(int i = 0 ; i < len-1 ; i++){
            for(int j = 0; j < len - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
           
        }
         
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the total number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("The elements are :");
        for(int i = 0 ; i < n ; i++){
            arr[i] = rand.nextInt(50);
            System.out.print(arr[i]+ " ");
        }
       Bubblesort obj = new Bubblesort();
       obj.bubblesort(arr);
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
