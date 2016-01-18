import java.util.Arrays;


public class sortAndInsertArray {
   public static void main(String args[])throws Exception{
        int array[] = { 100, 104, 105, 106, 101, 102, 103, 107, 108, 109 };
		System.out.println("The Array Is...");
        printArray(array);		
        System.out.println("--------------------------------------------");
		
        Arrays.sort(array);
        System.out.println("The Sorted Array Is...");
        printArray(array);		
        System.out.println("--------------------------------------------");
		
		int insertIndex = array.length;
        array = Arrays.copyOf(array, array.length + 1);
        array[insertIndex] = 200;
        System.out.println("After Inserted 200 The Array Is...");
        printArray(array);
        System.out.println("--------------------------------------------");
   }
	private static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");                     
        }
        System.out.println();
    }
}
