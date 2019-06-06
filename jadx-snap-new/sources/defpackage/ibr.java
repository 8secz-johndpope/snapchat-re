package defpackage;

import com.google.common.collect.Maps;
import java.util.Map;

/* renamed from: ibr */
public final class ibr extends ibv {
    private final Map<String, byte[]> c = Maps.newConcurrentMap();

    public ibr(ajwy<ian> ajwy, hyw hyw, ajwy<hyk> ajwy2, ajwy<hys> ajwy3) {
        super(ajwy, hyw, ajwy2, ajwy3);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(byte[] bArr, String str, String str2, int i) {
        this.c.put(str, bArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] a(String str) {
        return (byte[]) this.c.get(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(String str) {
        this.c.remove(str);
    }
}
