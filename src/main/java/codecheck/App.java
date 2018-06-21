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
        System.out.println(CMD);
        System.out.println(NUM);
        String output = answer(CMD, NUM);
        System.out.println(output);
    }

    public static String answer(String CMD, String NUM) {
        String str = null;
        String cmd = CMD;
        String num = NUM;
/*        String[] strNum = null;

        if (!isNumber(num)) {
                strNum = num.split("");
        }


        for (int i = 0, l = args.length; i < l; i++) {
            replaceDecode(strNum[i].toString());
        }
*/
        //処理
        if (ENCODE.equals(cmd)) {
            return encode(num, SHIN_9);
            //return replaceEncode(num);
        } else if (DECODE.equals(cmd)) {
            return decode(num, SHIN_9);
            //return replaceDecode(num);
        } else if (ALIGN.equals(cmd)) {
            return align(num);
        }
        return null;
    }

    public static String encode(String A, int B) {
        Long str = Long.parseLong(A);
        int radix = B;
        System.out.println(str.toString());
        String result = Long.toString(str, radix);

        //int result =(int)Long.parseLong(str, radix);
        return result;
    }

    public static String decode(String A, int B) {
        String str = A;
        int radix = B;
        int result = 0;
        String[] array = null;
        array = str.split("");
        System.out.println(String.valueOf(array[0].toString()));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
            System.out.println(replaceDecode(array[i].toString()));
            int a = 9^(array.length-1-i);
            System.out.println("jijo:"+a);

            result += Integer.parseInt(replaceDecode(array[i].toString()))*(9^(array.length-1-i));
        }
        System.out.println(String.valueOf(result));
        return String.valueOf(result);
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




    public static String replaceDecode(String str) {
        String result = null;
        //StringBuilder result = new StringBuilder();
        result = str.replaceAll("a,A","0");
        result = str.replaceAll("b,B","1");
        result = str.replaceAll("c,C","2");
        result = str.replaceAll("d,D","3");
        result = str.replaceAll("e,E","4");
        result = str.replaceAll("f,F","5");
        result = str.replaceAll("g,G","6");
        result = str.replaceAll("h,H","7");
        result = str.replaceAll("i,I","8");
        return result.toString();
    }
    public static String replaceEncode (String str) {
        StringBuilder result = new StringBuilder();
        result = result.append(str.replaceAll("0","A"));
        result = result.append(str.replaceAll("1","B"));
        result = result.append(str.replaceAll("2","C"));
        result = result.append(str.replaceAll("3","D"));
        result = result.append(str.replaceAll("4","E"));
        result = result.append(str.replaceAll("5","F"));
        result = result.append(str.replaceAll("6","G"));
        result = result.append(str.replaceAll("7","H"));
        result = result.append(str.replaceAll("8","I"));
        return result.toString();
    }
}
