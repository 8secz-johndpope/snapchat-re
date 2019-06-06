package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.snapchat.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: eq */
public final class eq {
    static ArrayList<ViewGroup> a = new ArrayList();
    private static eo b = new ds();
    private static ThreadLocal<WeakReference<iv<ViewGroup, ArrayList<eo>>>> c = new ThreadLocal();

    /* renamed from: eq$a */
    static class a implements OnAttachStateChangeListener, OnPreDrawListener {
        ViewGroup a;
        private eo b;

        a(eo eoVar, ViewGroup viewGroup) {
            this.b = eoVar;
            this.a = viewGroup;
        }

        private void a() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.a.removeOnAttachStateChangeListener(this);
        }

        public final boolean onPreDraw() {
            a();
            if (!eq.a.remove(this.a)) {
                return true;
            }
            final iv a = eq.a();
            ArrayList arrayList = (ArrayList) a.get(this.a);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.a, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.b);
            this.b.a(new ep() {
                public final void a(eo eoVar) {
                    ((ArrayList) a.get(a.this.a)).remove(eoVar);
                }
            });
            this.b.a(this.a, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((eo) it.next()).f(this.a);
                }
            }
            this.b.a(this.a);
            return true;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            a();
            eq.a.remove(this.a);
            ArrayList arrayList = (ArrayList) eq.a().get(this.a);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((eo) it.next()).f(this.a);
                }
            }
            this.b.a(true);
        }
    }

    static iv<ViewGroup, ArrayList<eo>> a() {
        WeakReference weakReference = (WeakReference) c.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference weakReference2 = new WeakReference(new iv());
            c.set(weakReference2);
            weakReference = weakReference2;
        }
        return (iv) weakReference.get();
    }

    public static void a(ViewGroup viewGroup, eo eoVar) {
        if (!a.contains(viewGroup) && kb.a.q(viewGroup)) {
            a.add(viewGroup);
            if (eoVar == null) {
                eoVar = b;
            }
            eoVar = eoVar.clone();
            eq.c(viewGroup, eoVar);
            viewGroup.setTag(R.id.transition_current_scene, null);
            eq.b(viewGroup, eoVar);
        }
    }

    private static void b(ViewGroup viewGroup, eo eoVar) {
        if (eoVar != null && viewGroup != null) {
            a aVar = new a(eoVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void c(ViewGroup viewGroup, eo eoVar) {
        ArrayList arrayList = (ArrayList) eq.a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((eo) it.next()).e(viewGroup);
            }
        }
        if (eoVar != null) {
            eoVar.a(viewGroup, true);
        }
        if (en.a(viewGroup) != null) {
            en.a(null);
        }
    }
}
