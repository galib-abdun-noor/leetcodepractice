import java.util.ArrayList;
import java.util.HashSet;

public class pracThree {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        return set.size();
    }
}