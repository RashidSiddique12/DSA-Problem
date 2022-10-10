public class MergTwoSortedArray {

    static void mergSort(int a[], int b[], int m, int n){
        int i=0;
        int j=0;
        while(i < m && j < n){
            if(a[i] > b[j]){
                System.out.print(b[j++] + " ");
            }
            else{
                System.out.print(a[i++] + " ");
            }
        }
        while(i<m){
            System.out.print(a[i++] + " ");
        }
        while(j<n){
            System.out.print(b[j++] + " ");
        }
    }

    public static void main(String[] args) {
        int a[]={10,15,40,50,60}; // two sorted array
        int b[]={5, 6, 6,10,15};
        int m=a.length;
        int n=b.length;
        mergSort(a,b,m,n);
    }
}
