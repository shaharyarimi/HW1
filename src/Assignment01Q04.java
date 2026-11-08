import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (move%array.length==0) {
            return  array;
        }
        if (array.length == 0) {
           return array;
        }
        if (direction != 'R'&& direction != 'L') {
            return array;
        }
        int actualMoveRight;
        if ((direction == 'R' && move > 0)||(direction == 'L' && move < 0) )
        {
            actualMoveRight = Math.abs(move) % array.length;
        }
        else{
            
              actualMoveRight = array.length - Math.abs(move)% array.length;  
            }
        int[] swicher = new int[array.length] ;
        for (int i=0; i< array.length; i++)
        {
            swicher[i] = array [i];
        }
        for (int i=0; i< array.length; i++)
        {
            array[(i+actualMoveRight)%array.length] = swicher [i];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}