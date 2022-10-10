class bubbleSort{
    static void sort(int arr[], int n){
        boolean swaped;
        for(int i=0; i<n; i++){
            swaped=false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swaped=true;
                }
               
            }
            if(swaped==false){
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,2,6,1};
        int n= arr.length;
        sort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        

    }
}