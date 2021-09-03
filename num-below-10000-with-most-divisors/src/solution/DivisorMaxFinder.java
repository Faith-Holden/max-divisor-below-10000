package solution;

public class DivisorMaxFinder {
    public static void main(String[] args){
        int biggestDivisor = 0;
        int numWithBiggestDivisor = 0;
        for (int i=1; i<=10000; i++){
            int divisorCounter = 0;
            for (int j = 1; j<=i; j++){
                if(i%j==0){
                    divisorCounter++;
                }
            }
            if(divisorCounter>biggestDivisor){
                biggestDivisor = divisorCounter;
                numWithBiggestDivisor = i;
            }
        }
        System.out.print("The first number with the maximum number of divisors between 1 and 10,000 is ");
        System.out.print(numWithBiggestDivisor);
        System.out.print(", which has ");
        System.out.print(biggestDivisor);
        System.out.println(" divisors.");
    }
}
