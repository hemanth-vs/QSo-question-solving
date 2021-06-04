//31May2021
//https://www.codechef.com/problems/SOLBLTY
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SOLBLTY {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{
    int t = Integer.parseInt(br.readLine());
    for (int tIter = 0; tIter < t; tIter++) {
      StringTokenizer sTokenizer = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(sTokenizer.nextToken());
      int a = Integer.parseInt(sTokenizer.nextToken());
      int b = Integer.parseInt(sTokenizer.nextToken());
      int res = (a + (100-x)*b)*10;
      System.out.println(res);
    }
    br.close();
  }
}
