//Daniel Tamiru
//CCC 2013

import java.util.*;
import java.io.*;

public class BridgeTransport 
{
  public static void main(String [] args) throws Exception 
  {
    Scanner input = new Scanner (System.in);
    Scanner fromFile = new Scanner (new FileReader("DATARailCars.txt"));
    
    ArrayList<Integer> carWeight = new ArrayList<Integer>(100001);
    
    int t = fromFile.nextInt();
    int s = fromFile.nextInt();
    int sum = 0;
    if (s/4 >= 1) s = 4;
      
    int cpassed = 0;
    while(fromFile.hasNext()) carWeight.add(fromFile.nextInt());
    
    for (int i = 0; i < carWeight.size(); i++){
      for (s = s-1; s >= 0; s--){
        sum += carWeight.get(i+s);
      }
      /*So I came up with a really cool strat: If you have a value that needs to be added (-, * , / etc) a changing amount of times
       * You can use a backwards for loop that does this until the condition is no longer satsified by suvtracting through the independent variable repeatedly (for n = 5; n > 0; n--)
       * In this case, it was the value s (who could not be greater than 4) but could be less than 3. Therefore, set 4 or less and run through backwars for loop
       * */
      
      if(sum <= t && i == 0) cpassed = 4;
      else if (sum <= t) cpassed++;
      else break;
    }
   
    System.out.print(cpassed); 
  }// close main
}//close class