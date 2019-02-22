//CCC 2016

import java.util.*;

public class CombiningRiceballs
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    //Collections.frequency(rb,element);
    //Collections.max(list)
    /* solve the problem in the simplest way first, where some test cases are unaccounted for
     * Then I would incorporate all the conditions that would allow it to always yield the greatest value
     * I would never be able to solve this problem in time */
    int size = input.nextInt();
    ArrayList<String> rb = new ArrayList<String>();
    for (int t = 0; t < size; t++) rb.add(input.next());
    
    ArrayList<Integer>  shadowIndex1 = new ArrayList<Integer>();
    ArrayList<Integer>  shadowIndex2 = new ArrayList<Integer>();
    Boolean canOperate = true;
    
    for (int t = 1; t < size; t++) if (rb.get(t) == rb.get(0)) shadowIndex1.add(t);
    
    while (canOperate){

      for (int i = 1; i < size; i++){
        int v = rb.get(i);
        for(int x = i + 1; i < size; i++)  if (rb.get(x) == v) shadowIndex2.add(x);
        
        int deltaI1 = shadowIndex1(0) - i;
        int deltaI2 = shadowIndex1(1) - i;
        int deltaInext1 = shadowIndex2.get(0);
        // when removing, remove the upcoming elements 
        /*if ()
        else if ()
        else if ()
        else if ()
        else if ()
        else */
          
          
          
        
        shadowIndex1 = shadowIndex2; 
        size = rb.size();
      }
      

    }
    
  }//close main
}//close class 