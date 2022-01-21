import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int number =inp.nextInt();
        int tempNumber=number;
        int basNumber=0;
        int basValue;
        int result=0;

        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;

        }
        System.out.println(basNumber);
        tempNumber=number;
        
        while (tempNumber!=0) {
            basValue = tempNumber % 10;
            System.out.println(basValue);
            tempNumber /= 10;
            result+=basValue;

        }
        System.out.println(result);
    }
}
