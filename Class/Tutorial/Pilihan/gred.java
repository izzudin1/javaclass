//SOALAN 1 AKTIVITI 5.1.1
import java.util.Scanner;
public class gred {
    public static void main(String[] args) {
        System.out.println("Atucara mengesan Gred yang dimasukan");
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan markah math");
        int math = input.nextInt();
        System.out.println("Masukkan markah sains");
        int sn = input.nextInt();
        
        input.close();
        if (math == sn){
            System.out.println("gred yang diperolehi sama");
        }
        else{
            System.out.println("gred tidak sama");
        }
        
    }
    
}
