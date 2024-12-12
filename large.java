public class large {
    public static int largest(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={9,6,5,4,7,8,1,3};
        int n=arr.length;
            System.out.println("largest ellement of an array is:"+largest(arr));
}
}
