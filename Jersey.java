//Daniel Tamiru
//CCC 2015

import java.util.*;

public class Jersey
{
  public static void main(String [] args) throws Exception 
  {
    Scanner input = new Scanner (System.in);
    int j = input.nextInt();
    int a = input.nextInt();
    int match = 0;
    
    HashMap<String, Integer> sizes = new HashMap<String, Integer>();
    sizes.put("S", 1);
    sizes.put("M", 2);
    sizes.put("L", 3);
    ArrayList<Integer> jers = new ArrayList<Integer> (j);
    
    for (int i = 0; i < j; i++) jers.add(sizes.get(input.next()));
      System.out.println(jers);
   
    
    System.out.println();
   
    for (int i = 0; i < a; i++){
      int sOFp = sizes.get(input.next());
      int nOFp = input.nextInt()-1;
      
      System.out.println("size of player: " + sOFp + " number wanted: " + nOFp);
      
      if(jers.size() > nOFp  && jers.get(nOFp) >= sOFp){
        match++;
        jers.set(nOFp,-1000000);
      }
    }
    
    System.out.println(match);
  }// close main
}//close class