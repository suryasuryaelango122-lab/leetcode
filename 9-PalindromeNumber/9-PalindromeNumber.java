// Last updated: 2/13/2026, 9:46:34 AM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int num= x;
        while (num!=0) {
            rev= rev*10 + num%10;
            num=num/10;
        }
        return (rev == x) ;
        
        }
    }
