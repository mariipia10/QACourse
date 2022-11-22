/*
 * 
 * 
 */

package firstHomework;

/**
 *
 * @author piahe
 */
public class SortingAlgorithm {
    public static void main(String args[]){
        int[] intArray = new int[] {4,8,6,17,1};
        System.out.println("PRESORT");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            
        }
        sort(intArray);
        System.out.println("SORTED");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            
        }
    
    
    }
    
    
      //Bubble Sort
    public static void sort(int[] array) {

        boolean flag = true;

        while (flag) {

            flag = false;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    flag = true;

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }


    }

}
