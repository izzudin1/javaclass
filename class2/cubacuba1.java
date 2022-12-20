import java.util.Scanner;

public class cubacuba1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nombor integer dan ENTER: ");
        int nom1 = input.nextInt();
        int nom2 = input.nextInt();
        int nom3 = input.nextInt();

        operasiTambah(nom1,nom2,nom3);
        input.close();
    }

    public static void operasiTambah(int nom1,int nom2, int nom3) {
        int jumlah;
        jumlah=nom1+nom2+nom3;
        System.out.println(nom1 + "+" + nom2 + "+" + nom3 + "=" +jumlah);
    }
}

