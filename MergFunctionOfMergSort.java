class MergFunctionOfMergSort{
    public static void main(String[] args) {
        int arr[]={10,15,20,40,8,11,15,22,25};
        int l=0, high=8, mid=3;
        mergFunction(arr,l,high,mid);
        System.out.println();
        for(int ele : arr){
            
            System.out.print(ele + " ");
        }


    }
    static void mergFunction(int arr[], int low, int high, int mid){
        
        int n1=mid-low+1, n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0; i<n1; i++){ left[i]=arr[i+low]; }
        for(int j=0; j<n2; j++){ right[j]=arr[j+1+mid];}


        int i=0, j=0, k=low;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
            while(i<n1){
                arr[k++]=left[i++];  
            }
            while(j<n2){
                arr[k++]=right[j++];
            }
        
    }
}