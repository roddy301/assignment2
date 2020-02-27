import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class factorial {
    public static void main(String args[]) throws IOException {
        int Number;
        FileReader file = null;
        try {
            file = new  FileReader("input.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(file);

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
