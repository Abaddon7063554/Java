import java.util.Scanner;
//funkcja charCout zwraca wartość 1 lub 2
// jezeli wartośc jest wieksza bądz równa 0x10000 wartością jest 2 lub liczba 65536
// jezeli wartosc jest mniejsza niz 0x10000 wartością zwracaną jest
public class charCount
{
    public static void main(String[] args) throws InterruptedException {
       int   a;
        for(int i = 0 ; i<20 ; i++) {
           a = 1;
           Thread.sleep(100);
           System.out.println("widzimy :" +a + " value = "+Character.charCount(a));
           System.out.println(Character.toChars(a));
       }
    }
}