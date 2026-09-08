class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1; 

        int isFound = binarySearch(nums, target);
        if (isFound != -1) {
            return isFound;
        }

        if (nums[nums.length -1] < target) {
            return nums.length;
        }
        else if (nums[0] > target) {
            return 0;
        }

        while (l < r) {
            int mid = l + (r - l) / 2; 


           

            if (nums[mid] > target) {
                r = mid - 1;
                if (target > nums[mid] && target < nums[mid+1]) {
                    return mid + 1;
                }
                else if (target < nums[mid] && target > nums[mid-1]) {
                    return mid;
                }
            }
                
            else if (nums[mid] < target) {
                l = mid + 1;
                if (target > nums[mid] && target < nums[mid+1]) {
                    return mid + 1;
                }
                else if (target < nums[mid] && target > nums[mid-1]) {
                    return mid;
                }
            }
           
        }

        return -1;
    }

    public int binarySearch(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1; 

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > target) {
                r = mid - 1; 
            }
            else if (nums[mid] < target) {
                l = mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}