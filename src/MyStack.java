/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:19:26
 **/
public class MyStack {
    public int[] elem = new int[100];
    public int usedsize;

    public MyStack( ) {
        this.elem = elem;
        this.usedsize = usedsize;
    }
    //入栈
    public void push(int x){
        elem[usedsize] = x;
        usedsize++;
    }
    //取栈顶元素
    public int peek(){
        return elem[usedsize];
    }
    //出栈
    public int pop(){
        int ret = elem[usedsize-1];
        usedsize--;
        return ret;
    }
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        int ret = myStack.pop();
        System.out.println(ret);
        ret = myStack.pop();
        System.out.println(ret);
    }
}
