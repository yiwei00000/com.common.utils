package com.common.listutils;

import java.util.ArrayList;
import java.util.List;

/*
 *Created by yiwei 2019-03-31
 */
public class ListUtil {


    /**
     * 根据给的bin分割list
     *
     * @param elems  元素list
     * @param binNum 每份个数
     * @param <E>    list存放元素类型
     * @return 返回值
     */
    public static <E> List<List<E>> splitList(List<E> elems, int binNum) {
        List<List<E>> rs = null;
        if (elems != null && binNum != 0) {
            int size = elems.size();
            rs = new ArrayList<>();
            List<E> binLs = new ArrayList<>(binNum + 1);
            for (int i = 0; i < size; i++) {
                if (i != 0 && i % binNum == 0) {
                    rs.add(binLs);
                    binLs = new ArrayList<>(binNum + 1);
                }
                binLs.add(elems.get(i));
            }
            rs.add(binLs);

        }
        return rs;
    }

}
