import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class wczytywanie_pliku {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner pobierz = new Scanner(new File("C:\\Users\\Łukasz\\Documents\\GitHub\\Java\\programy\\wczytywanie\\plik.txt"));
        double srednia=0,i=1;
        while(pobierz.hasNextDouble()) //zwraca true jezeli następna wartość z pliku
        {                            // jest interpretowana jako int.
           srednia +=pobierz.nextDouble();
           i++;

        }
        System.out.println(i);
        System.out.println(srednia);
        System.out.println(srednia/i);



        pobierz.close();
    }
}