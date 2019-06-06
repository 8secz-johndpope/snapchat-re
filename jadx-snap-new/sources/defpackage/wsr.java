package defpackage;

/* renamed from: wsr */
public interface wsr {

    /* renamed from: wsr$a */
    public static final class a implements wsr {
        private final String A;
        private final String B;
        private final String a;
        private final String b;
        private final aily c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final Boolean h;
        private final String i;
        private final Boolean j;
        private final Boolean k;
        private final Long l;
        private final String m;
        private final String n;
        private final Long o;
        private final String p;
        private final String q;
        private final Boolean r;
        private final String s;
        private final String t;
        private final String u;
        private final Boolean v;
        private final Boolean w;
        private final String x;
        private final Boolean y;
        private final String z;

        public a(String str, String str2, aily aily, String str3, String str4, String str5, String str6, Boolean bool, String str7, Boolean bool2, Boolean bool3, Long l, String str8, String str9, Long l2, String str10, String str11, Boolean bool4, String str12, String str13, String str14, Boolean bool5, Boolean bool6, String str15, Boolean bool7, String str16, String str17, String str18) {
            String str19 = str;
            String str20 = str2;
            aily aily2 = aily;
            akcr.b(str, "shakeId");
            akcr.b(str2, "reportType");
            akcr.b(aily, "reportSource");
            this.a = str19;
            this.b = str20;
            this.c = aily2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = bool;
            this.i = str7;
            this.j = bool2;
            this.k = bool3;
            this.l = l;
            this.m = str8;
            this.n = str9;
            this.o = l2;
            this.p = str10;
            this.q = str11;
            this.r = bool4;
            this.s = str12;
            this.t = str13;
            this.u = str14;
            this.v = bool5;
            this.w = bool6;
            this.x = str15;
            this.y = bool7;
            this.z = str16;
            this.A = str17;
            this.B = str18;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final aily c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        /* JADX WARNING: Missing block: B:58:0x011e, code skipped:
            if (defpackage.akcr.a(r2.B, r3.B) != false) goto L_0x0123;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0123;
        L_0x0002:
            r0 = r3 instanceof defpackage.wsr.a;
            if (r0 == 0) goto L_0x0121;
        L_0x0006:
            r3 = (defpackage.wsr.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0026:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0030:
            r0 = r2.e;
            r1 = r3.e;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x003a:
            r0 = r2.f;
            r1 = r3.f;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0044:
            r0 = r2.g;
            r1 = r3.g;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x004e:
            r0 = r2.h;
            r1 = r3.h;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0058:
            r0 = r2.i;
            r1 = r3.i;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0062:
            r0 = r2.j;
            r1 = r3.j;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x006c:
            r0 = r2.k;
            r1 = r3.k;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0076:
            r0 = r2.l;
            r1 = r3.l;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0080:
            r0 = r2.m;
            r1 = r3.m;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x008a:
            r0 = r2.n;
            r1 = r3.n;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0094:
            r0 = r2.o;
            r1 = r3.o;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x009e:
            r0 = r2.p;
            r1 = r3.p;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00a8:
            r0 = r2.q;
            r1 = r3.q;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00b2:
            r0 = r2.r;
            r1 = r3.r;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00bc:
            r0 = r2.s;
            r1 = r3.s;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00c6:
            r0 = r2.t;
            r1 = r3.t;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00d0:
            r0 = r2.u;
            r1 = r3.u;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00da:
            r0 = r2.v;
            r1 = r3.v;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00e4:
            r0 = r2.w;
            r1 = r3.w;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00ee:
            r0 = r2.x;
            r1 = r3.x;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x00f8:
            r0 = r2.y;
            r1 = r3.y;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0102:
            r0 = r2.z;
            r1 = r3.z;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x010c:
            r0 = r2.A;
            r1 = r3.A;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0121;
        L_0x0116:
            r0 = r2.B;
            r3 = r3.B;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0121;
        L_0x0120:
            goto L_0x0123;
        L_0x0121:
            r3 = 0;
            return r3;
        L_0x0123:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wsr$a.equals(java.lang.Object):boolean");
        }

        public final String f() {
            return this.f;
        }

        public final String g() {
            return this.g;
        }

        public final Boolean h() {
            return this.j;
        }

        public final int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            aily aily = this.c;
            hashCode = (hashCode + (aily != null ? aily.hashCode() : 0)) * 31;
            str2 = this.d;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.e;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.f;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.g;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool = this.h;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            str2 = this.i;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            bool = this.j;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            bool = this.k;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            Long l = this.l;
            hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
            str2 = this.m;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.n;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            l = this.o;
            hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
            str2 = this.p;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.q;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            bool = this.r;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            str2 = this.s;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.t;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.u;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            bool = this.v;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            bool = this.w;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            str2 = this.x;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            bool = this.y;
            hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            str2 = this.z;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.A;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.B;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final Boolean i() {
            return this.k;
        }

        public final Long j() {
            return this.l;
        }

        public final String k() {
            return this.m;
        }

        public final String l() {
            return this.n;
        }

        public final Long m() {
            return this.o;
        }

        public final String n() {
            return this.q;
        }

        public final Boolean o() {
            return this.r;
        }

        public final String p() {
            return this.s;
        }

        public final String q() {
            return this.t;
        }

        public final String r() {
            return this.u;
        }

        public final Boolean s() {
            return this.v;
        }

        public final Boolean t() {
            return this.y;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("\n        |GetNextPendingTicket.Impl [\n        |  shakeId: ");
            stringBuilder.append(this.a);
            stringBuilder.append("\n        |  reportType: ");
            stringBuilder.append(this.b);
            stringBuilder.append("\n        |  reportSource: ");
            stringBuilder.append(this.c);
            stringBuilder.append("\n        |  description: ");
            stringBuilder.append(this.d);
            stringBuilder.append("\n        |  feature: ");
            stringBuilder.append(this.e);
            stringBuilder.append("\n        |  subFeature: ");
            stringBuilder.append(this.f);
            stringBuilder.append("\n        |  notificationEmail: ");
            stringBuilder.append(this.g);
            stringBuilder.append("\n        |  isAutoTicket: ");
            stringBuilder.append(this.h);
            stringBuilder.append("\n        |  autoTicketHash: ");
            stringBuilder.append(this.i);
            stringBuilder.append("\n        |  shouldCreateJiraTicket: ");
            stringBuilder.append(this.j);
            stringBuilder.append("\n        |  withScreenshot: ");
            stringBuilder.append(this.k);
            stringBuilder.append("\n        |  networkBandwidth: ");
            stringBuilder.append(this.l);
            stringBuilder.append("\n        |  networkConnectivityType: ");
            stringBuilder.append(this.m);
            stringBuilder.append("\n        |  shakeSensitivityType: ");
            stringBuilder.append(this.n);
            stringBuilder.append("\n        |  createTime: ");
            stringBuilder.append(this.o);
            stringBuilder.append("\n        |  status: ");
            stringBuilder.append(this.p);
            stringBuilder.append("\n        |  options: ");
            stringBuilder.append(this.q);
            stringBuilder.append("\n        |  withAttachments: ");
            stringBuilder.append(this.r);
            stringBuilder.append("\n        |  fragmentName: ");
            stringBuilder.append(this.s);
            stringBuilder.append("\n        |  fragmentFeature: ");
            stringBuilder.append(this.t);
            stringBuilder.append("\n        |  jiraMetaInfo: ");
            stringBuilder.append(this.u);
            stringBuilder.append("\n        |  isVideoShake: ");
            stringBuilder.append(this.v);
            stringBuilder.append("\n        |  withCameraRollAttachment: ");
            stringBuilder.append(this.w);
            stringBuilder.append("\n        |  cameraRollAttachmentNames: ");
            stringBuilder.append(this.x);
            stringBuilder.append("\n        |  isAnonymousTicket: ");
            stringBuilder.append(this.y);
            stringBuilder.append("\n        |  otherInfo: ");
            stringBuilder.append(this.z);
            stringBuilder.append("\n        |  breadcrumbData: ");
            stringBuilder.append(this.A);
            stringBuilder.append("\n        |  serializedOtherInfo: ");
            stringBuilder.append(this.B);
            stringBuilder.append("\n        |]\n        ");
            return akfu.a(stringBuilder.toString(), "|");
        }

        public final String u() {
            return this.z;
        }

        public final String v() {
            return this.A;
        }

        public final String w() {
            return this.B;
        }
    }

    String a();

    String b();

    aily c();

    String d();

    String e();

    String f();

    String g();

    Boolean h();

    Boolean i();

    Long j();

    String k();

    String l();

    Long m();

    String n();

    Boolean o();

    String p();

    String q();

    String r();

    Boolean s();

    Boolean t();

    String u();

    String v();

    String w();
}
