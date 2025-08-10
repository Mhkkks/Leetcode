//initial  
/*class Solution {
    public double myPow(double x, int n) {
        if(x==0){return 0;}
        if(n==0){return 1;}
        if(n==1){return x;}
        boolean pos=true;
        if(n<0){pos= false;}
        double ans=1;
       ans= findPow(x,n,ans,pos);

        return ans;
    }
    public double findPow(double x, int n, double ans, boolean pos){
       if(n==0){
        return ans;
       }
       if(pos==false){
        n=n+1;
        ans=ans/x;
       }
       else{n=n-1;
        ans= ans*x;}
        
       return findPow(x,n,ans,pos);
    }
  */

//Use Divide n Conquer for O(logn)

}
