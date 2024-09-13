class W3Ex1 
{
public static void main(String args[])

{
int arr[] = { 81 , 22 ,43 , 744 , 85 , 46 , 67 , 83  ,96 , 50} ;

int loc=0, large, k ,small;
for(int i = 0 ; i < arr.length ; i++)
{
System.out.println("   " + arr[i]);
}
large=arr[0];
small=arr[0];
for (k=0 ; k<10 ; k++)  
{
if (large < arr[k])
{
loc = k;
large=arr[k];
}

}

System.out.println("   The largest element is:" + arr[loc]);


for (k=0 ; k<10 ; k++)
if (small > arr[k])
{
loc = k;
small=arr[k];
}
System.out.println("   The smallest element is:" + arr[loc]);
} }