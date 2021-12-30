package elevenTwenty;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = 0;
        while(i<j){
            int area = (j-i)*Math.min(height[i], height[j]);
            if(maxArea<area)    maxArea = area;
            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
