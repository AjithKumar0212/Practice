package org.tcs.prac;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) 
	
{
	// TODO Auto-generated method stub
Scanner e =new Scanner(System.in);

System.out.println("q");
int phoneId=e.nextInt();
System.out.println("phone id is "+phoneId);
System.out.println("phone name is ");
String phoneName=e.next();
System.out.println("phone Name is "+phoneName);
System.out.println("serialnumber ? ");
short serialNumber =e.nextShort();
System.out.println("serial Number is "+serialNumber);
System.out.println("camera pixel in mb");
byte cameraPixel=e.nextByte();
System.out.println("camera pixel in mb is "+cameraPixel);
System.out.println("batteryCapacity");
int batteryCapacity = e.nextInt();
System.out.println("battery capacity is "+batteryCapacity);
System.out.println("ordernum");
long orderno = e.nextLong();
System.out.println("order no is"+orderno);
System.out.println("price?");
float price = e.nextFloat();
System.out.println("price is "+price);
System.out.println("x factor");
double xFactor = e.nextDouble();
System.out.println("X factor is "+xFactor);
e.nextLine();
System.out.println("userName ?");
String userName = e.nextLine();
System.out.println("user name is"+userName);
System.out.println("phone is good?");
boolean good = e.nextBoolean();
System.out.println(" phone is in good "+good);


}
}
