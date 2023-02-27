public class Soal1
{
	public static void main(String[] args)
	{
		short angka1 = 32000;
		short angka2 = 768;
		short hasil = (short) (angka1+angka2);
 
		System.out.println("Hasil 1 "+hasil);
	}
}

/* program tidak akan menghasilkan jumlah angka dengan hasil 32768 karena range dari primitive data type short adalah 
   minimum -32768 dan maksimum 32767, maka ketika 32000 + 768 hasilnya akan -32768 karena perhitungannya akan kembali
   ke nilai minimum, contoh lain seperti 32000 + 769 hasilnya akan menjadi -32767 karena 32000 + 769 = 3276, 32769 - 32767 (nilai maks),
   = 2, karena hasilnya sudah melampui 32767 maka hasilnya akan kembali ke nilai minimum -32768 dan ditambah sisa dari nilai
   yang berlebih dari penjumlahan dan pengurangan nilai maks, maka hasilnya -32766. Untuk mendapatkan hasil yang sesuai maka
   jenis primitive data types harus diganti, menggunakan int.
 */
