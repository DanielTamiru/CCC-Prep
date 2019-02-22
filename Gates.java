//Daniel Tamiru
//CCC 2015

import java.util.*;

public class Gates
{
  public static void main(String [] args) throws Exception 
  {
    Scanner input = new Scanner (System.in);
    //collections.sort(list) would not work cuz it says "that can land starting from the beginning"
    //the planes coming in wont wait thinking another more suitable will come and take its place
    
    //Ask yourself what conditions need to be an arry index. In this case, a spot is being filled so you just need to makie it clear an index is no longer avasilable
    //gate number is index of array. If a spot is taken, replace it with -1 because all positive integers are possible plane gate values
    int planeCount = 0;
    Boolean noGate = false;
    
    int gNum = input.nextInt();
    int[] g = new int[gNum]; 
    for (int v = 0; v < g.length; v++) g[v] = -1;
    
    int pNum = input.nextInt();
    
    for (int i = 0; i < pNum; i++){
      int pg = input.nextInt()-1;
      
      if (g[pg] == -1){
        g[pg] = pg;
        planeCount++;
      }
      else if(g[pg] != -1){
        for (int gdown = pg -1; gdown >= 0; gdown--){
          if (g[gdown] == -1) {
            g[gdown] = pg;
            planeCount++;
          }
          else if (gdown == 0) noGate = true;
        }
      }
      if (noGate) break;
    }
    
    for (int v = 0; v < g.length; v++) System.out.print(g[v] + 1 + " ");
    System.out.println();
    System.out.println(planeCount);
    
  }// close main
}//close class