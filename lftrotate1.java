public class lftrotate1 {
    public static int[] leftbyone(int arr[],int n){
        int temp=arr[0];

        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int srr[]={3,4,5,6,7,8,9,1,2};
        int n= srr.length;
        leftbyone(srr,n);

    }
}
