import java.lang.*;
import java.io.*;
import java.util.*;

class Reversestring {
    public static void main(String[] args){
        String input="nilesh";
        //String output=""; 
        int left,right=0;
        char[] arr=input.toCharArray();
        right=arr.length-1;
        //int i=0;
        //byte[] strAsByteArray=input.getBytes();
        //byte[] result=new byte[strAsByteArray.length];
        //for(int i=0;i<strAsByteArray.length;i++)
        //    result[i]=strAsByteArray[strAsByteArray.length-i-1];
        //System.out.println(new String(result));
        char temp;
        for(left=0;left<right;left++,right--)
        {    
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        input=String.valueOf(arr);
        System.out.println(arr);
        }   
    
}
