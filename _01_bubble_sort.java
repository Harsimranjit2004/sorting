package sorting;



public class _01_bubble_sort {
    public static void BubbleSort(int[] arr){
        boolean swaped;
        for(int i = 1;i<=arr.length-1;i++){
            swaped = false;
            for(int j = 0 ; j<arr.length -i;j++){
                if(isSmaller(arr, j+1, j)){
                    swap(arr, j+1, j);
                    swaped = true;
                }
            }
            if(swaped == false){
                break;
            }
        }
        
    }
    public static boolean isSmaller(int[] arr , int i , int j){
        
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }

    }
    public static void swap(int[] arr, int i , int j){
        int temp  = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
        
    }
    public static void main(String args[]){
  
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 1;
        arr[4] = 3;
        // taking input 
        // for(int i = 0 ; i<arr.length-1;i++){
        //     arr[i] = sc.nextInt();
        // }
        // 
        BubbleSort(arr);
        for(int i = 0 ;i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
