
package AlbumCopa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.text.StyleContext;

public class DesafioAlbumDaCopa {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int numTotal = scan.nextInt();
    int numFigCompradas = scan.nextInt();
    Set<Integer> setFig = new HashSet<>();
    
//TODO: Complete os espaços em branco com uma solução possível para o problema


    for (int i=0; i<numFigCompradas; i++) {
        
    }
    System.out.println(numTotal - setFig.size());
  }
}
