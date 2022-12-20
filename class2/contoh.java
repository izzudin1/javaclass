//import Scanner
import java.util.Scanner;
public class contoh {
    public static void main(String[] args) {
        
        //declaire pembolehubah Scanner
        Scanner input = new Scanner (System.in);

        //matlumat awal atucara
        System.out.println("ATURCARA MENETUKAN TAHAP UMUR");
        //papar teks pertanyaan
        System.out.println("Taip umur anda dan tekan enterL: ");
        int umur = input.nextInt();
        input.close();
        //kawalan if-else-if dengan operator hubungan dan logik
        if(!(umur > 11)) {
            System.out.println("anda masih kanak kanak");
        }
        else if (umur > 18 && umur <= 35) {
            System.out.println("anda sudah dewasa");
        }
        else if (umur == 36 || umur <=60){
        System.out.println("Anda sudah dipertengahan dewasa");
        }
        else{
            System.out.println("Anda sudah warga emas");
        }
        
    }
    
}
