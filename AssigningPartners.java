//Daniel Tamiru
//CCC 2014

import java.util.*;
import java.io.*;

public class AssigningPartners
{
  public static void main(String [] args) throws Exception 
  {
    Scanner input = new Scanner (System.in);
    Scanner fromFile = new Scanner (new FileReader("DATAPartners.txt"));
    
    
    boolean consistent = true;
    int size = Integer.parseInt(fromFile.nextLine());
    
    //use an ArrayList not an arry. Its too complicated for an array
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    
    for (int t = 0; t < size; t++) list1.add(fromFile.next());
    for (int t = 0; t < size; t++) list2.add(fromFile.next());
    
   
    
    for (int i = 0; i < size; i++){
      String s1 = list1.get(i);
      String s2 = list2.get(i);
      
      int iS1 = list1.indexOf(s2);
      int iS2 = list2.indexOf(s1);

      
      if (iS2 != iS1 || s1.equals(s2)) consistent = false;     
    }
    
    if (consistent) System.out.println("good");
    else System.out.println("bad");
    
  }// close main
}//close class