import java.util.Scanner;

class CourseGrade{
 String CourseName;
 char Grade;

CourseGrade(){
CourseName = "Ict";
Grade = 'A';
}

void result(){
System.out.print(" Enter  Your Course Name : ");
Scanner input = new Scanner(System.in);
CourseName = input.next();

while(true)
{
System.out.print(" Enter your grade From A - F : ");
Grade = input.next().toUpperCase().charAt(0);

if((Grade >= 65 && Grade <= 68) || (Grade == 70)) 
{
break;
}
else 

System.out.println("\n You Give A Wrong Grade .. Do It Again \n ");
}



}
void fine()
{

System.out.println(" Course name : " + CourseName );
System.out.println(" Grade : " + Grade);

} 


}




class W7Ex1{

public static void main(String args[])


{

CourseGrade out  = new CourseGrade();
out.result();
out.fine();



}


}