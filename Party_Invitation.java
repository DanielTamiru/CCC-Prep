//Daniel Tamiru
//CCC 2014

import java.util.*;
import java.io.*;

public class Party_Invitation
{
  public static void main(String [] args) throws Exception
  {
    Scanner input = new Scanner (System.in);
    Scanner fromFile = new Scanner (new FileReader("DATAInvited.txt"));
   
    ArrayList<Integer> invited = new ArrayList<Integer>();
    
    int friendNum = fromFile.nextInt();
    for (int n = 0; n < friendNum; n++) invited.add(n+1); // be sure of yourself when grabbing from a text file in a loop. Do you one the first value or the looped value

    int m = fromFile.nextInt();
    int[] rM = new int[m];
    
    for(int i = 0; i < m; i++){
      rM[i] = fromFile.nextInt();
      
      for (int p = 0; p < invited.size(); p++) // be careful with this stuff. If you can (when incrementing 1,2,3...) set the indexes equal to the value initially
         if (p != 0 && (p+1) % rM[i] == 0) invited.set(p, 0);// its the index not the value of the index
         
         invited.removeAll(Arrays.asList(0)); 
         /*LOGICALLY, YOU CANNOT REMOVE ALL OF A VALUE IN A LIST USING A FOR LOOP
          * you must use the arryalist method above
          * or you can while loop through (checking if .contains value) and remove the first instance of the value
          * using "list".removeAll(Arrays.asList(2));*/
    }
    
    for (int element : rM) 
      System.out.println("mR: " + element);
   
      System.out.println(invited);
    
    
    
    
  }// close main
}//close class