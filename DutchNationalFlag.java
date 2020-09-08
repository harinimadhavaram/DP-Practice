class DutchNationalFlag {

    public void swap(int nums[], int large, int small) {
        int temp = nums[large];
        nums[large] = nums[small];
        nums[small] = temp;
    }

    public int[] dutchNationalFlag(int nums[], int pivotIndex) {
        int small = 0;
        int large = nums.length - 1;
        int pivot = nums[pivotIndex];
        // Forward pass to move elements less than pivot infront of the pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                swap(nums, small, i);
                small++;
            }
        }

        // Backward pass to move elements greater than pivot behind the pivot
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > pivot) {
                swap(nums, large, i);
                large--;
            }
        }
        return nums;
    }

    public int[] dutchNationalFlag2(int nums[], int pivotIndex) {
        int small = 0;
        int large = nums.length - 1;
        int equal = 0;
        while (equal < large) {
            if (nums[equal] == nums[pivotIndex])
                equal++;
            else if (nums[equal] < nums[pivotIndex]) {
                swap(nums, equal, small);
                equal++;
                small++;
            } else {
                swap(nums, equal, large);
                large--;
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        DutchNationalFlag obj = new DutchNationalFlag();

        int nums[] = { 0, 1, 2, 0, 2, 1, 1 };
        int pivot = 3;
        int sum[] = obj.dutchNationalFlag2(nums, pivot);
        for (int i = 0; i < sum.length; i++)
            System.out.print(sum[i] + " ");

    }
}