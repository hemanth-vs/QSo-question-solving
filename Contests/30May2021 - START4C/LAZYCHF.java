//https://www.codechef.com/START4C/problems/LAZYCHF
//AC - Accepted
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LAZYCHF {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      StringTokenizer sTokenizer = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(sTokenizer.nextToken());
      int m = Integer.parseInt(sTokenizer.nextToken());
      int d = Integer.parseInt(sTokenizer.nextToken());
      System.out.println(Math.min(x*m,x+d));
    }
    br.close();
  }
}