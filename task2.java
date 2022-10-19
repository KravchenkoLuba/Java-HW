//Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class task2 {
    public void order(int array[])
    {
        int n = array.length;
 
        for (int i = n / 2 - 1; i >= 0; i--) {
          heapify(array, n, i);
        }
 
        for (int i=n-1; i>=0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
 
            heapify(array, i, 0);
        }
    }
 
    void heapify(int array[], int n, int i)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;  
 
        if (l < n && array[l] > array[largest])
            largest = l;
 
        if (r < n && array[r] > array[largest])
            largest = r;
 
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
 
            heapify(array, n, largest);
        }
    }
 
    static void printarray(int array[])
    {
        int n = array.length;
        for (int i=0; i < n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        int array[] = {1,12,9,5,3,6,2,7,4};
 
        var heapSort = new task2();
        heapSort.order(array);
        printarray(array);
    }
}

