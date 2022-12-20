public class senarainama {

    

    public static void main(String[] args) {
        String[] senarainama = {"kamal","zatil","ahmad","nurul"};
        String[] senarairumahsukan = {"marikh","pluto","bumi","marikh"};
        double [] senaraimata = new double[4];

        senaraimata[0]=35.2;
        senaraimata[1]=44.2;
        senaraimata[2]=56.1;
        senaraimata[3]=29.4;

        System.out.println("kedudukan markah untuk 4 peserta");
        System.out.println("peserta\trumah\tmata");
        for (int i=0; i<4;i++){
            System.out.println(senarainama[i]+"\t");
            System.out.println(senarairumahsukan[i]+"\t");
            System.out.println(senaraimata[i]);
            System.out.println();
        }
    } 
}
