package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: div */
public final class div {
    String a;
    private final SharedPreferences b;
    private final dij c;
    private final aipn<dib> d;
    private final aabe e;
    private long f = -1;
    private final AtomicBoolean g = new AtomicBoolean();
    private aahz h;
    private boolean i;
    private long j;
    private long k;
    private final Runnable l;

    public div(Context context, dij dij, dje dje, aabe aabe, aipn<dib> aipn) {
        this.c = dij;
        this.e = aabe;
        this.d = aipn;
        this.l = new -$$Lambda$div$r_C8GEggDIWKMzEhJPem9We3UCo(this);
        this.j = dje.b().a.longValue();
        this.b = context.getSharedPreferences(String.format("%s.%s", new Object[]{"com.snapchat.android.analytics.framework", context.getPackageName()}), 0);
        this.h = div.a(this.b.getString("com.snapchat.android.analytics.framework.singularSessionDeepLinkSource", null));
        this.i = this.b.getBoolean("com.snapchat.android.analytics.framework.sessionIsBeingClosed", false);
        this.a = this.b.getString("com.snapchat.android.analytics.framework.sessionId", "DEFAULT_SESSION_ID");
        this.k = this.b.getLong("com.snapchat.android.analytics.framework.seqNum", 0);
    }

    private static aahz a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return aahz.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    private void a() {
        if (this.i) {
            String str = "com.snapchat.android.analytics.framework.timeActive";
            long j = this.b.getLong(str, -1);
            aaav aaav = new aaav();
            aaav.a = Long.valueOf(b());
            aaav.b = Long.valueOf(j);
            aahz aahz = this.h;
            if (aahz != null) {
                aaav.c = aahz;
            }
            ((dib) this.d.get()).d(aaav);
            aaax aaax = new aaax();
            aaax.c = Long.valueOf(b());
            ((dib) this.d.get()).d(aaax);
            this.b.edit().remove(str).remove("com.snapchat.android.analytics.framework.endSessionRelativeTs").remove("com.snapchat.android.analytics.framework.singularSessionDeepLinkSource").putBoolean("com.snapchat.android.analytics.framework.sessionIsBeingClosed", false).commit();
            this.i = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    private /* synthetic */ void a(long r17, defpackage.aahz r19, android.content.Context r20, long r21) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r19;
        r4 = r0.g;
        r5 = 0;
        r6 = 1;
        r4 = r4.compareAndSet(r5, r6);
        if (r4 == 0) goto L_0x00f9;
    L_0x0010:
        r0.f = r1;
        r4 = r0.b;
        r7 = "com.snapchat.android.analytics.framework.endSessionRelativeTs";
        r4 = r4.contains(r7);
        r8 = 0;
        r10 = -1;
        r12 = "com.snapchat.android.analytics.framework.appVariant";
        if (r4 != 0) goto L_0x0024;
    L_0x0022:
        r4 = 1;
        goto L_0x0054;
    L_0x0024:
        r4 = r0.b;
        r13 = defpackage.aabe.OG;
        r13 = r13.name();
        r4 = r4.getString(r12, r13);
        r4 = defpackage.aabe.valueOf(r4);
        r13 = r0.e;
        if (r13 == r4) goto L_0x0039;
    L_0x0038:
        goto L_0x0022;
    L_0x0039:
        if (r3 != 0) goto L_0x0022;
    L_0x003b:
        r4 = r0.h;
        if (r4 == 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0022;
    L_0x0040:
        r4 = r0.b;
        r13 = r4.getLong(r7, r10);
        r13 = r1 - r13;
        r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x0022;
    L_0x004c:
        r6 = r0.j;
        r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0022;
    L_0x0053:
        r4 = 0;
    L_0x0054:
        if (r4 == 0) goto L_0x00e1;
    L_0x0056:
        r4 = r0.i;
        if (r4 == 0) goto L_0x005d;
    L_0x005a:
        r16.a();
    L_0x005d:
        r4 = r0.k;
        r6 = 1;
        r4 = r4 + r6;
        r0.k = r4;
        r4 = defpackage.abpu.a();
        r4 = r4.toString();
        r0.a = r4;
        r4 = r0.b;
        r4 = r4.edit();
        r5 = r0.k;
        r7 = "com.snapchat.android.analytics.framework.seqNum";
        r4 = r4.putLong(r7, r5);
        r5 = r0.a;
        r6 = "com.snapchat.android.analytics.framework.sessionId";
        r4 = r4.putString(r6, r5);
        r5 = "com.snapchat.android.analytics.framework.startSessionRelativeTs";
        r1 = r4.putLong(r5, r1);
        r2 = "com.snapchat.android.analytics.framework.timeActive";
        r1 = r1.putLong(r2, r8);
        r2 = r0.e;
        r2 = r2.name();
        r1 = r1.putString(r12, r2);
        if (r3 == 0) goto L_0x00a5;
    L_0x009c:
        r2 = r19.toString();
        r4 = "com.snapchat.android.analytics.framework.singularSessionDeepLinkSource";
        r1.putString(r4, r2);
    L_0x00a5:
        r1.commit();
        r0.h = r3;
        r1 = r0.b;
        r2 = "com.snapchat.android.analytics.framework.endSessionAbsoluteTs";
        r1 = r1.getLong(r2, r10);
        r1 = r21 - r1;
        r1 = defpackage.dih.a(r1);
        r4 = new aaaw;
        r4.<init>();
        r5 = r0.k;
        r5 = java.lang.Long.valueOf(r5);
        r4.a = r5;
        r1 = java.lang.Long.valueOf(r1);
        r4.b = r1;
        r1 = defpackage.div.a(r20);
        r4.c = r1;
        if (r3 == 0) goto L_0x00d5;
    L_0x00d3:
        r4.d = r3;
    L_0x00d5:
        r1 = r0.d;
        r1 = r1.get();
        r1 = (defpackage.dib) r1;
        r1.a(r4);
        return;
    L_0x00e1:
        r1 = r0.b;
        r1 = r1.edit();
        r2 = "com.snapchat.android.analytics.framework.sessionIsBeingClosed";
        r1 = r1.putBoolean(r2, r5);
        r1.commit();
        r0.i = r5;
        r1 = r0.c;
        r2 = r0.l;
        r1.b(r2);
    L_0x00f9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.div.a(long, aahz, android.content.Context, long):void");
    }

    private /* synthetic */ void a(boolean z, long j, long j2) {
        if (this.g.get()) {
            String str = "com.snapchat.android.analytics.framework.timeActive";
            this.b.edit().putLong("com.snapchat.android.analytics.framework.endSessionRelativeTs", j).putLong("com.snapchat.android.analytics.framework.endSessionAbsoluteTs", j2).putLong(str, this.b.getLong(str, 0) + dih.a(j - this.f)).putBoolean("com.snapchat.android.analytics.framework.sessionIsBeingClosed", true).commit();
            this.i = true;
            this.g.set(false);
            this.f = -1;
        }
    }

    private long b() {
        return dih.a(this.b.getLong("com.snapchat.android.analytics.framework.endSessionRelativeTs", -1) - this.b.getLong("com.snapchat.android.analytics.framework.startSessionRelativeTs", -1));
    }

    private /* synthetic */ void c() {
        a();
        ((dib) this.d.get()).c();
    }

    /* Access modifiers changed, original: final */
    public final void a(Context context, aahz aahz) {
        long currentTimeMillis = System.currentTimeMillis();
        this.c.a(new -$$Lambda$div$RW7NYZX4x1YVfSrUzxlKC7SerzY(this, SystemClock.elapsedRealtime(), aahz, context, currentTimeMillis));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0038 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:8:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing block: B:9:0x003f, code skipped:
            return;
     */
    public final void a(boolean r10) {
        /*
        r9 = this;
        r5 = java.lang.System.currentTimeMillis();
        r3 = android.os.SystemClock.elapsedRealtime();
        r7 = r9.c;
        r8 = new -$$Lambda$div$nmev6bmrJibNlH4g-l77TdYFlBM;
        r0 = r8;
        r1 = r9;
        r2 = r10;
        r0.<init>(r1, r2, r3, r5);
        r7.a(r8);
        r0 = r9.c;
        r1 = r9.l;
        r0.b(r1);
        if (r10 == 0) goto L_0x0041;
    L_0x001e:
        r10 = new java.util.concurrent.CountDownLatch;
        r0 = 1;
        r10.<init>(r0);
        r0 = r9.c;
        r1 = new -$$Lambda$div$NciN7uHszox01DrDDMxq0UHkuEM;
        r1.<init>(r9, r10);
        r0.a(r1);
        r0 = 3;
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0038 }
        r10.await(r0, r2);	 Catch:{ InterruptedException -> 0x0038 }
        return;
    L_0x0036:
        r10 = move-exception;
        goto L_0x0040;
    L_0x0038:
        r10 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0036 }
        r10.interrupt();	 Catch:{ all -> 0x0036 }
        return;
    L_0x0040:
        throw r10;
    L_0x0041:
        r10 = r9.c;
        r0 = r9.l;
        r1 = r9.j;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r1 + r3;
        r10.a(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.div.a(boolean):void");
    }
}
