//https://www.codechef.com/START4C/problems/QUIZPLAG
//AC - Accepted
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QUIZPLAG {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
    int t = Integer.parseInt(br.readLine());
    for (int tIter = 0; tIter < t; tIter++) {
      StringTokenizer sTokenizer = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(sTokenizer.nextToken());
      int m = Integer.parseInt(sTokenizer.nextToken());
      int k = Integer.parseInt(sTokenizer.nextToken());
      int arr[] = new int[k];
      StringTokenizer sTokenizer2 = new StringTokenizer(br.readLine());
      for (int i = 0; i < k; i++) {
        arr[i] = Integer.parseInt(sTokenizer2.nextToken());
      }
      int resArr[] = new int[n+1];
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]<=n) resArr[arr[i]]++;
      }
      int count = 0;
      for (int i = 0; i < resArr.length; i++) {
        if (resArr[i]>1)  count++;
      }
      System.out.print(count);
      for (int i = 0; i < resArr.length; i++) {
        if(resArr[i]>1) System.out.print(" "+i);
      }
      System.out.println("");
    }
    br.close();
  }
}
