public class InsertionSort {
    public static void main(String[] args) {
        int a[] ={12, 10, 8, 4,2};
        isort(a, 5);

        for(int ele:a){
            System.out.print(ele + " ");
        }

    }

    static void isort(int a[], int n){
        for(int i=1; i<n; i++){
            int key = a[i];
            int j=i-1;
            while(j>=0 && a[j]> key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}
