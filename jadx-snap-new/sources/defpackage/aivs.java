package defpackage;

import com.google.common.base.Preconditions;
import defpackage.aivh.a;
import defpackage.aivh.b;
import defpackage.aivh.c;
import defpackage.aivh.d;
import defpackage.aivh.e;
import defpackage.aivh.f;
import java.util.List;

/* renamed from: aivs */
public final class aivs extends a {
    public static final aivs a = new aivs();

    /* renamed from: aivs$a */
    static final class a extends aivh {
        private final b a;
        private e b;

        a(b bVar) {
            this.a = (b) Preconditions.checkNotNull(bVar, "helper");
        }

        public final void a() {
            e eVar = this.b;
            if (eVar != null) {
                eVar.a();
            }
        }

        public final void a(e eVar, aiup aiup) {
            aiuo aiuo = aiup.a;
            if (eVar == this.b && aiuo != aiuo.SHUTDOWN) {
                f bVar;
                f bVar2;
                int i = 1.a[aiuo.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        bVar = new b(c.a);
                    } else if (i == 3) {
                        bVar2 = new b(c.a(eVar));
                    } else if (i == 4) {
                        bVar = new b(c.a(aiup.b));
                    } else {
                        throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(aiuo)));
                    }
                    this.a.a(aiuo, bVar);
                }
                bVar2 = new c(eVar);
                bVar = bVar2;
                this.a.a(aiuo, bVar);
            }
        }

        public final void a(aivw aivw) {
            e eVar = this.b;
            if (eVar != null) {
                eVar.a();
                this.b = null;
            }
            this.a.a(aiuo.TRANSIENT_FAILURE, new b(c.a(aivw)));
        }

        public final void a(List<aiuw> list, aiud aiud) {
            e eVar = this.b;
            if (eVar == null) {
                this.b = this.a.a((List) list, aiud.b);
                this.a.a(aiuo.CONNECTING, new b(c.a(this.b)));
                this.b.b();
                return;
            }
            this.a.a(eVar, (List) list);
        }
    }

    /* renamed from: aivs$b */
    static final class b extends f {
        private final c a;

        b(c cVar) {
            this.a = (c) Preconditions.checkNotNull(cVar, "result");
        }

        public final c a(d dVar) {
            return this.a;
        }
    }

    /* renamed from: aivs$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[aiuo.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.aiuo.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.aiuo.IDLE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.aiuo.CONNECTING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.aiuo.READY;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.aiuo.TRANSIENT_FAILURE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aivs$1.<clinit>():void");
        }
    }

    /* renamed from: aivs$c */
    static final class c extends f {
        private final e a;

        c(e eVar) {
            this.a = (e) Preconditions.checkNotNull(eVar, "subchannel");
        }

        public final defpackage.aivh.c a(d dVar) {
            this.a.b();
            return defpackage.aivh.c.a;
        }
    }

    private aivs() {
    }

    public final aivh a(b bVar) {
        return new a(bVar);
    }
}
