class Solution {
    public double myPow(double x, int n) {
       
      return pow(x,n);
    }
    public double pow(double x, int n) {
          
           if(n==0)
           return 1.0;
           if(n==Integer.MIN_VALUE)
           return pow(x*x,n/2);
           if(n<0)
           return 1.0/pow(x,-1*n);
           if(n%2==0)
           return pow(x*x,n/2);
           else
           return x*pow(x*x,(n-1)/2);
    } 
}