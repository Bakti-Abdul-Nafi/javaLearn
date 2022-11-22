import java.util.Scanner;
public class traCatch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("##Program java nilai terbesar##");
        System.out.println("===============================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count,i,max_num;
        System.out.println("Input jumlah elemen pada array:");
        arr_count = input.nextInt();
        System.out.println("Input " + arr_count + " angka :");

        //simpan angka yang dimasukan kedalam array
        for(i = 0; i< arr_count; i++){
            arr[i] = input.nextInt();
        }
        System.out.println();

        //mencari nilai terbesar
        max_num = arr[0];
        for (i = 0; i< arr_count; i++){
            if(arr[i] > max_num){
                max_num = arr[i];
            }
        }
        System.out.println("Nilai array terbesar yaitu " + max_num);
    }
}
