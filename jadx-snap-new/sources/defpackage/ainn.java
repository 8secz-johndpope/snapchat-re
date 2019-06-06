package defpackage;

import java.io.Closeable;

/* renamed from: ainn */
public interface ainn extends Closeable {
    byte[] getBytes(int i);

    Double getDouble(int i);

    Long getLong(int i);

    String getString(int i);

    boolean next();
}
