import java.util.Scanner;

public class NumInWords {

    static String[] under = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen" };

    static String[] upper = {
            "","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
    };

    public static String inWords(int number){
        if(number < 20){
            return under[number];
        }
        if(number < 100){
            if(number%10!=0){
                return upper[number/10] + " " +under[number%10];
            }
            else{
                return upper[number/10];
            }
        }
        if(number < 1000){
            String s = under[number/100] + " hundred ";
            if((number/10)%10==0 && number%10==0){
                return s;
            }
            else if(number/100==0){
                return "and " + inWords(number%100);
            }
            else{
                return s + "and " + inWords(number%100);
            }
        }
        if(number < 100000){
            if(number%1000==0){
                return inWords(number/1000) + " thousands ";
            }
            else {
                return inWords(number/1000) + " thousands " + inWords(number%1000);
            }

        }
        return null;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Boolean in = true;
        while(in){
            int num = scan.nextInt();

            System.out.println(inWords(num));
        }

    }
}
