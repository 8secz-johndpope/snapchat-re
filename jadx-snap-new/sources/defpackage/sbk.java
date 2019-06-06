package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: sbk */
public final class sbk {
    public static <F, T> sat<T> a(sak<F> sak, Throwable th) {
        return sbk.a(sak, sbj.a(th), sas.c, -$$Lambda$sbk$wivotu-QMFejL2Y3W-LOVKOUXpA.INSTANCE);
    }

    public static <F, T> sat<T> a(sak<F> sak, Throwable th, sar sar) {
        return sbk.a(sak, sbj.a(th), sar, -$$Lambda$sbk$qYEJyYWt-84ym7HVklfHUku5VXA.INSTANCE);
    }

    public static <REQ, RSP> sat<RSP> a(sak<REQ> sak, saq<RSP> saq, sar sar, sbs<sao> sbs) {
        return new sbn((sak) Preconditions.checkNotNull(sak), (saq) Preconditions.checkNotNull(saq), (sar) Preconditions.checkNotNull(sar), (sbs) Preconditions.checkNotNull(sbs));
    }

    public static <F, T> sat<T> a(sat<F> sat, saq<T> saq, sar sar) {
        Preconditions.checkNotNull(sat);
        Preconditions.checkNotNull(saq);
        return sbk.a(sat.b(), saq, sar, new -$$Lambda$sbk$vaucn6UlX-_AL_gTpA_X07Ov7vk(sat));
    }
}
