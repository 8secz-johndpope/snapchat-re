package defpackage;

/* renamed from: dns */
public interface dns {

    /* renamed from: dns$b */
    public enum b {
        LENS_TOOLTIP,
        LENS_CAROUSEL_CAPTURE_TOOLTIP
    }

    /* renamed from: dns$a */
    public enum a {
        ACTIVE,
        DISABLED,
        COMPLETED
    }

    ajdp<Boolean> observeTooltipState(b bVar, a aVar);
}
