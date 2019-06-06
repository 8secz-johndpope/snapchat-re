package defpackage;

/* renamed from: sdl */
public interface sdl {
    public static final sdl a = -$$Lambda$sdl$aRsE5oQi_CMi3zOk9eMpcZJsItU.INSTANCE;

    /* renamed from: sdl$b */
    public enum b implements sdl {
        SKIP_ALL(a.SKIP),
        DISPLAY_ALL(a.DISPLAY);
        
        private final a fixedDecision;

        private b(a aVar) {
            this.fixedDecision = aVar;
        }

        public final a evaluateNotification(sdr sdr) {
            return this.fixedDecision;
        }
    }

    /* renamed from: sdl$a */
    public enum a {
        DISPLAY,
        SKIP,
        DROP
    }

    /* renamed from: sdl$-CC */
    public final /* synthetic */ class -CC {
    }

    a evaluateNotification(sdr sdr);
}
