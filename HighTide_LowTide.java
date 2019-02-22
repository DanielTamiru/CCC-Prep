//CCC 2017

import java.util.*;

public class HighTide_LowTide
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    int s = input.nextInt();
    ArrayList<Integer> tide = new ArrayList<Integer>();
    int[] ordered = new int[s];
    
    for(int i = 0; i < s; i++) tide.add(input.nextInt());
    Collections.sort(tide);
    System.out.println(tide);
    
    for (int i = s-1; i >= s/2; i--) ordered [2*i-s+1] = tide.get(i);
    for (int i = s-1; i >= s/2; i--) tide.remove(i);
    Collections.reverse(tide);
    System.out.println(tide);
    
    
    for (int i = 0; i < s/2; i++) ordered [2*i] = tide.get(i);
      
    System.out.println();
    
    for(int i = 0; i < s; i++) System.out.print(ordered[i] + " " );
  }//close main
}//close class 
  