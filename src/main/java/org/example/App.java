package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public App() throws Exception {
    }

    public static void main(String[] args ) throws Exception {

        System.out.println( "Hello World!" );
        Calculator calc = new Calculator();
        int result = calc.add(10,5);
        System.out.println("result = " + result);
    }
}
