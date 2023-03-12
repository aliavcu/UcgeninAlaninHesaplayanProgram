import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, Alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = input.nextInt();
        System.out.print("3. Kenarı giriniz : ");
        c = input.nextInt();

        u = (a + b + c)/2;
        Alan = u * (u - a) * (u - b) * (u -c);
        System.out.println("Alan : " + Alan);

    }

}