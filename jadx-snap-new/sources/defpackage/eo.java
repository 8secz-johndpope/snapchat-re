package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: eo */
public abstract class eo implements Cloneable {
    private static final int[] a = new int[]{2, 1, 3, 4};
    private static final eg i = new 1();
    private static ThreadLocal<iv<Animator, a>> z = new ThreadLocal();
    private ViewGroup A = null;
    private boolean B = false;
    private int C = 0;
    private boolean D = false;
    private boolean E = false;
    private ArrayList<c> F = null;
    private ArrayList<Animator> G = new ArrayList();
    private b H;
    long b = -1;
    long c = -1;
    public ArrayList<Integer> d = new ArrayList();
    public ArrayList<View> e = new ArrayList();
    er f = null;
    ArrayList<Animator> g = new ArrayList();
    eg h = i;
    private String j = getClass().getName();
    private TimeInterpolator k = null;
    private ArrayList<String> l = null;
    private ArrayList<Class> m = null;
    private ArrayList<Integer> n = null;
    private ArrayList<View> o = null;
    private ArrayList<Class> p = null;
    private ArrayList<String> q = null;
    private ArrayList<Integer> r = null;
    private ArrayList<View> s = null;
    private ArrayList<Class> t = null;
    private et u = new et();
    private et v = new et();
    private int[] w = a;
    private ArrayList<es> x;
    private ArrayList<es> y;

    /* renamed from: eo$3 */
    class 3 extends AnimatorListenerAdapter {
        3() {
        }

        public final void onAnimationEnd(Animator animator) {
            eo.this.d();
            animator.removeListener(this);
        }
    }

    /* renamed from: eo$a */
    static class a {
        View a;
        String b;
        es c;
        fm d;
        eo e;

        a(View view, String str, eo eoVar, fm fmVar, es esVar) {
            this.a = view;
            this.b = str;
            this.c = esVar;
            this.d = fmVar;
            this.e = eoVar;
        }
    }

    /* renamed from: eo$b */
    public static abstract class b {
    }

    /* renamed from: eo$c */
    public interface c {
        void a();

        void a(eo eoVar);

        void b();

        void c();
    }

