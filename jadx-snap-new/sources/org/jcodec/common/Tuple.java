package org.jcodec.common;

import java.util.LinkedList;
import java.util.List;

public class Tuple {

    public static class _2<T0, T1> {
        public final T0 v0;
        public final T1 v1;

        public _2(T0 t0, T1 t1) {
            this.v0 = t0;
            this.v1 = t1;
        }
    }

    public static <T0, T1> _2<T0, T1> _2(T0 t0, T1 t1) {
        return new _2(t0, t1);
    }

    public static <T0, T1> List<T1> _2_project1(List<_2<T0, T1>> list) {
        LinkedList linkedList = new LinkedList();
        for (_2 _2 : list) {
            linkedList.add(_2.v1);
        }
        return linkedList;
    }
}
