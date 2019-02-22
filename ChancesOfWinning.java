//Daniel Tamiru
//CCC 2013

import java.util.*;
import java.io.*;

public class ChancesOfWinning
{
  public static void main(String [] args) throws Exception
  {
    Scanner input = new Scanner (System.in);
    Scanner fromFile = new Scanner (new FileReader("DATATourney.txt"));
    
    int[] gp = new int[5]; // games played per team
    int[] p = new int[5]; // points per team
    
    int myT = fromFile.nextInt();
    int gptotal = fromFile.nextInt();
    System.out.println(gptotal);
    
    for (int g = 0; g < gptotal; g++){
      int t1 = fromFile.nextInt();
      int t2 = fromFile.nextInt();
      int result = fromFile.nextInt() - fromFile.nextInt(); 
      
      gp[t1]++;
      gp[t2]++;
      
      if(result > 0) p[t1] += 3;
      else if (result < 0) p[t2] += 3;
      else {
        p[t1] ++;
        p[t2] ++;
      }
    }
    
    System.out.println(Arrays.toString(gp));
    System.out.println(Arrays.toString(p));
    
    
    //From this point on, I think this problem requires data management knowledge. Everything I am thinking of sounds like it would take forever

    
    
      
  }// close main
}//close class