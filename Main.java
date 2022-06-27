import java.util.Scanner;
public class Main {
 
  public static int wystapienie_litera(String napis, char litera)
  {
    
      int ile_liter = 0;  
             
      char znak_z_napisu;
      for (int i = 0 ; i < napis.length() ; i++)
      {
          znak_z_napisu = napis.charAt(i); 
          if(znak_z_napisu == litera) 
          {                           
              ile_liter++; 
          }
      }   
      return ile_liter;
  }
 
 
  public static int wystapienie_litera_male_i_wielkie(String napis, char litera)
  {
      int ile_liter = 0; 
     
      char znak_z_napisu; 
    
    
 
     
      litera = String.valueOf(litera).toUpperCase().charAt(0);
      for (int i = 0 ; i < napis.length() ; i++) 
      {
          znak_z_napisu = napis.charAt(i); 
          znak_z_napisu = String.valueOf(znak_z_napisu).toUpperCase().charAt(0);
          if(znak_z_napisu == litera) 
          {                         
              ile_liter++; 
          }
      }   
      return ile_liter;
  }
 
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);
       
       System.out.println("Podaj przykładowy napis: ");
       String przykladowy_napis = scan.nextLine();
       System.out.println(wystapienie_litera(przykladowy_napis, 'A'));
       System.out.println(wystapienie_litera_male_i_wielkie(przykladowy_napis, 'A'));
    }
}