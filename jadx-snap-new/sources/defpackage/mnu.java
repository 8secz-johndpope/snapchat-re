package defpackage;

import java.util.Set;

/* renamed from: mnu */
public interface mnu {

    /* renamed from: mnu$b */
    public static final class b implements mnu {
        public static final b a = new b();

        private b() {
        }

        public final void a() {
        }

        public final void a(Set<? extends a> set) {
            akcr.b(set, "filters");
        }

        public final d b() {
            return new d();
        }
    }

    /* renamed from: mnu$a */
    public interface a {
        String a();
    }

    /* renamed from: mnu$c */
    public static final class c {
        public final e a;
        public final min b;
        final String c;

        public c(e eVar, min min, String str) {
            akcr.b(eVar, "scope");
            akcr.b(min, "statistic");
            akcr.b(str, "rawData");
            this.a = eVar;
            this.b = min;
            this.c = str;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.mnu.c;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.mnu.c) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mnu$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            e eVar = this.a;
            int i = 0;
            int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
            min min = this.b;
            hashCode = (hashCode + (min != null ? min.hashCode() : 0)) * 31;
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Profile(scope=");
            stringBuilder.append(this.a);
            stringBuilder.append(", statistic=");
            stringBuilder.append(this.b);
            stringBuilder.append(", rawData=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mnu$d */
    public static final class d {
        public final Iterable<c> a;
        public final String b;
        public final String c;
        public final String d;
        private final Set<a> e;

        public /* synthetic */ d() {
            this(ajyy.a, ajyw.a, "{}", "{}", "{}");
        }

        public d(Set<? extends a> set, Iterable<c> iterable, String str, String str2, String str3) {
            akcr.b(set, "filters");
            akcr.b(iterable, "profiles");
            akcr.b(str, "rawData");
            akcr.b(str2, "topLevelCpuProfile");
            akcr.b(str3, "topLevelGpuProfile");
            this.e = set;
            this.a = iterable;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x003d;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x003d;
        L_0x0002:
            r0 = r3 instanceof defpackage.mnu.d;
            if (r0 == 0) goto L_0x003b;
        L_0x0006:
            r3 = (defpackage.mnu.d) r3;
            r0 = r2.e;
            r1 = r3.e;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0012:
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x001c:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0026:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0030:
            r0 = r2.d;
            r3 = r3.d;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x003b;
        L_0x003a:
            goto L_0x003d;
        L_0x003b:
            r3 = 0;
            return r3;
        L_0x003d:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mnu$d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Set set = this.e;
            int i = 0;
            int hashCode = (set != null ? set.hashCode() : 0) * 31;
            Iterable iterable = this.a;
            hashCode = (hashCode + (iterable != null ? iterable.hashCode() : 0)) * 31;
            String str = this.b;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.c;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Report(filters=");
            stringBuilder.append(this.e);
            stringBuilder.append(", profiles=");
            stringBuilder.append(this.a);
            stringBuilder.append(", rawData=");
            stringBuilder.append(this.b);
            stringBuilder.append(", topLevelCpuProfile=");
            stringBuilder.append(this.c);
            stringBuilder.append(", topLevelGpuProfile=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mnu$e */
    public interface e {
        String a();
    }

    void a();

    void a(Set<? extends a> set);

    d b();
}
