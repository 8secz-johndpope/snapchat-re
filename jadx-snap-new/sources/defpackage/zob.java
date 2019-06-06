package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.util.ArrayMap;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zob */
public abstract class zob implements Cloneable {
    private static ThreadLocal<ArrayMap<Animator, a>> A = new ThreadLocal();
    private static final int[] a = new int[]{2, 1, 3, 4};
    private static final znz b = new 1();
    private ViewGroup B = null;
    private int C = 0;
    private boolean D = false;
    private boolean E = false;
    private ArrayList<b> F = null;
    private znz G = b;
    private String c = getClass().getName();
    private ArrayList<Integer> d = new ArrayList();
    private ArrayList<View> e = new ArrayList();
    private ArrayList<String> f = null;
    private ArrayList<Class> g = null;
    private ArrayList<Integer> h = null;
    private ArrayList<View> i = null;
    private ArrayList<Class> j = null;
    protected long k = -1;
    protected long l = -1;
    protected TimeInterpolator m = null;
    zoe n = null;
    boolean o = false;
    ArrayList<Animator> p = new ArrayList();
    protected ArrayList<Animator> q = new ArrayList();
    private ArrayList<String> r = null;
    private ArrayList<Integer> s = null;
    private ArrayList<View> t = null;
    private ArrayList<Class> u = null;
    private zoh v = new zoh();
    private zoh w = new zoh();
    private int[] x = a;
    private ArrayList<zog> y;
    private ArrayList<zog> z;

    /* renamed from: zob$1 */
    static class 1 extends znz {
        1() {
        }
    }

    /* renamed from: zob$b */
    public interface b {
        void a();

        void a(zob zob);
    }

    /* renamed from: zob$3 */
    class 3 extends AnimatorListenerAdapter {
        3() {
        }

        public final void onAnimationEnd(Animator animator) {
            zob.this.d();
            animator.removeListener(this);
        }
    }

    /* renamed from: zob$a */
    public static class a {
        public View a;
        String b;
        zog c;
        WindowId d;
        zob e;

        a(View view, String str, zob zob, WindowId windowId, zog zog) {
            this.a = view;
            this.b = str;
            this.c = zog;
            this.d = windowId;
            this.e = zob;
        }
    }

