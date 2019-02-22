//CCC 2017


import java.util.*;

public class Sum_Game
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    int sRTBig = 0, total = 0;
    int slength = input.nextInt();
    int[] sw = new int[slength];
    
    for(int i = 0; i < slength; i++){
      total += input.nextInt();
      sw[i] = total;
    }
    
    total = 0;
    
    for(int i = 0; i < slength; i++){
      total += input.nextInt();
      if (total == sw[i]) sRTBig = i + 1;
    }
    
    System.out.println(sRTBig);
    
  }//close main
}//close class 
  