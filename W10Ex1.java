import javax.swing.JOptionPane;
class MainMenu {
int option;
public void mainMenu() {
do {
option = Integer.parseInt(JOptionPane.showInputDialog(null,"SELECT FROM THIS MENU"+ "\n1.Calculator\n2.Convertor\n3.Marksheet\n4.Exit"+ "\nEnter Your Choice "));
switch(option) {
case 1:
Calculator cl = new Calculator();
cl.menu();
break;
case 2:
Converter conv = new Converter();
conv.menu();
break;
case 3:
Marksheet ms = new Marksheet();
ms.menu();
break;
case 4:
JOptionPane.showMessageDialog(null,"Thank You for Using");
break;
default:
JOptionPane.showMessageDialog(null,"Invalid Option");
}
}
while(option !=4);
}
}

class Marksheet{
double sub1,sub2,sub3,sub4,sub5,sub6,perc, total;
int option ;
char ch , Grade;
public void menu(){
do{
option = Integer.parseInt(JOptionPane.showInputDialog("Marksheet Of 2nd Semester \n     a.Java OOP \n     b.Digital Logic and Design  \n     c.Calculus \n     d.Philosophy \n     e.English \n     f.Islamiyat \n\n1.Calculate Total Marks , Percentage%  And Grade \n 2.Exit \n \n  "));
if(option == 1)
{
calc();
}
else if (option == 2)
{

JOptionPane.showMessageDialog(null, "Thankyou!");
}

}
while(option != 2);
}
public void init()
{
sub1 =Integer.parseInt(JOptionPane.showInputDialog("Enter Java OOP Marks"));
sub2 =Integer.parseInt(JOptionPane.showInputDialog("Enter Digital Logic and Design Marks"));
sub3 =Integer.parseInt(JOptionPane.showInputDialog("Enter Calculus Marks"));
sub4 =Integer.parseInt(JOptionPane.showInputDialog("Enter Philosophy Marks"));
sub5 =Integer.parseInt(JOptionPane.showInputDialog("Enter English Marks"));
sub6 =Integer.parseInt(JOptionPane.showInputDialog("Enter Islamiyat Marks"));
}
public void Total(){
total = sub1+sub2+sub3+sub4+sub5+sub6;
}
public void Percen(){
perc = ((double)total/600)*100;
}

public void Grad()
{
if(perc >= 80 )Grade= 'A';
else if (perc >= 70) Grade= 'B'; 
else if (perc >= 60) Grade= 'C';
else if (perc >= 50) Grade= 'D';
else Grade = 'F';


}

public void calc()
{
do{
init();
Total();
Percen();
Grad();




JOptionPane.showMessageDialog(null, "Marksheet Of 2nd Semester \n  a.Java OOP : " + sub1+"     b.Digital Logic and Design : " + sub2+"    \n \t c.Calculus : " + sub3 + "       d.Philosophy :" + sub4+" \n \t e.English " + sub5+"           f.Islamiyat : " + sub6+" \n \n 1.Total Marks : " + total +"    2.Percentage% : "+ Math.round(perc)+ " \n 3.Grade : " + Grade + "\n \n " , "Marksheet",JOptionPane.INFORMATION_MESSAGE);
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');



}



}

class Converter

{
double pound ,hour,kilo,tempF,tempC,meter , centi, mint ;
int option;
char ch;

public void menu(){
 do {

option = Integer.parseInt(JOptionPane.showInputDialog("SELECT FROM THIS MENU To Convert"+ "\n1. Temperature from Celcius to Farhenheit    \n2.Meter to Centimeter\n3.Hours Into Minutes\n4.Kilogram to pound \n5.Exit"+ "\nEnter Your Choice "));
if(option == 1) {
temp();
}
else if(option == 2) {
centi();
}
else if(option == 3) {
mint();
}
else if(option == 4) {
pound();
}
else if (option == 5) {
JOptionPane.showMessageDialog(null, "Thank you for using Converter");
}


}


while(option!=5);
}

public void temp(){
do{
tempC = Double.parseDouble(JOptionPane.showInputDialog(" Enter Temperature in Degree Celcius "));


tempF = (tempC * 9/5) + 32;
JOptionPane.showMessageDialog(null, "Temperature of " +tempC + " Degree Celcius To Degree Farhenheit is : " + Math.round(tempF) + "  ","Temperature Converter",JOptionPane.INFORMATION_MESSAGE);
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');


}


public void centi(){
do{
meter = Double.parseDouble(JOptionPane.showInputDialog(" Enter Measurement In Meters "));


centi = meter*100;
JOptionPane.showMessageDialog(null, "Conversion of  " + meter + " Meters InTo Centimeters is : " + centi + "cm   "," Length Converter",JOptionPane.INFORMATION_MESSAGE);
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');
}


public void mint(){
do{
hour = Double.parseDouble(JOptionPane.showInputDialog(" Enter hours  "));
mint = hour*60;
JOptionPane.showMessageDialog(null, "Conversion of  " + hour + "hr InTo Minutes is : " + mint + " mints   ","Time Converter",JOptionPane.INFORMATION_MESSAGE);
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');
}


public void pound(){
do{
kilo = Double.parseDouble(JOptionPane.showInputDialog(" Enter Mass in Kilogram    "));
pound = kilo*2.20462;
JOptionPane.showMessageDialog(null, "Conversion of  " + kilo+ " kg  InTo Pounds is : "+ pound + " pounds      "," Weight Converter",JOptionPane.INFORMATION_MESSAGE);
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');
}


}



class Calculator {
int n1,n2, option;
char ch;
public void menu() {
do {
option=Integer.parseInt(JOptionPane.showInputDialog("Calculator\n"+ "\n1.Add\n2.Sub\n3.Multi\n4.Division\n5.Back"));
if(option == 1) {
add();
}
else if(option == 2) {
sub();
}
else if(option == 3) {
mul();
}
else if(option == 4) {
div();
}
else if (option == 5) {
JOptionPane.showMessageDialog(null, "Thank you for using Calculator");
}
}while(option != 5);
}
public void init() {
n1=Integer.parseInt(JOptionPane.showInputDialog("Enter 1st Value "));
n2=Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd Value "));
}
public void add() {
do {
init();
JOptionPane.showMessageDialog(null, n1+" + " + n2 + " = "+(n1+n2));
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');
}
public void sub() {
do {
init();
JOptionPane.showMessageDialog(null, n1+" - " + n2 + " = "+(n1-n2));
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');
}

public void mul() {
do {
init();
JOptionPane.showMessageDialog(null, n1+" x " + n2 + " = "+(n1*n2));
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');
}
public void div() {
do {
init();
double div = (double)n1;

JOptionPane.showMessageDialog(null, n1+" / " + n2 + " = "+(div/n2));
ch = JOptionPane.showInputDialog("Calculate Again [Y/N]").charAt(0);
}while(ch=='y' || ch == 'Y');
}
}
class Test {
public static void main(String[] args) {
MainMenu ob = new MainMenu();
ob.mainMenu();
}
}
