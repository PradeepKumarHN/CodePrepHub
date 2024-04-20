package integers;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b=Arrays.copyOf(a,a.length);
        System.out.println("reverse of "+Arrays.toString(a)+" is "+Arrays.toString(reversedArray(a)));
        System.out.println("reverse of "+Arrays.toString(b)+" is "+Arrays.toString(reversedArrayUsingForLoop(b)));
    }

    private static int[] reversedArrayUsingForLoop(int[] a) {
        int[] b=new int[a.length];
        for (int i = a.length-1; i >=0 ; i--) {
            b[i]=a[i];
        }
        return b;
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
