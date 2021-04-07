package lt.bit.java.intro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A { public static void main(String[] args)
   {

        System.out.print("labas grupe;-)");
     int arr [] = { 56,16,9,20,2,0,110,44,190,85,1};
        System.out.println(Arrays.toString(arr));
        //isspausdinamas masyva prieš lyguojant.
        for (int i = 0; i < arr.length-1; i++ )
        {
            for ( int j = i + 1; j < arr.length; j ++)
            {
                if ( arr[i] > arr [j]) //Keisti, jei arr [i] yra didesnis nei arr [j]
                {
                    int temp = arr [i];
                    arr [i] = arr [j];
                    arr [j] = temp;
                }

                System.out.println( i + " :" +Arrays.toString(arr));
                //isspausdinamas  arr po lyguojimo.
            }
        }
  }


}

