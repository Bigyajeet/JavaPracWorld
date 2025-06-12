public class findSquareRootOfLogn {
    public static int floorSqrt(int n) {
    int start=1,end=n;
      while(start<=end){
          int mid=(start+end)/2;
          int val=(mid*mid);
          if(val<=n){
              start=mid+1;
          }
          else{
              end=mid-1;
          }
          
      }
      return end;
    
}
}

