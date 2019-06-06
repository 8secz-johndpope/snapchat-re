package defpackage;

import com.google.common.collect.Sets;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: rwv */
public final class rwv {
    final Map<String, a> a;
    final aipn<ygi> b;
    final aipn<tnj> c;
    final aipn<ftl> d;
    final aipn<gqr> e;
    boolean f = false;
    private final aipn<ihh> g;
    private final aipn<ifs> h;
    private Boolean i = null;

    /* renamed from: rwv$b */
    public enum b implements ygh {
        DEFAULT;
        
        private final String mSubDirectoryName;

        private b() {
            this.mSubDirectoryName = r3;
        }

        public final ide a() {
            return iew.a;
        }

        public final ygj b() {
            return ygj.b;
        }

        public final long c() {
            return 102400;
        }

        public final boolean d() {
            return true;
        }

        public final String e() {
            return this.mSubDirectoryName;
        }

        public final Set<ygk> f() {
            return Sets.newHashSet(c.DEFAULT);
        }

        public final boolean g() {
            return true;
        }

        public final ygo<ygk> h() {
            return null;
        }
    }

    /* renamed from: rwv$c */
    public enum c implements ygk {
        DEFAULT;
        
        private final String mExtension;
        private final boolean mIsMultiFile;

        private c() {
            this.mExtension = r3;
            this.mIsMultiFile = false;
        }

        public final String a() {
            return this.mExtension;
        }
    }

    /* renamed from: rwv$a */
    public static final class a {
        public final long a;
        public final rxm b;
        public final long c;
        public final rxm d;
        public final long e;

        public a(long j, rxm rxm, long j2, rxm rxm2, long j3) {
            this.a = j;
            this.b = rxm;
            this.c = j2;
            this.d = rxm2;
            this.e = j3;
        }
    }

    public rwv(aipn<ygi> aipn, aipn<tnj> aipn2, aipn<ftl> aipn3, aipn<ihh> aipn4, aipn<ifs> aipn5, aipn<gqr> aipn6) {
        this.b = aipn;
        this.c = aipn2;
        this.d = aipn3;
        this.g = aipn4;
        this.h = aipn5;
        this.e = aipn6;
        this.a = new HashMap();
    }

    static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        if (this.i == null) {
            this.i = Boolean.valueOf(((ifs) this.h.get()).l());
        }
        return this.i.booleanValue();
    }

    /* Access modifiers changed, original: final */
    public final boolean a(long j) {
        return ((ihh) this.g.get()).a() - j > 604800000;
    }
}
