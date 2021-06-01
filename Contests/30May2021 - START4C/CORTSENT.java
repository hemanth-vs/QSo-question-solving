//https://www.codechef.com/START4C/problems/CORTSENT
//AC - Accepted
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CORTSENT {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException {
    int t = Integer.parseInt(br.readLine());
    for(int tIter=0;tIter<t;tIter++) {
      StringTokenizer sTokenizer = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(sTokenizer.nextToken());
      String strArr[] = new String[n];
      char la1='a', lm1='m', ln2='N', lz2='Z';
      for(int i=0;i<n;i++) {
        strArr[i] = new String(sTokenizer.nextToken());
      }
      boolean flag1=false,flag2=false,flag3=false,lang1=true,lang2=true;
      for (int i = 0; i < strArr[0].length(); i++) {
        if(strArr[0].charAt(i)>=la1 && strArr[0].charAt(i)<=lm1) {
          flag1 = true;
        }
        else if(strArr[0].charAt(i)>=ln2 && strArr[0].charAt(i)<=lz2){
          flag2 = true;
        }
        else flag3 = true;
      }
      if(flag3) {
        System.out.println("NO");
        continue;
      }
      if(flag1&&flag2) {
        System.out.println("NO");
        continue;
      }
      else {
        if(flag1&&!flag2) lang1=true;
        else if(!flag1&&flag2) lang2 = true;
      }
      flag3 = false;
      boolean flag4 = false;
      for (int i = 1; i < strArr.length; i++) {
        flag1=flag2=flag3=false;
        for (int j = 0; j < strArr[i].length(); j++) {
          if(strArr[i].charAt(j)>=la1 && strArr[i].charAt(j)<=lm1) {
            flag1 = true;
          }
          else if(strArr[i].charAt(j)>=ln2 && strArr[i].charAt(j)<=lz2){
            flag2 = true;
          }
          else flag3 = true;
        }
        //System.out.println(flag1+" "+flag2+" "+flag3);
        if(flag3) {
          System.out.println("NO");
          break;
        }
        if(flag1 && flag2) {
          System.out.println("NO");
          flag4 = true;
          break;
        }
        /*if(lang1 && flag2 && !flag1) {
          System.out.println("NO - if3");
          flag4 = true;
          break;
        }
        if(lang2 && flag1 && !flag2) {
          System.out.println("NO - if4");
          flag4 = true;
          break;
        }*/
      }
      if(flag3 || flag4) continue;
      else {
        System.out.println("YES");
      }
    }
    br.close();
  }
}
