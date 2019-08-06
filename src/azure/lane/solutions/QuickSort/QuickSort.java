package azure.lane.solutions.QuickSort;

/**
 * @author Zheyuan Fu
 * @date 2019.07.16
 */
public class QuickSort {
    public void quickSort(int[] nums, int low, int high) {
        if(low >= high) return ;
        int pivot = partition(nums, low, high);
        quickSort(nums, low, pivot - 1);
        quickSort(nums, pivot + 1, high);
    }

    private int partition(int[] nums, int low, int high) {
        int q = low + (int)(Math.random() * (high - low + 1));
        exch(nums, low, q);

        int index = low + 1;
        for(int i = low + 1; i <= high; i ++) {
            if(nums[i] < nums[low]) {
                exch(nums, i, index ++);
            }
        }
        exch(nums, low, --index);
        return index;
    }
    private void exch(int[] nums, int i, int j){
        if (i == j)
            return;
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}
