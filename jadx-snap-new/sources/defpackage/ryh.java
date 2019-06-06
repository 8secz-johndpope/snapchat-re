package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ryh */
public enum ryh {
    DISABLED(0, true),
    ENABLE_UNTIL_TURN_OFF(-1, true),
    ENABLE_FOR_3_DAYS(TimeUnit.DAYS.toMillis(3)),
    ENABLE_FOR_7_DAYS(TimeUnit.DAYS.toMillis(7)),
    ENABLE_FOR_10_MINUTES(TimeUnit.MINUTES.toMillis(10));
    
    public static final a Companion = null;
    public final boolean specialValue;
    public final long value;

    /* renamed from: ryh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Companion = new a();
    }

    private ryh(long j, boolean z) {
        this.value = j;
        this.specialValue = z;
    }
}
