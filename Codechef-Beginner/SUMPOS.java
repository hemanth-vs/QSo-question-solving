//https://www.codechef.com/problems/SUMPOS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SUMPOS {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
    br.readLine();
    for(int tIter=1;tIter<=5;tIter++) {
      StringTokenizer abc = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(abc.nextToken());
      int b = Integer.parseInt(abc.nextToken());
      int c = Integer.parseInt(abc.nextToken());
      if(a==b+c || b ==c+a || c == a+b) System.out.println("YES");
      else System.out.println("NO");

    }
    br.close();
  }
}