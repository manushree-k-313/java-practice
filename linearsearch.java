public class linearsearch {
    public static void main(String[] args) {
        int arr[]={2,4,8,5,6,7,81,9,3};
        int n=arr.length;
        int element=4;
        System.out.println(linear(arr, n, element));
        
        
    }
    public static int linear(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
    return -1;
}
}
