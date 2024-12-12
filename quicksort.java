class quicksort {
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int partind=partition(arr,low,high);
            quickSort(arr, low, partind-1);
            quickSort(arr,partind+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j) {
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }  
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }
    public static int[] qs(int arr[], int low, int high){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};
        int n=arr.length;
        System.out.print("before sorting ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        qs(arr, 0, n);
        System.out.print("after sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
    
        }


    }
    
}
