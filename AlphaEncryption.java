import java.util.Scanner;

public class AlphaEncryption
{

	/* The PT array stores the lower case letters for plain text/decrypted  message  */
	
public static  char PT [] = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                                 'p','q','r','s','t','u','v','w','x','y','z'};                                 
  
           
/* The ET array stores the Upper case letters that will assigned to the  lower case letters in the PT array respectively e.g, Q is assigned to a, Y is assigned to b, X assigned c  */

   public static  char ET [] = { 'Q','Y','X','W','V','O','Z','N','M','R','U','T','K','S','P',
                                 'L','J','I','H','G','F','E','D','C','B','A'};
    
   
   /* This method encrypts the original message that is entered by the user  */
   
   public static String Encrypt(String a)
    {
        char b[] = new char[(a.length())];
        for (int i = 0; i < a.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (PT[j] == a.charAt(i))
                {
                    b[i] = ET[j];
                    
           
                }
            }
        }
        return (new String(b));
    }
   
     /* This method Decrypts the message that was entered by the user  */
    
       public static String Decrypt( String a)
       {
        char pt1[] = new char[(a.length())];
         
          for( int i = 0; i< a.length(); i++)
           {
             for(int j = 0; j < 26;j++)
              {
                if(ET [j] == a.charAt(i))
                 {
                  pt1[i] = PT[j];
                  
                  
              }
            }
          }
          return(new String(pt1));
        } 
            
            
      
    
       public static void main(String args [] )
       {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message: ");
        System.out.println();
        
        String enc = Encrypt(scan.nextLine().toLowerCase());
        System.out.println();
        System.out.println("The Encrypted message is: " + enc);
        System.out.println();
        System.out.println(" The Decrypted message is: " + Decrypt(enc));
        scan.close();
        
        
      } 
     }
	
