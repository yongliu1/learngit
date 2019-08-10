import java.util.Scanner;

/**
 * Description:
 *将一个字符串中的空格替换成 "%20"。
 * @author:liuyong
 * @date:2019/8/10 17:09
 */
public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=null;
        line=scanner.nextLine();

        System.out.println(replaceSpace(line));
    }

    private static String replaceSpace(String origin){
        StringBuffer str=new StringBuffer(origin);
        for(int i=0;i<origin.length();i++){
            if(str.charAt(i)==' '){
                str.append("  ");
            }
        }
        int p1=origin.length()-1;
        int p2=str.length()-1;
        while(p1>=0&&p2>p1){
            char c=str.charAt(p1);
            if(c==' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            }else{
                str.setCharAt(p2--,c);
            }
            p1--;
        }
        return str.toString();
    }
}
