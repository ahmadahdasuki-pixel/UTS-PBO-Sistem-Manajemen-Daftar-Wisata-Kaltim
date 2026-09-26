# Sistem Manajemen Daftar Wisata Kaltim

**Nama : Ahmad Ahdasuki** 

**NIM : 2509116021**

**Kelas : A Sistem Informasi 2025**

**Mata Kuliah : Pemograman Berbasis Objek**

# Penjelasan Progam

## 1. Deskripsi Program
Program yang dibuat adalah Sistem Manajemen Tempat Wisata di Kalimantan Timur yang dikembangkan menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO). Program ini digunakan untuk mengelola data tempat wisata yang terdapat di Kalimantan Timur, baik wisata alam maupun wisata buatan.

Program menyediakan beberapa fitur utama, yaitu menambah data wisata, menampilkan data wisata, memperbarui data wisata, menghapus data wisata, dan keluar dari program. Data wisata alam memiliki informasi khusus seperti jenis alam, tingkat kesulitan, dan fasilitas, sedangkan wisata buatan memiliki informasi seperti jenis wahana, jam operasional, dan batas usia.

Program juga menerapkan beberapa konsep dasar PBO, yaitu class, object, constructor, encapsulation, inheritance, polymorphism, condition, looping, dan ArrayList. Dengan konsep tersebut, data wisata dapat dikelola secara lebih terstruktur sesuai dengan karakteristik masing-masing jenis wisata.

## 2. Alur Program 
Ketika program pertama kali dijalankan, sistem akan menampilkan menu utama yang terdiri dari lima pilihan, yaitu Tambah Data Wisata, Tampilkan Data Wisata, Update Data Wisata, Hapus Data Wisata, dan Keluar. Pengguna dapat memilih menu dengan memasukkan angka sesuai pilihan yang tersedia.

Jika pengguna memilih Tambah Data Wisata, program akan meminta data umum seperti ID wisata, nama wisata, lokasi, dan harga tiket. Setelah itu pengguna memilih jenis wisata, yaitu Wisata Alam atau Wisata Buatan. Berdasarkan pilihan tersebut, program akan meminta atribut khusus dari masing-masing jenis wisata dan menyimpan data ke dalam ArrayList.

Jika pengguna memilih Tampilkan Data Wisata, program akan menampilkan seluruh data wisata yang tersimpan dan mengelompokkannya menjadi Wisata Alam dan Wisata Buatan. Jika memilih Update Data Wisata, pengguna memasukkan ID wisata kemudian program mencari data tersebut dan memperbarui informasi yang dipilih. Pada menu Hapus Data Wisata, pengguna memasukkan ID wisata dan program akan menghapus data yang sesuai.

Program menggunakan perulangan while sehingga menu akan terus ditampilkan setelah suatu proses selesai. Program hanya berhenti ketika pengguna memilih menu Keluar.

## 3. Penjelasan Setiap Class
MainWisata.java

Class MainWisata merupakan class utama yang digunakan untuk menjalankan program. Class ini berfungsi menampilkan menu utama dan menerima pilihan dari pengguna. Setiap pilihan menu akan diarahkan ke method yang sesuai pada class ManajemenWisata. Class ini juga menggunakan perulangan agar menu dapat terus ditampilkan sampai pengguna memilih menu keluar.

ManajemenWisata.java

Class ManajemenWisata berfungsi sebagai pusat pengelolaan data tempat wisata dalam program. Class ini menangani seluruh proses CRUD, yaitu menambahkan, menampilkan, memperbarui, dan menghapus data wisata. Data Wisata Alam dan Wisata Buatan disimpan menggunakan ArrayList, sedangkan proses pengolahan datanya dilakukan berdasarkan ID wisata yang dimasukkan oleh pengguna.

TempatWisata.java

Class TempatWisata merupakan superclass yang menyimpan data umum yang dimiliki oleh seluruh tempat wisata. Data tersebut meliputi ID wisata, nama wisata, lokasi, dan harga tiket. Class ini juga menyediakan constructor, getter, setter, serta method tampilkanData() yang digunakan sebagai dasar untuk penerapan inheritance dan polymorphism.

