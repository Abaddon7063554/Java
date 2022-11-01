import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class babelkowe{

  static int[] show_table (int i ){
     int[] tablica = new  int[i];
     Random losowanie = new Random();
     for (int j = 0;j<tablica.length;j++){
         tablica[j]= losowanie.nextInt(20);
     }
     return tablica;
 }
    public static void main(String[] args){
        //  System.out.print(Arrays.toString(show_table(12)));
        int l = 10;
        int[] tablica = new  int[l];
        Random losowanie = new Random();
        for (int j = 0;j<tablica.length;j++){
            tablica[j]= losowanie.nextInt(20);
        }
        for (int j = 0;j<tablica.length;j++){
            System.out.print(tablica[j]+" | ");
        }
        System.out.println("---------------");
     //sortowanie babelkowe rosnąco
        int  i,j,a=1;
        int pomocnicza;
        for(j=0;j<tablica.length-1;j++) {
            for(i=0;i<tablica.length-1;i++) {
                if (tablica[i] > tablica[i + 1]) {
                    pomocnicza = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = pomocnicza;
                }
            }
        }
        System.out.println("Sortowanie babelkowe rosąco");
        for (int z = 0;z<tablica.length;z++){
            System.out.print(tablica[z]+" | ");
        }
        System.out.println("");
        System.out.println("Sortowanie babelkowe malejaco");
    //sortowanie babelkowe malejaco
        for(j=0;j<tablica.length-1;j++) {
            for(i=0;i<tablica.length-1;i++) {
                if (tablica[i] < tablica[i + 1]) {
                    pomocnicza = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = pomocnicza;
                }
            }
        }
        for (int z = 0;z<tablica.length;z++){
            System.out.print(tablica[z]+" | ");
        }

    }
}