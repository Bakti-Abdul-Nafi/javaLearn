import java.util.Scanner;

public class test {
    public static void main(String args[]){
        System.out.println("Coba Program:");
        System.out.println("=====================");
        System.out.println();

        int i_angka,p_kotak,l_kotak;
        Scanner input = new Scanner(System.in);

        //program persegi
        System.out.println("Masukan inputan :");
        i_angka = input.nextInt();



        //logic persegi
        for (int i = 0; i<=i_angka;i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k =1; k<= i_angka-i;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
