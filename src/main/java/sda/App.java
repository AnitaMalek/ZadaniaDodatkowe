package sda;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        // 1. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość największej z nich.

//        int a = 14;
//        int b = 9;
//        int c = 14;
//
//        if(a>=b && a>=c){     // a jest max?
//            System.out.println("Najwieksza jest liczba: "+a);
//        } else if(b>=a && b>=c){    // b jest max?
//            System.out.println("Najwieksza jest liczba:  "+b);
//        } else {     // Skoro nie a i b, to c jest max
//            System.out.println("Najwieksza jest liczba: "+c);
//        }

        // 2. Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie (wypisz na ekranie odpowiedni komunikat).

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbe...");
//        int t = scanner.nextInt();
//        if( t % 2 == 0 ) System.out.println("Podana liczba jest parzysta.");
//        else System.out.println("Podana liczba jest nieparzysta.");

        // 3. Sprawdź, czy wartość zmiennej jest większa, mniejsza, czy równa zero (użyj google żeby znaleźć odpowiedź,
// jak obsłużyć więcej niż dwa przypadki w instrukcji warunkowej).

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę do sprawdzenia: ");
//        int t = scanner.nextInt();
//        if (t > 0) {
//            System.out.println("Liczba jest większa od zera!");
//        } else if (t < 0) {
//            System.out.println("Liczba jest mniejsza od zera!");
//        } else {
//            System.out.println("Liczba jest warta tyle co zero ;)");
//        }

// 4. Rozwiąż zadanie 1. dla czterech zmiennych.

//        int a = 3004;
//        int b = 3004;
//        int c = 20;
//        int d = 3004;
//        if (a >= b && a >= c && a >= d) {
//            System.out.println("Liczba a jest największa");
//        } else if (b >= a && b>= c && b >= d) {
//            System.out.println("Liczba b jest największa");
//        } else if (c >= a && c >= b && c >= d) {
//            System.out.println("Liczba c jest największa");
//        } else {
//            System.out.println("Liczba d jest największa");
//        }

        // For: 1. Wypisz wszystkie liczby z zakresu 5 - 100.

//        int i;
//        for (i = 5; i <= 100; i++) {
//            System.out.println(i + ", ");
//        }

        // 2. Wypisz wszystkie liczby z zakresu 55 - 150.

//        for (int i = 55; i <= 150; i++) {
//            System.out.println(i + ", ");
//        }

        // 3. Wypisz wszystkie liczby z zakresu 1 - 100 zaczynając od 100.

//        int liczba = 100;
//
//        for (int i = liczba; i >= 1; i--) {
//            System.out.println(i + ", ");
//        }

        // 4. Wypisz wszystkie liczby parzyste z przedziału 0 - 100.

//        for (int i = 0; i <= 100; i++) {
//            if (i % 2  == 0) {
//                System.out.println(i + ", ");
//            }
//        }

        // 5. Dla liczb z przedziału 0 - 100 podaj informację, czy są podzielne przez 2, 3 i 5,
        // w następujący sposób:

//        for ( int i = 0; i <= 100; i++) {
//            if (i % 2 == 0 && i % 3 == 0 && i % 5 ==0) {
//                System.out.println(i + " Liczba jest podzielna przez 2, 3 i 5");
//            } else if  (i % 2 == 0 && i % 3 ==0) {
//                System.out.println(i + " Liczba jest podzielna przez 2 i 3");
//            }
//            else if (i % 2 == 0 && i % 5 == 0) {
//                System.out.println(i + " Liczba jest podzielna przez 2 i 5");
//            }
//            else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + " Liczba jest podzielna przez 3 i 5");
//            }
//            else if (i % 2 ==0) {
//                System.out.println(i + " Liczba jest podzielna przez 2.");
//            }
//            else  if (i % 3 == 0) {
//                System.out.println(i + " Liczba jest podzielna przez 3.");
//            }
//            else if (i % 5 ==0) {
//                System.out.println(i + " Liczba jest podzielna przez 5");
//            } else {
//                System.out.println(i + " Liczby nie da się podzielić przez 2, 3 ani 5");
//            }
//        }

        // 6. Podaj sumę wszystkich liczb z przedziału 1 - 459 (skorzystaj z pętli for).

//    int sum = 0;
//        for (int i = 1; i <= 459; i++) {
//            sum += i;
//            System.out.println("Sum = "  + sum);
//        }

        // 7. Podaj wartość sumy wyrazów ciągu arytmetycznego. Wartość pierwszego wyrazu ciagu to 5,
        // różnica każdych kolejnych dwóch wyrazów to 2. Chcemy zsumować 459 wyrazów (skorzystaj z pętli for).


//        double sum = 0;
//
//            for (int i = 5; i <= 459; i+=2) {
//                sum +=i;
//
//                System.out.println("Sum = " + sum);
//        }

//        8. Wypisz w konsoli:
//  *
//  **
//  ***
//  ****
//  *****
//  Wierszy w takim formacie chcemy uzyskać tyle, ile wynosi wartość przypisana zmiennej x.

//        int x = 10;
//        for (int i = 1; i <= x; i++) {  // odpowiada za ilosc * i linii
//            for (int j = x; j >= i / 2; j--) {  //odpowiada za spacje przed *
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i - 1; j++) {  // odpowiada za wypisywanie *
//                System.out.print("*");
//            }
//            System.out.println("");
//        }



        //char, charAt
//         1. Wypisz wszystkie litery angielskiego alfabetu.
//
//        char c;
//        for (c = 'A'; c <= 'Z'; c++) {
//            System.out.println(c);
//        }

//         2. Wypisz co drugi znak angielskiego alfabetu.
//
//        char c;
//        for (c = 'A'; c<= 'Z'; c+=2) {
//            System.out.println(c);
//        }

//         3. Wypisz znaki angielskiego alfabetu na wspak.
//
//        char c;
//        for (c = 'Z'; c >= 'A'; c--) {
//
//            System.out.println(c);
//        }
//
//         4. Znajdź największą literę w tekście "alfabet".
//
//        String s = "alfabet";
//        char result = s.charAt(0);
//        for(int i = 1; i < s.length(); i++)
//            result = result > s.charAt(i) ? result : s.charAt(i);
//        System.out.println(result);

        // 5. Zadeklaruj zmienną tekstową i przypisz jej wartość.
        // Wypisz wszystkie znaki wartości tej zmiennej w osobnych wierszach.


        // 6. Podaj liczbę wystąpień litery "a" w tekście "alfabet".


        // 7. Sprawdź, czy tekst jest palindromem (czy czytany od tyłu będzie taki sam).
        // 8. Sprawdź dla wybranego tekstu, dla której litery będziemy mieli
        // najdłuższy ciąg wystąpień tylko tej litery.
        // Przykładowo: aabbbccbb - dla tego tekstu będzie to b, które wystąpiło pod rząd 3 razy.
        // 9. Zadeklaruj i przypisz wartości dwóm zmiennym tekstowym. Następnie sprawdź,
        // czy pierwszy tekst zawiera drugi.

    }
    }

