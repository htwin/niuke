package com.ht.list;

import java.util.*;

public class Test01 {
    public ArrayList<String> Permutation(String str) {
        if(str!=null&&str.length()>0){
            ArrayList<String> list = new ArrayList<>();
            getSubSort(str.toCharArray(),0,list);
            Collections.sort(list);
            return list;
        }
        return null;
    }

    private void getSubSort(char[] c, int i, List<String> list){
        if(i==(c.length-1)){
            list.add(String.valueOf(c));
        }else{

            Set<Character> charSet  = new HashSet<Character>();

            for(int j=i;j<c.length;++j){
                if(j==i||!charSet .contains(c[j])){
                    charSet.add(c[j]);
                    swap(c,i,j);
                    getSubSort(c,i+1,list);
                    swap(c,j,i);
                }
            }

        }
    }
    private void swap(char[] c,int i,int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void main(String[] args) {
        Test01 t = new Test01();
        t.Permutation("abc");
    }

}
