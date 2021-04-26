package edu.xcdq;

/**
 * @author xujinwei
 * @date 2021/4/25 16:39
 */
public class Demo {
    public static void main(String[] args) {
        Uncle uncle1 = new UncleOne();
        //用父类的类名接受子类创建的对象 只能调用父类中出现过的方法
        uncle1.faHongbao();
        // uncle1.chouyan();  //不能调用

        UncleOne u1 = (UncleOne) uncle1;//向下转型
        u1.faHongbao();
        u1.chouyan();

        Uncle uncle2 = new UncleTwo(); //向上转型
        uncle2.faHongbao();
    }
}
