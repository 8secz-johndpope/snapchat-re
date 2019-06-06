package defpackage;

import com.google.common.base.Preconditions;
import defpackage.ajca.a;
import defpackage.ajce.b;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ajcg */
public abstract class ajcg {
    private static final Set<a> c = Collections.unmodifiableSet(EnumSet.noneOf(a.class));
    private final Set<a> a = c;
    public final ajci b;

    /* renamed from: ajcg$a */
    public enum a {
        ;

        private a(String str) {
        }
    }

    static {
        Collections.emptyMap();
    }

    protected ajcg(ajci ajci) {
        this.b = (ajci) Preconditions.checkNotNull(ajci, "context");
        Preconditions.checkArgument(true, "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public void a(ajce ajce) {
        Preconditions.checkNotNull(ajce);
        ajce = ajce;
        Object obj = ajce.a() == b.RECEIVED ? ajcf.b.RECV : ajcf.b.SENT;
        long b = ajce.b();
        a aVar = new a();
        ajcf.b bVar = (ajcf.b) Preconditions.checkNotNull(obj, "type");
        if (bVar != null) {
            aVar.a = bVar;
            a(aVar.a(b).b(0).c(0).b(ajce.c()).c(ajce.d()).a());
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Deprecated
    public void a(ajcf ajcf) {
        Preconditions.checkNotNull(ajcf);
        ajcf = ajcf;
        a(ajce.a(ajcf.b() == ajcf.b.RECV ? b.RECEIVED : b.SENT, ajcf.c()).b(ajcf.d()).c(ajcf.e()).a());
    }
}
