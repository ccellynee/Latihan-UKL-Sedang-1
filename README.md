# Latihan-UKL-Sedang-1

Bagian 1:

        System.out.println("----- Faktorial dari suatu bilangan bulat positif -----");
        System.out.println("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

Pada bagian 1 program meminta pengguna menginput bilangan bulat positif.



Bagian 2:

        if (angka <0) {
            System.out.println("Harus bilangan bulat positif!");
        } else {
            int bilangan = 1;

Di bagian 2 program mendeteksi bilangan yang dimasukan apakah benar bilangan bulat positif, dengan kondisi jika bilangan = 0 atau kurang dari 0 (bilangan bulat negatif) maka program akan mengeluarkan output "Harus bilangan bulat positif!". Jika bilangan yang dimasukkan benar bilangan bulat positif maka program akan lanjut ke tahap berikutnya dan variabel bilangan disetting awalnya adalah 1, karena bilangan bulat positif dimulai dari angka 1.

Bagian 3: 

        for (int i = 1; i <= angka; i++) {
            bilangan = bilangan *i;
        }

Pada bagian 3 program melakukan perulangan dari i = 1 sampai i = angka, dan setiap kali perulangan, nilai bilangan dikalikan dengan i
Contoh kalau angka = 5:

i	bilangan (hasil sementara)
1	1 × 1 = 1
2	1 × 2 = 2
3	2 × 3 = 6
4	6 × 4 = 24
5	24 × 5 = 120

Jadi hasil akhirnya adalah 120, yaitu 5!.

Bagian 4:

        System.out.println("Faktorial dari " + angka + " adalah " + bilangan);

Program mengeluarkan output berupa hasil dari faktorial yang di input pengguna.

Screenshot hasil program:

<img width="1479" height="454" alt="Cuplikan layar 2025-11-04 165232" src="https://github.com/user-attachments/assets/0d8e7e25-5ea5-4a9e-b7a0-ec4c496db46a" />
