//01June2021
//https://www.codechef.com/problems/SOCKS1
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SOCKS1 {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{
    StringTokenizer abc = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(abc.nextToken());
    int b = Integer.parseInt(abc.nextToken());
    int c = Integer.parseInt(abc.nextToken());
    if(a==b ||a==c || b==c) System.out.println("YES");
    else System.out.println("NO");
    br.close();
  }
}
