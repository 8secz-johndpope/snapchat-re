package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: qbx */
public final class qbx implements ajej {
    pqh a;
    private final Map<String, Map<String, qfm>> b = new LinkedHashMap();
    private final Set<String> c = new LinkedHashSet();
    private final ajei d = new ajei();
    private final pqg e;

    public qbx(pqg pqg) {
        akcr.b(pqg, "chatCommands");
        this.e = pqg;
    }

    private final void a(qgu qgu) {
        Map linkedHashMap = new LinkedHashMap();
        for (String a : qgu.d) {
            ajxm a2 = ajxs.a(a, qfm.NOT_STARTED);
            linkedHashMap.put(a2.a, a2.b);
        }
        this.b.put(qgu.a, linkedHashMap);
    }

    private final void a(qgu qgu, gcj gcj) {
        pqh a = pqi.a(this.a);
        if (a != null) {
            this.e.a(a, qgu.a, gcj);
        }
    }

    private final void b(qgu qgu) {
        Object obj;
        Object obj2 = this.b.get(qgu.a);
        if (obj2 == null) {
            akcr.a();
        }
        Collection arrayList = new ArrayList();
        Iterator it = ((Map) obj2).entrySet().iterator();
        while (true) {
            obj = 1;
            if (!it.hasNext()) {
                break;
            }
            Object value = ((Entry) it.next()).getValue();
            if (((qfm) value) == qfm.SUCCESS) {
                obj = null;
            }
            if (obj == null) {
                value = null;
            }
            qfm qfm = (qfm) value;
            if (qfm != null) {
                arrayList.add(qfm);
            }
        }
        boolean isEmpty = ((List) arrayList).isEmpty();
        akcr.b(qgu, "event");
        gcj gcj = qgu.c;
        if (!isEmpty || gcj == gcj.UNPRESERVED) {
            obj = null;
        }
        if (obj != null) {
            a(qgu, gcj.UNPRESERVED);
        }
    }

    public final void dispose() {
        this.d.dispose();
    }

    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onReceivedItemDisplayEvent(qgu qgu) {
        String str = "event";
        akcr.b(qgu, str);
        pqh pqh = this.a;
        int i = 1;
        if (pqh != null && pqh.c) {
            return;
        }
        StringBuilder stringBuilder;
        if ((qgu.b ^ 1) == 0) {
            stringBuilder = new StringBuilder("Only dispatch a ReceivedItemDisplayEvent on a received message. messageKey=");
            stringBuilder.append(qgu.a);
            throw new IllegalStateException(stringBuilder.toString().toString());
        } else if (qgu.d.contains(qgu.e)) {
            if (((Map) this.b.get(qgu.a)) == null) {
                a(qgu);
            }
            String str2 = qgu.a;
            String str3 = qgu.e;
            qfm qfm = qgu.f;
            Object obj = this.b.get(str2);
            if (obj == null) {
                akcr.a();
            }
            qfm qfm2 = (qfm) ((Map) obj).get(str3);
            if (!(qfm2 == qfm.SUCCESS || qfm == qfm2)) {
                Object obj2 = this.b.get(str2);
                if (obj2 == null) {
                    akcr.a();
                }
                ((Map) obj2).put(str3, qfm);
                int i2 = qby.a[qfm.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        b(qgu);
                    }
                    return;
                }
                boolean contains = this.c.contains(qgu.a);
                akcr.b(qgu, str);
                if (qgu.c != gcj.INITIAL) {
                    i = 0;
                }
                if (!(i == 0 || contains)) {
                    this.c.add(qgu.a);
                    a(qgu, gcj.PRESERVED);
                }
            }
        } else {
            stringBuilder = new StringBuilder("displayItemIdSet must contain displayItemId. displayItemIdSet=");
            stringBuilder.append(qgu.d);
            stringBuilder.append(", displayItemId=");
            stringBuilder.append(qgu.e);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
    }
}
