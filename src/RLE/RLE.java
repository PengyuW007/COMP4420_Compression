package RLE;

public class RLE {
    public static void main(String[] args) {
        System.out.println(transformation("11010"));
        //System.out.println(encoding(7));
    }

    public static String transformation(String S) {
        String res = "";
        int len = S.length();
        int flag = 0;
        if (S.charAt(0) == '1') {
            res += "1";
        } else {
            res += "0";
        }

        for (int i = 1; i < len; i++) {
            if (S.charAt(i) != S.charAt(i - 1) || i == len - 1) {
                int count = i-flag;
                if(i==len-1){
                    count++;
                }
                res+=encoding(count);
                flag = i;
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
    }

}
