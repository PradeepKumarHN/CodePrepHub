package strings;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("reverse of "+Arrays.toString(a)+" is "+Arrays.toString(reversedArray(a)));
    }
    public static int[] reversedArray(int[] a){
        int left=0,right=a.length-1,temp;
        while(left<right){
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return a;
    }
}
