package defpackage;

/* renamed from: aipc */
final class aipc {
    static final String a = ajfv.class.getName();

    /* renamed from: aipc$a */
    static class a {
        int a;
        final Throwable b;

        private a(Throwable th) {
            this.b = th;
            this.a = 1;
        }

        /* synthetic */ a(Throwable th, byte b) {
            this(th);
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            int i = this.a;
            if (i > 1) {
                aioi aioi = new aioi(i, this.b);
                Throwable th = this.b;
                while (th.getCause() != null) {
                    th = th.getCause();
                    if (th instanceof aiph) {
                        aiph aiph = (aiph) th;
                        aiph.a.getAndSet(aioi.getMessage());
                        return;
                    }
                }
                try {
                    th.initCause(aioi);
                } catch (Throwable unused) {
                }
            }
        }
    }

    static int a(Throwable th) {
        if (th == null) {
            return 7;
        }
        int hashCode = th.getClass().hashCode() + 217;
        if (th.getMessage() != null) {
            hashCode = (hashCode * 31) + th.getMessage().hashCode();
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement hashCode2 : stackTrace) {
                hashCode = (hashCode * 31) + hashCode2.hashCode();
            }
        }
        return hashCode;
    }
}
