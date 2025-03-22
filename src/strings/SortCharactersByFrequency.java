package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }

        Queue<Integer[]> que=new PriorityQueue<>((a, b)->(b[1]-a[1]));

        for(Map.Entry<Character, Integer> pair:mp.entrySet()){
            Integer [] arr=new Integer[]{(int)pair.getKey(),pair.getValue()};
            que.offer(arr);
        }

        StringBuilder ans=new StringBuilder();
        while(!que.isEmpty()){
            Integer[] ar=que.poll();
            int key=ar[0],val=ar[1];
            while(val-->0)
                ans.append((char)key);
        }

        return ans.toString();
    }
}
