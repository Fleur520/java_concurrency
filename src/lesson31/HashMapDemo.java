package lesson31;

import java.util.HashMap;

/**
 * 描述：     重写了不好的hashCode方法，通过debug可以看出生成了TreeNode节点
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap map = new HashMap<HashMapDemo,Integer>(1);
        for (int i = 0; i < 1000; i++) {
            HashMapDemo hashMapDemo1 = new HashMapDemo();
            map.put(hashMapDemo1, null);
        }
        System.out.println("运行结束");
    }

    @Override
    public int hashCode() {
        return 1;
    }



}
