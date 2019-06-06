package defpackage;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* renamed from: aiwh */
public final class aiwh {
    public static final Logger a = Logger.getLogger(aiwh.class.getName());
    public final String b;
    public final AtomicLong c = new AtomicLong();

    /* renamed from: aiwh$a */
    public final class a {
        public static final /* synthetic */ boolean b = (aiwh.class.desiredAssertionStatus() ^ 1);
        public final long a;

        private a(long j) {
            this.a = j;
        }

        public /* synthetic */ a(aiwh aiwh, long j, byte b) {
            this(j);
        }
    }

    public aiwh(String str, long j) {
        Preconditions.checkArgument(j > 0, "value must be positive");
        this.b = str;
        this.c.set(j);
    }
}
