package mediumProblems;

import java.util.HashMap;
import java.util.Map;

public class SenderWithLargestWordCount {
    public static void main(String[] args) {
        String[] messages = {"How is leetcode for everyone","Leetcode is useful for practice"};
        String[] senders = {"Bob","Charlie"};
        System.out.println(largestWordCount(messages, senders));
    }
    public static String largestWordCount(String[] messages, String[] senders) {
        Map<String , Integer> count= new HashMap<>();
        for (int i =0; i < messages.length;i++){
            String[] wordCount = messages[i].split(" ");
            count.put(senders[i],count.getOrDefault(senders[i],0)+wordCount.length);
        }
        String result = "";
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String ,Integer> entry:count.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                result = entry.getKey();
            }else if(entry.getValue() == maxValue){
                if (entry.getKey().compareTo(result) > 0){
                    result = entry.getKey();
                }
            }
        }
        return result;
    }
}
