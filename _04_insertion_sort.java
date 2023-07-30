package sorting;

public class _04_insertion_sort {
    public static void sort(int[] arr){
        for(int i = 1; i<arr.length;i++){
            for(int j = i-1; j>=0;j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j]; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ; 

                }else{
                    break;
                }
            }
        }
    }
    public static void main(String args[]){
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 1;
        arr[4] = 3;
        sort(arr);
        for(int i = 0 ;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
