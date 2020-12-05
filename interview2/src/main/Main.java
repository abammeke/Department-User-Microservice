package main;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String longest = "abcabcabcadsadsaasdgsa";
        //bcads
        Map<Integer, String> map = new HashMap<Integer, String>();

        for(int i =0; i<longest.length(); i++){
            String s = longest.charAt(i)+"";
            for(int j=i+1; j<longest.length()-1; j++){
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
                    s+=longest.charAt(j);
            }

        }

    }








//    public static void sort(int [] arr, int [] sorted){
//        int len = arr.length;
//        int min = arr[0];
//        for(int i=0; i<len; i++){
//            for(int j=0; j< len; j++){
//                if(min <arr[j]){
//                 //   swap(min, arr[j]);
//
//                }
//            }
//        }
//
//    }
//
//    private void swap(int a, int b){
//        int temp = a;
//        b=a;
//        a=temp;
//    }

}
