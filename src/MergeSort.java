import java.util.*;
public class MergeSort{
void mergeSort(int arr[] , int left , int right){
    if(left < right){
        int mid = left + (right - left)/2;
        
        mergeSort(arr,left,mid);
        mergeSort(arr,mid + 1, right);
        merge(arr, left , mid , right);
    }
}
void merge(int arr[], int left , int mid , int right){
    int n1 = mid - left + 1;
    int n2 = right - mid;
    
    int leftarr[] = new int[n1];
    int rightarr[] = new int[n2];
    
    for(int i = 0 ; i < n1 ; i++){
        leftarr[i] = arr[left + i];
    }
    for(int j = 0 ; j < n2 ; j++){
        rightarr[j] = arr[mid + 1 + j];
    }
    
    int i =0 ;int j = 0 ;int  k =left;
    while( i < n1 && j < n2){
        if(leftarr[i] <= rightarr[j]){
           arr[k] = leftarr[i];
           i++;
        }
        else{
            arr[k] = rightarr[j];
            j++;
        }
        k++;
    }
    while( i < n1){
        arr[k] = leftarr[i];
        i++;
        k++;
    }
    while( j < n2){
        arr[k] = rightarr[j];
        j++;
        k++;
    }
    
    
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the number of Elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = rand.nextInt(100);
    }
    System.out.println("The original Array : ");
    System.out.println(Arrays.toString(arr));
    MergeSort obj = new MergeSort();
    obj.mergeSort(arr, 0,n-1);
    System.out.println("The sorted array : ");
    System.out.println(Arrays.toString(arr));
    sc.close();
}
}