WisataAlam.java

Class WisataAlam merupakan subclass dari TempatWisata yang digunakan untuk menyimpan data khusus tempat wisata alam. Selain mewarisi data umum dari TempatWisata, class ini memiliki informasi tambahan berupa jenis alam, tingkat kesulitan, dan fasilitas. Class ini juga menerapkan method overriding pada tampilkanData() untuk menampilkan informasi yang sesuai dengan karakteristik wisata alam.

WisataBuatan.java

Class WisataBuatan merupakan subclass dari TempatWisata yang digunakan untuk mengelola informasi khusus tempat wisata buatan. Class ini mewarisi data umum dari TempatWisata dan menambahkan informasi berupa jenis wahana, jam buka, jam tutup, serta batas usia. Class ini juga melakukan method overriding pada tampilkanData() sehingga informasi yang ditampilkan dapat disesuaikan dengan karakteristik wisata buatan.

## 4. Penerapan Inheritence
Inheritance diterapkan dengan menjadikan TempatWisata sebagai superclass, sedangkan WisataAlam dan WisataBuatan sebagai subclass.
Penerapannya dapat dilihat pada kode berikut:
```
java
public class WisataAlam extends TempatWisata
......
public class WisataBuatan extends TempatWisata
```

Keyword extends menunjukkan bahwa kedua subclass tersebut mewarisi atribut dan method dari TempatWisata.
TempatWisata memiliki data umum seperti idWisata, namaWisata, lokasi, dan hargaTiket. Sementara itu, subclass menambahkan atribut yang lebih khusus sesuai dengan jenis wisatanya. WisataAlam memiliki jenisAlam, tingkatKesulitan, dan fasilitasAlam, sedangkan WisataBuatan memiliki jenisWahana, jamBuka, jamTutup, dan batasUsia.

## 5. Penerapan Condition IF/ELSE
Condition digunakan untuk menentukan tindakan program berdasarkan kondisi atau pilihan yang diberikan oleh pengguna. Pada program ini, if, else if, dan else digunakan terutama untuk menentukan menu yang dipilih dan menentukan jenis wisata.

Contohnya pada MainWisata:
```
java
if (pilihan == 1) {
    manajemen.tambahWisata();
} else if (pilihan == 2) {
    manajemen.tampilkanWisata();
} else if (pilihan == 3) {
    manajemen.updateWisata();
} else if (pilihan == 4) {
    manajemen.hapusWisata();
} else if (pilihan == 5) {
    berjalan = false;
} else {
    System.out.println("Pilihan tidak valid!");
}

```
Kode tersebut digunakan untuk menentukan proses yang dijalankan berdasarkan menu yang dipilih pengguna. 
Dengan adanya condition, program dapat memberikan proses yang berbeda sesuai dengan input pengguna.

## 6. Penerapan Looping
Looping digunakan untuk menjalankan suatu proses secara berulang. Pada program ini terdapat while dan for. while digunakan pada MainWisata untuk membuat menu utama terus berjalan sampai pengguna memilih menu keluar.

```
java
boolean berjalan = true;

while (berjalan) {
    // menampilkan menu
}
```
Ketika pengguna memilih menu 5, nilai berjalan diubah menjadi false sehingga perulangan berhenti.
Selain itu, for digunakan untuk membaca data yang tersimpan di dalam ArrayList. Contohnya:
```
java
for (WisataAlam wisata : daftarWisataAlam) {
    wisata.tampilkanData();
}
```

Kode tersebut akan melakukan perulangan terhadap seluruh data wisata alam yang tersimpan. Hal yang sama dilakukan pada data WisataBuatan.
Looping juga digunakan dalam proses pencarian ID saat melakukan update, hapus, maupun pengecekan ID yang sudah digunakan. Dengan demikian, looping membuat program dapat menjalankan menu secara berulang dan memproses banyak data wisata secara efisien.

## 7. Penerapan Polymorpishm - Method Overiding
Polymorphism diterapkan menggunakan method overriding, yaitu ketika subclass memiliki method dengan nama dan parameter yang sama dengan method pada superclass, tetapi memiliki isi atau implementasi yang berbeda.

