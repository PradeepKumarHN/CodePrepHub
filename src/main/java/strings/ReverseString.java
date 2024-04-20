package strings;

public class ReverseString {
    public static void main(String[] args) {
    String str="pradeep";
        System.out.println("reverse of string "+str+" = "+reverseString(str));
        System.out.println("reverse of string "+str+" using StringBuilder = "+reverseStringUsingStringBuilder(str));
    }

    private static String reverseStringUsingStringBuilder(String str) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=str.toCharArray().length-1;i>=0;i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String reverseString(String str){
        char[] reversedString=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        char temp;
        while(left<right){
            temp=reversedString[left];
            reversedString[left]=reversedString[right];
            reversedString[right]=temp;
            left++;
            right--;
        }
        return new String(reversedString);
    }

}
