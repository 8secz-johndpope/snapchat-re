package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import defpackage.aiuf.a;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: aiyw */
final class aiyw implements aiui {
    static final Logger a = Logger.getLogger(aiyw.class.getName());
    static final a<aiyt.a> h = a.a("internal-retry-policy");
    static final a<aixq.a> i = a.a("internal-hedging-policy");
    final AtomicReference<Map<String, e>> b = new AtomicReference();
    final AtomicReference<Map<String, e>> c = new AtomicReference();
    final boolean d = false;
    final int e;
    final int f;
    volatile boolean g;

    /* renamed from: aiyw$e */
    static final class e {
        final Long a;
        final Boolean b;
        final Integer c;
        final Integer d;
        final aiyt e;
        final aixq f;

        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc  */
        e(java.util.Map<java.lang.String, java.lang.Object> r7, boolean r8, int r9, int r10) {
            /*
            r6 = this;
            r6.<init>();
            r0 = defpackage.aiyx.d(r7);
            r6.a = r0;
            r0 = "waitForReady";
            r1 = r7.containsKey(r0);
            r2 = 1;
            r3 = 0;
            r4 = 0;
            if (r1 != 0) goto L_0x0016;
        L_0x0014:
            r0 = r4;
            goto L_0x0038;
        L_0x0016:
            r1 = defpackage.aiyx.a;
            if (r1 != 0) goto L_0x0027;
        L_0x001a:
            r1 = r7.containsKey(r0);
            if (r1 == 0) goto L_0x0021;
        L_0x0020:
            goto L_0x0027;
        L_0x0021:
            r7 = new java.lang.AssertionError;
            r7.<init>();
            throw r7;
        L_0x0027:
            r1 = r7.get(r0);
            r5 = "no such key %s";
            r1 = com.google.common.base.Preconditions.checkNotNull(r1, r5, r0);
            r5 = r1 instanceof java.lang.Boolean;
            if (r5 == 0) goto L_0x00c6;
        L_0x0035:
            r0 = r1;
            r0 = (java.lang.Boolean) r0;
        L_0x0038:
            r6.b = r0;
            r0 = "maxResponseMessageBytes";
            r1 = r7.containsKey(r0);
            if (r1 != 0) goto L_0x0044;
        L_0x0042:
            r0 = r4;
            goto L_0x0050;
        L_0x0044:
            r0 = defpackage.aiyx.c(r7, r0);
            r0 = r0.intValue();
            r0 = java.lang.Integer.valueOf(r0);
        L_0x0050:
            r6.c = r0;
            r0 = r6.c;
            if (r0 == 0) goto L_0x0066;
        L_0x0056:
            r0 = r0.intValue();
            if (r0 < 0) goto L_0x005e;
        L_0x005c:
            r0 = 1;
            goto L_0x005f;
        L_0x005e:
            r0 = 0;
        L_0x005f:
            r1 = r6.c;
            r5 = "maxInboundMessageSize %s exceeds bounds";
            com.google.common.base.Preconditions.checkArgument(r0, r5, r1);
        L_0x0066:
            r0 = "maxRequestMessageBytes";
            r1 = r7.containsKey(r0);
            if (r1 != 0) goto L_0x0070;
        L_0x006e:
            r0 = r4;
            goto L_0x007c;
        L_0x0070:
            r0 = defpackage.aiyx.c(r7, r0);
            r0 = r0.intValue();
            r0 = java.lang.Integer.valueOf(r0);
        L_0x007c:
            r6.d = r0;
            r0 = r6.d;
            if (r0 == 0) goto L_0x0091;
        L_0x0082:
            r0 = r0.intValue();
            if (r0 < 0) goto L_0x0089;
        L_0x0088:
            goto L_0x008a;
        L_0x0089:
            r2 = 0;
        L_0x008a:
            r0 = r6.d;
            r1 = "maxOutboundMessageSize %s exceeds bounds";
            com.google.common.base.Preconditions.checkArgument(r2, r1, r0);
        L_0x0091:
            if (r8 == 0) goto L_0x00a0;
        L_0x0093:
            r0 = "retryPolicy";
            r1 = r7.containsKey(r0);
            if (r1 == 0) goto L_0x00a0;
        L_0x009b:
            r0 = defpackage.aiyx.b(r7, r0);
            goto L_0x00a1;
        L_0x00a0:
            r0 = r4;
        L_0x00a1:
            if (r0 != 0) goto L_0x00a6;
        L_0x00a3:
            r9 = defpackage.aiyt.f;
            goto L_0x00aa;
        L_0x00a6:
            r9 = defpackage.aiyw.e.a(r0, r9);
        L_0x00aa:
            r6.e = r9;
            if (r8 == 0) goto L_0x00ba;
        L_0x00ae:
            r8 = "hedgingPolicy";
            r9 = r7.containsKey(r8);
            if (r9 == 0) goto L_0x00ba;
        L_0x00b6:
            r4 = defpackage.aiyx.b(r7, r8);
        L_0x00ba:
            if (r4 != 0) goto L_0x00bf;
        L_0x00bc:
            r7 = defpackage.aixq.a;
            goto L_0x00c3;
        L_0x00bf:
            r7 = defpackage.aiyw.a(r4, r10);
        L_0x00c3:
            r6.f = r7;
            return;
        L_0x00c6:
            r8 = new java.lang.ClassCastException;
            r9 = 3;
            r9 = new java.lang.Object[r9];
            r9[r3] = r1;
            r9[r2] = r0;
            r10 = 2;
            r9[r10] = r7;
            r7 = "value %s for key %s in %s is not Boolean";
            r7 = java.lang.String.format(r7, r9);
            r8.<init>(r7);
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyw$e.<init>(java.util.Map, boolean, int, int):void");
        }

        private static aiyt a(Map<String, Object> map, int i) {
            Map<String, Object> map2 = map;
            String str = "maxAttempts";
            Object obj = null;
            int intValue = ((Integer) Preconditions.checkNotNull(!map.containsKey(str) ? null : Integer.valueOf(aiyx.c(map, str).intValue()), "maxAttempts cannot be empty")).intValue();
            Preconditions.checkArgument(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) Preconditions.checkNotNull(aiyx.a((Map) map), "initialBackoff cannot be empty")).longValue();
            Preconditions.checkArgument(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) Preconditions.checkNotNull(aiyx.b((Map) map), "maxBackoff cannot be empty")).longValue();
            Preconditions.checkArgument(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            str = "backoffMultiplier";
            double doubleValue = ((Double) Preconditions.checkNotNull(!map.containsKey(str) ? null : aiyx.c(map, str), "backoffMultiplier cannot be empty")).doubleValue();
            Preconditions.checkArgument(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            str = "retryableStatusCodes";
            if (map.containsKey(str)) {
                obj = aiyx.b(aiyx.a(map, str));
            }
            Preconditions.checkNotNull(obj, "rawCodes must be present");
            Preconditions.checkArgument(obj.isEmpty() ^ 1, "rawCodes can't be empty");
            EnumSet noneOf = EnumSet.noneOf(aivw.a.class);
            for (String str2 : obj) {
                Verify.verify("OK".equals(str2) ^ 1, "rawCode can not be \"OK\"", new Object[0]);
                noneOf.add(aivw.a.valueOf(str2));
            }
            return new aiyt(min, longValue, longValue2, doubleValue, Collections.unmodifiableSet(noneOf));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Objects.equal(this.a, eVar.a) && Objects.equal(this.b, eVar.b) && Objects.equal(this.c, eVar.c) && Objects.equal(this.d, eVar.d) && Objects.equal(this.e, eVar.e);
        }

        public final int hashCode() {
            return Objects.hashCode(this.a, this.b, this.c, this.d, this.e);
        }

        public final String toString() {
            return MoreObjects.toStringHelper((Object) this).add("timeoutNanos", this.a).add("waitForReady", this.b).add("maxInboundMessageSize", this.c).add("maxOutboundMessageSize", this.d).add("retryPolicy", this.e).toString();
        }
    }

    /* renamed from: aiyw$a */
    final class a implements defpackage.aixq.a {
        private /* synthetic */ aivm a;

        a(aivm aivm) {
            this.a = aivm;
        }
    }

    /* renamed from: aiyw$b */
    final class b implements aiyt.a {
        private /* synthetic */ aivm a;

        b(aivm aivm) {
            this.a = aivm;
        }

        public final aiyt a() {
            return !aiyw.this.g ? aiyt.f : aiyw.this.a(this.a);
        }
    }

    /* renamed from: aiyw$c */
    final class c implements aixq.a {
        private /* synthetic */ aixq a;

        c(aixq aixq) {
            this.a = aixq;
        }
    }

    /* renamed from: aiyw$d */
    final class d implements aiyt.a {
        private /* synthetic */ aiyt a;

        d(aiyt aiyt) {
            this.a = aiyt;
        }

        public final aiyt a() {
            return this.a;
        }
    }

    aiyw(boolean z, int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    static /* synthetic */ aixq a(Map map, int i) {
        String str = "maxAttempts";
        Object obj = null;
        int intValue = ((Integer) Preconditions.checkNotNull(!map.containsKey(str) ? null : Integer.valueOf(aiyx.c(map, str).intValue()), "maxAttempts cannot be empty")).intValue();
        Preconditions.checkArgument(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
        i = Math.min(intValue, i);
        long longValue = ((Long) Preconditions.checkNotNull(aiyx.c(map), "hedgingDelay cannot be empty")).longValue();
        Preconditions.checkArgument(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
        String str2 = "nonFatalStatusCodes";
        if (map.containsKey(str2)) {
            obj = aiyx.b(aiyx.a(map, str2));
        }
        Preconditions.checkNotNull(obj, "rawCodes must be present");
        Preconditions.checkArgument(obj.isEmpty() ^ 1, "rawCodes can't be empty");
        EnumSet noneOf = EnumSet.noneOf(aivw.a.class);
        for (String str22 : obj) {
            Verify.verify("OK".equals(str22) ^ 1, "rawCode can not be \"OK\"", new Object[0]);
            noneOf.add(aivw.a.valueOf(str22));
        }
        return new aixq(i, longValue, Collections.unmodifiableSet(noneOf));
    }

    private e b(aivm<?, ?> aivm) {
        Map map = (Map) this.b.get();
        e eVar = map != null ? (e) map.get(aivm.b) : null;
        if (eVar != null) {
            return eVar;
        }
        Map map2 = (Map) this.c.get();
        return map2 != null ? (e) map2.get(aivm.a(aivm.b)) : eVar;
    }

    public final <ReqT, RespT> aiuh<ReqT, RespT> a(aivm<ReqT, RespT> aivm, aiuf aiuf, aiug aiug) {
        if (this.d) {
            if (this.g) {
                aiyt a = a(aivm);
                e b = b(aivm);
                aixq aixq = b == null ? aixq.a : b.f;
                boolean z = a.equals(aiyt.f) || aixq.equals(aixq.a);
                Verify.verify(z, "Can not apply both retry and hedging policy for the method '%s'", (Object) aivm);
                aiuf = aiuf.a(h, new d(a)).a(i, new c(aixq));
            } else {
                aiuf = aiuf.a(h, new b(aivm)).a(i, new a(aivm));
            }
        }
        e b2 = b(aivm);
        if (b2 == null) {
            return aiug.a(aivm, aiuf);
        }
        Integer num;
        if (b2.a != null) {
            aius a2 = aius.a(b2.a.longValue(), TimeUnit.NANOSECONDS);
            aius aius = aiuf.b;
            if (aius == null || a2.compareTo(aius) < 0) {
                aiuf = aiuf.a(a2);
            }
        }
        if (b2.b != null) {
            if (b2.b.booleanValue()) {
                aiuf = aiuf.a();
            } else {
                aiuf aiuf2 = new aiuf(aiuf);
                aiuf2.h = false;
                aiuf = aiuf2;
            }
        }
        if (b2.c != null) {
            num = aiuf.i;
            aiuf = aiuf.a(num != null ? Math.min(num.intValue(), b2.c.intValue()) : b2.c.intValue());
        }
        if (b2.d != null) {
            num = aiuf.j;
            aiuf = aiuf.b(num != null ? Math.min(num.intValue(), b2.d.intValue()) : b2.d.intValue());
        }
        return aiug.a(aivm, aiuf);
    }

    /* Access modifiers changed, original: final */
    public final aiyt a(aivm<?, ?> aivm) {
        e b = b(aivm);
        return b == null ? aiyt.f : b.e;
    }
}
