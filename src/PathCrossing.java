import java.util.HashSet;

public class PathCrossing {
    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }
    public static boolean isPathCrossing(String path) {
        int count=0;
        int count1=0;
        HashSet<String> points = new HashSet<>();
        points.add("0_0");
        for (int i =0; i< path.length();i++){
            switch (path.charAt(i)) {
                case 'N' -> count1++;
                case 'S' -> count1--;
                case 'W' -> count--;
                case 'E' -> count++;
            }

            //string builder performs faster than string ,because string has to create new objects in heap memory while concatenating
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(count);
            stringBuilder.append("-");
            stringBuilder.append(count1);
            String s= stringBuilder.toString();
            if(!points.add(s)){
                return true;
            }
        }

        return false;
    }
}
