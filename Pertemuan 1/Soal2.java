public class Soal2
{
	public static void main(String[] args)
	{
		int i = 42;
		String s = (i<40)?"life":(i>50)?"universe":"everything";
		System.out.println(s);
	}
}

/* program ini menjelaskan tentang penggunaan if else pada program java, dimana pada code (String s = (i<40)?"life":(i>50)?"universe":"everything";)
   code akan mengambil nilai data dari int i yang telah di berikan sebelumnya, ketika nilai i kurang dari 40 maka program akan mencetak hasil "life"
   pada layar, ketika nilai i lebih dari 50 maka program akan mencetak hasil "universe" pada layar, dan jika nilai i tidak kurang dari 40 dan tidak 
   lebih dari 50 maka termasuk kedalam else program akan mencetak hasil "everything" pada layar sesuai dengan hasil awal program dimana nilai i di 
   deklarasikan nilai nya memiliki nilai 42, maka hasilnya "everything".
 */