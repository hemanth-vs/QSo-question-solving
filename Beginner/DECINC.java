//https://www.codechef.com/problems/DECINC
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DECINC {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(br.readLine());
    if(n%4==0) System.out.println(n+1);
    else System.out.println(n-1);
    br.close();
  }
}
