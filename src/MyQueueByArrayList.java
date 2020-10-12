/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:19:38
 **/
public class MyQueueByArrayList {

    public int[] elem = new int[100];
    public int usedSize = 0;
    public int head = 0;
    public int tail = 0;
    public void offer(int x){
        if (elem.length == usedSize){
            return;
        }
        elem[tail] = x;
        tail++;
        if (tail >= elem.length){
            tail = 0;
        }
        usedSize++;
    }
    public Integer poll(){
        if (usedSize == 0){
            return null;
        }
        Integer ret = elem[head];
        head++;
        if (head >= elem.length){
            head = 0;
        }
        this.usedSize--;
        return ret;
    }
    public Integer peek(){
        if (usedSize == 0){
            return null;
        }
        return elem[head];
    }
}
