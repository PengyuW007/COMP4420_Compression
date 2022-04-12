package RLE;

import java.util.*;

public class RLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String S = scanner.next();


        System.out.println(transformation(S));
    }

    public static String transformation(String S) {
        String res = "";
        int len = S.length();
        int count = 1;
        if (S.charAt(0) == '1') {
            res += "1";
        } else {
            res += "0";
        }

        for (int i = 1; i < len; i++) {
            if(S.charAt(i)==S.charAt(i-1)){
                count++;
                if(i==len-1){
                    res+=encoding(count);
                }
            }else {
                if(i!=len-1){
                    res+=encoding(count);
                }
                count = 1;
            }
        }

        return res;
    }//end transformation

    private static String encoding(int k) {
        String bin = Integer.toBinaryString(k);
        int len = bin.length() - 1;
        for (int i = 0; i < len; i++) {
            bin = "0" + bin;
        }
        return bin;
    }//end encoding

}
