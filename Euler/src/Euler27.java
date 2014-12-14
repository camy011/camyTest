import java.util.HashSet;
import java.util.Set;

public class Euler27 {

    static final int LOWER_BOUND=-999;
    static final int UPPER_BOUND=999;

    private static Set<Integer> knownPrimes = new HashSet<Integer>();
    public static void run() {
        knownPrimes.add(2);
        int maxA=0, maxB=0, maxPrimes=0;

        for(int a=LOWER_BOUND; a<=UPPER_BOUND; a++){
            for(int b=LOWER_BOUND; b<=UPPER_BOUND; b++){
                int primes=0;
                int n=0;
                while(isPrime(n*n+a*n+b)){
                    primes++;
                    n++;
                }
                if(primes>maxPrimes){
                    maxA=a;
                    maxB=b;
                    maxPrimes=primes;
                }
            }
        }

        System.out.println("Solution is: " + "a=" + maxA + ", b=" + maxB + ", product=" + maxA*maxB);
    }

    private static boolean isPrime(int value){
        if(value<2){ return false; }
        if(value==2){ return true; }
        if(value%2==0){ return false; }
        if(knownPrimes.contains(value)){ return true; }

        for(int i=3; i<=Math.sqrt(value); i+=2){
            if(value%i==0){
                return false;
            }
        }

        knownPrimes.add(value);
        return true;
    }

}