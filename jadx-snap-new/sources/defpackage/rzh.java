package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: rzh */
public final class rzh {

    /* renamed from: rzh$a */
    public static final class a extends akcs implements akbl<rzg, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            rzg rzg = (rzg) obj;
            akcr.b(rzg, "schedulingContext");
            return rzg.toString();
        }
    }

    public static final Set<idl> a(Set<rzg> set) {
        akcr.b(set, "receiver$0");
        Iterable<rzg> iterable = set;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (rzg rzg : iterable) {
            arrayList.add(rzg.a);
        }
        return ajyu.m((List) arrayList);
    }

    public static final boolean a(Collection<rzg> collection) {
        akcr.b(collection, "receiver$0");
        if ((collection.isEmpty() ^ 1) != 0) {
            Object obj;
            Iterable<rzg> iterable = collection;
            if (!((Collection) iterable).isEmpty()) {
                for (rzg rzg : iterable) {
                    if (!rze.a(rzg.b)) {
                        obj = null;
                        break;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public static final idl b(Set<rzg> set) {
        akcr.b(set, "receiver$0");
        rzg rzg = (rzg) ajyu.e((Iterable) set);
        if (rzg != null) {
            idl idl = rzg.a;
            if (idl != null) {
                return idl;
            }
        }
        return idn.a;
    }

    public static final boolean b(Collection<rzg> collection) {
        String str = "receiver$0";
        akcr.b(collection, str);
        if ((collection.isEmpty() ^ 1) != 0) {
            Object obj;
            Iterable<rzg> iterable = collection;
            if (!((Collection) iterable).isEmpty()) {
                for (rzg rzg : iterable) {
                    Object obj2;
                    rzc rzc = rzg.b;
                    akcr.b(rzc, str);
                    if (rzc.ordinal() <= rzc.UserInitiated.ordinal()) {
                        obj2 = 1;
                        continue;
                    } else {
                        obj2 = null;
                        continue;
                    }
                    if (obj2 != null) {
                        obj = 1;
                        break;
                    }
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public static final idd c(Set<rzg> set) {
        akcr.b(set, "receiver$0");
        return idf.a(rzh.b((Set) set));
    }
}
