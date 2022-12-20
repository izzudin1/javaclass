//import class
import java.util.Scanner;
public class hasildarab {
    public static void main(String[] args) {

        //paparan output makluman atucara 
        System.out.println("ATURCARA PERMAINAN MATEMATIK OPERASI DARAB");

        //pengisytiharan pembolehubah Scanner
        Scanner input=new Scanner (System.in);

        //declaire pembolehubah dan papar teks pertanyaan
        int nom1, nom2;
        String jawab;
        
        //kawalan ulangan do while
        do{
            System.out.print("Nombor pertama");
            nom1=input.nextInt();
            System.out.print("Nombor kedua: ");
            nom2=input.nextInt();

            //paparan output
            System.out.println("hasil darab:" + nom1 + "X"+ nom2 + "=" + Math.abs (nom2*nom1));

            //pertanyaan ulangan 
            System.out.println("Taipkan Y untuk teruskan...");
            jawab=input.next();
            input.close();
            //ulangan selagi syarat ditepati 
        }while (jawab.equals("Y")||jawab.equals("y"));
        
    }
    
}
