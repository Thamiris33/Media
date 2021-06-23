
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //primeira media

        int x = 7;
        int y = 8;
        int z = 9;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        int media1 = ((x+y+z)/3);

        System.out.println("Soma = " + (x+y+x));
        System.out.println("Media1 = " + (media1));

        //Segunda media

        int a = 5;
        int b = 4;
        int c = 6;

        System.out.println("Digite a: " + a);
        System.out.println("Digite b: " + b);
        System.out.println("Digite c: " + c);

        System.out.println("Soma = " + (a+b+c));
        int media2 = ((a+b+c)/3);
        System.out.println("Media2 = " + media2);
        int media3 = (media1 + (media2)/2);
        System.out.println("Media3 = " + media3);

        //Terceira media "Media das Medias"

        System.out.println("Soma3 = " + ((x+y+z) + (a+b+c)));

        System.out.println("Media5 = " + (((x+y+z)/3 + (a+b+c)/3))/3);





    }
}
