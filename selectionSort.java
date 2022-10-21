public class selectionSort {

    static void secSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int min_ind=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=temp;         

        } 
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,2,1};
        secSort(arr, 5);

        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
