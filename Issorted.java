public class Issorted {
    public static boolean issorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){

            }
            else 
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        System.out.println("array is sorted  "+issorted(arr));
    }

}
