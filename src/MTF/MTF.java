package MTF;

import java.util.*;

public class MTF {
    static ArrayList<Character> Alphabet = alphabet();

    public static void main(String[] args) {
        String S = "INEFFICIENCIES";
        ArrayList<String> mtf = mtf(S);

        for (int i = 0; i < Alphabet.size(); i++) {
            System.out.println(Alphabet.get(i));
        }

    }

    public static ArrayList<String> mtf(String S) {
        int len = S.length();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            /*
            for(int j = 0;j<26;j++){
                if(S.charAt(i)==Alphabet.get(j)){
                    char curr = S.charAt(i);
                    res.add(i+"");
                    Alphabet.remove(i);
                    Alphabet.add(0,curr);
                    break;
                }
            }
            */
            int j = 0;
            while(j>26||S.charAt(i)==Alphabet.get(j)){
                char curr = S.charAt(i);
                res.add(i+"");
                Alphabet.remove(i);
                Alphabet.add(0,curr);
                j++;
            }
        }
        return res;
    }

    static ArrayList<Character> alphabet() {
        ArrayList<Character> table = new ArrayList<>();
        char cap = 'A';
        for (int i = 0; i < 26; i++) {
            table.add(cap++);
        }
        return table;
    }

    public static void print() {
        for (int i = 0; i < 26; i++) {
            System.out.println(Alphabet.get(i));
        }
    }
}
