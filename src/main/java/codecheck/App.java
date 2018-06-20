package codecheck;

import java.util.regex.Pattern;

public class App {

    private static String ENCODE = "encode";
    private static String DECODE = "decode";
    private static String ALIGN = "align";
    private static int SHIN_10 = 10;
    private static int SHIN_9 = 9;

    public static void main(String[] args) {
        String CMD = null;
        String NUM = null;
        for (int i = 0, l = args.length; i < l; i++) {
            //String output = String.format("argv[%s]: %s", i, args[i]);
            if (i == 0) {
                CMD = args[i].toString();
            } else {
                NUM = args[i].toString();
            }
        }
        String output = answer(CMD, NUM);
        System.out.println(output);
    }

    public static String answer(String CMD, String NUM) {
        String str = null;
        String cmd = CMD;
        String num = NUM;

        //処理
        if (ENCODE.equals(cmd)) {
            return replaceEncode(num);
        } else if (DECODE.equals(cmd)) {
            return replaceDecode(num);
        } else if (ALIGN.equals(cmd)) {
            return align(num);
        }
        return null;
    }
    /*
    public static String encode(String A, int B) {
        String str = A;
        int radix = B;
        int result = Long.valueOf(str, radix).intValue();
        //int result =(int)Long.parseLong(str, radix);
        return String.valueOf(result);
    }

    public static String decode(Long A, int B) {
        Long str = A;
        int radix = B;
        String result = Long.toString(str, radix);
        return result;
    }
   */
    public static String align(String A) {
        String result = null;
        String str = A;
        int base = Integer.parseInt(str, SHIN_9);

        return result;
    }

    public static boolean isNumber(String num){
        if(Pattern.matches("^[1-9]?[0-9]+$", num)){
            return true;
        }
        return false;
    }

    public static String replaceDecode(String str) {
        String result = null;
        result = str.replaceAll("a,A","0");
        result = str.replaceAll("b,B","1");
        result = str.replaceAll("c,C","2");
        result = str.replaceAll("d,D","3");
        result = str.replaceAll("e,E","4");
        result = str.replaceAll("f,F","5");
        result = str.replaceAll("g,G","6");
        result = str.replaceAll("h,H","7");
        result = str.replaceAll("i,I","8");
        return result;
    }
    public static String replaceEncode (String str) {
        String result = null;
        result = str.replaceAll("0","A");
        result = str.replaceAll("1","B");
        result = str.replaceAll("2","C");
        result = str.replaceAll("3","D");
        result = str.replaceAll("4","E");
        result = str.replaceAll("5","F");
        result = str.replaceAll("6","G");
        result = str.replaceAll("7","H");
        result = str.replaceAll("8","I");
        return result;
    }
}
