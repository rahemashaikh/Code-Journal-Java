import java.util.Scanner;

class W3Ex2
{

public static void main(String args[])

{
double tempF;
System.out.println("\t \t \"Programe to Convert Temperature\" ");
 Scanner inPut = new Scanner(System.in);
System.out.print(" \t \t Enter Temperature in Celcius : ");
double tempC = inPut.nextDouble();

tempF = (tempC * 9/5) + 32;

System.out.println("\t \t " + "F =  " + tempF);

}
}