    private void a(ArrayMap<View, zog> arrayMap, ArrayMap<View, zog> arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View view = (View) arrayMap.keyAt(size);
            if (view != null && a(view)) {
                zog zog = (zog) arrayMap2.remove(view);
                if (!(zog == null || zog.a == null || !a(zog.a))) {
                    this.y.add((zog) arrayMap.removeAt(size));
                    this.z.add(zog);
                }
            }
        }
    }

    private void a(ArrayMap<View, zog> arrayMap, ArrayMap<View, zog> arrayMap2, ArrayMap<String, View> arrayMap3, ArrayMap<String, View> arrayMap4) {
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayMap3.valueAt(i);
            if (view != null && a(view)) {
                View view2 = (View) arrayMap4.get(arrayMap3.keyAt(i));
                if (view2 != null && a(view2)) {
                    zog zog = (zog) arrayMap.get(view);
                    zog zog2 = (zog) arrayMap2.get(view2);
                    if (!(zog == null || zog2 == null)) {
                        this.y.add(zog);
                        this.z.add(zog2);
                        arrayMap.remove(view);
                        arrayMap2.remove(view2);
                    }
                }
            }
        }
    }

    private void a(ArrayMap<View, zog> arrayMap, ArrayMap<View, zog> arrayMap2, LongSparseArray<View> longSparseArray, LongSparseArray<View> longSparseArray2) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) longSparseArray.valueAt(i);
            if (view != null && a(view)) {
                View view2 = (View) longSparseArray2.get(longSparseArray.keyAt(i));
                if (view2 != null && a(view2)) {
                    zog zog = (zog) arrayMap.get(view);
                    zog zog2 = (zog) arrayMap2.get(view2);
                    if (!(zog == null || zog2 == null)) {
                        this.y.add(zog);
                        this.z.add(zog2);
                        arrayMap.remove(view);
                        arrayMap2.remove(view2);
                    }
                }
            }
        }
    }

    private void a(ArrayMap<View, zog> arrayMap, ArrayMap<View, zog> arrayMap2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && a(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && a(view2)) {
                    zog zog = (zog) arrayMap.get(view);
                    zog zog2 = (zog) arrayMap2.get(view2);
                    if (!(zog == null || zog2 == null)) {
                        this.y.add(zog);
                        this.z.add(zog2);
                        arrayMap.remove(view);
                        arrayMap2.remove(view2);
                    }
                }
            }
        }
    }

    private static void a(zoh zoh, View view, zog zog) {
        zoh.a.put(view, zog);
        int id = view.getId();
        if (id >= 0) {
            if (zoh.b.indexOfKey(id) >= 0) {
                zoh.b.put(id, null);
            } else {
                zoh.b.put(id, view);
            }
        }
        String s = kb.a.s(view);
        if (s != null) {
            if (zoh.d.containsKey(s)) {
                zoh.d.put(s, null);
            } else {
                zoh.d.put(s, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zoh.c.indexOfKey(itemIdAtPosition) >= 0) {
                    view = (View) zoh.c.get(itemIdAtPosition);
                    if (view != null) {
                        view.setHasTransientState(false);
                        zoh.c.put(itemIdAtPosition, null);
                    }
                    return;
                }
                view.setHasTransientState(true);
                zoh.c.put(itemIdAtPosition, view);
            }
        }
    }

    private void a(zoh zoh, zoh zoh2) {
        ArrayMap arrayMap = new ArrayMap(zoh.a);
        ArrayMap arrayMap2 = new ArrayMap(zoh2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.x;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    a(arrayMap, arrayMap2);
                } else if (i2 == 2) {
                    a(arrayMap, arrayMap2, zoh.d, zoh2.d);
                } else if (i2 == 3) {
                    a(arrayMap, arrayMap2, zoh.b, zoh2.b);
                } else if (i2 == 4) {
                    a(arrayMap, arrayMap2, zoh.c, zoh2.c);
                }
                i++;
            } else {
                b(arrayMap, arrayMap2);
                return;
            }
        }
    }

    /* JADX WARNING: Missing block: B:13:0x002e, code skipped:
            return true;
     */
    private static boolean a(defpackage.zog r3, defpackage.zog r4, java.lang.String r5) {
        /*
        r0 = r3.b;
        r0 = r0.containsKey(r5);
        r1 = r4.b;
        r1 = r1.containsKey(r5);
        r2 = 0;
        if (r0 == r1) goto L_0x0010;
    L_0x000f:
        return r2;
    L_0x0010:
        r3 = r3.b;
        r3 = r3.get(r5);
        r4 = r4.b;
        r4 = r4.get(r5);
        if (r3 != 0) goto L_0x0020;
    L_0x001e:
        if (r4 == 0) goto L_0x002d;
    L_0x0020:
        r5 = 1;
        if (r3 == 0) goto L_0x002e;
    L_0x0023:
        if (r4 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x002e;
    L_0x0026:
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x002d;
    L_0x002c:
        return r5;
    L_0x002d:
        return r2;
    L_0x002e:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zob.a(zog, zog, java.lang.String):boolean");
    }

    private void b(ArrayMap<View, zog> arrayMap, ArrayMap<View, zog> arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            zog zog = (zog) arrayMap.valueAt(i);
            if (a(zog.a)) {
                this.y.add(zog);
                this.z.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            zog zog2 = (zog) arrayMap2.valueAt(i2);
            if (a(zog2.a)) {
                this.z.add(zog2);
                this.y.add(null);
            }
        }
    }

    private void c(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                zog zog = new zog();
                zog.a = view;
                if (z) {
                    a(zog);
                } else {
                    b(zog);
                }
                zog.c.add(this);
                c(zog);
                zob.a(z ? this.v : this.w, view, zog);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    c(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    private static ArrayMap<Animator, a> f() {
        ArrayMap arrayMap = (ArrayMap) A.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        arrayMap = new ArrayMap();
        A.set(arrayMap);
        return arrayMap;
    }

    public Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        return null;
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
        if (this.l != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dur(");
            stringBuilder.append(this.l);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.k != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dly(");
            stringBuilder.append(this.k);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.m != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("interp(");
            stringBuilder.append(this.m);
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

    public zob a(int i) {
        if (i > 0) {
            this.d.add(Integer.valueOf(i));
        }
        return this;
    }

    public zob a(long j) {
        this.l = j;
        return this;
    }

    public zob a(TimeInterpolator timeInterpolator) {
        this.m = timeInterpolator;
        return this;
    }

    public zob a(b bVar) {
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.add(bVar);
        return this;
    }

    public final zog a(View view, boolean z) {
        zob zob = this;
        while (true) {
            zob zob2 = zob.n;
            if (zob2 == null) {
                break;
            }
            zob = zob2;
        }
        return (zog) (z ? zob.v : zob.w).a.get(view);
    }

    /* Access modifiers changed, original: final */
    public final void a(ViewGroup viewGroup) {
        this.y = new ArrayList();
        this.z = new ArrayList();
        a(this.v, this.w);
        ArrayMap f = zob.f();
        int size = f.size();
        WindowId windowId = viewGroup.getWindowId();
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = (Animator) f.keyAt(size);
                if (animator != null) {
                    a aVar = (a) f.get(animator);
                    if (!(aVar == null || aVar.a == null || aVar.d != windowId)) {
                        zog zog = aVar.c;
                        View view = aVar.a;
                        boolean z = true;
                        zog a = a(view, true);
                        zog b = b(view, true);
                        if (a == null && b == null) {
                            b = (zog) this.w.a.get(view);
                        }
                        if ((a == null && b == null) || !aVar.e.a(zog, b)) {
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
                in.a("createAnimators");
                a(viewGroup, this.v, this.w, this.y, this.z);
                in.a();
                in.a("runAnimators");
                b();
                in.a();
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(ViewGroup viewGroup, zoh zoh, zoh zoh2, ArrayList<zog> arrayList, ArrayList<zog> arrayList2) {
        ArrayMap f = zob.f();
        this.q.size();
        SparseLongArray sparseLongArray = new SparseLongArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2;
            zoh zoh3;
            zog zog = (zog) arrayList.get(i);
            zog zog2 = (zog) arrayList2.get(i);
            if (!(zog == null || zog.c.contains(this))) {
                zog = null;
            }
            if (!(zog2 == null || zog2.c.contains(this))) {
                zog2 = null;
            }
            if (!(zog == null && zog2 == null)) {
                Object obj = (zog == null || zog2 == null || a(zog, zog2)) ? 1 : null;
                if (obj != null) {
                    Animator a = a(viewGroup, zog, zog2);
                    if (a != null) {
                        zog zog3;
                        View view;
                        Object obj2;
                        if (zog2 != null) {
                            zog zog4;
                            Animator animator;
                            View view2 = zog2.a;
                            String[] a2 = a();
                            if (view2 != null && a2 != null && a2.length > 0) {
                                int i3;
                                zog4 = new zog();
                                zog4.a = view2;
                                zog3 = (zog) zoh2.a.get(view2);
                                if (zog3 != null) {
                                    i3 = 0;
                                    while (i3 < a2.length) {
                                        animator = a;
                                        i2 = size;
                                        zog zog5 = zog3;
                                        zog4.b.put(a2[i3], zog3.b.get(a2[i3]));
                                        i3++;
                                        a = animator;
                                        size = i2;
                                        zog3 = zog5;
                                    }
                                }
                                animator = a;
                                i2 = size;
                                int size2 = f.size();
                                for (i3 = 0; i3 < size2; i3++) {
                                    a aVar = (a) f.get((Animator) f.keyAt(i3));
                                    if (aVar.c != null && aVar.a == view2 && (((aVar.b == null && this.c == null) || aVar.b.equals(this.c)) && aVar.c.equals(zog4))) {
                                        view = view2;
                                        zog3 = zog4;
                                        obj2 = null;
                                        break;
                                    }
                                }
                            } else {
                                zoh3 = zoh2;
                                animator = a;
                                i2 = size;
                                zog4 = null;
                            }
                            view = view2;
                            zog3 = zog4;
                            obj2 = animator;
                        } else {
                            zoh3 = zoh2;
                            i2 = size;
                            view = zog != null ? zog.a : null;
                            obj2 = a;
                            zog3 = null;
                        }
                        if (obj2 != null) {
                            f.put(obj2, new a(view, this.c, this, viewGroup.getWindowId(), zog3));
                            this.q.add(obj2);
                        }
                        i++;
                        size = i2;
                    }
                    zoh3 = zoh2;
                    i2 = size;
                    i++;
                    size = i2;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            zoh3 = zoh2;
            i2 = size;
            i++;
            size = i2;
        }
        if (sparseLongArray.size() != 0) {
            for (int i4 = 0; i4 < sparseLongArray.size(); i4++) {
                Animator animator2 = (Animator) this.q.get(sparseLongArray.keyAt(i4));
                animator2.setStartDelay((sparseLongArray.valueAt(i4) - Long.MAX_VALUE) + animator2.getStartDelay());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ViewGroup viewGroup, boolean z) {
        a(z);
        if (this.d.size() > 0 || this.e.size() > 0) {
            for (int i = 0; i < this.d.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.d.get(i)).intValue());
                if (findViewById != null) {
                    zog zog = new zog();
                    zog.a = findViewById;
                    if (z) {
                        a(zog);
                    } else {
                        b(zog);
                    }
                    zog.c.add(this);
                    c(zog);
                    zob.a(z ? this.v : this.w, findViewById, zog);
                }
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View view = (View) this.e.get(i2);
                zog zog2 = new zog();
                zog2.a = view;
                if (z) {
                    a(zog2);
                } else {
                    b(zog2);
                }
                zog2.c.add(this);
                c(zog2);
                zob.a(z ? this.v : this.w, view, zog2);
            }
            return;
        }
        c(viewGroup, z);
    }

    public abstract void a(zog zog);

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (z) {
            this.v.a.clear();
            this.v.b.clear();
            this.v.c.clear();
            this.v.d.clear();
            this.y = null;
            return;
        }
        this.w.a.clear();
        this.w.b.clear();
        this.w.c.clear();
        this.w.d.clear();
        this.z = null;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return (this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(view.getId())) || this.e.contains(view);
    }

    public boolean a(zog zog, zog zog2) {
        if (!(zog == null || zog2 == null)) {
            String[] a = a();
            if (a != null) {
                for (String a2 : a) {
                    if (zob.a(zog, zog2, a2)) {
                        return true;
                    }
                }
            } else {
                for (String a3 : zog.b.keySet()) {
                    if (zob.a(zog, zog2, a3)) {
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

    public zob b(int i) {
        if (i > 0) {
            this.d.remove(Integer.valueOf(i));
        }
        return this;
    }

    public zob b(long j) {
        this.k = j;
        return this;
    }

    public zob b(View view) {
        this.e.add(view);
        return this;
    }

    public zob b(b bVar) {
        ArrayList arrayList = this.F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(bVar);
        if (this.F.size() == 0) {
            this.F = null;
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final zog b(View view, boolean z) {
        zob zob = this;
        while (true) {
            zob zob2 = zob.n;
            if (zob2 == null) {
                break;
            }
            zob = zob2;
        }
        ArrayList arrayList = z ? zob.y : zob.z;
        zog zog = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            zog zog2 = (zog) arrayList.get(i2);
            if (zog2 == null) {
                return null;
            }
            if (zog2.a == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            zog = (zog) (z ? zob.z : zob.y).get(i);
        }
        return zog;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        c();
        final ArrayMap f = zob.f();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (f.containsKey(animator)) {
                c();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            f.remove(animator);
                            zob.this.p.remove(animator);
                        }

                        public final void onAnimationStart(Animator animator) {
                            zob.this.p.add(animator);
                        }
                    });
                    if (animator == null) {
                        d();
                    } else {
                        long j = this.l;
                        if (j >= 0) {
                            animator.setDuration(j);
                        }
                        j = this.k;
                        if (j >= 0) {
                            animator.setStartDelay(j + animator.getStartDelay());
                        }
                        TimeInterpolator timeInterpolator = this.m;
                        if (timeInterpolator != null) {
                            animator.setInterpolator(timeInterpolator);
                        }
                        animator.addListener(new 3());
                        animator.start();
                    }
                }
            }
        }
        this.q.clear();
        d();
    }

    /* Access modifiers changed, original: 0000 */
    public void b(ViewGroup viewGroup) {
        ArrayMap f = zob.f();
        int size = f.size();
        if (viewGroup != null) {
            WindowId windowId = viewGroup.getWindowId();
            while (true) {
                size--;
                if (size >= 0) {
                    a aVar = (a) f.valueAt(size);
                    if (!(aVar.a == null || windowId == null || !windowId.equals(aVar.d))) {
                        ((Animator) f.keyAt(size)).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public abstract void b(zog zog);

    /* Access modifiers changed, original: 0000 */
    public void b(boolean z) {
        this.o = z;
    }

    /* Access modifiers changed, original: 0000 */
    public zob c(ViewGroup viewGroup) {
        this.B = viewGroup;
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
                    ((b) arrayList.get(i)).a();
                }
            }
            this.E = false;
        }
        this.C++;
    }

    public void c(View view) {
        if (!this.E) {
            ArrayMap f = zob.f();
            int size = f.size();
            if (view != null) {
                WindowId windowId = view.getWindowId();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    a aVar = (a) f.valueAt(size);
                    if (!(aVar.a == null || windowId == null || !windowId.equals(aVar.d))) {
                        ((Animator) f.keyAt(size)).pause();
                    }
                }
            }
            ArrayList arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.F.clone();
                int size2 = arrayList.size();
                for (size = 0; size < size2; size++) {
                    arrayList.get(size);
                }
            }
            this.D = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c(zog zog) {
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
                    ((b) arrayList.get(i2)).a(this);
                }
            }
            for (i = 0; i < this.v.c.size(); i++) {
                view = (View) this.v.c.valueAt(i);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (i = 0; i < this.w.c.size(); i++) {
                view = (View) this.w.c.valueAt(i);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            this.E = true;
        }
    }

    public void d(View view) {
        if (this.D) {
            if (!this.E) {
                ArrayMap f = zob.f();
                int size = f.size();
                WindowId windowId = view.getWindowId();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    a aVar = (a) f.valueAt(size);
                    if (!(aVar.a == null || windowId == null || !windowId.equals(aVar.d))) {
                        ((Animator) f.keyAt(size)).resume();
                    }
                }
                ArrayList arrayList = this.F;
                if (arrayList != null && arrayList.size() > 0) {
                    arrayList = (ArrayList) this.F.clone();
                    int size2 = arrayList.size();
                    for (size = 0; size < size2; size++) {
                        arrayList.get(size);
                    }
                }
            }
            this.D = false;
        }
    }

    /* renamed from: e */
    public zob clone() {
        try {
            zob zob = (zob) super.clone();
            try {
                zob.q = new ArrayList();
                zob.v = new zoh();
                zob.w = new zoh();
                zob.y = null;
                zob.z = null;
                return zob;
            } catch (CloneNotSupportedException unused) {
                return zob;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public String toString() {
        return a("");
    }
}
