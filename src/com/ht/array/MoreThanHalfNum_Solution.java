package com.ht.array;

import java.util.HashMap;

/**
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum_Solution {
    public int moreThanHalfNum_Solution(int [] array) {

        if(array.length==1)return array[0];

        //用hashmap的键作为数组中的元素，value为改元素出现的次数，超过5就返回，结束循环
        HashMap<Integer,Integer> map = new HashMap<>();
        int midArrayLength = array.length/2;//数组一半长度
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int oldNum = map.get(array[i]);//之前出现的个数
                int newNum = oldNum+1;//在原来的基础上加一
                //大于数组长度一半，直接返回
                if(newNum>midArrayLength)return array[i];
                map.put(array[i],newNum);

            }else{
                //不存在，加入map中
                map.put(array[i],1);
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        MoreThanHalfNum_Solution m = new MoreThanHalfNum_Solution();
        int array[] = new int[]{};
        System.out.println(m.moreThanHalfNum_Solution(array));
    }

}
