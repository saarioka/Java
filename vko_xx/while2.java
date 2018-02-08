public class while2
{ 
public static void main (String[ ] args)  
{ 
int n=20; 
int i = 1;  
int k=1;
while (i + k < n)  
{ 
    if (i < k)   
    {  
    i = i + k; 
   }  
else 
{ 
     if (k < i)  
     { 
      k = k + i; 
    } 
   } 
   System.out.println( " i = " + i  + " ja k = " + k ); 
  } //  while 
 } //  main 
} // class   