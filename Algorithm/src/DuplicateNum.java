/**
 * Description:在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * User:liu yong
 * 时间复杂度：O(n)，空间复杂度：O(1)
 * Date:2019/8/10 15:53
 */
public class DuplicateNum {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,8,2,9,2};
        System.out.println(duplicate(numbers));
    }

    private static int duplicate(int[] numbers){
        int N=numbers.length;
        if(N<=1){
            return -1;
        }
        int i=0;
        while (i<N){
            if(numbers[i]!=i){
                if(numbers[numbers[i]]==numbers[i]){
                    return numbers[i];
                }
                else{
                    swap(numbers,numbers[i],i);
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    private static void swap(int[] numbers,int i,int j){
        int tmp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=tmp;
    }
}
