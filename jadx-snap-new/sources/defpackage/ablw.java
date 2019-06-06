package defpackage;

import com.google.common.base.Predicate;

/* renamed from: ablw */
public final class ablw {

    /* renamed from: ablw$1 */
    public static class 1 implements Predicate<abll> {
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return ((abll) obj).c == abmc.MAIN_ACTIVITY_ON_POST_RESUME;
        }
    }

    public static long a(ablm ablm) {
        return Math.abs(ablm.a(ablm.a, Long.valueOf(abpf.a(abpp.a((Long) ablm.d.get(abmb.FIRST_PREVIEW_FRAME_RECEIVED)), abpp.a((Long) ablm.d.get(abmb.FIRST_PREVIEW_FRAME_RENDERED)), abpp.a((Long) ablm.d.get(abmb.FIRST_UI_RENDERED))))).longValue());
    }
}
