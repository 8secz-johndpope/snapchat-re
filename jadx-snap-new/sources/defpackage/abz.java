package defpackage;

import defpackage.ahn.c;
import defpackage.jf.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: abz */
public final class abz {
    private final ahi<zd, String> a = new ahi(1000);
    private final a<a> b = ahn.a(10, new 1());

    /* renamed from: abz$1 */
    class 1 implements ahn.a<a> {
        1() {
        }

        private static a b() {
            try {
                return new a(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }

        public final /* synthetic */ Object a() {
            return 1.b();
        }
    }

    /* renamed from: abz$a */
    static final class a implements c {
        final MessageDigest a;
        private final aho b = new defpackage.aho.a();

        a(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        public final aho b_() {
            return this.b;
        }
    }

    private String b(zd zdVar) {
        a aVar = (a) ahl.a(this.b.a(), "Argument must not be null");
        try {
            zdVar.a(aVar.a);
            String a = ahm.a(aVar.a.digest());
            return a;
        } finally {
            this.b.a(aVar);
        }
    }

    public final String a(zd zdVar) {
        Object obj;
        synchronized (this.a) {
            obj = (String) this.a.b(zdVar);
        }
        if (obj == null) {
            obj = b(zdVar);
        }
        synchronized (this.a) {
            this.a.b(zdVar, obj);
        }
        return obj;
    }
}
