//CCC 2016


import java.util.*;

public class TandemBicycle
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);

    int problem = input.nextInt();
    int citNum = input.nextInt();
    int sum = 0;
    
    int[] d = new int[citNum];
    for (int t = 0; t < citNum; t++) d[t] = input.nextInt();
    int[] p = new int [citNum];
    for (int t = 0; t < citNum; t++) p[t] = input.nextInt();
    
    if (problem == 2) for(int t = 0; t < citNum; t++) sum += Math.min(d[t], p[t]);
    else for(int t = 0; t < citNum; t++) sum += Math.max(d[t], p[t]);
    
    System.out.println(sum);
    
  }//close main
}//close class 