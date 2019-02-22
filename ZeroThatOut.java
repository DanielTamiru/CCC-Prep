//Daniel Tamiru
//CCC 2015

import java.util.*;

public class ZeroThatOut
{
  public static void main(String [] args) throws Exception 
  {
    ArrayList<Integer> num = new ArrayList<Integer>();
    Scanner input = new Scanner (System.in);
    int d = input.nextInt();
    
    for (int t = 0; t < d; t++){
      num.add(input.nextInt());
      num.remove(num.size()-1);
    }
    
    int total = 0;
    for (int i = 0; i < num.size(); i++) total += num.get(i);
    System.out.println(total);
    
  }// close main
}//close class