Pada superclass TempatWisata terdapat method:
```
java
public void tampilkanData() {
    System.out.println("ID Wisata   : " + idWisata);
    System.out.println("Nama Wisata : " + namaWisata);
    System.out.println("Lokasi      : " + lokasi);
    System.out.println("Harga Tiket : Rp" + hargaTiket);
}
```

Method tersebut kemudian di-override pada WisataAlam:
```
java
@Override
public void tampilkanData() {
    System.out.println("ID Wisata          : " + getIdWisata());
    System.out.println("Nama Wisata        : " + getNamaWisata());
    System.out.println("Lokasi             : " + getLokasi());
    System.out.println("Harga Tiket        : Rp" + getHargaTiket());
    System.out.println("Jenis Alam         : " + jenisAlam);
    System.out.println("Tingkat Kesulitan  : " + tingkatKesulitan);
    System.out.println("Fasilitas          : " + fasilitasAlam);
}
```

Dan juga di-override pada WisataBuatan:
```
java
@Override
public void tampilkanData() {
    System.out.println("ID Wisata          : " + getIdWisata());
    System.out.println("Nama Wisata        : " + getNamaWisata());
    System.out.println("Lokasi             : " + getLokasi());
    System.out.println("Harga Tiket        : Rp" + getHargaTiket());
    System.out.println("Jenis Wahana       : " + jenisWahana);
    System.out.println("Jam Operasional    : " + jamBuka + " - " + jamTutup);
    System.out.println("Batas Usia         : " + batasUsia);
}
```
Walaupun menggunakan nama method yang sama, hasil yang ditampilkan berbeda. WisataAlam menampilkan informasi khusus wisata alam, sedangkan WisataBuatan menampilkan informasi khusus wisata buatan.

Pemanggilannya dilakukan melalui:
```
java
super.tampilkanDataUmum();
```
Dengan demikian, method tampilkanData() memiliki perilaku yang disesuaikan dengan class yang menggunakannya.

## 8. Dokumentasi Alur Program
**1. Menu Utama**

<img width="458" height="192" alt="image" src="https://github.com/user-attachments/assets/847fc539-7d06-41ee-bcb3-fc70fead31de" />

**2. Menu Tambah**

<img width="315" height="391" alt="image" src="https://github.com/user-attachments/assets/ea74920f-c9e1-4205-848e-2172fbdfb0e4" />


**3. Menu Tampilkan**

<img width="319" height="521" alt="image" src="https://github.com/user-attachments/assets/0811e5a5-a613-465b-85ad-bb79f15b1add" />


**4. Menu Update**

<img width="319" height="461" alt="image" src="https://github.com/user-attachments/assets/31129812-f924-4cea-904d-2989ac17c17a" />


**5. Menu Hapus**

<img width="283" height="368" alt="image" src="https://github.com/user-attachments/assets/2c2d26fa-f96c-43fa-bb4c-79f442f2bd65" />


**6. Keluar Program**

<img width="477" height="269" alt="image" src="https://github.com/user-attachments/assets/bf3478ef-5cae-48c9-96be-170e4c2ca32a" />

## 9. Kesimpulan Program
Program Sistem Manajemen Tempat Wisata di Kalimantan Timur berhasil dikembangkan menggunakan bahasa pemrograman Java dengan menerapkan konsep dasar Pemrograman Berorientasi Objek. Program dapat melakukan proses pengelolaan data berupa tambah, tampil, update, dan hapus terhadap data wisata alam dan wisata buatan.

Dalam implementasinya, program menerapkan inheritance melalui hubungan antara TempatWisata, WisataAlam, dan WisataBuatan. Polymorphism diterapkan menggunakan method overriding pada method tampilkanData(). Selain itu, condition digunakan untuk menentukan pilihan menu dan jenis wisata, sedangkan looping digunakan untuk menjalankan menu secara berulang dan mengolah data yang tersimpan dalam ArrayList.

Dengan penerapan konsep tersebut, program dapat mengelola data tempat wisata secara terstruktur sekaligus menunjukkan penerapan konsep PBO dalam sebuah studi kasus yang sederhana dan relevan.

