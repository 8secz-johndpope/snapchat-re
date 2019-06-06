package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.snap.core.db.record.CognacRVModel;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.mhs.b;
import java.util.Arrays;

/* renamed from: mph */
public interface mph extends mhu<a, b> {

    /* renamed from: mph$a */
    public static final class a {
        public final b a;
        public final String b;
        public final byte[] c;
        final String d;
        public final String e;

        public a(b bVar, String str, byte[] bArr, String str2, String str3) {
            akcr.b(bVar, "id");
            akcr.b(str, MessageMediaRefModel.URI);
            akcr.b(bArr, UnlockablesModel.DATA);
            akcr.b(str2, "method");
            akcr.b(str3, "contentType");
            this.a = bVar;
            this.b = str;
            this.c = bArr;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                a aVar = (a) obj;
                return (akcr.a(this.a, aVar.a) ^ 1) == 0 && (akcr.a(this.b, aVar.b) ^ 1) == 0 && Arrays.equals(this.c, aVar.c) && (akcr.a(this.d, aVar.d) ^ 1) == 0 && (akcr.a(this.e, aVar.e) ^ 1) == 0;
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.UriDataHandler.Request");
            }
        }

        public final int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Arrays.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Request(id=");
            stringBuilder.append(this.a);
            stringBuilder.append(", uri=");
            stringBuilder.append(this.b);
            stringBuilder.append(", data=");
            stringBuilder.append(Arrays.toString(this.c));
            stringBuilder.append(", method=");
            stringBuilder.append(this.d);
            stringBuilder.append(", contentType=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mph$b */
    public static abstract class b {

        /* renamed from: mph$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static c a(a aVar) {
                akcr.b(aVar, "request");
                return new c(aVar.a, aVar.b, "", mpi.a, aVar.e);
            }
        }

        /* renamed from: mph$b$b */
        public static abstract class b extends b {
            private final defpackage.mhs.b a;
            private final String b;
            private final String c;
            private final int d;

            /* renamed from: mph$b$b$a */
            public static final class a extends b {
                private final a a;
                private final String b;
                private final byte[] c;

                public /* synthetic */ a(a aVar, String str) {
                    this(aVar, str, mpi.a);
                }

                private a(a aVar, String str, byte[] bArr) {
                    akcr.b(aVar, "request");
                    akcr.b(str, "description");
                    akcr.b(bArr, UnlockablesModel.DATA);
                    super(aVar, 400, (byte) 0);
                    this.a = aVar;
                    this.b = str;
                    this.c = bArr;
                }

                public final String c() {
                    return this.b;
                }

                public final byte[] e() {
                    return this.c;
                }
            }

            /* renamed from: mph$b$b$b */
            public static final class b extends b {
                private final a a;
                private final String b;
                private final byte[] c;

                public /* synthetic */ b(a aVar, String str) {
                    this(aVar, str, mpi.a);
                }

                private b(a aVar, String str, byte[] bArr) {
                    akcr.b(aVar, "request");
                    akcr.b(str, "description");
                    akcr.b(bArr, UnlockablesModel.DATA);
                    super(aVar, 403, (byte) 0);
                    this.a = aVar;
                    this.b = str;
                    this.c = bArr;
                }

                public final String c() {
                    return this.b;
                }

                public final byte[] e() {
                    return this.c;
                }
            }

            /* renamed from: mph$b$b$c */
            public static final class c extends b {
                private final a a;
                private final String b;
                private final byte[] c;

                public /* synthetic */ c(a aVar, String str) {
                    this(aVar, str, mpi.a);
                }

                private c(a aVar, String str, byte[] bArr) {
                    akcr.b(aVar, "request");
                    akcr.b(str, "description");
                    akcr.b(bArr, UnlockablesModel.DATA);
                    super(aVar, 404, (byte) 0);
                    this.a = aVar;
                    this.b = str;
                    this.c = bArr;
                }

                public final String c() {
                    return this.b;
                }

                public final byte[] e() {
                    return this.c;
                }
            }

            /* renamed from: mph$b$b$d */
            public static final class d extends b {
                private final a a;
                private final int b;
                private final String c;
                private final byte[] d;

                public /* synthetic */ d(a aVar, int i, String str) {
                    this(aVar, i, str, mpi.a);
                }

                private d(a aVar, int i, String str, byte[] bArr) {
                    akcr.b(aVar, "request");
                    akcr.b(str, "description");
                    akcr.b(bArr, UnlockablesModel.DATA);
                    super(aVar, i, (byte) 0);
                    this.a = aVar;
                    this.b = i;
                    this.c = str;
                    this.d = bArr;
                }

                public final String c() {
                    return this.c;
                }

                public final int d() {
                    return this.b;
                }

                public final byte[] e() {
                    return this.d;
                }
            }

            private b(a aVar, int i) {
                super();
                this.d = i;
                this.a = aVar.a;
                this.b = aVar.b;
                this.c = aVar.e;
            }

            public /* synthetic */ b(a aVar, int i, byte b) {
                this(aVar, i);
            }

            public final defpackage.mhs.b a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }

            public int d() {
                return this.d;
            }

            public final String f() {
                return this.c;
            }
        }

        /* renamed from: mph$b$c */
        public static final class c extends b {
            private final int a = Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            private final defpackage.mhs.b b;
            private final String c;
            private final String d;
            private final byte[] e;
            private final String f;

            public c(defpackage.mhs.b bVar, String str, String str2, byte[] bArr, String str3) {
                akcr.b(bVar, CognacRVModel.REQUESTID);
                akcr.b(str, MessageMediaRefModel.URI);
                akcr.b(str2, "description");
                akcr.b(bArr, UnlockablesModel.DATA);
                akcr.b(str3, "contentType");
                super();
                this.b = bVar;
                this.c = str;
                this.d = str2;
                this.e = bArr;
                this.f = str3;
            }

            public final defpackage.mhs.b a() {
                return this.b;
            }

            public final String b() {
                return this.c;
            }

            public final String c() {
                return this.d;
            }

            public final int d() {
                return Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            }

            public final byte[] e() {
                return this.e;
            }

            public final String f() {
                return this.f;
            }
        }

        static {
            a aVar = new a();
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public abstract defpackage.mhs.b a();

        public abstract String b();

        public abstract String c();

        public abstract int d();

        public abstract byte[] e();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                b bVar = (b) obj;
                return (akcr.a(a(), bVar.a()) ^ 1) == 0 && (akcr.a(b(), bVar.b()) ^ 1) == 0 && (akcr.a(c(), bVar.c()) ^ 1) == 0 && d() == bVar.d() && Arrays.equals(e(), bVar.e()) && (akcr.a(f(), bVar.f()) ^ 1) == 0;
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.UriDataHandler.Response");
            }
        }

        public abstract String f();

        public int hashCode() {
            return (((((((((a().hashCode() * 31) + b().hashCode()) * 31) + c().hashCode()) * 31) + d()) * 31) + Arrays.hashCode(e())) * 31) + f().hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Response(requestId=");
            stringBuilder.append(a());
            stringBuilder.append(',');
            stringBuilder.append(" uri=");
            stringBuilder.append(b());
            stringBuilder.append(", description='");
            stringBuilder.append(c());
            stringBuilder.append("', responseCode=");
            stringBuilder.append(d());
            stringBuilder.append(", data=");
            stringBuilder.append(Arrays.toString(e()));
            stringBuilder.append(", contentType='");
            stringBuilder.append(f());
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    boolean a(a aVar);
}
