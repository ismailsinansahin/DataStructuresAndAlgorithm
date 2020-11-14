package ds01_arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] array = {5,2,8,0,2,4,1,9,11};
        int temp;

        System.out.println("Ordered Array  : " + Arrays.toString(array));

        for (int i=0 ; i<array.length/2 ; i++){
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }

        System.out.println("Reversed Array : " + Arrays.toString(array));

    }

}
