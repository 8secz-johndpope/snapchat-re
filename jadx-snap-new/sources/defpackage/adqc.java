package defpackage;

import com.google.common.base.Joiner;
import com.google.common.base.Stopwatch;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: adqc */
public final class adqc implements qqd {
    private static final Joiner a = Joiner.on(ppy.d).skipNulls();
    private final c b = new c("CONNECTED_LATENCY", (byte) 0);
    private final c c = new c("DISCONNECTED_LATENCY", (byte) 0);
    private final c d = new c("PING_RTT_LATENCY", (byte) 0);
    private final Stopwatch e = Stopwatch.createUnstarted();
    private final Collection<a> f = EvictingQueue.create(20);
    private final b g = new b(qqc.DISCONNECTED, System.currentTimeMillis());

    /* renamed from: adqc$c */
    static class c {
        private final String a;
        private long b;
        private long c;

        private c(String str) {
            this.a = str;
            this.b = 0;
            this.c = 0;
        }

        /* synthetic */ c(String str, byte b) {
            this(str);
        }

        /* Access modifiers changed, original: final */
        public final void a(long j) {
            if (this.c > 0) {
                j = (long) ((((float) this.b) * 0.875f) + (((float) j) * 0.125f));
            }
            this.b = j;
            this.c++;
        }

        public final String toString() {
            return String.format(Locale.US, "{\"name\":\"%s\",\"averageValue\":%d,\"sampleSize\":%d}", new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.c)});
        }
    }

    /* renamed from: adqc$b */
    static class b {
        qqc a;
        long b;

        public b(qqc qqc, long j) {
            this.a = qqc;
            this.b = j;
        }
    }

    /* renamed from: adqc$a */
    static class a {
        private final qqc a;
        private final qqc b;
        private final long c;
        private final long d;

        public a(qqc qqc, qqc qqc2, long j, long j2) {
            this.a = qqc;
            this.b = qqc2;
            this.c = j;
            this.d = j2;
        }

        public final String toString() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            return String.format(Locale.US, "{\"startingState\":\"%s\",\"endingState\":\"%s\",\"startingStateTimestamp\":\"%s\",\"endingStateTimestamp\":\"%s\",\"startingStateLifetimeMillis\":%d}", new Object[]{this.a, this.b, simpleDateFormat.format(new Date(this.c)), simpleDateFormat.format(new Date(this.d)), Long.valueOf(this.d - this.c)});
        }
    }

    /* renamed from: adqc$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[qqc.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.qqc.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.qqc.CONNECTING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.qqc.CONNECTED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.qqc.DISCONNECTED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.adqc$1.<clinit>():void");
        }
    }

    public final void a(long j) {
        this.d.a(j);
    }

    public final void a(qqc qqc) {
        c cVar;
        long currentTimeMillis = System.currentTimeMillis();
        Collection collection = this.f;
        b bVar = this.g;
        collection.add(new a(bVar.a, qqc, bVar.b, currentTimeMillis));
        bVar = this.g;
        bVar.a = qqc;
        bVar.b = currentTimeMillis;
        int i = 1.a[qqc.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cVar = this.b;
            } else if (i == 3) {
                cVar = this.c;
            }
            if (cVar != null && this.e.isRunning()) {
                cVar.a(this.e.elapsed(TimeUnit.MILLISECONDS));
                this.e.reset();
                return;
            }
        }
        this.e.reset().start();
        cVar = null;
        if (cVar != null) {
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(a.join(ImmutableList.of(this.b, this.c, this.d)));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
