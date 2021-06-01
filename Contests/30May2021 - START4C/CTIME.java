//https://www.codechef.com/START4C/problems/CTIME
//Task #0,1,2 - AC - Accepted
//Task #3 - WA - Wrong Answer
//Overall - WA - Wrong Anser
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CTIME {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{
    int t = Integer.parseInt(br.readLine());
    for (int tIter = 0; tIter < t; tIter++) {
      StringTokenizer sTokenizer = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(sTokenizer.nextToken());
      int k = Integer.parseInt(sTokenizer.nextToken());
      int f = Integer.parseInt(sTokenizer.nextToken());
      int s[] = new int[n];
      int e[] = new int[n];
      for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        s[i] = Integer.parseInt(st.nextToken());
        e[i] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(s);
      Arrays.sort(e);
      int time = 0;
      for (int i = 0; i < n-1; i++) {
        if(e[i]<s[i+1]) time = time + s[i+1] - e[i];
      }
      time = time + f - e[n-1];
      if(time >= k) System.out.println("YES");
      else System.out.println("NO");
    }
    br.close();
  }
}
