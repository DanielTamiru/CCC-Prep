//Daniel Tamiru
//CCC 2013

import java.util.*;

//Be careful where you're checking the boolean. If it's in a loop, it will take the last true or false value. Break from loop if satisfies some "dealbreaker"
//you could have done String.indexOf(y,2) for each digit and seen whether or not -1 was returned. Would have been way easier

public class From1987to2013
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    
    int y = input.nextInt();
    Boolean sameCheck = true;
    
    while(sameCheck == true){
      y += 1;
      String year = Integer.toString(y);
      
      for(int i = 0; i < year.length()-1; i++){
        String num = year.substring(i,i+1);
        String rest = year.substring(i+1);    
        sameCheck = rest.contains(num);
        
        if(sameCheck == true) break;
      }
      
      if (sameCheck == false)
          System.out.println(year);
        
    }//close while
      
  }// close main
}//close class