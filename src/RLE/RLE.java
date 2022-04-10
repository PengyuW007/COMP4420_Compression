package RLE;

public class RLE {
    public static void main(String[] args) {
        System.out.println(transformation("11111110010000000000000000000011111111111"));
        //System.out.println(encoding(7));
    }

    public static String transformation(String S) {
        String res = "";
        int len = S.length();
        int count = 0;

        if(S.charAt(0)=='1'){
            res+="1";
        }

        for (int i = 1; i < len; i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                count++;
            } else {
                //getCount and do encoding here
                //System.out.println("Before: "+res);
                res+=encoding(count);
               // System.out.println("After: "+ res);
                count = 0;
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
