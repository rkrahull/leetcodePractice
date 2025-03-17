package twoPointer;
/*
TC : O(N)
SC : O(1)
*/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxWater=0;
        while(l<r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
            int currWater=h*width;
            maxWater=Math.max(currWater,maxWater);
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxWater;
    }
}
