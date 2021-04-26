package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/4/25 17:28
 */
public class Demo01 {
    public static void main(String[] args) {

        //类名 对象名  = new 类名
        Uncle uncle1 = new UncleOne();
        if(uncle1 instanceof UncleTwo){
            UncleTwo u2 = (UncleTwo) uncle1;
            u2.faHongbao();
        }
        if (uncle1 instanceof UncleOne){
            UncleOne u1 = (UncleOne) uncle1;
            u1.faHongbao();
            u1.chouyan();
        }
        /*
        * instanceof
        * 判断对象是否是给定的类的实例
        * 作用 ：避免类型转换时，出现错误，进而引发程序的崩溃*/
    }
}
