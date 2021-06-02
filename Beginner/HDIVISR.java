//https://www.codechef.com/problems/HDIVISR
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HDIVISR {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(br.readLine());
    int ans = 1;
    for(int i=2;i<=10;i++) {
      if(n%i==0) ans = i;
    }
    System.out.println(ans);
    br.close();
  }
}
