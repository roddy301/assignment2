import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;

public class factorial {
    public static void main(String args[]) throws IOException {
        int Number;
        URL url = new URL("https://raw.githubusercontent.com/roddy301/assignment2/master/input.txt");
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

            System.out.print(j+",");
            System.out.print(answer+",");
            System.out.println(diff);
            line = bufferedReader.readLine();
            j++;
        }
    }
}
