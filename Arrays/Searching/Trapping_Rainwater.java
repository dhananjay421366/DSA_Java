public class Trapping_Rainwater {
    public static int Trapping_Rainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary -arr
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            System.out.println("leftMax array is :" + leftMax[i]);
        }
        System.out.println();
        // calculate right max boundary -arr
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            System.out.println("rightMax array is :" + rightMax[i]);

        }
        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound , rightmax bound)
            // trapped water = waterLevel - height[i]
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(Trapping_Rainwater(height));
    }
}
