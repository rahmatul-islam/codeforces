

public class lee69{
    public static void main(String[] args) {
        int x=4;
        int ans=mySqurt(x);
        System.out.println(ans);
        
    }
    public static int mySqurt(int x){
        if (x < 2) {
            return x;
        }

        int l=1;
        int r=x/2;
        int ans = 0;
        while (l<=r) { 
            int mid =l+(r-l)/2;
            long sq = (long) mid * mid;
            if (sq==x) {
                return mid;
                
            }
            else if(sq<x){
                ans = mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
           
            
            
        }
        return ans;
    }
}