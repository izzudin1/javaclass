import java.util.Scanner;

public class lebar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //intihar pembolehubah
        double lebar, tinggi;
        System.out.println("kira luas segitiga");

        //ambil nilai tinggi
        System.out.println("tinggi segitiga :");
        tinggi = keyboard.nextDouble();

        //ambil nilai lebar
        System.out.println("lebar segitiga");
        lebar = keyboard.nextDouble();

        keyboard.close();

        //panggil sub aturcara
        kiraSegitiga(tinggi,lebar);
    }
//sub aturcara guna perimeter
public static void kiraSegitiga(double tinggi, double lebar){
    //laksana operasi tanpa pulangkan nilai
    double luas = 0.5*tinggi*lebar;
    System.out.println("luas segitiga adalah"+luas+"persegi.");
}
}

