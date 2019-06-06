package defpackage;

import java.io.OutputStream;

/* renamed from: gdx */
public interface gdx {

    /* renamed from: gdx$c */
    public interface c {
        String a(String str);
    }

    /* renamed from: gdx$b */
    public interface b {
        OutputStream a();

        gez b();

        void c();
    }

    /* renamed from: gdx$a */
    public static final class a {
        public final gdx a;
        public final String b;
        public final gea c;
        public final ajdx<iha> d;

        public a(gdx gdx, String str, gea gea, ajdx<iha> ajdx) {
            akcr.b(gdx, "cache");
            akcr.b(str, "key");
            akcr.b(gea, "policy");
            akcr.b(ajdx, "serializationHelper");
            this.a = gdx;
            this.b = str;
            this.c = gea;
            this.d = ajdx;
        }

        /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof defpackage.gdx.a;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (defpackage.gdx.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.d;
            r3 = r3.d;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gdx$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            gdx gdx = this.a;
            int i = 0;
            int hashCode = (gdx != null ? gdx.hashCode() : 0) * 31;
            String str = this.b;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            gea gea = this.c;
            hashCode = (hashCode + (gea != null ? gea.hashCode() : 0)) * 31;
            ajdx ajdx = this.d;
            if (ajdx != null) {
                i = ajdx.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry(cache=");
            stringBuilder.append(this.a);
            stringBuilder.append(", key=");
            stringBuilder.append(this.b);
            stringBuilder.append(", policy=");
            stringBuilder.append(this.c);
            stringBuilder.append(", serializationHelper=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    b a(String str, gea gea, int i);

    gez a(String str, gea gea);

    boolean b(String str, gea gea);
}
