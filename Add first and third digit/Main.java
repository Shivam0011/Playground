#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d",&a);
  b=a/100;
  c=a%100;
  c=c%10;
  a=b+c;
  printf("%d",a);
  return 0;
}