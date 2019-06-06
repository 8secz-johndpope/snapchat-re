package defpackage;

import defpackage.aivn.a;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aivo */
public abstract class aivo extends a {
    public static final a b = new a(e);
    private static final Logger c = Logger.getLogger(aivo.class.getName());
    private static Iterable<Class<?>> d = aivo.b();
    private static final List<aivo> e = aivv.a(aivo.class, d, aivo.class.getClassLoader(), new b());

    /* renamed from: aivo$b */
    static final class b implements aivv.a<aivo> {
        b() {
        }

        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return 5;
        }
    }

    /* renamed from: aivo$a */
    static final class a extends defpackage.aivn.a {
        private final List<aivo> b;

        a(List<aivo> list) {
            this.b = Collections.unmodifiableList(new ArrayList(list));
        }

        private void b() {
            if (this.b.isEmpty()) {
                throw new RuntimeException("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
        }

        public final aivn a(URI uri, aiud aiud) {
            b();
            for (aivo a : this.b) {
                aivn a2 = a.a(uri, aiud);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        }

        public final String a() {
            b();
            return ((aivo) this.b.get(0)).a();
        }
    }

    private static List<Class<?>> b() {
        try {
            return Collections.singletonList(Class.forName("aixe"));
        } catch (ClassNotFoundException e) {
            c.log(Level.FINE, "Unable to find DNS NameResolver", e);
            return Collections.emptyList();
        }
    }
}
