package javaNew.academy.StaticImport;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static javaNew.academy.StaticImport.Config.*;

public class StaticImportExample {
    public static void main(String[] args) {
        int min = min(5,7);
        out.println("min = " + min);

        out.println(PI);

        printConfig();
        out.println("Name = " + NAME);
        out.println("CONST_NUMBER = " + CONST_NUMBER);

    }
}
