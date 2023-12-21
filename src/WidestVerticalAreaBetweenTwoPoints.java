import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WidestVerticalAreaBetweenTwoPoints {
    public static void main(String[] args) {

        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        System.out.println(maxWidthOfVerticalArea(points));

    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        int difference= 0;
        int[] xAxis= new int[points.length];
        for (int i =0 ; i< points.length; i++){
            xAxis[i] = points[i][0];
        }
        Arrays.sort(xAxis);
        for(int x=1; x< xAxis.length; x++){
            int difference1 = xAxis[x] - xAxis[x - 1];
            if(xAxis[x] != xAxis[x-1] && difference < difference1){
                difference = difference1;
            }
        }
        return difference;
    }
}
