package defpackage;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

/* renamed from: ibs */
public final class ibs extends ibx {
    private final Map<String, byte[]> c = Maps.newConcurrentMap();

    public ibs(ajwy<ian> ajwy, ajwy<hyk> ajwy2, ajwy<hys> ajwy3) {
        super(ajwy, ajwy2, ajwy3);
    }

    /* Access modifiers changed, original: protected|final */
    public final List<ice> a(String str) {
        return Lists.newArrayList();
    }

    /* Access modifiers changed, original: protected|final */
    public final List<ice> a(List<String> list) {
        return Lists.newArrayList();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, List<ahqd> list, boolean z) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(byte[] bArr, String str, String str2, int i) {
        this.c.put(str, bArr);
    }
}
