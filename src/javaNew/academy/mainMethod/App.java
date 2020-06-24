package javaNew.academy.mainMethod;

import javaNew.academy.a.b.c.d.*;

public class App {
    public static void main(String[] args) {
        for(int i = 0; i<args.length;i++){
            System.out.println("args ["+i+"] = "+ args[i]);
        }
        sum(8,1);
        ExampleClass exampleClass = new ExampleClass();
        ImportExample importExample = new ImportExample();
    }

    /**
     * Calculates sum of two integers
     *
     * @param a operand a
     * @param b operand b
     * @return sum
     */
    public static int sum(int a, int b){
        return a + b;
    }
}
