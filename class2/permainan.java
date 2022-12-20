import java.util.Scanner;

public class permainan {
    public static void main(String[] args) {
        //paparan output-makluman awal aturcara
        System.out.println("aturcara permainan matematik-operasi tambah");

        //pengisytiharan pembolehubah scanner
        Scanner input = new Scanner(System.in);
        input.close();
        //ishtihar pembolehubah dan papar teks pertanyaan 
        int nom1 = (int) (Math.random()*101);
        int nom2 = (int) (Math.random()*101);

        System.out.println("nyatakan jawapan "+ nom1 +" + " + nom2 + "=");
        int jawapan = input.nextInt();

        //kawalan ulangan guna while
        while (nom1 + nom2 != jawapan){

        //papar output jika jawapan salah dan ulang tanya
        System.out.println("jawapan anda salah! sila cuba lagi... \n nyatakan jawapan "+ nom1 + "+" +nom2 + "=");
        jawapan = input.nextInt();
        }
        //papar output jika jawapan betul
        System.out.println("tahniah, jawapan anda betul!");
    }
}
