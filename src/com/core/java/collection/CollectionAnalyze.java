package com.core.java.collection;

import java.util.ArrayList;

/**
 * @author: qilongxin
 * @date: 2021/12/17 13:50
 */
public class CollectionAnalyze {
    public static void main(String[] args) {
        // ArrayList初始容量默认为0（类型为Object的空数组存储数据，利用了数组的协变，擦除了编译时类型，此时还未分配内存空间）
        ArrayList<String> list = new ArrayList<>();
        // 在添加第1个元素时，会进入grow()方法，分配内存空间，数组容量为10（内部扩容实际上是将小数组中的元素复制到大数组中）
        list.add("1");
        // 在添加第2、3、4...个元素时，不会进入grow()方法，数组不会扩容，直到添加第11个元素时，数组会再次扩容（扩大为原来容量的1.5倍左右）
        list.add("2");
        list.add("3");
        list.add("4");
        // ArrayList扩容核心方法：grow(int minCapacity)  int newCapacity = oldCapacity + (oldCapacity >> 1)
        // 位运算速度比整数运算更快，右移两位表示除以2，所以新容量为旧容量的1.5倍左右
        System.out.println(list);
    }
}
