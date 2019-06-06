package defpackage;

import com.looksery.sdk.ProfilingSessionReceiver;

/* renamed from: ajxh */
public class ajxh {
    public static final <T> ajxe<T> a(ajxj ajxj, akbk<? extends T> akbk) {
        ajxx ajxq;
        akcr.b(ajxj, ProfilingSessionReceiver.EXTRA_STRING_FIELD_MODE);
        akcr.b(akbk, "initializer");
        int i = ajxg.a[ajxj.ordinal()];
        if (i == 1) {
            ajxq = new ajxq(akbk, (byte) 0);
        } else if (i == 2) {
            ajxq = new ajxp(akbk);
        } else if (i == 3) {
            ajxq = new ajxx(akbk);
        } else {
            throw new ajxk();
        }
        return ajxq;
    }

    public static final <T> ajxe<T> a(akbk<? extends T> akbk) {
        akcr.b(akbk, "initializer");
        return new ajxq(akbk, (byte) 0);
    }
}
