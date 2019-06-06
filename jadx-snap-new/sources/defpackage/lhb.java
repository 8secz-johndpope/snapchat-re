package defpackage;

import com.google.common.base.Supplier;
import com.google.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* renamed from: lhb */
public final class lhb {
    final long a;
    final aeqv b;

    /* renamed from: lhb$a */
    public interface a {

        /* renamed from: lhb$a$b */
        public static final class b implements a {
            public static final b a = new b();

            private b() {
            }

            public final lhb a(File file) {
                akcr.b(file, "file");
                Closeable fileInputStream = new FileInputStream(file);
                try {
                    lhb lhb = new lhb(file.lastModified(), aeqx.a(adzw.a(akaw.a((FileInputStream) fileInputStream))));
                    akax.a(fileInputStream, null);
                    return lhb;
                } catch (Throwable th) {
                    akax.a(fileInputStream, th);
                }
            }

            public final void a(lhb lhb, File file) {
                akcr.b(lhb, "cache");
                akcr.b(file, "file");
                Closeable fileOutputStream = new FileOutputStream(file);
                try {
                    ((FileOutputStream) fileOutputStream).write(MessageNano.toByteArray(aeqx.a(lhb.b)));
                    akax.a(fileOutputStream, null);
                    file.setLastModified(lhb.a);
                } catch (Throwable th) {
                    akax.a(fileOutputStream, th);
                }
            }
        }

        /* renamed from: lhb$a$a */
        public static final class a implements a {
            private final Supplier<iha> a;

            public a(Supplier<iha> supplier) {
                akcr.b(supplier, "serializationHelperSupplier");
                this.a = supplier;
            }

            /* JADX WARNING: Missing block: B:9:0x002f, code skipped:
            defpackage.akax.a(r0, r5);
     */
            public final defpackage.lhb a(java.io.File r5) {
                /*
                r4 = this;
                r0 = "file";
                defpackage.akcr.b(r5, r0);
                r0 = new java.io.FileInputStream;
                r0.<init>(r5);
                r0 = (java.io.Closeable) r0;
                r5 = 0;
                r1 = r0;
                r1 = (java.io.FileInputStream) r1;	 Catch:{ Throwable -> 0x002d }
                r2 = r4.a;	 Catch:{ Throwable -> 0x002d }
                r2 = r2.get();	 Catch:{ Throwable -> 0x002d }
                r2 = (defpackage.iha) r2;	 Catch:{ Throwable -> 0x002d }
                r1 = (java.io.InputStream) r1;	 Catch:{ Throwable -> 0x002d }
                r3 = defpackage.lhb.class;
                r1 = r2.a(r1, r3);	 Catch:{ Throwable -> 0x002d }
                r2 = "serializationHelperSuppl…dLensesCache::class.java)";
                defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x002d }
                r1 = (defpackage.lhb) r1;	 Catch:{ Throwable -> 0x002d }
                defpackage.akax.a(r0, r5);
                return r1;
            L_0x002b:
                r1 = move-exception;
                goto L_0x002f;
            L_0x002d:
                r5 = move-exception;
                throw r5;	 Catch:{ all -> 0x002b }
            L_0x002f:
                defpackage.akax.a(r0, r5);
                throw r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lhb$a$a.a(java.io.File):lhb");
            }

            public final void a(lhb lhb, File file) {
                akcr.b(lhb, "cache");
                akcr.b(file, "file");
                Closeable fileOutputStream = new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream2 = (FileOutputStream) fileOutputStream;
                    Object a = ((iha) this.a.get()).a((Object) lhb, (Type) lhb.class);
                    akcr.a(a, "json");
                    Charset charset = akfp.a;
                    if (a != null) {
                        a = a.getBytes(charset);
                        akcr.a(a, "(this as java.lang.String).getBytes(charset)");
                        fileOutputStream2.write(a);
                        akax.a(fileOutputStream, null);
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type java.lang.String");
                } catch (Throwable th) {
                    akax.a(fileOutputStream, th);
                }
            }
        }

        lhb a(File file);

        void a(lhb lhb, File file);
    }

    public /* synthetic */ lhb() {
        this(-1, null);
    }

    public lhb(long j, aeqv aeqv) {
        this.a = j;
        this.b = aeqv;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lhb) {
                lhb lhb = (lhb) obj;
                if ((this.a == lhb.a ? 1 : null) == null || !akcr.a(this.b, lhb.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        aeqv aeqv = this.b;
        return i + (aeqv != null ? aeqv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScheduledLensesCache(lastScheduleCheck=");
        stringBuilder.append(this.a);
        stringBuilder.append(", response=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
