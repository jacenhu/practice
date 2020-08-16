import java.util.HashMap;
import java.util.Map;

public class MajorityElementClass {

    public int majorityElement(int[] nums) {
        // 预处理到hash map中
        Map<Integer, Integer> mapCount = new HashMap<Integer, Integer>();

        for (int num : nums){
            if (!mapCount.containsKey(num)){
                mapCount.put(num, 1);
            } else {
                mapCount.put(num, mapCount.get(num) + 1);
            }
        }

        // 获取最多出现的
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : mapCount.entrySet()){
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()){
                maxEntry = entry;
            }
        }

        return maxEntry.getKey();
    }
}
