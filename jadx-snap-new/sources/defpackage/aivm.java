package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: aivm */
public final class aivm<ReqT, RespT> {
    public final c a;
    public final String b;
    public final b<RespT> c;
    public final boolean d;
    public final boolean e;
    private b<ReqT> f;
    private Object g;
    private boolean h;
    private final AtomicReferenceArray<Object> i;

    /* renamed from: aivm$c */
    public enum c {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN
    }

    /* renamed from: aivm$a */
    public static final class a<ReqT, RespT> {
        public b<ReqT> a;
        public b<RespT> b;
        public c c;
        public String d;
        public boolean e;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final aivm<ReqT, RespT> a() {
            return new aivm(this.c, this.d, this.a, this.b, null, false, false, this.e, (byte) 0);
        }
    }

    /* renamed from: aivm$b */
    public interface b<T> {
        InputStream a(T t);

        T a(InputStream inputStream);
    }

    private aivm(c cVar, String str, b<ReqT> bVar, b<RespT> bVar2, Object obj, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        this.i = new AtomicReferenceArray(1);
        this.a = (c) Preconditions.checkNotNull(cVar, "type");
        this.b = (String) Preconditions.checkNotNull(str, "fullMethodName");
        this.f = (b) Preconditions.checkNotNull(bVar, "requestMarshaller");
        this.c = (b) Preconditions.checkNotNull(bVar2, "responseMarshaller");
        this.g = obj;
        this.h = z;
        this.d = z2;
        this.e = z3;
        if (z2 && cVar != c.UNARY) {
            z4 = false;
        }
        Preconditions.checkArgument(z4, "Only unary methods can be specified safe");
    }

    /* synthetic */ aivm(c cVar, String str, b bVar, b bVar2, Object obj, boolean z, boolean z2, boolean z3, byte b) {
        this(cVar, str, bVar, bVar2, null, false, false, z3);
    }

    public static <ReqT, RespT> a<ReqT, RespT> a() {
        a aVar = new a();
        aVar.a = null;
        aVar.b = null;
        return aVar;
    }

    public static String a(String str) {
        int lastIndexOf = ((String) Preconditions.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        return lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
    }

    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String) Preconditions.checkNotNull(str, "fullServiceName"));
        stringBuilder.append("/");
        stringBuilder.append((String) Preconditions.checkNotNull(str2, "methodName"));
        return stringBuilder.toString();
    }

    public final InputStream a(ReqT reqT) {
        return this.f.a((Object) reqT);
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("fullMethodName", this.b).add("type", this.a).add("idempotent", this.h).add("safe", this.d).add("sampledToLocalTracing", this.e).add("requestMarshaller", this.f).add("responseMarshaller", this.c).add("schemaDescriptor", this.g).omitNullValues().toString();
    }
}
