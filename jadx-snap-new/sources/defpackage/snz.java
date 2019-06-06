package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.google.common.base.Predicate;
import com.snapchat.android.R;
import defpackage.sqk.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: snz */
public class snz extends som {
    public static final Predicate<sqh> q = new 1();
    private final e A;
    private final d B;
    private final ski C;
    private final ski P;
    private final boolean Q;
    private AnimationDrawable R;
    private sqk S;
    private int T;
    private int U;
    private int V;
    private int W;
    private double X;
    private double Y;
    final ImageView r;
    AnimationDrawable s;
    a t;
    boolean u;
    SortedMap<Long, LinkedHashSet<Runnable>> v;
    Set<Runnable> w;
    long x;
    boolean y;
    boolean z;

    /* renamed from: snz$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((sqh) obj).c(sqh.V, null) != null;
        }
    }

    /* renamed from: snz$2 */
    class 2 implements OnClickListener {
        2() {
        }

        private void a(boolean z) {
            szw szw = new szw();
            szw.b(skj.aK, Long.valueOf((long) snz.this.K()));
            szw.b(skj.aM, Boolean.valueOf(snz.this.z));
            szw.b(skj.aL, Boolean.valueOf(z));
            snz.this.C().a("PERSPECTIVE_DID_CHANGE", snz.this.H, szw);
        }

        public final void onClick(View view) {
            snz.this.C().a("DISMISS_TUTORIAL");
            boolean z = false;
            if (!snz.this.y || snz.this.t == null) {
                a(false);
                if (snz.this.s != null) {
                    snz.this.r.setBackground(snz.this.s);
                    snz.this.s.stop();
                    snz.this.s.selectDrawable(0);
                    snz.this.s.start();
                }
                return;
            }
            a a = snz.a(snz.this.t.c, snz.this.a(snz.this.K()));
            if (!(a == null || a.equals(snz.this.t))) {
                z = true;
            }
            if (z) {
                snz.this.a(a, true);
            }
            a(z);
        }
    }

    /* renamed from: snz$e */
    static class e implements OnLayoutChangeListener {
        private final WeakReference<snz> a;

        private e(snz snz) {
            this.a = new WeakReference(snz);
        }

        /* synthetic */ e(snz snz, byte b) {
            this(snz);
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            snz snz = (snz) this.a.get();
            if (snz != null) {
                if (!(i == i5 && i2 == i6 && i3 == i7 && i4 == i8)) {
                    snz.S();
                }
            }
        }
    }

    /* renamed from: snz$d */
    static class d implements Runnable {
        private final WeakReference<snz> a;

        private d(snz snz) {
            this.a = new WeakReference(snz);
        }

        /* synthetic */ d(snz snz, byte b) {
            this(snz);
        }

        public final void run() {
            snz snz = (snz) this.a.get();
            if (snz != null && snz.u && snz.K() >= 0) {
                for (LinkedHashSet it : snz.v.subMap(Long.valueOf(0), Long.valueOf(((long) snz.K()) + 1)).values()) {
                    Iterator it2 = it.iterator();
                    while (it2.hasNext()) {
                        Runnable runnable = (Runnable) it2.next();
                        if (!snz.w.contains(runnable)) {
                            snz.w.add(runnable);
                            runnable.run();
                        }
                    }
                }
                snz.R();
            }
        }
    }

