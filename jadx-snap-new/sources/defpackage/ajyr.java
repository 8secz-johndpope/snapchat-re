package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ajyr */
public class ajyr extends ajyq {
    public static final <T> boolean a(Iterable<? extends T> iterable, akbl<? super T, Boolean> akbl) {
        akcr.b(iterable, "receiver$0");
        akcr.b(akbl, "predicate");
        return ajyr.b((Iterable) iterable, (akbl) akbl);
    }

    public static final <T> boolean a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        akcr.b(collection, "receiver$0");
        akcr.b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean a(Collection<? super T> collection, T[] tArr) {
        akcr.b(collection, "receiver$0");
        akcr.b(tArr, "elements");
        return collection.addAll(ajyh.a((Object[]) tArr));
    }

    public static final <T> boolean a(List<T> list, akbl<? super T, Boolean> akbl) {
        akcr.b(list, "receiver$0");
        akcr.b(akbl, "predicate");
        return ajyr.b((List) list, (akbl) akbl);
    }

    private static final <T> boolean b(Iterable<? extends T> iterable, akbl<? super T, Boolean> akbl) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((Boolean) akbl.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        akcr.b(collection, "receiver$0");
        akcr.b(iterable, "elements");
        return akdg.b(collection).removeAll(ajyn.a((Iterable) iterable, (Iterable) collection));
    }

    private static final <T> boolean b(List<T> list, akbl<? super T, Boolean> akbl) {
        if (list instanceof RandomAccess) {
            int i;
            int a = ajym.a((List) list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    Object obj = list.get(i2);
                    if (!((Boolean) akbl.invoke(obj)).booleanValue()) {
                        if (i != i2) {
                            list.set(i, obj);
                        }
                        i++;
                    }
                    if (i2 == a) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int a2 = ajym.a((List) list);
            if (a2 >= i) {
                while (true) {
                    list.remove(a2);
                    if (a2 == i) {
                        break;
                    }
                    a2--;
                }
            }
            return true;
        } else if (list != null) {
            return ajyr.b(akdg.a((Object) list), (akbl) akbl);
        } else {
            throw new ajxt("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }

    public static final <T> boolean c(Collection<? super T> collection, Iterable<? extends T> iterable) {
        akcr.b(collection, "receiver$0");
        akcr.b(iterable, "elements");
        return akdg.b(collection).retainAll(ajyn.a((Iterable) iterable, (Iterable) collection));
    }
}
