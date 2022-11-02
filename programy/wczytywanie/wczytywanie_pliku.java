import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class wczytywanie_pliku {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner pobierz = new Scanner(new File("C:\\Users\\Łukasz\\Documents\\GitHub\\Java\\programy\\wczytywanie\\plik.txt"));

        while(pobierz.hasNextInt()) //zwraca true jezeli następna wartość z pliku
        {                            //daje jest interpretowana jako int.
            System.out.println(pobierz.nextInt());
        //    System.out.println(pobierz.skip("1"));
        }
        pobierz.close();
    }
}