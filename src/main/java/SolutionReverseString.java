import java.util.Stack;

/**
 * Created by daixulin on 7/21/16.
 */
public class SolutionReverseString {

    public static String reverseString(String s){
        char[] chars = new char[s.length()];
        int index = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            chars[index++] = s.charAt(i);
        }

        return new String(chars);
    }

    public static String reverseString1(String s){
        String resersed = "";
        for(int i = s.length() - 1; i >= 0; i--){
            resersed += s.charAt(i);
        }

        return resersed;
    }

    public static String reverseString2(String s){
        char[] arrChar = s.toCharArray();

        for(int i = 0,j = arrChar.length - 1; i <= j; i++, j--){
            char tmp = arrChar[i];
            arrChar[i] = arrChar[j];
            arrChar[j] = arrChar[i];
        }

        return new String(arrChar);
    }

    //fastest!!!
    public static String reverseString3(String s){
        char[] arrChar = s.toCharArray();
        char c;
        //for(int i = 0; i < s.length()/2; i++){
        for(int i = 0; i < arrChar.length/2; i++){
            c = arrChar[i];
            //arrChar[i] = arrChar[s.length() - i - 1];
            arrChar[i] = arrChar[arrChar.length - i - 1];
            arrChar[s.length() - i - 1] = c;
        }

        return new String(arrChar);
    }

    public static String reverseStringWord(String s){
        if(s == null || s.length() == 0){
            return "";
        }

        String[] parts = s.split(" ");
        Stack<String> stack = new Stack<String>();
        for(String val : parts){
            stack.push(val);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString();
    }
}
