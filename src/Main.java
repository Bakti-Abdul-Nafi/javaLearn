import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner coba = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = coba.nextLine();
        System.out.println("Name is" + name);
        coba.close();
    }
}