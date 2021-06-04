//https://www.codechef.com/problems/DIFFSUM
#include<stdio.h>
int main() {
    //your code goes here
    int n1,n2;
    scanf("%d",&n1);
    scanf("%d",&n2);
    if(n1>n2) printf("%d\n",n1-n2);
    else printf("%d\n",n1+n2);
    return 0;
}