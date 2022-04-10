package LZW;

public class Main {

    public static void main(String[] args){

        LZW lzw_compression = new LZW();

        String OriginalString = "= bibiisbibi";

        System.out.println("Original String-> "+OriginalString);

        System.out.println("Original String length -> "+OriginalString.length());

        String compressed = lzw_compression.lzw_compress(OriginalString);

        System.out.println("Compressed String -> "+compressed);

        System.out.println("Compressed length String -> "+compressed.length());

        String decompressed = lzw_compression.lzw_extract(compressed);

        System.out.println("Decompressed String -> "+decompressed);

    }
}
