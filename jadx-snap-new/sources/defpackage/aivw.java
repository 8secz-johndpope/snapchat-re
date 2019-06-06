package defpackage;

import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import defpackage.aivl.e;
import defpackage.aivl.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: aivw */
public final class aivw {
    public static final List<aivw> a;
    public static final aivw b = a.OK.b();
    public static final aivw c = a.CANCELLED.b();
    public static final aivw d = a.UNKNOWN.b();
    public static final aivw e = a.DEADLINE_EXCEEDED.b();
    public static final aivw f = a.PERMISSION_DENIED.b();
    public static final aivw g = a.UNAUTHENTICATED.b();
    public static final aivw h = a.RESOURCE_EXHAUSTED.b();
    public static final aivw i = a.INTERNAL.b();
    public static final aivw j = a.UNAVAILABLE.b();
    static final e<aivw> k = e.a("grpc-status", false, new b());
    static final e<String> l = e.a("grpc-message", false, p);
    private static final g<String> p = new c();
    public final a m;
    public final String n;
    final Throwable o;

    /* renamed from: aivw$c */
    static final class c implements g<String> {
        private static final byte[] a = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70};

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        private static boolean a(byte b) {
            return b < (byte) 32 || b >= (byte) 126 || b == (byte) 37;
        }

        private static String b(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i = 0;
            while (i < bArr.length) {
                if (bArr[i] == (byte) 37 && i + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i + 1, 2, Charsets.US_ASCII), 16));
                        i += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i]);
                i++;
            }
            return new String(allocate.array(), 0, allocate.position(), Charsets.UTF_8);
        }
    }

    /* renamed from: aivw$b */
    static final class b implements g<aivw> {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: aivw$a */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        public final int value;
        final byte[] valueAscii;

        private a(int i) {
            this.value = i;
            this.valueAscii = Integer.toString(i).getBytes(Charsets.US_ASCII);
        }

        public final int a() {
            return this.value;
        }

        public final aivw b() {
            return (aivw) aivw.a.get(this.value);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        a[] values = a.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            a aVar = values[i];
            aivw aivw = (aivw) treeMap.put(Integer.valueOf(aVar.value), new aivw(aVar));
            if (aivw == null) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Code value duplication between ");
                stringBuilder.append(aivw.m.name());
                stringBuilder.append(" & ");
                stringBuilder.append(aVar.name());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        a.INVALID_ARGUMENT.b();
        a.NOT_FOUND.b();
        a.ALREADY_EXISTS.b();
        a.FAILED_PRECONDITION.b();
        a.ABORTED.b();
        a.OUT_OF_RANGE.b();
        a.UNIMPLEMENTED.b();
        a.DATA_LOSS.b();
    }

    private aivw(a aVar) {
        this(aVar, null, null);
    }

    private aivw(a aVar, String str, Throwable th) {
        this.m = (a) Preconditions.checkNotNull(aVar, "code");
        this.n = str;
        this.o = th;
    }

    public static aivw a(Throwable th) {
        for (Throwable th2 = (Throwable) Preconditions.checkNotNull(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof aivx) {
                return ((aivx) th2).a;
            }
            if (th2 instanceof aivy) {
                return ((aivy) th2).a;
            }
        }
        return d.b(th);
    }

    static String a(aivw aivw) {
        if (aivw.n == null) {
            return aivw.m.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aivw.m);
        stringBuilder.append(": ");
        stringBuilder.append(aivw.n);
        return stringBuilder.toString();
    }

    public final a a() {
        return this.m;
    }

    public final aivw a(String str) {
        return Objects.equal(this.n, str) ? this : new aivw(this.m, str, this.o);
    }

    public final aivy a(aivl aivl) {
        return new aivy(this, aivl);
    }

    public final aivw b(String str) {
        if (str == null) {
            return this;
        }
        if (this.n == null) {
            return new aivw(this.m, str, this.o);
        }
        a aVar = this.m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.n);
        stringBuilder.append("\n");
        stringBuilder.append(str);
        return new aivw(aVar, stringBuilder.toString(), this.o);
    }

    public final aivw b(Throwable th) {
        return Objects.equal(this.o, th) ? this : new aivw(this.m, this.n, th);
    }

    public final boolean b() {
        return a.OK == this.m;
    }

    public final aivy c() {
        return new aivy(this);
    }

    public final aivx d() {
        return new aivx(this);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        String str = "description";
        ToStringHelper add = MoreObjects.toStringHelper((Object) this).add("code", this.m.name()).add(str, this.n);
        Object obj = this.o;
        if (obj != null) {
            obj = Throwables.getStackTraceAsString(obj);
        }
        return add.add("cause", obj).toString();
    }
}
