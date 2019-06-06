package defpackage;

import java.util.LinkedList;

/* renamed from: zgf */
public final class zgf {
    public static final zfe<LinkedList<idd>> a = new zfe();

    static {
        zgf zgf = new zgf();
    }

    private zgf() {
    }

    public static final idd a() {
        LinkedList linkedList = (LinkedList) a.get();
        return linkedList != null ? (idd) linkedList.getLast() : null;
    }

    public static final void a(idd idd) {
        akcr.b(idd, "callsite");
        LinkedList linkedList = (LinkedList) a.get();
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        linkedList.add(idd);
        a.set(linkedList);
    }

    public static final void b() {
        LinkedList linkedList = (LinkedList) a.get();
        if (linkedList != null) {
            linkedList.removeLast();
            if (linkedList.isEmpty()) {
                a.remove();
            }
        }
    }
}
