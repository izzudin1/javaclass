import java.util.Scanner;

public class nomborbulat {
    public static void main(String[] args) {
        
        //panggil semula sub aturcara 1,2 dan 3
        namaAnda();
        soalan();
        ucapan();
    }
    //sub1
    static void soalan(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan satu nombor bulat:");
        int nombor=input.nextInt();

        input.close();
        //tentukan nombor genap ganjil
        if(nombor % 2 == 0){
            System.out.println(nombor + "adalah nombor genap.");
        }else{
            System.out.println(nombor + "adalah nombor ganjil.");
        }
    }
    //sub2
    static void ucapan(){
        System.out.println("terima kasih, sila cuba lagi");
    }
    //sub3
    static void namaAnda(){
        System.out.println("tentukan nombor genap/ganjil");
        Scanner nama= new Scanner(System.in);
        System.out.println("nama anda :");
        String namaSendiri = nama.next();
        System.out.println("terima kasih : " +namaSendiri);

        nama.close();
    }

    
}


