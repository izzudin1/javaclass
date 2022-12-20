//import class
import java.util.Scanner;
public class permainan {
    public static void main (String[] args) {

        //paparan output-makluman awal aturcara
        System.out.println("ATURCARA PERMAINAN MATEMATIK-OPERASI DARAB");

        //pengisytiharan pembolehubah Scanner
        Scanner input=new Scanner (System.in);

      

        //Isytihar pembolehubah dan papar teks pertanyaan
        int nom1,nom2;
        String jawab;
        input.close();

        //kawalan ulangan do while 
        do{
            System.out.print("Nombor Pertama: ");
            nom1=input.nextInt();
            System.out.print("Nombor Kedua: ");
            nom2=input.nextInt();

            //paparan output 
            System.out.println("hasil darab: "+nom1+" X "+nom2+"="+Math.abs (nom2 * nom2));

            //pertanyaan ulangan 
            System.out.println("taipakn Y untuk teruskan..");
            jawab=input.next();

            //ulangan selagi syarat ditepati    
        }while (jawab.equals("Y") || jawab.equals ("Y"));
    }
    
}
