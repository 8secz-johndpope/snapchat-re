package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: qr */
final class qr {
    private static final String a = pq.a("SystemJobInfoConverter");
    private final ComponentName b;

    /* renamed from: qr$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[pr.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.pr.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.pr.NOT_REQUIRED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.pr.CONNECTED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.pr.UNMETERED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.pr.NOT_ROAMING;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = defpackage.pr.METERED;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qr$1.<clinit>():void");
        }
    }

    qr(Context context) {
        this.b = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:8:0x0023, code skipped:
            if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x002c;
     */
    public final android.app.job.JobInfo a(defpackage.rv r11, int r12) {
        /*
        r10 = this;
        r0 = r11.k;
        r1 = r0.b;
        r2 = defpackage.qr.1.a;
        r3 = r1.ordinal();
        r2 = r2[r3];
        r3 = 26;
        r4 = 4;
        r5 = 3;
        r6 = 2;
        r7 = 24;
        r8 = 1;
        r9 = 0;
        if (r2 == r8) goto L_0x0045;
    L_0x0017:
        if (r2 == r6) goto L_0x0041;
    L_0x0019:
        if (r2 == r5) goto L_0x0043;
    L_0x001b:
        if (r2 == r4) goto L_0x0026;
    L_0x001d:
        r5 = 5;
        if (r2 == r5) goto L_0x0021;
    L_0x0020:
        goto L_0x002c;
    L_0x0021:
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 < r3) goto L_0x002c;
    L_0x0025:
        goto L_0x0046;
    L_0x0026:
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 < r7) goto L_0x002c;
    L_0x002a:
        r4 = 3;
        goto L_0x0046;
    L_0x002c:
        r2 = defpackage.pq.a();
        r4 = a;
        r5 = new java.lang.Object[r8];
        r5[r9] = r1;
        r1 = "API version too low. Cannot convert network type value %s";
        r1 = java.lang.String.format(r1, r5);
        r5 = new java.lang.Throwable[r9];
        r2.a(r4, r1, r5);
    L_0x0041:
        r4 = 1;
        goto L_0x0046;
    L_0x0043:
        r4 = 2;
        goto L_0x0046;
    L_0x0045:
        r4 = 0;
    L_0x0046:
        r1 = new android.os.PersistableBundle;
        r1.<init>();
        r2 = r11.b;
        r5 = "EXTRA_WORK_SPEC_ID";
        r1.putString(r5, r2);
        r2 = r11.a();
        r5 = "EXTRA_IS_PERIODIC";
        r1.putBoolean(r5, r2);
        r2 = new android.app.job.JobInfo$Builder;
        r5 = r10.b;
        r2.<init>(r12, r5);
        r12 = r2.setRequiredNetworkType(r4);
        r2 = r0.c;
        r12 = r12.setRequiresCharging(r2);
        r2 = r0.d;
        r12 = r12.setRequiresDeviceIdle(r2);
        r12 = r12.setExtras(r1);
        r1 = r0.d;
        if (r1 != 0) goto L_0x0086;
    L_0x007a:
        r1 = r11.m;
        r2 = defpackage.pk.LINEAR;
        if (r1 != r2) goto L_0x0081;
    L_0x0080:
        r8 = 0;
    L_0x0081:
        r1 = r11.n;
        r12.setBackoffCriteria(r1, r8);
    L_0x0086:
        r1 = r11.a();
        if (r1 == 0) goto L_0x00ab;
    L_0x008c:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r7) goto L_0x0098;
    L_0x0090:
        r1 = r11.i;
        r4 = r11.j;
        r12.setPeriodic(r1, r4);
        goto L_0x00b0;
    L_0x0098:
        r1 = defpackage.pq.a();
        r2 = a;
        r4 = new java.lang.Throwable[r9];
        r5 = "Flex duration is currently not supported before API 24. Ignoring.";
        r1.a(r2, r5, r4);
        r1 = r11.i;
        r12.setPeriodic(r1);
        goto L_0x00b0;
    L_0x00ab:
        r1 = r11.h;
        r12.setMinimumLatency(r1);
    L_0x00b0:
        r11 = android.os.Build.VERSION.SDK_INT;
        if (r11 < r7) goto L_0x00e5;
    L_0x00b4:
        r11 = r0.a();
        if (r11 == 0) goto L_0x00e5;
    L_0x00ba:
        r11 = r0.i;
        r11 = r11.a;
        r11 = r11.iterator();
    L_0x00c2:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x00db;
    L_0x00c8:
        r1 = r11.next();
        r1 = (defpackage.pn.a) r1;
        r2 = r1.b;
        r4 = new android.app.job.JobInfo$TriggerContentUri;
        r1 = r1.a;
        r4.<init>(r1, r2);
        r12.addTriggerContentUri(r4);
        goto L_0x00c2;
    L_0x00db:
        r1 = r0.g;
        r12.setTriggerContentUpdateDelay(r1);
        r1 = r0.h;
        r12.setTriggerContentMaxDelay(r1);
    L_0x00e5:
        r12.setPersisted(r9);
        r11 = android.os.Build.VERSION.SDK_INT;
        if (r11 < r3) goto L_0x00f6;
    L_0x00ec:
        r11 = r0.e;
        r12.setRequiresBatteryNotLow(r11);
        r11 = r0.f;
        r12.setRequiresStorageNotLow(r11);
    L_0x00f6:
        r11 = r12.build();
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr.a(rv, int):android.app.job.JobInfo");
    }
}
