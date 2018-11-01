package myGroup;

import static input.InputUtils.stringInput;
/**
 * Hello world!
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = stringInput("Please enter your name: ");
        System.out.println( "Hello " + name + "!");
    }
}
