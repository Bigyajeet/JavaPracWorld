public class ReverseInArray {
    public static void reverse(int num[]){
        int first=0,last=num.length-1;
        while(first<last){
            //temp
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first ++;//increased by 1
            last--;//decreased by 1
        }

    }
    

public static void main(String args[]){
    int num[]={2,4,6,8,10};
    reverse(num);

    for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
    }

}
    
}
