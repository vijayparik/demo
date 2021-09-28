package practice;


// Draw a pattern
/*
ABCD
ABC
AB
A
*/


public class pattern1 {
	
public static void main (String [] args )
{   int i , j ; 
	
	for(i=0;i<5;i++) 
	{
		    int c ='A';
	          
		    for(j=5;j>i;j--)  {System.out.print((char)c++ );}
		    System.out.println(" ");
			
	}
	
}
}
