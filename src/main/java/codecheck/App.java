package codecheck;

import java.util.regex.Pattern;

public class App {

    private static String ENCODE = "encode";
    private static String DECODE = "decode";
    private static String ALIGN = "align";
    private static int SHIN_10 = 10;
    private static int SHIN_9 = 9;

    public static void main(String[] args) {
        String[] args = new String[2];
        String CMD = null;
        String NUM = null;
        for (int i = 0, l = args.length; i < l; i++) {
            //String output = String.format("argv[%s]: %s", i, args[i]);
             if (i == 0) {
                 CMD = args[i];
             } else {
                 NUM = args[i];
             }
        }
        String output = answer(CMD, NUM);
        System.out.println(output);
    }

    public static String answer(String CMD, String NUM) {
        String str = null;
        String cmd = CMD;
        String num = NUM;
        //引数二つ目の0判定
        //if (!num.isEmpty()) {
        //    str = num;
        //}

        //処理
        //if (isNumber(num) && ENCODE.equals(cmd)) {
            if (ENCODE.equals(cmd)) {
            return  encode(num, SHIN_10);
        } else if (DECODE.equals(cmd)) {
            Long numL = Long.parseLong(num);
            return decode(numL, SHIN_10);
        } else if (ALIGN.equals(cmd)) {
            return align(num);
        }
        return null;

    }

    public static String encode(String A, int B) {
        String str = A;
        int radix = B;
        Long result = Long.parseLong(str, radix);
        return String.valueOf(result);
    }

    public static String decode(Long A, int B) {
        Long str = A;
        int radix = B;
        String result = Long.toString(str, radix);
        return result;
    }

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
}
