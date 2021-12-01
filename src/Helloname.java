import java.util.Scanner;

public class Helloname {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Здравствуй <Ваше имя> ");
        String name = sc.nextLine();
        System.out.printf("Здравствуй %s\n", name);
        sc.close();
    }
}