public class SortingAlgo{

    public static  void bubbleSort(int[] nums){
        for(int i =0; i<nums.length -1;i++){
            boolean count = false;
            for(int j = 0; j<nums.length -1 - i;j++){
                if(nums[j] > nums[j+1]){
                    nums[j] = nums[j] ^ nums[j+1];
                    nums[j+1] = nums[j] ^ nums[j+1];
                    nums[j] = nums[j] ^ nums[j+1];
                    count = true;
                }
            }
            System.out.printf("step : %d \n",i);
            for(int n:nums){
                System.out.printf("%d ",n);
            }
            if(!count){
                break;
            }
        }
        System.out.println("Final Sort result :");
        for(int i:nums){
            System.out.printf("%d ",i);
        }

    }

    public static void selectionSort(int[] nums){
        int i,j;
        for(i = 0;i<nums.length;i++){
            int min_idx = i;
            for(j = i + 1;j<nums.length;j++){
                if(nums[j] < nums[min_idx]){
                    min_idx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min_idx];
            nums[min_idx] = temp;
        }

        System.out.println("Final Sort result :");
        for(int k:nums){
            System.out.printf("%d ",k);
        }
    }

    public static void main(String[] args) {
        int[] nums = {20,10,-1,5,7,9,-2,5};
        //SortingAlgo.bubbleSort(nums);
        SortingAlgo.selectionSort(nums);
    }
}
