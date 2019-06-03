package com.ht.array;

public class FindGreatestSumOfSubArray {

    public static int findGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int tempMax = 0;
            for(int j=i;j<array.length;j++){
                tempMax += array[j];
                max = tempMax>max?tempMax:max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr [] = new int[]{6,7};
        System.out.println(findGreatestSumOfSubArray(arr));
    }

}
