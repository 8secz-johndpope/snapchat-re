package defpackage;

/* renamed from: mva */
public abstract class mva {

    /* renamed from: mva$d */
    public static final class d extends mva {
        public final String a;
        private final boolean b;
        private final String c;
        private final String d;

        public d(String str, boolean z, String str2, String str3) {
            akcr.b(str, "url");
            super();
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (akcr.a(this.a, dVar.a)) {
                        if (!((this.b == dVar.b ? 1 : null) != null && akcr.a(this.c, dVar.c) && akcr.a(this.d, dVar.d))) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            int i2 = this.b;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            String str2 = this.c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WebView(url=");
            stringBuilder.append(this.a);
            stringBuilder.append(", shouldAutofill=");
            stringBuilder.append(this.b);
            stringBuilder.append(", ctaText=");
            stringBuilder.append(this.c);
            stringBuilder.append(", localizedCtaText=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mva$c */
    public static final class c extends mva {
        public final String a;
        private final String b;
        private final String c;

        public c(String str, String str2, String str3) {
            akcr.b(str, "videoId");
            super();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.mva.c;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.mva.c) r3;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mva$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LongFormVideo(videoId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", ctaText=");
            stringBuilder.append(this.b);
            stringBuilder.append(", localizedCtaText=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mva$a */
    public static final class a extends mva {
        public final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public a(String str, String str2, String str3, String str4, String str5) {
            akcr.b(str, "packageId");
            super();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x003d;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x003d;
        L_0x0002:
            r0 = r3 instanceof defpackage.mva.a;
            if (r0 == 0) goto L_0x003b;
        L_0x0006:
            r3 = (defpackage.mva.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0026:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0030:
            r0 = r2.e;
            r3 = r3.e;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mva$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.c;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AppInstall(packageId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", title=");
            stringBuilder.append(this.b);
            stringBuilder.append(", iconUrl=");
            stringBuilder.append(this.c);
            stringBuilder.append(", ctaText=");
            stringBuilder.append(this.d);
            stringBuilder.append(", localizedCtaText=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mva$b */
    public static final class b extends mva {
        public final String a;
        public final String b;
        public final String c;
        private final String d;
        private final String e;
        private final String f;

        public b(String str, String str2, String str3, String str4, String str5, String str6) {
            akcr.b(str, "deeplinkUrl");
            akcr.b(str3, "packageId");
            super();
            this.a = str;
            this.d = str2;
            this.b = str3;
            this.e = str4;
            this.f = str5;
            this.c = str6;
        }

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.f;
        }

        /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0047;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0047;
        L_0x0002:
            r0 = r3 instanceof defpackage.mva.b;
            if (r0 == 0) goto L_0x0045;
        L_0x0006:
            r3 = (defpackage.mva.b) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x0012:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x001c:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x0026:
            r0 = r2.e;
            r1 = r3.e;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x0030:
            r0 = r2.f;
            r1 = r3.f;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x003a:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0045;
        L_0x0044:
            goto L_0x0047;
        L_0x0045:
            r3 = 0;
            return r3;
        L_0x0047:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mva$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("DeepLink(deeplinkUrl=");
            stringBuilder.append(this.a);
            stringBuilder.append(", appTitle=");
            stringBuilder.append(this.d);
            stringBuilder.append(", packageId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", ctaText=");
            stringBuilder.append(this.e);
            stringBuilder.append(", localizedCtaText=");
            stringBuilder.append(this.f);
            stringBuilder.append(", webViewFallbackUrl=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private mva() {
    }

    public /* synthetic */ mva(byte b) {
        this();
    }

    public abstract String a();

    public abstract String b();
}
