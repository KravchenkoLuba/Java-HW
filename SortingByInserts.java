public class SortingByInserts {
    public static void sortingByInserts(int[] array){
        for(int i = 1; i < array.length; i++  ){
            int current = array[i];
            int j = i;
            while(j > 0 && array[j-1] > current){
                array[j] = array[j-1];
                j--;
            }
            array[j] = current;
        }
    }
    
    public static void printarray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf( "%d ", array[i]);
        }
    }
    

    public static void main(String[] args){
        int[] myarray = new int[] {5, 2, 6, 8, 4, 1, 12, 15};
        sortingByInserts(myarray);
        printarray(myarray);
    }
}
