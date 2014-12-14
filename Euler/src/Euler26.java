import java.math.BigDecimal;

public class Euler26 {

    public static void run() {
        int solutionValue = 0;
        int maxLength = 0;

        for (int i = 1; i < 1000; i++) {
            int length = getRepeatCountEuler26(i);
            if (length > maxLength) {
                solutionValue = i;
                maxLength = length;
            }
        }

        System.out.println("Solution is: " + solutionValue);
        System.out.println("Max length of: " + maxLength);
    }

    private static int getRepeatCountEuler26(int i){
        String str = new BigDecimal(1).divide(new BigDecimal(i), 10000, BigDecimal.ROUND_DOWN).toString();
        int repeatLength = 1;
        while (true){
            if (repeatLength*3 > str.length()){
                repeatLength=0;
                break;
            }

            String subStr1 = str.substring(str.length() - repeatLength, str.length());
            String subStr2 = str.substring(str.length() - repeatLength*2, str.length() - repeatLength);
            String subStr3 = str.substring(str.length() - repeatLength*3, str.length() - repeatLength*2);

            if(subStr1.equalsIgnoreCase(subStr2) && subStr2.equalsIgnoreCase(subStr3)){
                break;
            }
            repeatLength++;
        }
        return repeatLength;
    }

}
