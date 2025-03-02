package sorting;
//TC : O(NlogN)
//SC : O(N)
class MergeSort {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r)
            return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }
    
    void merge(int arr[], int low, int mid, int high){
        int [] ans=new int[high-low+1];
        
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                ans[k++]=arr[i++];
            }
            else{
                ans[k++]=arr[j++];
            }
        }
        
        while(i<=mid){
            ans[k++]=arr[i++];
        }
        
        while(j<=high){
            ans[k++]=arr[j++];
        }
        
        for(int ind=low;ind<=high;ind++){
            arr[ind]=ans[ind-low];
        }
        return;
        
    }
}
