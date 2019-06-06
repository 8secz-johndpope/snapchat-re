package defpackage;

import com.snap.core.db.record.UnlockablesModel;
import defpackage.mhs.b;
import java.util.Arrays;

/* renamed from: mnq */
public interface mnq extends mhu<b, a> {

    /* renamed from: mnq$a */
    public static abstract class a {

        /* renamed from: mnq$a$a */
        public static final class a extends a {
            public final b a;

            public a(b bVar) {
                akcr.b(bVar, "id");
                super();
                this.a = bVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mnq.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mnq.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mnq.a.a) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mnq$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                return bVar != null ? bVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Restore(id=");
                stringBuilder.append(this.a);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        }

        /* renamed from: mnq$a$b */
        public static final class b extends a {
            public final defpackage.mhs.b a;
            public final byte[] b;

            public b(defpackage.mhs.b bVar, byte[] bArr) {
                akcr.b(bVar, "id");
                akcr.b(bArr, UnlockablesModel.DATA);
                super();
                this.a = bVar;
                this.b = bArr;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                    return false;
                }
                if (obj != null) {
                    b bVar = (b) obj;
                    return (akcr.a(this.a, bVar.a) ^ 1) == 0 && Arrays.equals(this.b, bVar.b);
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.PersistenceProcessor.Request.Save");
                }
            }

            public final int hashCode() {
                return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Save(id=");
                stringBuilder.append(this.a);
                stringBuilder.append(", data=");
                stringBuilder.append(Arrays.toString(this.b));
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: mnq$b */
    public static final class b {
        final defpackage.mhs.b a;
        final byte[] b;

        public b(defpackage.mhs.b bVar, byte[] bArr) {
            akcr.b(bVar, "id");
            akcr.b(bArr, UnlockablesModel.DATA);
            this.a = bVar;
            this.b = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                b bVar = (b) obj;
                return (akcr.a(this.a, bVar.a) ^ 1) == 0 && Arrays.equals(this.b, bVar.b);
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.PersistenceProcessor.Result");
            }
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Result(id=");
            stringBuilder.append(this.a);
            stringBuilder.append(", data=");
            stringBuilder.append(Arrays.toString(this.b));
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}
