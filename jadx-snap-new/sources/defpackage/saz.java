package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: saz */
final class saz implements sbd {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final InputStream b;

    public saz(InputStream inputStream) {
        this.b = inputStream;
    }

    public final InputStream a() {
        InputStream inputStream;
        if (this.a.getAndSet(true)) {
            inputStream = this.b;
            if (inputStream == null || !inputStream.markSupported()) {
                throw new IllegalStateException("Stream can't be opened twice");
            }
            this.b.reset();
            return this.b;
        }
        inputStream = this.b;
        if (inputStream == null) {
            inputStream = scc.a();
            akcr.a((Object) inputStream, "InputStreams.empty()");
        }
        return inputStream;
    }

    public final void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
