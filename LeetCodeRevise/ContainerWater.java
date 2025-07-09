public class ContainerWater {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] height = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = height.length-1;
        int max = 0;

        while(left<right){
            int diff = (right-left)*(Math.min(height[left],height[right]));
            if(diff > max){
                max = diff;
            }
            System.out.println(diff);
           if(height[left] < height[right]){
            left++;
           }else{
            right--;
           }
        }

        System.out.println("result is "+max);
        
    } 
}
