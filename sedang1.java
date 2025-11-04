import java.util.Scanner;

public class sedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         
        //menginput angka
        System.out.println("----- Faktorial dari suatu bilangan bulat positif -----");
        System.out.println("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        if (angka <0) {
            System.out.println("Harus bilangan bulat positif!");
        } else {
            int bilangan = 1;

        //hitung faktorial
        for (int i = 1; i <= angka; i++) {
            bilangan = bilangan *i;
        }

        System.out.println("Faktorial dari " + angka + " adalah " + bilangan);
        }
    }
}