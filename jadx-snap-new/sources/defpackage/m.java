package defpackage;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.util.Log;
import defpackage.f.c;
import defpackage.f.d;
import defpackage.j.a;
import defpackage.j.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: m */
public final class m extends j {
    private e<k, a> a = new e();
    private b b;
    private final WeakReference<l> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<b> g = new ArrayList();

    /* renamed from: m$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] b = new int[b.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Missing block: B:37:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.j.b.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.j.b.INITIALIZED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.j.b.CREATED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = defpackage.j.b.STARTED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = defpackage.j.b.RESUMED;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = defpackage.j.b.DESTROYED;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = defpackage.j.a.values();
            r5 = r5.length;
            r5 = new int[r5];
            a = r5;
            r5 = a;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = defpackage.j.a.ON_CREATE;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x005d }
            r5 = defpackage.j.a.ON_STOP;	 Catch:{ NoSuchFieldError -> 0x005d }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = defpackage.j.a.ON_START;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = defpackage.j.a.ON_PAUSE;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x007b }
            r1 = defpackage.j.a.ON_RESUME;	 Catch:{ NoSuchFieldError -> 0x007b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007b }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x007b }
        L_0x007b:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = defpackage.j.a.ON_DESTROY;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0091 }
            r1 = defpackage.j.a.ON_ANY;	 Catch:{ NoSuchFieldError -> 0x0091 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0091 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0091 }
        L_0x0091:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.m$1.<clinit>():void");
        }
    }

    /* renamed from: m$a */
    static class a {
        b a;
        private GenericLifecycleObserver b;

        a(k kVar, b bVar) {
            this.b = o.a((Object) kVar);
            this.a = bVar;
        }

        /* Access modifiers changed, original: final */
        public final void a(l lVar, defpackage.j.a aVar) {
            b b = m.b(aVar);
            this.a = m.a(this.a, b);
            this.b.a(lVar, aVar);
            this.a = b;
        }
    }

    public m(l lVar) {
        this.c = new WeakReference(lVar);
        this.b = b.INITIALIZED;
    }

    static b a(b bVar, b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void a(l lVar) {
        d a = this.a.a();
        while (a.hasNext() && !this.f) {
            Entry entry = (Entry) a.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo(this.b) < 0 && !this.f && this.a.c(entry.getKey())) {
                c(aVar.a);
                aVar.a(lVar, m.d(aVar.a));
                c();
            }
        }
    }

    static b b(a aVar) {
        switch (aVar) {
            case ON_CREATE:
            case ON_STOP:
                return b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return b.STARTED;
            case ON_RESUME:
                return b.RESUMED;
            case ON_DESTROY:
                return b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value ".concat(String.valueOf(aVar)));
        }
    }

    private void b(l lVar) {
        e eVar = this.a;
        f.b bVar = new f.b(eVar.c, eVar.b);
        eVar.d.put(bVar, Boolean.FALSE);
        while (bVar.hasNext() && !this.f) {
            Entry entry = (Entry) bVar.next();
            a aVar = (a) entry.getValue();
            while (aVar.a.compareTo(this.b) > 0 && !this.f && this.a.c(entry.getKey())) {
                b bVar2 = aVar.a;
                int i = 1.b[bVar2.ordinal()];
                if (i != 1) {
                    a aVar2;
                    if (i == 2) {
                        aVar2 = a.ON_DESTROY;
                    } else if (i == 3) {
                        aVar2 = a.ON_STOP;
                    } else if (i == 4) {
                        aVar2 = a.ON_PAUSE;
                    } else if (i != 5) {
                        throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(bVar2)));
                    } else {
                        throw new IllegalArgumentException();
                    }
                    c(m.b(aVar2));
                    aVar.a(lVar, aVar2);
                    c();
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    private boolean b() {
        if (this.a.e == 0) {
            return true;
        }
        b bVar = ((a) this.a.b.getValue()).a;
        b bVar2 = ((a) this.a.c.getValue()).a;
        return bVar == bVar2 && this.b == bVar2;
    }

    private b c(k kVar) {
        e eVar = this.a;
        b bVar = null;
        Entry entry = eVar.c(kVar) ? ((c) eVar.a.get(kVar)).d : null;
        b bVar2 = entry != null ? ((a) entry.getValue()).a : null;
        if (!this.g.isEmpty()) {
            ArrayList arrayList = this.g;
            bVar = (b) arrayList.get(arrayList.size() - 1);
        }
        return m.a(m.a(this.b, bVar2), bVar);
    }

    private void c() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void c(b bVar) {
        this.g.add(bVar);
    }

    private static a d(b bVar) {
        int i = 1.b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return a.ON_START;
            }
            if (i == 3) {
                return a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(bVar)));
            }
        }
        return a.ON_CREATE;
    }

    private void d() {
        l lVar = (l) this.c.get();
        if (lVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!b()) {
            this.f = false;
            if (this.b.compareTo(((a) this.a.b.getValue()).a) < 0) {
                b(lVar);
            }
            c cVar = this.a.c;
            if (!(this.f || cVar == null || this.b.compareTo(((a) cVar.getValue()).a) <= 0)) {
                a(lVar);
            }
        }
        this.f = false;
    }

    public final b a() {
        return this.b;
    }

    public final void a(a aVar) {
        b(m.b(aVar));
    }

    public final void a(b bVar) {
        b(bVar);
    }

    public final void a(k kVar) {
        a aVar = new a(kVar, this.b == b.DESTROYED ? b.DESTROYED : b.INITIALIZED);
        if (((a) this.a.a(kVar, aVar)) == null) {
            l lVar = (l) this.c.get();
            if (lVar != null) {
                Object obj = (this.d != 0 || this.e) ? 1 : null;
                Enum c = c(kVar);
                this.d++;
                while (aVar.a.compareTo(c) < 0 && this.a.c(kVar)) {
                    c(aVar.a);
                    aVar.a(lVar, m.d(aVar.a));
                    c();
                    c = c(kVar);
                }
                if (obj == null) {
                    d();
                }
                this.d--;
            }
        }
    }

    public final void b(b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            d();
            this.e = false;
        }
    }

    public final void b(k kVar) {
        this.a.b(kVar);
    }
}
