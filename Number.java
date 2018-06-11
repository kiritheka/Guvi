import java.util.Scanner;

public class Number{
 public  String numberCheck(int number) {
         if(number>0){
           return "Positive";
           }else if(number<0){
               return "Negative";
           }else{
               return"Zero";
           }
         }

     public static void main(String []args){
         Number number = new Number();
        Scanner sc = new Scanner(System.in);         int number = sc.nextInt();
         String result = number.numberCheck(number);
        System.out.println("Input: " + number);
        System.out.println("Output: " + result);
     }
}
