package defpackage;

import defpackage.aivv.a;
import java.util.List;

/* renamed from: aivk */
public abstract class aivk {
    static final aivk a;
    private static Iterable<Class<?>> b = new a();

    /* renamed from: aivk$a */
    static final class a implements Iterable<Class<?>> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
        public final java.util.Iterator<java.lang.Class<?>> iterator() {
            /*
            r2 = this;
            r0 = new java.util.ArrayList;
            r0.<init>();
            r1 = "aizm";
            r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x000e }
            r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x000e }
        L_0x000e:
            r1 = "io.grpc.netty.NettyChannelProvider";
            r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
            r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
        L_0x0017:
            r0 = r0.iterator();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aivk$a.iterator():java.util.Iterator");
        }
    }

    /* renamed from: aivk$1 */
    class 1 implements a<aivk> {
        1() {
        }

        public final /* bridge */ /* synthetic */ int a(Object obj) {
            return ((aivk) obj).a();
        }
    }

    /* renamed from: aivk$b */
    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    static {
        List a = aivv.a(aivk.class, b, aivk.class.getClassLoader(), new 1());
        a = (aivk) (a.isEmpty() ? null : a.get(0));
    }

    public abstract int a();

    public abstract aivj<?> a(String str);
}
