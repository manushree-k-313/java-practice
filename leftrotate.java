public class leftrotate {
    public static void leftrot(int[] arr,int n,int d){
        if(n==0)return;
        d=d%n;
        if(d==0)return;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    } 
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,9};
        int n=arr.length;
        int d=8;
        System.out.println("before left shift");
        for(int i=0;i<n;i++){
            System.out.print(+arr[i]);
        }
        System.out.println();
        leftrot(arr, n, d);
        System.out.println("after leftshift");
        for(int i=0;i<n;i++){
            System.out.print(+arr[i]);
        }
    }

    
}