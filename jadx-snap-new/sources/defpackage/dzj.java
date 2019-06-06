package defpackage;

import android.os.Build;
import com.google.common.collect.ImmutableSet;
import defpackage.edg.a;

/* renamed from: dzj */
public final class dzj implements dzo {
    static final ImmutableSet<String> a = ImmutableSet.of("Nexus 4");

    public final void a(dpp dpp, a aVar) {
        if ("Nexus 4".equals(Build.MODEL) && !dpp.o()) {
            aVar.d = Integer.valueOf(dpp.h());
        }
    }
}
