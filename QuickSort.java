import java.util.Arrays;

public class QuickSort{
    
    public static  void main(String[] args) {
        int[] arr = {1,5,8,6,9,7,0,3};
        int firstindex = 0;
        int endindex = 7; 
        int[] res = qsort(arr, firstindex, endindex);
        System.out.println(Arrays. toString (res));
    }
    public static int[] qsort(int[] arr, int firstindex, int endindex){
        if (firstindex < endindex){
                int pivotindex = partition(arr, firstindex, endindex);
                qsort(arr,firstindex, pivotindex - 1);
                qsort(arr,pivotindex + 1, endindex);
        }
        return arr;
    }

    static int partition(int[] arr, int firstindex, int endindex){
        int pivot = arr[endindex];
        int i = firstindex - 1;

        for (int j = firstindex; j < endindex - 1; j++){
                if (arr[j] <= pivot){
                        ++i;
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[endindex];
        arr[endindex] = temp;

        return i + 1;
}

}