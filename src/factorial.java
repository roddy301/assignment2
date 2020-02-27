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
        while(line!=null){
            Number = Integer.parseInt(line);
            BigInteger answer = BigInteger.valueOf(1);
            if (Number <= 1) {
                System.out.println(answer);
            } else {
                for (int i = Number; i > 1; i--) {
                    BigInteger temp = BigInteger.valueOf(i);
                    answer = answer.multiply(temp);
                }
                System.out.println("Factorial of "+Number+":"+answer);
            }
            line = bufferedReader.readLine();
        }
    }
}
