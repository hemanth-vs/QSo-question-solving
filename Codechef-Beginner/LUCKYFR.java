//27May2021
//https://www.codechef.com/problems/LUCKYFR
import java.io.*;

public class LUCKYFR {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
    int t = Integer.parseInt(br.readLine());
    for(int tIter = 0; tIter<t;tIter++) {
      int num = Integer.parseInt(br.readLine());
      int dup = num;
      int count = 0;
      while(dup!=0) {
        if(dup%10 == 4) count++;
        dup = dup/10;
      }
      System.out.println(count);
    }
    br.close();
  }
}