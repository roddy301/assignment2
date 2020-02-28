import java.io.*;
import java.math.BigInteger;
import java.net.URL;

public class fibonacci {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://raw.githubusercontent.com/roddy301/assignment2/master/input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line = bufferedReader.readLine() ;
        int j = 1;
        while(line != null){
            int Number;
            BigInteger First_Value = BigInteger.valueOf(0);
            BigInteger Second_Value = BigInteger.valueOf(1);
            BigInteger Next;

            Number = Integer.parseInt(line);
            System.out.print(j+",");
            long start = System.nanoTime();
            System.out.print("\"");
            for(int i = 0; i <= Number; i++) {
                if (i <= 1) {
                    System.out.print(i+"-");
                } else {
                    Next = First_Value.add(Second_Value);
                    First_Value = Second_Value;
                    Second_Value = Next;
                    System.out.print(Next + "-");
                }
            }
            System.out.print("\",");
            long end = System.nanoTime();
            long diff = end - start;
            System.out.println(diff);
            line = bufferedReader.readLine();
            j++;
        }
    }
}
