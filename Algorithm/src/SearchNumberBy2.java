/**
 * @Description:
 *给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * @author:liuyong
 * @date:2019/8/10 16:27
 */
public class SearchNumberBy2 {
    public static void main(String[] args) {
        int[][] numbers={{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        int target=44;
        System.out.println(findNumberIn2(numbers,target));
    }
    private static boolean findNumberIn2(int[][] numbers,int target){
        int i=0,j=numbers[0].length-1;
        while(i<numbers.length&&j>=0){
            if(numbers[i][j]>target){
                j--;
            }else if(numbers[i][j]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
