//CCC 2016

import java.util.*;

public class Ragaman
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    //this kind of sucks. could have just done for loop and grabbed index of two strings and compared them. Common man
    Boolean hasOnlyAster = true;
   
    String w = input.next();
    String wana = input.next();
   
    ArrayList<Character> wanaL = new ArrayList<Character>();
    for (int t = 0; t < wana.length(); t++) wanaL.add(wana.charAt(t));
    
    for (int t = 0; t < w.length(); t++) wanaL.remove((Character)wana.charAt(t));
 
    if (wanaL.size() > 0) {
      for (int t = 0; t < wana.length(); t++) if(wanaL.get(t) != '*') hasOnlyAster = false;
    }
    else hasOnlyAster = false;
    
    if (hasOnlyAster) System.out.println("A");
    else System.out.println("N");
    
    
  }//close main
}//close class 
  