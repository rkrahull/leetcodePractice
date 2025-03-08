package sorting;
//TC : O(N*N)
//SC : O(N)
class SelectionSort {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(i,minIndex,arr);
        }
    }

    void swap(int i, int j,int[] arr){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}