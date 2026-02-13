// Last updated: 2/13/2026, 9:44:31 AM
int fib(int n){
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    return fib(n-2)+fib(n-1);
}