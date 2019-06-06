package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: zpb */
public class zpb extends zoe {
    private static final a a = (VERSION.SDK_INT > 21 ? new b() : new c());
    private final LinkedHashMap<zob, ArrayList<ValueAnimator>> b = new LinkedHashMap();

    /* renamed from: zpb$b */
    static class b implements a {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void a(ValueAnimator valueAnimator, float f) {
            valueAnimator.setCurrentFraction(f);
        }
    }

    /* renamed from: zpb$a */
    interface a {
        void a(ValueAnimator valueAnimator, float f);
    }

    /* renamed from: zpb$c */
    static class c implements a {
        private Method a;

        public c() {
            try {
                this.a = ValueAnimator.class.getDeclaredMethod("animateValue", new Class[]{Float.TYPE});
                this.a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
        }

        public final void a(ValueAnimator valueAnimator, float f) {
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(valueAnimator, new Object[]{Float.valueOf(f)});
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public final void a(float f) {
        ArrayList arrayList = new ArrayList();
        for (ArrayList addAll : this.b.values()) {
            arrayList.addAll(addAll);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            if (valueAnimator.isStarted()) {
                a.a(valueAnimator, f);
            }
        }
    }

    public final void b() {
        this.b.clear();
        int size = this.r.size();
        int i = 0;
        while (i < size) {
            zob zob = (i < 0 || i >= this.r.size()) ? null : (zob) this.r.get(i);
            ArrayList arrayList = new ArrayList();
            Iterator it = zob.q.iterator();
            while (it.hasNext()) {
                arrayList.addAll(zoj.a((Animator) it.next()));
            }
            long j = this.l;
            long j2 = this.k;
            TimeInterpolator timeInterpolator = this.m;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it2.next();
                if (j >= 0) {
                    valueAnimator.setDuration(j);
                }
                if (j2 >= 0) {
                    valueAnimator.setStartDelay(valueAnimator.getStartDelay() + j2);
                }
                if (timeInterpolator != null) {
                    valueAnimator.setInterpolator(timeInterpolator);
                }
            }
            this.b.put(zob, arrayList);
            i++;
        }
        super.b();
        for (ArrayList it3 : this.b.values()) {
            Iterator it4 = it3.iterator();
            while (it4.hasNext()) {
                ((ValueAnimator) it4.next()).pause();
            }
        }
    }
}
