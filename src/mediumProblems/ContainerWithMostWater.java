package mediumProblems;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea1(height));
    }
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        for (int i =0; i < height.length;i++){
            for (int j =i; j < height.length; j++){
                max= Math.max(max,(j-i)*Math.min(height[j],height[i]));
            }
        }
        return max;
    }

    public static int maxArea1(int[] height) {
        int area=0;int left=0;
        int right=height.length-1;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int water=(right-left)*h;
            area=Math.max(area,water);
            while(left<right && height[left]<=h) left++;
            while(left<right && height[right]<=h) right--;
        }
        return area;
    }
}
