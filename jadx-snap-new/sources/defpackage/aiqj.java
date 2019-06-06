package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import defpackage.aiqh.b;
import defpackage.aisc.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiqj */
public class aiqj {
    private static volatile aiqj e;
    private static aiqr f = new aiqi();
    public final ExecutorService a;
    final aiql<aiqj> b;
    public WeakReference<Activity> c;
    AtomicBoolean d;
    private final Context g;
    private final Map<Class<? extends aiqo>, aiqo> h;
    private final Handler i;
    private final aiql<?> j;
    private final airm k;
    private aiqh l;
    private aiqr m;
    private boolean n = false;

    /* renamed from: aiqj$a */
    public static class a {
        final Context a;
        aiqo[] b;
        aisc c;
        Handler d;
        aiqr e;
        String f;
        aiql<aiqj> g;

        public a(Context context) {
            if (context != null) {
                this.a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    /* renamed from: aiqj$1 */
    class 1 extends b {
        1() {
        }

        public final void a(Activity activity) {
            aiqj.this.a(activity);
        }

        public final void b(Activity activity) {
            aiqj.this.a(activity);
        }

        public final void c(Activity activity) {
            aiqj.this.a(activity);
        }
    }

    private aiqj(Context context, Map<Class<? extends aiqo>, aiqo> map, aisc aisc, Handler handler, aiqr aiqr, aiql aiql, airm airm, Activity activity) {
        this.g = context;
        this.h = map;
        this.a = aisc;
        this.i = handler;
        this.m = aiqr;
        this.b = aiql;
        this.d = new AtomicBoolean(false);
        final int size = map.size();
        this.j = new aiql() {
            private CountDownLatch b = new CountDownLatch(size);

            public final void a() {
                this.b.countDown();
                if (this.b.getCount() == 0) {
                    aiqj.this.d.set(true);
                    aiqj.this.b.a();
                }
            }
        };
        this.k = airm;
        a(activity);
    }

    public static aiqj a(Context context, aiqo... aiqoArr) {
        if (e == null) {
            synchronized (aiqj.class) {
                if (e == null) {
                    a aVar = new a(context);
                    if (aVar.b == null) {
                        Map hashMap;
                        aVar.b = aiqoArr;
                        if (aVar.c == null) {
                            aVar.c = new aisc(aisc.a, aisc.b, TimeUnit.SECONDS, new airu(), new a());
                        }
                        if (aVar.d == null) {
                            aVar.d = new Handler(Looper.getMainLooper());
                        }
                        if (aVar.e == null) {
                            aVar.e = new aiqi();
                        }
                        if (aVar.f == null) {
                            aVar.f = aVar.a.getPackageName();
                        }
                        if (aVar.g == null) {
                            aVar.g = aiql.a;
                        }
                        if (aVar.b == null) {
                            hashMap = new HashMap();
                        } else {
                            Collection asList = Arrays.asList(aVar.b);
                            Map hashMap2 = new HashMap(asList.size());
                            aiqj.a(hashMap2, asList);
                            hashMap = hashMap2;
                        }
                        Context applicationContext = aVar.a.getApplicationContext();
                        airm airm = new airm(applicationContext, aVar.f, hashMap.values());
                        aisc aisc = aVar.c;
                        Handler handler = aVar.d;
                        aiqr aiqr = aVar.e;
                        aiql aiql = aVar.g;
                        Context context2 = aVar.a;
                        aiqj aiqj = new aiqj(applicationContext, hashMap, aisc, handler, aiqr, aiql, airm, context2 instanceof Activity ? (Activity) context2 : null);
                        e = aiqj;
                        aiqj.l = new aiqh(aiqj.g);
                        aiqj.l.a(new 1());
                        aiqj.a(aiqj.g);
                    } else {
                        throw new IllegalStateException("Kits already set.");
                    }
                }
            }
        }
        return e;
    }

    public static <T extends aiqo> T a(Class<T> cls) {
        return (aiqo) aiqj.d().h.get(cls);
    }

    public static aiqr a() {
        return e == null ? f : e.m;
    }

    private void a(Context context) {
        Future submit = this.a.submit(new aiqk(context.getPackageCodePath()));
        Collection values = this.h.values();
        aiqs aiqs = new aiqs(submit, values);
        ArrayList<aiqo> arrayList = new ArrayList(values);
        Collections.sort(arrayList);
        aiqs.a(context, this, aiql.a, this.k);
        for (aiqo a : arrayList) {
            a.a(context, this, this.j, this.k);
        }
        aiqs.i();
        StringBuilder stringBuilder = aiqj.a().a(3) ? new StringBuilder("Initializing io.fabric.sdk.android:fabric [Version: 1.4.3.25], with the following kits:\n") : null;
        for (aiqo aiqo : arrayList) {
            aiqo.e.a((aisd) aiqs.e);
            aiqj.a(this.h, aiqo);
            aiqo.i();
            if (stringBuilder != null) {
                stringBuilder.append(aiqo.b());
                stringBuilder.append(" [Version: ");
                stringBuilder.append(aiqo.a());
                stringBuilder.append("]\n");
            }
        }
        if (stringBuilder != null) {
            aiqj.a().a("Fabric", stringBuilder.toString());
        }
    }

    private static void a(Map<Class<? extends aiqo>, aiqo> map, aiqo aiqo) {
        airv airv = aiqo.i;
        if (airv != null) {
            for (Class cls : airv.a()) {
                if (cls.isInterface()) {
                    for (aiqo aiqo2 : map.values()) {
                        if (cls.isAssignableFrom(aiqo2.getClass())) {
                            aiqo.e.a((aisd) aiqo2.e);
                        }
                    }
                } else if (((aiqo) map.get(cls)) != null) {
                    aiqo.e.a((aisd) ((aiqo) map.get(cls)).e);
                } else {
                    throw new aise("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    private static void a(Map<Class<? extends aiqo>, aiqo> map, Collection<? extends aiqo> collection) {
        for (aiqo aiqo : collection) {
            map.put(aiqo.getClass(), aiqo);
            if (aiqo instanceof aiqp) {
                aiqj.a((Map) map, ((aiqp) aiqo).c());
            }
        }
    }

    public static boolean b() {
        aiqj aiqj = e;
        return false;
    }

    public static boolean c() {
        return e != null && e.d.get();
    }

    private static aiqj d() {
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    public final aiqj a(Activity activity) {
        this.c = new WeakReference(activity);
        return this;
    }
}