    /* renamed from: snz$3 */
    class 3 implements ski {
        3() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (snz.this.u) {
                snz.this.S();
            }
        }
    }

    /* renamed from: snz$4 */
    class 4 implements ski {
        4() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (snz.this.u) {
                snz.this.Q();
            }
        }
    }

    /* renamed from: snz$5 */
    class 5 implements Comparator<a> {
        5() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            a aVar = (a) obj2;
            int i = ((a) obj).c;
            int i2 = aVar.c;
            return i < i2 ? -1 : i > i2 ? 1 : 0;
        }
    }

    /* renamed from: snz$a */
    static class a implements Runnable {
        private final WeakReference<snz> a;
        private final WeakReference<defpackage.sqk.a> b;

        private a(snz snz, defpackage.sqk.a aVar) {
            this.a = new WeakReference(snz);
            this.b = new WeakReference(aVar);
        }

        /* synthetic */ a(snz snz, defpackage.sqk.a aVar, byte b) {
            this(snz, aVar);
        }

        public final void run() {
            snz snz = (snz) this.a.get();
            defpackage.sqk.a aVar = (defpackage.sqk.a) this.b.get();
            if (!(snz == null || aVar == null || !aVar.equals(snz.t))) {
                int K = snz.K();
                if (((long) K) < snz.x) {
                    snz.a(snz.a(aVar.c, snz.a(K)), true);
                }
            }
        }
    }

    /* renamed from: snz$b */
    static class b implements Runnable {
        private final WeakReference<snz> a;
        private final WeakReference<a> b;

        private b(snz snz, a aVar) {
            this.a = new WeakReference(snz);
            this.b = new WeakReference(aVar);
        }

        /* synthetic */ b(snz snz, a aVar, byte b) {
            this(snz, aVar);
        }

        public final void run() {
            snz snz = (snz) this.a.get();
            a aVar = (a) this.b.get();
            if (snz != null && aVar != null) {
                snz.T();
            }
        }
    }

    /* renamed from: snz$c */
    static class c implements Runnable {
        private final WeakReference<snz> a;
        private final WeakReference<a> b;

        private c(snz snz, a aVar) {
            this.a = new WeakReference(snz);
            this.b = new WeakReference(aVar);
        }

        /* synthetic */ c(snz snz, a aVar, byte b) {
            this(snz, aVar);
        }

        public final void run() {
            snz snz = (snz) this.a.get();
            a aVar = (a) this.b.get();
            if (snz != null && aVar != null) {
                snz.T();
            }
        }
    }

    public snz(Context context) {
        this(context, new ImageView(context));
    }

    private snz(Context context, ImageView imageView) {
        super(context);
        this.S = (sqk) this.I.a(sqh.V);
        boolean z = true;
        this.y = true;
        this.r = imageView;
        this.r.setVisibility(8);
        this.r.setOnClickListener(new 2());
        this.A = new e(this, (byte) 0);
        this.B = new d(this, (byte) 0);
        this.C = new 3();
        this.P = new 4();
        int dimension = (int) context.getResources().getDimension(R.dimen.perspective_change_button_margin);
        int dimension2 = (int) context.getResources().getDimension(R.dimen.perspective_change_button_size);
        LayoutParams layoutParams = new LayoutParams(dimension2, dimension2, 8388693);
        layoutParams.setMarginEnd(dimension);
        layoutParams.bottomMargin = dimension;
        I().addView(this.r, layoutParams);
        if (VERSION.SDK_INT <= 19) {
            z = false;
        }
        this.Q = z;
    }

    private void T() {
        boolean z = true;
        if (a(K()).size() <= 1) {
            z = false;
        }
        if (this.y != z) {
            this.y = z;
        }
    }

    public final void C_() {
        this.u = false;
        ViewGroup I = I();
        I.removeOnLayoutChangeListener(this.A);
        I.removeCallbacks(this.B);
        super.C_();
    }

    /* Access modifiers changed, original: final */
    public final void Q() {
        this.x = 0;
        this.v = new TreeMap();
        this.w = new HashSet();
        this.S = (sqk) this.I.a(sqh.V);
        for (a aVar : this.S.c) {
            long j = aVar.b - 100;
            for (Long longValue : Arrays.asList(new Long[]{Long.valueOf(aVar.a), Long.valueOf(aVar.b - 1000), Long.valueOf(j)})) {
                long longValue2 = longValue.longValue();
                if (!this.v.containsKey(Long.valueOf(longValue2))) {
                    this.v.put(Long.valueOf(longValue2), new LinkedHashSet());
                }
            }
            this.x = Math.max(this.x, j);
            ((LinkedHashSet) this.v.get(Long.valueOf(r4))).add(new c(this, aVar, (byte) 0));
            ((LinkedHashSet) this.v.get(Long.valueOf(r6))).add(new b(this, aVar, (byte) 0));
            ((LinkedHashSet) this.v.get(Long.valueOf(j))).add(new a(this, aVar, (byte) 0));
        }
        List a = a(0);
        if (!a.isEmpty()) {
            a(a.contains(this.t) ? this.t : (a) a.get(0), false);
        }
        this.y = a.isEmpty() ^ 1;
        AnimationDrawable animationDrawable = this.R;
        if (animationDrawable != null) {
            this.r.setBackground(animationDrawable);
            this.R.stop();
            this.R.selectDrawable(0);
        }
    }

    /* Access modifiers changed, original: final */
    public final void R() {
        I().postDelayed(this.B, 50);
    }

    /* Access modifiers changed, original: final */
    public final void S() {
        this.T = I().getWidth();
        this.U = I().getHeight();
        if (this.S.a != 0 && this.S.b != 0 && this.T != 0 && this.U != 0) {
            this.X = (double) (((float) this.T) / (((float) this.V) / ((float) this.S.a)));
            this.Y = (double) (((float) this.U) / (((float) this.W) / ((float) this.S.b)));
            a(this.t, false);
        }
    }

    public final List<a> a(int i) {
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a aVar : this.S.c) {
            long j = aVar.a;
            long j2 = aVar.b;
            long j3 = (long) i;
            if (j <= j3 && j2 > 1000 + j3) {
                arrayList2.add(aVar);
            }
            if (j <= j3 && j2 > j3) {
                arrayList.add(aVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        Collections.sort(arrayList, new 5());
        return arrayList;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2) {
        super.a(i, i2);
        this.V = i;
        this.W = i2;
        S();
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        if (this.F != sjo.STARTED) {
            Q();
        }
        S();
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar, boolean z) {
        this.t = aVar;
        if (aVar != null && ((double) this.V) >= 1.0E-6d && ((double) this.W) >= 1.0E-6d && this.X >= 1.0E-6d && this.Y >= 1.0E-6d && this.S.a != 0) {
            View J = J();
            double max = Math.max(this.X, this.Y);
            ViewGroup.LayoutParams layoutParams = J.getLayoutParams();
            double d = (double) this.V;
            Double.isNaN(d);
            layoutParams.width = (int) Math.ceil(d * max);
            layoutParams = J.getLayoutParams();
            d = (double) this.W;
            Double.isNaN(d);
            layoutParams.height = (int) Math.ceil(d * max);
            int i = aVar.c / this.S.a;
            float f = (float) (max / this.X);
            float abs = Math.abs(((float) this.T) * (1.0f - f)) / 2.0f;
            J.setX((((float) (((aVar.c % this.S.a) * -1) * this.T)) * f) - abs);
            float f2 = (float) (max / this.Y);
            J.setY((((float) ((i * -1) * this.U)) * f2) - (Math.abs(((float) this.U) * (1.0f - f2)) / 2.0f));
            J.requestLayout();
            AnimationDrawable animationDrawable = this.R;
            if (animationDrawable != null && z) {
                this.r.setBackground(animationDrawable);
                this.R.stop();
                this.R.start();
            }
        }
    }

    public final void a(szw szw) {
        super.a(szw);
        boolean z = true;
        this.u = true;
        C().a("VIDEO_PLAYBACK_STARTED", this.C);
        C().a("VIDEO_PLAYBACK_LOOPED", this.P);
        I().addOnLayoutChangeListener(this.A);
        Q();
        R();
        S();
        if (this.I.a(sqh.cq) == null) {
            z = false;
        }
        this.z = z;
    }

    public final void ae_() {
        super.ae_();
        if (this.Q && this.R == null) {
            this.s = (AnimationDrawable) this.r.getContext().getResources().getDrawable(R.drawable.perspective_change_short);
            this.s.setOneShot(true);
            this.r.setBackgroundResource(R.drawable.perspective_change_animation);
            this.R = (AnimationDrawable) this.r.getBackground();
            this.R.setOneShot(true);
            this.r.setVisibility(0);
            return;
        }
        if (!this.Q) {
            this.r.setBackgroundResource(R.drawable.perspective_change_01);
            this.r.setVisibility(0);
        }
    }

    public final void b() {
        ViewGroup I = I();
        I.removeOnLayoutChangeListener(this.A);
        I.removeCallbacks(this.B);
        super.b();
    }

    public final void b(szw szw) {
        this.u = false;
        ViewGroup I = I();
        C().b("VIDEO_PLAYBACK_STARTED", this.C);
        C().b("VIDEO_PLAYBACK_LOOPED", this.P);
        I.removeOnLayoutChangeListener(this.A);
        I.removeCallbacks(this.B);
        super.b(szw);
    }

    public final void c(szw szw) {
        super.c(szw);
        this.u = true;
        I().addOnLayoutChangeListener(this.A);
        S();
        T();
        R();
    }
}
