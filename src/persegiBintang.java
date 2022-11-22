import java.util.Scanner;
public class persegiBintang {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("##Program persegi panjang bintang##");
        System.out.println("===================================");
        System.out.println();

        int besar_persegi,i,j,lebar_persegi;
        System.out.println("Input besar persegi:");
        besar_persegi = input.nextInt();
//        System.out.println("Input lebar persegi:");
//        lebar_persegi = input.nextInt();
//        System.out.println();

        for (i=1; i<=besar_persegi;i++){
            for (j=1; j<=besar_persegi-i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
