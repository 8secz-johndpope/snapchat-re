package defpackage;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import defpackage.aiul.a;
import defpackage.aiul.b;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: aiuu */
public final class aiuu {
    public static final aiuu a = new aiuu().a(new a(), true).a(b.a, false);
    private static Joiner d = Joiner.on(',');
    public final Map<String, a> b;
    public final byte[] c;

    /* renamed from: aiuu$a */
    public static final class a {
        public final aiut a;
        final boolean b;

        a(aiut aiut, boolean z) {
            this.a = (aiut) Preconditions.checkNotNull(aiut, "decompressor");
            this.b = z;
        }
    }

    private aiuu() {
        this.b = new LinkedHashMap(0);
        this.c = new byte[0];
    }

    private aiuu(aiut aiut, boolean z, aiuu aiuu) {
        String a = aiut.a();
        Preconditions.checkArgument(a.contains(ppy.b) ^ 1, "Comma is currently not allowed in message encoding");
        int size = aiuu.b.size();
        if (!aiuu.b.containsKey(aiut.a())) {
            size++;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size);
        for (a aVar : aiuu.b.values()) {
            String a2 = aVar.a.a();
            if (!a2.equals(a)) {
                linkedHashMap.put(a2, new a(aVar.a, aVar.b));
            }
        }
        linkedHashMap.put(a, new a(aiut, z));
        this.b = Collections.unmodifiableMap(linkedHashMap);
        this.c = d.join(a()).getBytes(Charset.forName("US-ASCII"));
    }

    private aiuu a(aiut aiut, boolean z) {
        return new aiuu(aiut, z, this);
    }

    private Set<String> a() {
        HashSet hashSet = new HashSet(this.b.size());
        for (Entry entry : this.b.entrySet()) {
            if (((a) entry.getValue()).b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
