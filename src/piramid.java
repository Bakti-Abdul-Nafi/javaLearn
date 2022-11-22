import java.util.Scanner;

public class piramid {
    public static void main(String args[]){
        System.out.println("Program Piramid");
        System.out.println("================");
        System.out.println();

        int t_piramid;
        Scanner input = new Scanner(System.in);
        System.out.println("masukan tinggi piramid:");
        t_piramid = input.nextInt();
        System.out.println();

        for (int i = 0; i<= t_piramid; i++){
            for (int j =1; j<= t_piramid-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= i; k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
