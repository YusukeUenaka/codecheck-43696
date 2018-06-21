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
        int[] arrayNum = null;
        array = str.split("");
        //System.out.println(String.valueOf("1:"+array[0].toString()));
        int k = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            System.out.println(String.valueOf("1:"+array[i].toString()));
            String tmp = replaceDecode(array[i].toString());
            System.out.println("2:"+tmp);
            //arrayNum[i] = Integer.valueOf(tmp).intValue();
            System.out.println("4:"+String.valueOf(Math.pow(9,(array.length-1))));
            if ((array.length-i) > 0) {
                result += Integer.valueOf(tmp).intValue() * (Math.pow(9, (array.length)));
                System.out.println("3:"+result);
            } else if ((array.length-i) == 0) {
                result += Integer.valueOf(tmp).intValue();
                System.out.println("5:"+result);
            }
            //System.out.println("3:"+String.valueOf(arrayNum[i]));
            System.out.println("3:"+result);
        }
//        for (int i = 0; i < arrayNum.length; i++) {
//            result += arrayNum[i]*(9^arrayNum.length);
//        }

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
        switch(str) {
            case "A":
                result = str.replaceAll("A","0");
                break;
            case "B":
                result = str.replaceAll("B","1");
                break;
            case "C":
                result = str.replaceAll("C","2");
                break;
            case "D":
                result = str.replaceAll("D","3");
                break;
            case "E":
                result = str.replaceAll("E","4");
                break;
            case "F":
                result = str.replaceAll("F","5");
                break;
            case "G":
                result = str.replaceAll("G","6");
                break;
            case "H":
                result = str.replaceAll("H","7");
                break;
            case "I":
                result = str.replaceAll("I","8");
                break;
        }
        /*
        result = str.replaceAll("A","0");
        result = str.replaceAll("B","1");
        result = str.replaceAll("C","2");
        result = str.replaceAll("D","3");
        result = str.replaceAll("E","4");
        result = str.replaceAll("F","5");
        result = str.replaceAll("G","6");
        result = str.replaceAll("H","7");
        result = str.replaceAll("I","8");
        */
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
