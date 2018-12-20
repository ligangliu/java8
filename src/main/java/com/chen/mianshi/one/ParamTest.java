package com.chen.mianshi.one;

/**
 * 参数传递分析
 * @Author liu
 * @Date 2018-12-18 22:19
 */
public class ParamTest {

    public static void main(String[] args) {
        ParamTest test = new ParamTest();
        int a = 1;
        test.changeInt(a);
        //值并不会改变，所以还是会输出1
        System.out.println(a);
        Point point = new Point(1,2);
        test.changePoint(point);
        System.out.println(point);
        String str = "xyz";
        test.changeString(str);
        System.out.println(str);

    }

    /**
     * 对于原声数据类型：只是将a的值拷贝了给参数a
     * @param a
     */
    public void changeInt(int a){
        a = 3;
    }

    /**
     * 方法里面的str = "xxx"会在String pool中重新生成一个xxx对象，且str指向它
     * 然后方法外面的那个str始终指向其传进来的值
     * @param str
     */
    public void changeString(String str){
        str = "xxxx";
    }
    /**
     * 对于引用类型：传递的是引用的地址，那么方法里面对于point的操作就是传递过来的地址进行操作
     * 其实在java里面，对于方法的参数传递，不管是原声数据还是引用类型，一律传值，只不过引用类型的值是一个地址
     * @param point
     */
    public void changePoint(Point point){
        point.x = 5;
        point.y = 6;
    }
}
class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " +y;
    }
}
