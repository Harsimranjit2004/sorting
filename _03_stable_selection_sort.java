package sorting;

public class _03_stable_selection_sort {
    public static void sort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int m = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[m]){
                    m = j;
                }
            }
            int key = arr[m];
            while(m>i){
                arr[m] = arr[m-1];
                m--;
            }
            arr[i] = key;
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
