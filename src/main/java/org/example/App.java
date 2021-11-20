package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int a1, int a2) {
        return a1 + a2;
    }

    public static void main( String[] args )
    {
        App a = new App();
        System.out.println("result = " + a.add(1, 3));
    }
}
