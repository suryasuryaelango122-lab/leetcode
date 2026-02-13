// Last updated: 2/13/2026, 9:46:37 AM
int reverse(int x){

    int rev=0;
       while(x){
           if(rev>214748364||rev<(-214748364))
           return 0;
           rev=rev*10+x%10;
           x/=10;
       }
       x=rev;
       return x;
}