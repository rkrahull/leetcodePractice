package math;

import java.util.ArrayList;
import java.util.List;

/*TC : O(Rlog(log(R))+R−L)
SC : O(R)*/
class ClosestPrimeNumbersRange {
    public int[] closestPrimes(int left, int right) {
        boolean[] arr=new boolean[right+1];

        for(int i=0;i<=right;i++)
            arr[i]=true;
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=right;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=right;j+=i){
                    arr[j]=false;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(arr[i]==true){
                //System.out.println(i);
                list.add(i);
            }
        }

        //System.out.println(list);

        int min = Integer.MAX_VALUE;
        int x=-1, y=-1;
        for(int i=1; i< list.size();i++){
            if(list.get(i)-list.get(i-1) < min){
                min = list.get(i)-list.get(i-1);
                y=list.get(i);
                x=list.get(i-1);
            }
        }

        return new int[]{x, y};
    }
}