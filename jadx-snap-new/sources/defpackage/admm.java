package defpackage;

import java.io.FileDescriptor;
import java.util.List;

/* renamed from: admm */
public interface admm {

    /* renamed from: admm$a */
    public enum a {
        HARDWARE_FIRST,
        SOFTWARE_FIRST
    }

    /* renamed from: admm$b */
    public static final class b extends Exception {
        private final String a;
        private final Throwable b;

        public b(String str, Throwable th) {
            akcr.b(th, "cause");
            super(str, th);
            this.a = str;
            this.b = th;
        }

        public final Throwable getCause() {
            return this.b;
        }

        public final String getMessage() {
            return this.a;
        }
    }

    ajdp<jwu> a(ide ide, idd idd, FileDescriptor fileDescriptor, List<Long> list, abtl abtl, a aVar);
}
