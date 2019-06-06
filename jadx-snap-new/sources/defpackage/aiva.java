package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: aiva */
public final class aiva {
    static final Logger a = Logger.getLogger(aiva.class.getName());
    public static final aiva b = new aiva();
    private static /* synthetic */ boolean h = (aiva.class.desiredAssertionStatus() ^ 1);
    public final ConcurrentNavigableMap<Long, aivb<Object>> c = new ConcurrentSkipListMap();
    public final ConcurrentMap<Long, aivb<Object>> d = new ConcurrentHashMap();
    public final ConcurrentMap<Long, aivb<Object>> e = new ConcurrentHashMap();
    private final ConcurrentNavigableMap<Long, aivb<Object>> f = new ConcurrentSkipListMap();
    private final ConcurrentMap<Long, Object> g = new ConcurrentHashMap();

    /* renamed from: aiva$c */
    public static final class c {
        private d a;
        private b b = null;

        public c(d dVar) {
            this.a = (d) Preconditions.checkNotNull(dVar);
        }
    }

    /* renamed from: aiva$d */
    public static final class d {
        private String a;
        private Certificate b;
        private Certificate c;

        public d(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                aiva.a.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", new Object[]{sSLSession.getPeerHost()}), e);
            }
            this.a = cipherSuite;
            this.b = certificate2;
            this.c = certificate;
        }
    }

    /* renamed from: aiva$a */
    public static final class a {

        /* renamed from: aiva$a$a */
        public static final class a {
            private String a;
            private b b;
            private long c;
            private aivf d;
            private aivf e;

            /* renamed from: aiva$a$a$a */
            public static final class a {
                public String a;
                public b b;
                public aivf c;
                private Long d;

                public final a a(long j) {
                    this.d = Long.valueOf(j);
                    return this;
                }

                public final a a() {
                    Preconditions.checkNotNull(this.a, "description");
                    Preconditions.checkNotNull(this.b, "severity");
                    Preconditions.checkNotNull(this.d, "timestampNanos");
                    Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
                    return new a(this.a, this.b, this.d.longValue(), this.c);
                }
            }

            /* renamed from: aiva$a$a$b */
            public enum b {
                CT_UNKNOWN,
                CT_INFO,
                CT_WARNING,
                CT_ERROR
            }

            /* synthetic */ a(String str, b bVar, long j, aivf aivf) {
                this(str, bVar, j, null, aivf);
            }

            private a(String str, b bVar, long j, aivf aivf, aivf aivf2) {
                this.a = str;
                this.b = (b) Preconditions.checkNotNull(bVar, "severity");
                this.c = j;
                this.d = null;
                this.e = aivf2;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (Objects.equal(this.a, aVar.a) && Objects.equal(this.b, aVar.b) && this.c == aVar.c && Objects.equal(this.d, aVar.d) && Objects.equal(this.e, aVar.e)) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                return Objects.hashCode(this.a, this.b, Long.valueOf(this.c), this.d, this.e);
            }

            public final String toString() {
                return MoreObjects.toStringHelper((Object) this).add("description", this.a).add("severity", this.b).add("timestampNanos", this.c).add("channelRef", this.d).add("subchannelRef", this.e).toString();
            }
        }
    }

    /* renamed from: aiva$b */
    public static final class b {
    }

    public static <T extends aivb<?>> void a(Map<Long, T> map, T t) {
        aivb aivb = (aivb) map.put(Long.valueOf(t.b().a), t);
        if (!h && aivb != null) {
            throw new AssertionError();
        }
    }

    public static <T extends aivb<?>> void b(Map<Long, T> map, T t) {
        aivb aivb = (aivb) map.remove(Long.valueOf(t.b().a));
        if (!h && aivb == null) {
            throw new AssertionError();
        }
    }

    public final void a(aivb<Object> aivb) {
        aiva.a(this.e, aivb);
    }
}
