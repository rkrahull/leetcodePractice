package arrays;

class KthTwoSortedArrays {
    public int kthElement(int a[], int b[], int k) {
        if(k > a.length + b.length )
            return 0;
        if(k == a.length + b.length){
            return Math.max(a[a.length-1], b[b.length-1]);
        }
        int ele=0;
        int i=0,j=0,c=0;
        while(i<a.length && j<b.length){
            c++;
            if(a[i]<=b[j]){
                ele=a[i];
                i++;
            }
            else{
                ele=b[j];
                j++;
            }
            if(c==k)
                return ele;
        }
        
        while(i<a.length){
            c++;
            ele=a[i];
            i++;
            if(c==k)
                return ele;
        }
        
         while(j<b.length){
            c++;
            ele=b[j];
            j++;
            if(c==k)
                return ele;
        }
        return ele;
    }
}
//TC : O(K)
//SC : O(1)