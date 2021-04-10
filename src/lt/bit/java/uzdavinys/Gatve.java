package lt.bit.java.uzdavinys;

public class Gatve {
    public static void main(String[]args) {
        // vienos gatves pozymiai:
        //- kodas
        //-pavadinmas
        //-masyvas-kilometras
        //-masyvas - plotas
        // pvz:
        //   kodas:       10
        //  pavadinimas:  Laisves al.
        // kilometras:   [2.0 km, 3.4 km,  5.9 km]
        // plotas :      [2 juostos, 2 juostos, 6 juostos ]

        int[] kodai = {10,11,12 };
        String[] pavadinimai = {"Laisves al","Vytauto pr. ","Maironio g."};
        double[][] km = {

                {2.0, 3.4, 5.9 },
                {0.0, 0.5, 0.75,1.2, 3.4},
                {0.0, 0.3, 1.1, 1.8}
        };
        int[][] plotis = {
                {2, 2, 6},
                {5, 4, 4, 4, 6},
                {2, 2, 2, 2}
        };
        for(int i = 0; i < kodai.length; i++){
            System.out.print(kodai[i] + " " + pavadinimai [i] + ", sankryzos: " );
            for (int k = 0; k < km[i].length; k++){
                System.out.print(km[i][k] + " (" + plotis[i][k] + "),");
            }
            System.out.println();
        }
          //Strukturos!!!
        class Sankryza {
            double km;
            int plotis;
        }
        class Gatve {
            int kodas;
            String pavadinimas;
            double[] km;
            int[] ploti;
            Sankryza[] sankryzos;
        }
          Gatve gatve = new Gatve();
          gatve.kodas = 10;
          gatve.pavadinimas ="laisves al.";
          gatve.sankryzos = new Sankryza[3];
          gatve.sankryzos[0] = new Sankryza();
          gatve.sankryzos[0].km = 2.0;
          gatve.sankryzos[0].plotis = 2;
          gatve.sankryzos[1] = new Sankryza();
          gatve.sankryzos[1].km = 3.4;
          gatve.sankryzos[1].plotis = 2;
          gatve.sankryzos[2] = new Sankryza();
          gatve.sankryzos[2].km = 5.9;
          //gatve.sankryzos[2}.plotis = 2;

        System.out.print(gatve.kodas + " " + gatve.pavadinimas + " sankryzos: " );










    }
}
