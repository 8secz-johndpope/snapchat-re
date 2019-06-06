package defpackage;

import defpackage.adqk.a;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: adqd */
public final class adqd implements adpx {
    final ConcurrentHashMap<String, adqk> a = new ConcurrentHashMap(16, 0.75f, 2);
    private final ScheduledExecutorService b;
    private final long c;

    /* renamed from: adqd$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|5|6|7|8|10) */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.adqk.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.adqd$1.<clinit>():void");
        }
    }

    public adqd(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.c = 20000;
    }

    private /* synthetic */ void b(aesm aesm) {
        adqk adqk = (adqk) this.a.remove(aesm.p);
        if (adqk != null) {
            qqe qqe;
            psd psd;
            String str;
            int i = 1.a[adqk.b - 1];
            if (i == 1) {
                qqe = adqk.a;
                psd = psd.NO_CONNECTION;
                str = "Message timed out waiting for a connection!";
            } else if (i == 2) {
                qqe = adqk.a;
                psd = psd.WRITE_TIMEOUT;
                str = "Message timed out in the middle of writing across our connection!";
            } else if (i == 3) {
                adqk.a.onWriteCompleted(psd.ACK_TIMEOUT, "Message timed out waiting for an ACK!");
            }
            qqe.onWriteCompleted(psd, str);
        }
    }

    private /* synthetic */ void b(String str, psd psd, String str2) {
        adqk adqk = (adqk) this.a.remove(str);
        if (adqk != null) {
            adqk.a.onWriteCompleted(psd, str2);
        }
    }

    public final void a() {
        for (Entry key : this.a.entrySet()) {
            a((String) key.getKey(), psd.NO_CONNECTION, "Connection closed!");
        }
    }

    public final void a(aesm aesm) {
        if (aesm.a.a(aesm.o) == aesm.a.CONVERSATION_MESSAGE_RESPONSE) {
            this.b.submit(new -$$Lambda$adqd$l8P3Heejs7c-43U1pMt0uYencaE(this, (aeig) aesm));
        }
    }

    public final void a(aesm aesm, qqe qqe) {
        this.a.put(aesm.p, new adqk(qqe, adqs.a(aesm)));
        this.b.schedule(new -$$Lambda$adqd$VgqINErsIXpThrvI7mDccY8ffzk(this, aesm), 20000, TimeUnit.MILLISECONDS);
    }

    public final void a(String str) {
        adqk adqk = (adqk) this.a.get(str);
        if (adqk != null) {
            if (adqk.c) {
                adqk.b = 3;
                return;
            }
            this.a.remove(str);
            this.b.submit(new -$$Lambda$adqd$rDQwt0xKLOm_H2ZiJdYAG1S5Mro(adqk));
        }
    }

    public final void a(String str, psd psd, String str2) {
        this.b.submit(new -$$Lambda$adqd$EDtD-erHjIjD5lCoSdYglKHZXNE(this, str, psd, str2));
    }
}
