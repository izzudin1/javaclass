

import java.util.Scanner;

public class konsonanvokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sila masukkan perkataan");

        String perkataan = input.next();
        char[] hurufv = perkataan.toCharArray();
        int vokal = 0;

        for (char h: hurufv){
            if(h == 'a' || h == 'A' || h == 'e' || h == 'E' || h == 'i' || h == 'I' || 
            h == 'o' || h == 'O' || h == 'u' || h == 'U') {

                vokal++;
            }
            input.close();
        }
        System.out.println("Bilangan huruf vokal dalam " + perkataan +""+ " adalah: " + vokal);
        System.out.println("Bilangan huruf konsonan dalam " + perkataan +""+ " adalah: " + (hurufv.length - vokal));
    }    
}

