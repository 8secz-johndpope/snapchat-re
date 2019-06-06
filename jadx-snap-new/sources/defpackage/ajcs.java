package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import defpackage.ajck.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ajcs */
public abstract class ajcs {

    /* renamed from: ajcs$a */
    static final class a extends ajcs {
        private final Set<String> a;

        static {
            ajcq ajcq = new ajcq(Collections.unmodifiableMap(new HashMap((Map) Preconditions.checkNotNull(Collections.emptyMap(), "numbersOfLatencySampledSpans"))), Collections.unmodifiableMap(new HashMap((Map) Preconditions.checkNotNull(Collections.emptyMap(), "numbersOfErrorSampledSpans"))));
        }

        private a() {
            this.a = Sets.newHashSet();
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ajcs$b */
    public static abstract class b {
        b() {
        }

        public abstract Map<Object, Integer> a();

        public abstract Map<a, Integer> b();
    }

    protected ajcs() {
    }
}
