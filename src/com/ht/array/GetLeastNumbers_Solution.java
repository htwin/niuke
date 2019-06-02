package com.ht.array;

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumbers_Solution {
    public ArrayList<Integer> getLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        //排序，找到前k个数
        if(k<=input.length) {
            Arrays.sort(input);
            for (int i = 0; i < k; i++) {
                list.add(input[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int array [] =new int[]{4,5,1,6,2,7,3,8};
        GetLeastNumbers_Solution g = new GetLeastNumbers_Solution();
        ArrayList<Integer> list = g.getLeastNumbers_Solution(array, 4);
        for(int i:list){
            System.out.println(i);
        }
    }
}
