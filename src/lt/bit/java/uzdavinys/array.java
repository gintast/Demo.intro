package lt.bit.java.uzdavinys;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int a[][] = new int[3][2]; //declarion
        //dedami elementai/reiksme i masyva
        a[0][0] = 10;
        a[0][1] = 20;

        a[1][0] = 30;
        a[1][1] = 40;

        a[2][0] = 50;
        a[2][1] = 60;


     /*   //kilpos kunas
        //interacija jo eiluteja
        for (int i = 0; i <= 2; i++) {


            System.out.println();
            //interacija  stulpeliu kiek viena eilute
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j] + " ");//10 20 30 40 50 60
            }
            System.out.println();
        }*/
        for(int i[]:a){
            for(int j:i){
                System.out.print(j+"  ");//10 20 30 40 50 60
            }
            System.out.println();
        }
    }
}