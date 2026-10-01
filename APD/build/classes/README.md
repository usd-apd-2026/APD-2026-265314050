````markdown
# Praktikum Algoritma dan Pemrograman Dasar

## C0 - Perbaikan Program Dasar

### Tabel Rancangan

| Komponen | Keterangan |
|---|---|
| Input | Nama dan umur |
| Proses | Membaca nama dan umur menggunakan Scanner |
| Output | Menampilkan nama dan umur |
| Tipe Data | String dan int |

### Pseudocode

```text
Mulai
Deklarasikan nama sebagai String
Deklarasikan umur sebagai integer

Input nama
Input umur

Tampilkan nama dan umur
Selesai
````

### Flowchart

```text
Mulai
  ↓
Input nama
  ↓
Input umur
  ↓
Tampilkan nama dan umur
  ↓
Selesai
```

---

## C1 - Operasi Aritmatika

### Tabel Rancangan

| Komponen  | Keterangan                                                               |
| --------- | ------------------------------------------------------------------------ |
| Input     | Dua bilangan integer a dan b                                             |
| Proses    | Penjumlahan, pengurangan, perkalian, pembagian, pembagian real, dan sisa |
| Output    | Hasil seluruh operasi aritmatika                                         |
| Tipe Data | int dan double                                                           |

### Pseudocode

```text
Mulai
Deklarasikan a dan b sebagai integer

Input a
Input b

jumlah = a + b
selisih = a - b
perkalian = a * b
pembagian = a / b
pembagianReal = a * 1.0 / b
sisa = a % b

Tampilkan semua hasil
Selesai
```

### Flowchart

```text
Mulai
  ↓
Input a dan b
  ↓
Proses operasi aritmatika
  ↓
Tampilkan hasil
  ↓
Selesai
```

---

## C2 - Total dan Rata-rata

### Tabel Rancangan

| Komponen  | Keterangan                     |
| --------- | ------------------------------ |
| Input     | Tiga nilai                     |
| Proses    | Menghitung total dan rata-rata |
| Output    | Total dan rata-rata            |
| Tipe Data | double                         |

### Pseudocode

```text
Mulai
Deklarasikan nilai1, nilai2, nilai3 sebagai double
Deklarasikan total sebagai double
Deklarasikan rataRata sebagai double

Input nilai1
Input nilai2
Input nilai3

total = nilai1 + nilai2 + nilai3
rataRata = total / 3.0

Tampilkan total
Tampilkan rata-rata
Selesai
```

### Flowchart

```text
Mulai
  ↓
Input 3 nilai
  ↓
Hitung total
  ↓
Hitung rata-rata
  ↓
Tampilkan hasil
  ↓
Selesai
```

---

## C3 - Paket dan Sisa Barang

### Tabel Rancangan

| Komponen  | Keterangan                                            |
| --------- | ----------------------------------------------------- |
| Input     | Jumlah barang dan kapasitas paket                     |
| Proses    | Menghitung paket penuh dengan `/` dan sisa dengan `%` |
| Output    | Jumlah paket penuh dan sisa barang                    |
| Tipe Data | int                                                   |

### Pseudocode

```text
Mulai
Deklarasikan jumlahBarang sebagai integer
Deklarasikan kapasitasPaket sebagai integer

Input jumlahBarang
Input kapasitasPaket

paketPenuh = jumlahBarang / kapasitasPaket
sisa = jumlahBarang % kapasitasPaket

Tampilkan paketPenuh
Tampilkan sisa
Selesai
```

### Flowchart

```text
Mulai
  ↓
Input jumlah barang
  ↓
Input kapasitas paket
  ↓
Hitung paket penuh
  ↓
Hitung sisa barang
  ↓
Tampilkan hasil
  ↓
Selesai
```

---

## C4 - Ringkasan Transaksi

### Tabel Rancangan

| Komponen  | Keterangan                                                   |
| --------- | ------------------------------------------------------------ |
| Input     | Nama depan, nama belakang, nama barang, harga satuan, jumlah |
| Proses    | Menggabungkan nama dan menghitung subtotal                   |
| Output    | Ringkasan transaksi                                          |
| Tipe Data | String, double, dan int                                      |

### Pseudocode

```text
Mulai
Deklarasikan firstName sebagai String
Deklarasikan lastName sebagai String
Deklarasikan namaBarang sebagai String
Deklarasikan hargaSatuan sebagai double
Deklarasikan jumlah sebagai integer

Input firstName
Input lastName
Input namaBarang
Input hargaSatuan
Input jumlah

fullName = firstName + " " + lastName
subtotal = hargaSatuan * jumlah

Tampilkan nama toko
Tampilkan nama pembeli
Tampilkan nama barang
Tampilkan harga dan jumlah
Tampilkan subtotal

Selesai
```

### Flowchart

```text
Mulai
  ↓
Input nama depan
  ↓
Input nama belakang
  ↓
Input nama barang
  ↓
Input harga dan jumlah
  ↓
Gabungkan nama
  ↓
Hitung subtotal
  ↓
Tampilkan ringkasan transaksi
  ↓
Selesai
```