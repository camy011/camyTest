public class Euler36 {

    public static void run() {
        int solution=0;

        for(int i=0; i<1000000; i++){
            String intForward=Integer.toString(i);
            if(!intForward.equals(new StringBuilder(intForward).reverse().toString())){
                continue;
            }

            String binaryForward=Integer.toBinaryString(i);
            if(binaryForward.equals(new StringBuilder(binaryForward).reverse().toString())){
                solution+=i;
            }
        }

        System.out.println("Solution is: " + solution);
    }

}