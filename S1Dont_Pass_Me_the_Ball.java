//Daniel Tamiru
//CCC 2012 

//This a data managment prolem involving combinations. I understood what was being asked but I did not understand the formula I used

import java.util.*;

public class S1Dont_Pass_Me_the_Ball
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    
    int scorer = input.nextInt();
    System.out.println((scorer-1)*(scorer-2)*(scorer-3)/(3*2));    
  }// close main
}