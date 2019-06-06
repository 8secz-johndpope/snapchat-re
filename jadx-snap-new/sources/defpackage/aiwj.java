package defpackage;

import com.google.common.base.Preconditions;
import defpackage.aivh.a;
import defpackage.aivh.b;
import defpackage.aivh.c;
import defpackage.aivh.d;
import defpackage.aivh.e;
import defpackage.aivh.f;
import java.util.List;
import java.util.Map;

/* renamed from: aiwj */
final class aiwj extends a {
    private final aiwq a;
    private final aizd b;

    /* renamed from: aiwj$a */
    static final class a extends aivh {
        private final b a;
        private aivh b;
        private defpackage.aivh.a c = aivs.a;
        private aiwq d;
        private final aizd e;

        a(b bVar, aiwq aiwq, aizd aizd) {
            this.a = bVar;
            this.b = this.c.a(bVar);
            this.d = aiwq;
            this.e = aizd;
            if (aiwq != null) {
                Preconditions.checkNotNull(aizd, "timeProvider");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
        private static defpackage.aivh.a a(java.util.List<defpackage.aiuw> r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            /*
            r4 = r4.iterator();
        L_0x0004:
            r0 = r4.hasNext();
            r1 = 0;
            if (r0 == 0) goto L_0x001d;
        L_0x000b:
            r0 = r4.next();
            r0 = (defpackage.aiuw) r0;
            r0 = r0.b;
            r2 = defpackage.aixn.b;
            r0 = r0.a(r2);
            if (r0 == 0) goto L_0x0004;
        L_0x001b:
            r4 = 1;
            goto L_0x001e;
        L_0x001d:
            r4 = 0;
        L_0x001e:
            r0 = "getInstance";
            r2 = 0;
            if (r4 == 0) goto L_0x0043;
        L_0x0023:
            r4 = "io.grpc.grpclb.GrpclbLoadBalancerFactory";
            r4 = java.lang.Class.forName(r4);	 Catch:{ RuntimeException -> 0x0041, Exception -> 0x0038 }
            r5 = new java.lang.Class[r1];	 Catch:{ RuntimeException -> 0x0041, Exception -> 0x0038 }
            r4 = r4.getMethod(r0, r5);	 Catch:{ RuntimeException -> 0x0041, Exception -> 0x0038 }
            r5 = new java.lang.Object[r1];	 Catch:{ RuntimeException -> 0x0041, Exception -> 0x0038 }
            r4 = r4.invoke(r2, r5);	 Catch:{ RuntimeException -> 0x0041, Exception -> 0x0038 }
            r4 = (defpackage.aivh.a) r4;	 Catch:{ RuntimeException -> 0x0041, Exception -> 0x0038 }
            return r4;
        L_0x0038:
            r4 = move-exception;
            r5 = new java.lang.RuntimeException;
            r0 = "Can't get GRPCLB, but balancer addresses were present";
            r5.<init>(r0, r4);
            throw r5;
        L_0x0041:
            r4 = move-exception;
            throw r4;
        L_0x0043:
            if (r5 == 0) goto L_0x0053;
        L_0x0045:
            r4 = "loadBalancingPolicy";
            r3 = r5.containsKey(r4);
            if (r3 != 0) goto L_0x004e;
        L_0x004d:
            goto L_0x0053;
        L_0x004e:
            r4 = defpackage.aiyx.d(r5, r4);
            goto L_0x0054;
        L_0x0053:
            r4 = r2;
        L_0x0054:
            if (r4 == 0) goto L_0x0094;
        L_0x0056:
            r5 = java.util.Locale.ROOT;
            r5 = r4.toUpperCase(r5);
            r3 = "ROUND_ROBIN";
            r5 = r5.equals(r3);
            if (r5 == 0) goto L_0x0084;
        L_0x0064:
            r4 = "ajau";
            r4 = java.lang.Class.forName(r4);	 Catch:{ RuntimeException -> 0x0082, Exception -> 0x0079 }
            r5 = new java.lang.Class[r1];	 Catch:{ RuntimeException -> 0x0082, Exception -> 0x0079 }
            r4 = r4.getMethod(r0, r5);	 Catch:{ RuntimeException -> 0x0082, Exception -> 0x0079 }
            r5 = new java.lang.Object[r1];	 Catch:{ RuntimeException -> 0x0082, Exception -> 0x0079 }
            r4 = r4.invoke(r2, r5);	 Catch:{ RuntimeException -> 0x0082, Exception -> 0x0079 }
            r4 = (defpackage.aivh.a) r4;	 Catch:{ RuntimeException -> 0x0082, Exception -> 0x0079 }
            return r4;
        L_0x0079:
            r4 = move-exception;
            r5 = new java.lang.RuntimeException;
            r0 = "Can't get Round Robin LB";
            r5.<init>(r0, r4);
            throw r5;
        L_0x0082:
            r4 = move-exception;
            throw r4;
        L_0x0084:
            r5 = new java.lang.IllegalArgumentException;
            r4 = java.lang.String.valueOf(r4);
            r0 = "Unknown service config policy: ";
            r4 = r0.concat(r4);
            r5.<init>(r4);
            throw r5;
        L_0x0094:
            r4 = defpackage.aivs.a;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwj$a.a(java.util.List, java.util.Map):aivh$a");
        }

        public final void a() {
            this.b.a();
            this.b = null;
        }

        public final void a(e eVar, aiup aiup) {
            this.b.a(eVar, aiup);
        }

        public final void a(aivw aivw) {
            this.b.a(aivw);
        }

        public final void a(List<aiuw> list, aiud aiud) {
            try {
                defpackage.aivh.a a = a.a((List) list, (Map) aiud.a(aixn.a));
                if (!(a == null || a == this.c)) {
                    this.a.a(aiuo.CONNECTING, new b());
                    this.b.a();
                    this.c = a;
                    aivh aivh = this.b;
                    this.b = this.c.a(this.a);
                    aiwq aiwq = this.d;
                    if (aiwq != null) {
                        defpackage.aiva.a.a.a aVar = new defpackage.aiva.a.a.a();
                        StringBuilder stringBuilder = new StringBuilder("Load balancer changed from ");
                        stringBuilder.append(aivh);
                        stringBuilder.append(" to ");
                        stringBuilder.append(this.b);
                        aVar.a = stringBuilder.toString();
                        aVar.b = defpackage.aiva.a.a.b.CT_INFO;
                        aiwq.a(aVar.a(this.e.a()).a());
                    }
                }
                this.b.a((List) list, aiud);
            } catch (RuntimeException e) {
                this.a.a(aiuo.TRANSIENT_FAILURE, new c(aivw.i.a("Failed to pick a load balancer from service config").b(e)));
                this.b.a();
                this.c = null;
                this.b = new d();
            }
        }
    }

    /* renamed from: aiwj$b */
    static final class b extends f {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final c a(d dVar) {
            return c.a;
        }
    }

    /* renamed from: aiwj$c */
    static final class c extends f {
        private final aivw a;

        c(aivw aivw) {
            this.a = aivw;
        }

        public final defpackage.aivh.c a(d dVar) {
            return defpackage.aivh.c.a(this.a);
        }
    }

    /* renamed from: aiwj$d */
    static final class d extends aivh {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final void a() {
        }

        public final void a(e eVar, aiup aiup) {
        }

        public final void a(aivw aivw) {
        }

        public final void a(List<aiuw> list, aiud aiud) {
        }
    }

    aiwj(aiwq aiwq, aizd aizd) {
        this.a = aiwq;
        this.b = aizd;
    }

    public final aivh a(b bVar) {
        return new a(bVar, this.a, this.b);
    }
}
