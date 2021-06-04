//https://www.codechef.com/problems/UWCOI21A
#include<stdio.h>
int main() {
    //your code goes here
    int t;
    scanf("%d",&t);
    for (int i = 0; i < t; i++) {
        int n;
        scanf("%d",&n);
        if(n%2==0) {
            printf("2 %d\n",n/2);
        }else if(n%3==0) {
            printf("3 %d\n",n/3);
        }else   printf("1 %d\n",n);
    }
    return 0;
}