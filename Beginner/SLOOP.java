//28May2021
//https://www.codechef.com/problems/SLOOP
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SLOOP {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{
    int t = Integer.parseInt(br.readLine());
    for(int tIter=0;tIter<t;tIter++) {
      StringTokenizer sTokenizer = new StringTokenizer(br.readLine());
      int m = Integer.parseInt(sTokenizer.nextToken());
      int s = Integer.parseInt(sTokenizer.nextToken());
      System.out.println(m/s);
    }
    br.close();
  }
}