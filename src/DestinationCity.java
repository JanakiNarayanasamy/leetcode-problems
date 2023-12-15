import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DestinationCity {
    public static void main(String[] args) {

        List<String > l1 = List.of("qMTSlfgZlC","ePvzZaqLXj");
        List<String > l2 = List.of("xKhZXfuBeC","TtnllZpKKg");
        List<String > l3 = List.of("ePvzZaqLXj","sxrvXFcqgG");
        List<String > l4 = List.of("sxrvXFcqgG","xKhZXfuBeC");
        List<String > l5 = List.of("TtnllZpKKg","OAxMijOZgW");
        List<List<String >> paths = List.of(l1,l2,l3,l4,l5);
        System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {

        // Destination would never be a source
        Set<String > pathSet = new HashSet<>();
        for (int i =0 ; i <paths.size(); i++){
            pathSet.add(paths.get(i).get(0));
        }
        for (int i =0 ; i <paths.size(); i++){
            if(!pathSet.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}

