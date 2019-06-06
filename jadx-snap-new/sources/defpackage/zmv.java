package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zmv */
public final class zmv extends ajed implements zmx {
    static final a a = new a(0, null);
    private static final ThreadLocal<LayoutInflater> g = new ThreadLocal();
    final AtomicBoolean b = new AtomicBoolean(false);
    final SparseArray<LinkedList<View>> c = new SparseArray();
    final ajdw d;
    final LayoutInflater e;
    final ViewGroup f;

    /* renamed from: zmv$a */
    static class a {
        final int a;
        final View b;

        a(int i, View view) {
            this.a = i;
            this.b = view;
        }
    }

    /* renamed from: zmv$7 */
    class 7 implements ajfb<ajej> {
        7() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zmv$6 */
    class 6 implements ajev {
        6() {
        }

        public final void run() {
        }
    }

    /* renamed from: zmv$5 */
    class 5 implements ajfc<Integer, T> {
        5() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return zmv.a(zmv.this.e).inflate(((Integer) obj).intValue(), zmv.this.f, false);
        }
    }

    /* renamed from: zmv$4 */
    class 4 implements ajfc<Entry<Integer, Integer>, ajdt<Integer>> {
        4() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Entry entry = (Entry) obj;
            return ajdp.b(entry.getKey()).a((long) ((Integer) entry.getValue()).intValue());
        }
    }

    /* renamed from: zmv$3 */
    class 3 implements ajfc<Integer, ajdt<a>> {

        /* renamed from: zmv$3$2 */
        class 2 implements ajfc<Integer, a> {
            2() {
            }

            private a a(Integer num) {
                return new a(num.intValue(), zmv.a(zmv.this.e).inflate(num.intValue(), zmv.this.f, false));
            }

            public final /* synthetic */ Object apply(Object obj) {
                return a((Integer) obj);
            }
        }

        /* renamed from: zmv$3$1 */
        class 1 implements ajfb<Throwable> {
            1() {
            }

            public final /* synthetic */ void accept(Object obj) {
                Log.e("RxViewPrefetcher", "Failed to inflate", (Throwable) obj);
            }
        }

        3() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return ajdp.b((Integer) obj).p(new 2()).c(new 1()).f(zmv.a).b(zmv.this.d);
        }
    }

    /* renamed from: zmv$2 */
    class 2 implements ajfl<a> {
        2() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            return !zmv.a.equals((a) obj);
        }
    }

    /* renamed from: zmv$1 */
    class 1 implements ajfc<a, Object> {
        1() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            zmv zmv = zmv.this;
            if (zmv.b.get()) {
                return aVar;
            }
            LinkedList linkedList = (LinkedList) zmv.c.get(aVar.a);
            if (linkedList == null) {
                linkedList = new LinkedList();
                zmv.c.put(aVar.a, linkedList);
            }
            linkedList.add(aVar.b);
            return aVar;
        }
    }

    public zmv(ajdw ajdw, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = ajdw;
        this.e = layoutInflater;
        this.f = viewGroup;
    }

    public static LayoutInflater a(LayoutInflater layoutInflater) {
        if (g.get() != null) {
            return (LayoutInflater) g.get();
        }
        layoutInflater = layoutInflater.cloneInContext(layoutInflater.getContext().createConfigurationContext(layoutInflater.getContext().getResources().getConfiguration()));
        g.set(layoutInflater);
        return layoutInflater;
    }

    public final ajcx a(Map<Integer, Integer> map) {
        return ajdp.b(map.entrySet()).k(new 4()).k(new 3()).b(this.d).a(ajee.a(ajef.a)).a(new 2()).p(new 1()).g();
    }

    public final View a(int i) {
        LinkedList linkedList = (LinkedList) this.c.get(i);
        return (linkedList == null || linkedList.isEmpty()) ? null : (View) linkedList.remove();
    }

    public final <T extends View> ajdx<T> b(int i) {
        return ajdx.b(Integer.valueOf(i)).b(new 7()).a(new 6()).f(new 5()).b(this.d);
    }

    public final void onDispose() {
        this.b.set(true);
        for (int i = 0; i < this.c.size(); i++) {
            SparseArray sparseArray = this.c;
            ((LinkedList) sparseArray.get(sparseArray.keyAt(i))).clear();
        }
        this.c.clear();
    }
}
