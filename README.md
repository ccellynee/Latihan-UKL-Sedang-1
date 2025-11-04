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
