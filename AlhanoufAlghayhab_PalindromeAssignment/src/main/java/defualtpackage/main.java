
package defualtpackage;

/**
 *
 * @author alhan
 */



import java.util.Scanner;
public class main {
    
     static void  CheckPalindrome (String words)
{
    int leng = words.length();
 
    String palindrome = "" ;
    int count = 0;
for(int i=leng-1;i>=0;i--)

{
    palindrome =palindrome+words.charAt(i);
    
    
     
}    
   
if(words.equalsIgnoreCase(palindrome))
{
    
System.out.println(words+" "+"is a palindrome");
}

else
System.out.println(words+"is not a palindrome");

    }
      
      
    public static void main(String[] args)
      {
          
         
           System.out.print("Enter your words to check palindrome:"); 
         Scanner input = new Scanner(System.in);
         
         String word = input.nextLine();
        
         CheckPalindrome(word);
          
      }}
    
    

