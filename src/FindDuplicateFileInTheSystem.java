import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateFileInTheSystem {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String >> map = new HashMap<>();

        for (String path:paths){
            String[] arr= path.split(" ");
            String directory = arr[0];
            for (int i=1; i < arr.length; i++){
                String fileName= arr[i].substring(0,arr[i].indexOf('('));
                String content = arr[i].substring(arr[i].indexOf('(')+1,arr[i].indexOf(')'));
                StringBuilder filePath = new StringBuilder(directory);
                filePath.append("/").append(fileName);
                map.computeIfAbsent(content,k-> new ArrayList<>()).add(filePath.toString());
            }
        }
        map.entrySet().removeIf(entry -> entry.getValue().size() < 2);

        return new ArrayList<>(map.values());
    }
}
