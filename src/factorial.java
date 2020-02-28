import java.io.*;
import java.math.BigInteger;
import java.net.URL;

public class factorial {
    public static void main(String args[]) throws IOException {
        int Number;
        FileReader file = null;
        URL url = new URL("https://raw.githubusercontent.com/roddy301/factorial/master/src/input.txt");
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String line = bufferedReader.readLine();
        int j = 1;
        while(line!=null){
            Number = Integer.parseInt(line);
            BigInteger answer = BigInteger.valueOf(1);

            long start = System.nanoTime();
            if (Number <= 1) {
                System.out.println(answer);
            } else {
                for (int i = Number; i > 1; i--) {
                    BigInteger temp = BigInteger.valueOf(i);
                    answer = answer.multiply(temp);
                }
            }
            long end = System.nanoTime();
            long diff = end - start;

            System.out.print("Request ID: "+j+"      ");
            System.out.print("Factorial of "+Number+": "+answer);
            System.out.println("     Time taken in nanoseconds: "+diff);
            line = bufferedReader.readLine();
            j++;
        }
    }
}
