//https://www.codechef.com/problems/DIV03
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DIV03 {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{
    int t = Integer.parseInt(br.readLine());
    for (int tIter = 0; tIter < t; tIter++) {
      int a[] = new int[10];
      StringTokenizer arr = new StringTokenizer(br.readLine());
      for (int i = 0; i < 10; i++) {
        a[i] = Integer.parseInt(arr.nextToken());
      }
      int k = Integer.parseInt(br.readLine());
      for (int i = 9; i >= 0; i--) {
        if(k==0) break;
        if(k>=a[i]) {
          k = k - a[i];
          a[i] = a[i] - a[i];
        }
        if(k<a[i]) {
          k = k - k;
          a[i] = a[i] - k;
        }
      }
      int curr = 0;
      for (int i = 9; i >=0; i--) {
        if(a[i] != 0) { 
          curr = i;
          break;
        }
      }
      System.out.println(curr + 1);
    }
    br.close();
  }
}
