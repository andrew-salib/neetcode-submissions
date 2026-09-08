public class Solution {
    public bool hasDuplicate(int[] nums) {
        if ( nums.Length <= 1)
        {
            return false;
        }

        List<int> numSeen = new List<int>(); 

        for (int i = 0; i < nums.Length; i++) 
        {
            
            if (numSeen.IndexOf(nums[i]) == -1)
            {
                numSeen.Add(nums[i]);
            }
            else 
            {
                return true;
            }
        }

        return false; 

    }
}