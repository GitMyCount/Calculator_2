import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s1 = scan.nextLine();

        ParsLine line = new ParsLine();
        line.parsLine = s1;
        line.setLine();
    }
}
