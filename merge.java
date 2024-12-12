import java.util.ArrayList;
import java.util.Scanner;

class mergeSiert{
    public static void mergesort(int arr[],int low,int high){
        
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]>arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++; 
        }
        while(right<=high){
            temp.add(arr[right]);
            right++; 
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={8,9,5,6,4,5,3,0,8,6};
        int n=arr.length;
        System.out.println(" before mergesort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergesort(arr, 0, n-1);
        System.out.println(" after mergesort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}