    /* renamed from: eo$1 */
    static class 1 extends eg {
        1() {
        }

        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    private static void a(et etVar, View view, es esVar) {
        etVar.a.put(view, esVar);
        int id = view.getId();
        if (id >= 0) {
            if (etVar.b.indexOfKey(id) >= 0) {
                etVar.b.put(id, null);
            } else {
                etVar.b.put(id, view);
            }
        }
        String s = kb.a.s(view);
        if (s != null) {
            if (etVar.d.containsKey(s)) {
                etVar.d.put(s, null);
            } else {
                etVar.d.put(s, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (etVar.c.e(itemIdAtPosition) >= 0) {
                    view = (View) etVar.c.b(itemIdAtPosition);
                    if (view != null) {
                        kb.a(view, false);
                        etVar.c.a(itemIdAtPosition, null);
                    }
                    return;
                }
                kb.a(view, true);
                etVar.c.a(itemIdAtPosition, (Object) view);
            }
        }
    }

    private void a(et etVar, et etVar2) {
        iv ivVar = new iv(etVar.a);
        iv ivVar2 = new iv(etVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.w;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            int size;
            int i3;
            View view;
            View view2;
            es esVar;
            es esVar2;
            if (i2 == 1) {
                for (i2 = ivVar.size() - 1; i2 >= 0; i2--) {
                    View view3 = (View) ivVar.b(i2);
                    if (view3 != null && b(view3)) {
                        es esVar3 = (es) ivVar2.remove(view3);
                        if (!(esVar3 == null || esVar3.b == null || !b(esVar3.b))) {
                            this.x.add((es) ivVar.d(i2));
                            this.y.add(esVar3);
                        }
                    }
                }
            } else if (i2 == 2) {
                iv ivVar3 = etVar.d;
                iv ivVar4 = etVar2.d;
                size = ivVar3.size();
                for (i3 = 0; i3 < size; i3++) {
                    view = (View) ivVar3.c(i3);
                    if (view != null && b(view)) {
                        view2 = (View) ivVar4.get(ivVar3.b(i3));
                        if (view2 != null && b(view2)) {
                            esVar = (es) ivVar.get(view);
                            esVar2 = (es) ivVar2.get(view2);
                            if (!(esVar == null || esVar2 == null)) {
                                this.x.add(esVar);
                                this.y.add(esVar2);
                                ivVar.remove(view);
                                ivVar2.remove(view2);
                            }
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray sparseArray = etVar.b;
                SparseArray sparseArray2 = etVar2.b;
                size = sparseArray.size();
                for (i3 = 0; i3 < size; i3++) {
                    view = (View) sparseArray.valueAt(i3);
                    if (view != null && b(view)) {
                        view2 = (View) sparseArray2.get(sparseArray.keyAt(i3));
                        if (view2 != null && b(view2)) {
                            esVar = (es) ivVar.get(view);
                            esVar2 = (es) ivVar2.get(view2);
                            if (!(esVar == null || esVar2 == null)) {
                                this.x.add(esVar);
                                this.y.add(esVar2);
                                ivVar.remove(view);
                                ivVar2.remove(view2);
                            }
                        }
                    }
                }
            } else if (i2 == 4) {
                ja jaVar = etVar.c;
                ja jaVar2 = etVar2.c;
                size = jaVar.a();
                for (i3 = 0; i3 < size; i3++) {
                    view = (View) jaVar.c(i3);
                    if (view != null && b(view)) {
                        view2 = (View) jaVar2.b(jaVar.b(i3));
                        if (view2 != null && b(view2)) {
                            esVar = (es) ivVar.get(view);
                            esVar2 = (es) ivVar2.get(view2);
                            if (!(esVar == null || esVar2 == null)) {
                                this.x.add(esVar);
                                this.y.add(esVar2);
                                ivVar.remove(view);
                                ivVar2.remove(view2);
                            }
                        }
                    }
                }
            }
            i++;
        }
        for (int i4 = 0; i4 < ivVar.size(); i4++) {
            es esVar4 = (es) ivVar.c(i4);
            if (b(esVar4.b)) {
                this.x.add(esVar4);
                this.y.add(null);
            }
        }
        for (int i5 = 0; i5 < ivVar2.size(); i5++) {
            es esVar5 = (es) ivVar2.c(i5);
            if (b(esVar5.b)) {
                this.y.add(esVar5);
                this.x.add(null);
            }
        }
    }

    /* JADX WARNING: Missing block: B:11:0x001f, code skipped:
            return true;
     */
    private static boolean a(defpackage.es r0, defpackage.es r1, java.lang.String r2) {
        /*
        r0 = r0.a;
        r0 = r0.get(r2);
        r1 = r1.a;
        r1 = r1.get(r2);
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        if (r1 == 0) goto L_0x001d;
    L_0x0010:
        r2 = 1;
        if (r0 == 0) goto L_0x001f;
    L_0x0013:
        if (r1 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x001f;
    L_0x0016:
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        return r2;
    L_0x001d:
        r0 = 0;
        return r0;
    L_0x001f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo.a(es, es, java.lang.String):boolean");
    }

    private void c(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                es esVar = new es();
                esVar.b = view;
                if (z) {
                    a(esVar);
                } else {
                    b(esVar);
                }
                esVar.c.add(this);
                c(esVar);
                eo.a(z ? this.u : this.v, view, esVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    c(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    private static iv<Animator, a> f() {
        iv ivVar = (iv) z.get();
        if (ivVar != null) {
            return ivVar;
        }
        ivVar = new iv();
        z.set(ivVar);
        return ivVar;
    }

    public Animator a(ViewGroup viewGroup, es esVar, es esVar2) {
        return null;
    }

    public eo a(long j) {
        this.c = j;
        return this;
    }

    public eo a(TimeInterpolator timeInterpolator) {
        this.k = timeInterpolator;
        return this;
    }

    public eo a(c cVar) {
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.add(cVar);
        return this;
    }

    public final es a(View view, boolean z) {
        eo eoVar = this;
        while (true) {
            eo eoVar2 = eoVar.f;
            if (eoVar2 == null) {
                break;
            }
            eoVar = eoVar2;
        }
        return (es) (z ? eoVar.u : eoVar.v).a.get(view);
    }

    /* Access modifiers changed, original: 0000 */
    public String a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(": ");
        str = stringBuilder.toString();
        String str2 = ") ";
        if (this.c != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dur(");
            stringBuilder.append(this.c);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.b != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dly(");
            stringBuilder.append(this.b);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.k != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("interp(");
            stringBuilder.append(this.k);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.d.size() <= 0 && this.e.size() <= 0) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("tgts(");
        str = stringBuilder.toString();
        int size = this.d.size();
        String str3 = ppy.d;
        if (size > 0) {
            String str4 = str;
            for (int i = 0; i < this.d.size(); i++) {
                StringBuilder stringBuilder2;
                if (i > 0) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str4);
                    stringBuilder2.append(str3);
                    str4 = stringBuilder2.toString();
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str4);
                stringBuilder2.append(this.d.get(i));
                str4 = stringBuilder2.toString();
            }
            str = str4;
        }
        if (this.e.size() > 0) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (i2 > 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str3);
                    str = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.e.get(i2));
                str = stringBuilder.toString();
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final void a(ViewGroup viewGroup) {
        this.x = new ArrayList();
        this.y = new ArrayList();
        a(this.u, this.v);
        iv f = eo.f();
        int size = f.size();
        fm a = fc.a(viewGroup);
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = (Animator) f.b(size);
                if (animator != null) {
                    a aVar = (a) f.get(animator);
                    if (!(aVar == null || aVar.a == null || !a.equals(aVar.d))) {
                        es esVar = aVar.c;
                        View view = aVar.a;
                        boolean z = true;
                        es a2 = a(view, true);
                        es b = b(view, true);
                        if ((a2 == null && b == null) || !aVar.e.a(esVar, b)) {
                            z = false;
                        }
                        if (z) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                f.remove(animator);
                            }
                        }
                    }
                }
            } else {
                a(viewGroup, this.u, this.v, this.x, this.y);
                b();
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(ViewGroup viewGroup, et etVar, et etVar2, ArrayList<es> arrayList, ArrayList<es> arrayList2) {
        iv f = eo.f();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2;
            et etVar3;
            es esVar = (es) arrayList.get(i);
            es esVar2 = (es) arrayList2.get(i);
            if (!(esVar == null || esVar.c.contains(this))) {
                esVar = null;
            }
            if (!(esVar2 == null || esVar2.c.contains(this))) {
                esVar2 = null;
            }
            if (!(esVar == null && esVar2 == null)) {
                Object obj = (esVar == null || esVar2 == null || a(esVar, esVar2)) ? 1 : null;
                if (obj != null) {
                    Animator a = a(viewGroup, esVar, esVar2);
                    if (a != null) {
                        es esVar3;
                        View view;
                        Object obj2;
                        Animator animator;
                        if (esVar2 != null) {
                            es esVar4;
                            View view2 = esVar2.b;
                            String[] a2 = a();
                            if (view2 != null && a2 != null && a2.length > 0) {
                                int i3;
                                esVar4 = new es();
                                esVar4.b = view2;
                                esVar3 = (es) etVar2.a.get(view2);
                                if (esVar3 != null) {
                                    i3 = 0;
                                    while (i3 < a2.length) {
                                        animator = a;
                                        i2 = size;
                                        es esVar5 = esVar3;
                                        esVar4.a.put(a2[i3], esVar3.a.get(a2[i3]));
                                        i3++;
                                        a = animator;
                                        size = i2;
                                        esVar3 = esVar5;
                                    }
                                }
                                animator = a;
                                i2 = size;
                                int size2 = f.size();
                                for (i3 = 0; i3 < size2; i3++) {
                                    a aVar = (a) f.get((Animator) f.b(i3));
                                    if (aVar.c != null && aVar.a == view2 && aVar.b.equals(this.j) && aVar.c.equals(esVar4)) {
                                        view = view2;
                                        esVar3 = esVar4;
                                        obj2 = null;
                                        break;
                                    }
                                }
                            } else {
                                etVar3 = etVar2;
                                animator = a;
                                i2 = size;
                                esVar4 = null;
                            }
                            view = view2;
                            esVar3 = esVar4;
                            obj2 = animator;
                        } else {
                            etVar3 = etVar2;
                            animator = a;
                            i2 = size;
                            view = esVar.b;
                            obj2 = animator;
                            esVar3 = null;
                        }
                        if (obj2 != null) {
                            f.put(obj2, new a(view, this.j, this, fc.a(viewGroup), esVar3));
                            this.G.add(obj2);
                        }
                        i++;
                        size = i2;
                    }
                    etVar3 = etVar2;
                    i2 = size;
                    i++;
                    size = i2;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            etVar3 = etVar2;
            i2 = size;
            i++;
            size = i2;
        }
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            Animator animator2 = (Animator) this.G.get(sparseIntArray.keyAt(i4));
            animator2.setStartDelay((((long) sparseIntArray.valueAt(i4)) - Long.MAX_VALUE) + animator2.getStartDelay());
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ViewGroup viewGroup, boolean z) {
        a(z);
        if (this.d.size() > 0 || this.e.size() > 0) {
            for (int i = 0; i < this.d.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.d.get(i)).intValue());
                if (findViewById != null) {
                    es esVar = new es();
                    esVar.b = findViewById;
                    if (z) {
                        a(esVar);
                    } else {
                        b(esVar);
                    }
                    esVar.c.add(this);
                    c(esVar);
                    eo.a(z ? this.u : this.v, findViewById, esVar);
                }
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View view = (View) this.e.get(i2);
                es esVar2 = new es();
                esVar2.b = view;
                if (z) {
                    a(esVar2);
                } else {
                    b(esVar2);
                }
                esVar2.c.add(this);
                c(esVar2);
                eo.a(z ? this.u : this.v, view, esVar2);
            }
            return;
        }
        c(viewGroup, z);
    }

    public void a(b bVar) {
        this.H = bVar;
    }

    public abstract void a(es esVar);

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        et etVar;
        if (z) {
            this.u.a.clear();
            this.u.b.clear();
            etVar = this.u;
        } else {
            this.v.a.clear();
            this.v.b.clear();
            etVar = this.v;
        }
        etVar.c.b();
    }

    public boolean a(es esVar, es esVar2) {
        if (!(esVar == null || esVar2 == null)) {
            String[] a = a();
            if (a != null) {
                for (String a2 : a) {
                    if (eo.a(esVar, esVar2, a2)) {
                        return true;
                    }
                }
            } else {
                for (String a3 : esVar.a.keySet()) {
                    if (eo.a(esVar, esVar2, a3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String[] a() {
        return null;
    }

    public eo b(long j) {
        this.b = j;
        return this;
    }

    public eo b(c cVar) {
        ArrayList arrayList = this.F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.F.size() == 0) {
            this.F = null;
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final es b(View view, boolean z) {
        eo eoVar = this;
        while (true) {
            eo eoVar2 = eoVar.f;
            if (eoVar2 == null) {
                break;
            }
            eoVar = eoVar2;
        }
        ArrayList arrayList = z ? eoVar.x : eoVar.y;
        es esVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            es esVar2 = (es) arrayList.get(i2);
            if (esVar2 == null) {
                return null;
            }
            if (esVar2.b == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            esVar = (es) (z ? eoVar.y : eoVar.x).get(i);
        }
        return esVar;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        c();
        final iv f = eo.f();
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (f.containsKey(animator)) {
                c();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            f.remove(animator);
                            eo.this.g.remove(animator);
                        }

                        public final void onAnimationStart(Animator animator) {
                            eo.this.g.add(animator);
                        }
                    });
                    if (animator == null) {
                        d();
                    } else {
                        long j = this.c;
                        if (j >= 0) {
                            animator.setDuration(j);
                        }
                        j = this.b;
                        if (j >= 0) {
                            animator.setStartDelay(j);
                        }
                        TimeInterpolator timeInterpolator = this.k;
                        if (timeInterpolator != null) {
                            animator.setInterpolator(timeInterpolator);
                        }
                        animator.addListener(new 3());
                        animator.start();
                    }
                }
            }
        }
        this.G.clear();
        d();
    }

    public abstract void b(es esVar);

    /* Access modifiers changed, original: final */
    public final boolean b(View view) {
        return (this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(view.getId())) || this.e.contains(view);
    }

    public eo c(View view) {
        this.e.add(view);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        if (this.C == 0) {
            ArrayList arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).c();
                }
            }
            this.E = false;
        }
        this.C++;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(es esVar) {
    }

    public eo d(View view) {
        this.e.remove(view);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        this.C--;
        if (this.C == 0) {
            int i;
            View view;
            ArrayList arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.F.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList.get(i2)).a(this);
                }
            }
            for (i = 0; i < this.u.c.a(); i++) {
                view = (View) this.u.c.c(i);
                if (view != null) {
                    kb.a(view, false);
                }
            }
            for (i = 0; i < this.v.c.a(); i++) {
                view = (View) this.v.c.c(i);
                if (view != null) {
                    kb.a(view, false);
                }
            }
            this.E = true;
        }
    }

    /* renamed from: e */
    public eo clone() {
        try {
            eo eoVar = (eo) super.clone();
            eoVar.G = new ArrayList();
            eoVar.u = new et();
            eoVar.v = new et();
            eoVar.x = null;
            eoVar.y = null;
            return eoVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void e(View view) {
        if (!this.E) {
            iv f = eo.f();
            int size = f.size();
            fm a = fc.a(view);
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                a aVar = (a) f.c(size);
                if (aVar.a != null && a.equals(aVar.d)) {
                    do.a.a((Animator) f.b(size));
                }
            }
            ArrayList arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.F.clone();
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    ((c) arrayList.get(size)).a();
                }
            }
            this.D = true;
        }
    }

    public void f(View view) {
        if (this.D) {
            if (!this.E) {
                iv f = eo.f();
                int size = f.size();
                fm a = fc.a(view);
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    a aVar = (a) f.c(size);
                    if (aVar.a != null && a.equals(aVar.d)) {
                        do.a.b((Animator) f.b(size));
                    }
                }
                ArrayList arrayList = this.F;
                if (arrayList != null && arrayList.size() > 0) {
                    arrayList = (ArrayList) this.F.clone();
                    int size2 = arrayList.size();
                    for (size = 0; size < size2; size++) {
                        ((c) arrayList.get(size)).b();
                    }
                }
            }
            this.D = false;
        }
    }

    public String toString() {
        return a("");
    }
}
