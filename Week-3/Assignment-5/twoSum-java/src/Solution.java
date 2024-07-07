import java.util.HashMap;
public class Solution {
    public static int[] twoSum(int[] nums, int target) {

        //use Hashmap to store numbers as key,index as value
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<nums.length;i++){
            //find the numbers we need
            int gap = target - nums[i];
            //if hashMap match the number we loop
            if(map.containsKey(nums[i])){
                //return a new array,get the old number's index and new number's index
                return  new int[]{map.get(nums[i]),i};
            }
            //if not contain this number,maybe next time will match,store it into hashMap
            map.put(gap,i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


//you can't do the insert before if statement,because every key in hashmap is unique
//if the key is the same,the new one will replace the old one.