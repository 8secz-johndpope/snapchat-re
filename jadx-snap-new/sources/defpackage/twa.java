package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: twa */
public interface twa {

    /* renamed from: twa$a */
    public static final class a {
        public final String a;
        public final Uri b;

        public a(String str, Uri uri) {
            akcr.b(str, "id");
            akcr.b(uri, "iconUrl");
            this.a = str;
            this.b = uri;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.twa.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.twa.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.twa$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Uri uri = this.b;
            if (uri != null) {
                i = uri.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CarouselItem(id=");
            stringBuilder.append(this.a);
            stringBuilder.append(", iconUrl=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: twa$b */
    public static final class b {
        public final List<a> a;
        public final String b;

        public b(List<a> list, String str) {
            akcr.b(list, "items");
            this.a = list;
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.twa.b;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.twa.b) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.twa$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            List list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Result(items=");
            stringBuilder.append(this.a);
            stringBuilder.append(", appliedItemId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: twa$c */
    public static final class c {
        public final String a;

        public c(String str) {
            akcr.b(str, "itemId");
            this.a = str;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.twa.c) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.twa.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.twa.c) r2;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.twa$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            return str != null ? str.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SelectItem(itemId=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajdp<b> a();

    ajfb<c> b();
}
