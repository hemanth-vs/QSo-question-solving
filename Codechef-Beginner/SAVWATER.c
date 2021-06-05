//https://www.codechef.com/problems/SAVWATER
#include<stdio.h>
int main() {
    int t;
    scanf("%d",&t);
    for(int tIter=0;tIter<t;tIter++) {
        int h,x,y,c;
        scanf("%d %d %d %d",&h,&x,&y,&c);
        if(c>=(h*(x+(y/2)))) printf("YES\n");
        else printf("NO\n");
    }
    
    return 0;
}