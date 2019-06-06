package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.util.regex.Pattern;

/* renamed from: akif */
public final class akif implements Closeable, Flushable {
    private boolean a;

    static {
        akif.class.desiredAssertionStatus();
        Pattern.compile("[a-z0-9_-]{1,120}");
    }

    public final synchronized void close() {
        this.a = true;
    }

    public final synchronized void flush() {
    }
}
