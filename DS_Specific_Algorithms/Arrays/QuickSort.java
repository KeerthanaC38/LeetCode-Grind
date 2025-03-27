import java.util.Scanner;

class QuickSort {

    public void swap(int[] a, int i , int j){
        int c=a[i];
        a[i]=a[j];
        a[j]=c;
    }

    public int partition(int[] a, int low,int high){
        int pivot=a[low];
        int i=low,j=high;
        while(i<j){
            do{
                i++;
            }while(a[i]<pivot);
            do{
                j--;
            }while(a[j]>pivot);
            if(i<j){
                swap(a,i,j);
            }
        }
        swap(a,low,j);
        return j;

    }
    public void quickSort(int[] a,int low,int high){
        if(low<high){
            int j=partition(a,low,high);
            quickSort(a,low,j-1);
            quickSort(a,j+1,high);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        QuickSort qs=new QuickSort();
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        arr[n]=Integer.MAX_VALUE;
        qs.quickSort(arr,0,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
