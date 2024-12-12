import java.util.ArrayList;

public class movezeros {
    //brute
    /*public static void main(String[] args) {
        int arr[]={2,3,0,4,5,0,0,9,8,1};
        int n=arr.length;
        int[] ans = movezero(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }


    }
    public static int[] movezero(int arr[],int n){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int nz=temp.size();
       
        for(int i=0;i<nz;i++){
           arr[i]=temp.get(i);
        }
        for(int i=nz;i<n;i++){
            arr[i]=0;  
        }
        return arr;
    }*/
    //optimal
   public static int[] movezero(int a[],int n){
    int j=-1;
    for(int i=0;i<n;i++){
        if(a[i]==0){
            j=i;
            break;
        }
        
    }
    if(j==-1)return a;
    for(int i=j;i<n;i++){
        if(a[i]!=0){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            j++;
        }
    }
    return a;
   }
   public static void main(String[] args) {
    int a[]={1,0,2,3,0,4,0,8,7,6,0};
    int n=a.length;
    int[] ans=movezero(a, n);
    for(int i=0;i<n;i++){
        System.out.print(ans[i] +" ");
    }
    System.out.println(" ");

   }
}
