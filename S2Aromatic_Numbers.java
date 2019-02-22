//DT
//CCC 2012

import java.util.*;

public class S2Aromatic_Numbers
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner (System.in);
    
    String aromatic = input.next();
    int l = aromatic.length();
    
    HashMap<Character,Integer> romanNum = new HashMap<Character,Integer>();
    romanNum.put('I', 1);
    romanNum.put('V', 5);
    romanNum.put('X', 10);
    romanNum.put('L', 50);
    romanNum.put('C', 100);
    romanNum.put('D', 500);
    romanNum.put('M', 1000);
    
    int[] num = new int[l/2];
    char[] rom = new char[l/2];
    int total = 0;
    
    
    for (int i = 0; i < aromatic.length(); i++){//adding the arabic digits and roman numerals to their respective arrays 
      if (i % 2 != 0) rom [(i-1)/2] = aromatic.charAt(i);// with array indexes in sync
      else num[i/2] = Integer.parseInt(aromatic.substring(i,i+1));
    }
    
    for(int t = 0; t < l/2; t++){
      int romValue = romanNum.get(rom[t]);
      if(t < (l/2)-1 && romValue < romanNum.get(rom[t+1])) total -= romValue*num[t];
      else total += romValue*num[t];
    }
    
    System.out.println(total);
  }
}