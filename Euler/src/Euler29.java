import java.math.BigInteger;
import java.util.Set;
import java.util.HashSet;

public class Euler29 {

    public static void run() {
        Set<BigInteger> result = new HashSet<BigInteger>();
        for(int a=2; a<=100; a++){
            for(int b=2; b<=100; b++){
                result.add(BigInteger.valueOf(a).pow(b));
            }
        }

        System.out.println("Solution is: " + result.size());
    }

}
