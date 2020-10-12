import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:18:49
 **/
public class YangHui {

    public static List<List<Integer>> generate(int numRows){
       //判断numRows的合法性
        if (numRows <= 0){
            return null;
        }
        //定义result用来保存要求的第i行的数据
        List<List<Integer>> result = new ArrayList<>();
        //定义firstLine来保存第1行的数据
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1){
            return result;
        }
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2){
            return result;
        }
        for (int row = 3; row <= numRows; row++) {
            //定义prevLine来保存前一行的数据，row-1表示前一行，但由于下标是从0开始的，因此row-1行的下标还要-1
            List<Integer> prevLine = result.get((row-1)-1);
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            for (int col = 2; col < row; col++) {
                int curNum = prevLine.get((col-1)-1)+ prevLine.get(col-1);
                curLine.add(curNum);
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(4));
    }
}
