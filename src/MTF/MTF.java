package MTF;

import java.util.*;

public class MTF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type string here: ");
        String S = scan.next();
        //String S = "INEFFICIENCIES";
        ArrayList<String> res = mtf(S);

        System.out.println("Your result: ");
        System.out.println(res.toString());

    }

    public static ArrayList<String> mtf(String S) {
        ArrayList<Character> Alphabet = alphabet();
        int len = S.length();

        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            int j = 0;
            while (S.charAt(i) != Alphabet.get(j)) {
                j++;
            }
            char curr = Alphabet.get(j);
            res.add(j+"");
            Alphabet.remove(j);
            Alphabet.add(0,curr);
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


}
