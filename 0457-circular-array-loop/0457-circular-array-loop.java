class Solution {

    public boolean circularArrayLoop(int[] nums) {
        // Set slow and fast pointer at first element.
        int slow = 0;
        int fast = 0;
        int size = nums.length;
        for (int i = 1; i <= size; i++) {
            // save slow pointer's value before moving
            int prev = slow;
            // move slow pointer one step
            slow = nextStep(slow, nums[slow], size);
            // check is cycle is omposible, then set next pointers to nect value
            // and move to the next iteration
            if (isNotCycle(nums, prev, slow)) {
                fast = i;
                slow = i;
                continue;
            }
            // This flag indicates wheaher we need to move to the next iteration
            boolean nextIter = false;
            // Number of moves of fast pointer
            int moves = 2;
            for (int j = 0; j < moves; j++) {
                // Save fast popinter's value before moving
                prev = fast;
                // Move fast pointer check cycle every move
                fast = nextStep(fast, nums[fast], size);
                // If cycle is not possible, set slow and fast to next element
                // set 'next_iter' to true and break this loop
                if (isNotCycle(nums, prev, fast)) {
                    fast = i;
                    slow = i;
                    nextIter = true;
                    break;
                }
            }
            // Move to the next iteration
            if (nextIter) {
                continue;
            }
            // If both pointers are at the same position after moving both, a cycle is detected
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // a function to calculate the next step
    private int nextStep(int pointer, int value, int size) {
        int result = (pointer + value) % size;
        if (result < 0) {
            result += size;
        }
        return result;
    }

    // A function to detect a cycle doesn't exist
    private boolean isNotCycle(int[] nums, int prev, int pointer) {
        // If signs of both pointers are different or moving a pointer takes back to the same value,
        // then a cycle is not posible, we return TRUE, otherwise FALSE
        if ((nums[prev] >= 0 && nums[pointer] < 0) || (Math.abs(nums[pointer] % nums.length) == 0)) {
            return true;
        }
        return false;
    }
}
