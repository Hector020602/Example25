import java.util.Scanner;
public class Example25 {
    public static void main(String[] argv) {
        int num,mult;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        num = input.nextInt();

        for(int i = 1; i <= 10; i++) {
            mult = i * num;
            System.out.println(num + " x " + i + " = " + mult);
        }
    }
}
