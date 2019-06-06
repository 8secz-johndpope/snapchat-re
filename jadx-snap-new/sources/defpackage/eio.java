package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: eio */
public final class eio {
    private final dug a;

    public eio(dug dug) {
        akcr.b(dug, "cameraTelemetry");
        this.a = dug;
    }

    public final void a(aesf aesf, Long l, long j, String str, long j2, boolean z, aagz aagz) {
        akcr.b(aagz, "contentLossReason");
        aabx aabx = new aabx();
        aabx.a(aesf == aesf.IMAGE ? aasc.IMAGE : aasc.VIDEO);
        if (l != null) {
            aabx.a(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j - l.longValue())));
        }
        aabx.a(str);
        aabx.b(Long.valueOf(j2));
        aabx.a(Boolean.valueOf(z));
        aabx.a(aagz);
        this.a.a(aabx);
    }
}
