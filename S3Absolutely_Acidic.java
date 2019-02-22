//DT
//CCC 2012

//this is a failed attempt. I would have gotten it in the end but I woul have to redo the problem
//I could have used an ArrayList to store the most frequently occuring elements and used Arryalist methods from there
import java.util.*;

public class S3Absolutely_Acidic
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    int l = 2000001, a = 1;
    int[] acidity = new int[2000001];
    int freq = 0, aBig = 0, aSmall = 0;
    ArrayList<String> aBiggest = new ArrayList<String>();
    
   
    System.out.println("Set an acidity as 0 to exit the loop");
   
    while (a != 0) {
      a = input.nextInt();
      acidity[a] += 1;
    }//close while
    
    for(int i = 0; i < l; i++){
      
      if (acidity[i] > freq){
        freq = acidity[i];
        aBiggest.add(i);}
      else if (acidity[i] == freq){
        if (aSmall == 0) aSmall = i;
        else if (i >= aBig) aBig = i;
      }
    }
      if (aBiggest.get() == aSmall || aBiggest.get() == aBig)
        System.out.printkn(aBig-aSmall);
      else if ()
    
    

  }//close main
}//close class