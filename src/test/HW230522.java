package test;

public class HW230522 {
    public static void main(String[] args) {
        /*
        Implement a method that returns how many times the given int are present in the given array
({10, 3, 23, 5, -9, 1, 3,-7},3) -> 2
         */
        int [] newArr = {10, 3, 23, 5, -9, 1, 3,-7};
        int forchek=3;
        System.out.println(howManyTimesInt(newArr,forchek));
    }
    public static int howManyTimesInt(int[] newArr,int forchek){
        int counter=0;
        for (int j : newArr) {
            if (j == forchek) {
                counter++;
            }
        }
        return counter;
    }
}
