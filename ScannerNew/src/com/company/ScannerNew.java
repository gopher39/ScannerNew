package com.company;
import java.util.Scanner;
public class ScannerNew {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean legaSoft = false;

        while (!str.equals("СТОП")){  //Если с клавиатуры введено слово "СТОП" - ввод прекращается
            if (str.equals("ЛегаСофт")){ //Если среди введенных слов есть слово ЛегаСофт
                legaSoft = true;
            }
            str = sc.nextLine();
        }
        if (legaSoft == true)
            System.out.println("YES"); //Если среди введенных слов есть слово ЛегаСофт, то напечатать YES
        else
            System.out.println("NO");
    }
}
