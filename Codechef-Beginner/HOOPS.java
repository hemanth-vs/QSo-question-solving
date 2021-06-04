//https://www.codechef.com/problems/HOOPS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HOOPS {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{
    int t = Integer.parseInt(br.readLine());
    for(int tIter=0;tIter<t;tIter++) {
      int n = Integer.parseInt(br.readLine());
      System.out.println((n+1)/2);
    }
    br.close();
  }
}
