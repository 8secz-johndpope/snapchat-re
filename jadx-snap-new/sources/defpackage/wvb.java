package defpackage;

import defpackage.wsr.a;
import java.util.List;

/* renamed from: wvb */
final class wvb extends aing implements wsw {
    final List<ainb<?>> a = ainr.a();
    final wva b;
    final aino c;

    /* renamed from: wvb$b */
    static final class b extends akcs implements akbl<ainn, a> {
        private /* synthetic */ wvb a;

        b(wvb wvb) {
            this.a = wvb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            String string2 = ainn.getString(1);
            if (string2 == null) {
                akcr.a();
            }
            aina aina = this.a.b.b.a;
            Long l = ainn.getLong(2);
            if (l == null) {
                akcr.a();
            }
            aily aily = (aily) aina.decode(l);
            String string3 = ainn.getString(3);
            String string4 = ainn.getString(4);
            String string5 = ainn.getString(5);
            String string6 = ainn.getString(6);
            Long l2 = ainn.getLong(7);
            if (l2 != null) {
                valueOf = Boolean.valueOf(((Number) l2).longValue() == 1);
            } else {
                valueOf = null;
            }
            String string7 = ainn.getString(8);
            Long l3 = ainn.getLong(9);
            if (l3 != null) {
                valueOf2 = Boolean.valueOf(((Number) l3).longValue() == 1);
            } else {
                valueOf2 = null;
            }
            Long l4 = ainn.getLong(10);
            if (l4 != null) {
                valueOf3 = Boolean.valueOf(((Number) l4).longValue() == 1);
            } else {
                valueOf3 = null;
            }
            Long l5 = ainn.getLong(11);
            String string8 = ainn.getString(12);
            String string9 = ainn.getString(13);
            Long l6 = ainn.getLong(14);
            String string10 = ainn.getString(15);
            String string11 = ainn.getString(16);
            l4 = ainn.getLong(17);
            if (l4 != null) {
                valueOf4 = Boolean.valueOf(((Number) l4).longValue() == 1);
            } else {
                valueOf4 = null;
            }
            String string12 = ainn.getString(18);
            String string13 = ainn.getString(19);
            String string14 = ainn.getString(20);
            l4 = ainn.getLong(21);
            if (l4 != null) {
                valueOf5 = Boolean.valueOf(((Number) l4).longValue() == 1);
            } else {
                valueOf5 = null;
            }
            l4 = ainn.getLong(22);
            if (l4 != null) {
                valueOf6 = Boolean.valueOf(((Number) l4).longValue() == 1);
            } else {
                valueOf6 = null;
            }
            String string15 = ainn.getString(23);
            l4 = ainn.getLong(24);
            if (l4 != null) {
                valueOf7 = Boolean.valueOf(((Number) l4).longValue() == 1);
            } else {
                valueOf7 = null;
            }
            return new a(string, string2, aily, string3, string4, string5, string6, valueOf, string7, valueOf2, valueOf3, l5, string8, string9, l6, string10, string11, valueOf4, string12, string13, string14, valueOf5, valueOf6, string15, valueOf7, ainn.getString(25), ainn.getString(26), ainn.getString(27));
        }
    }

    /* renamed from: wvb$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ wvb b;

        /* renamed from: wvb$a$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindString(1, this.a.a);
                return ajxw.a;
            }
        }

        public a(wvb wvb, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.b = wvb;
            super(wvb.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            aino aino = this.b.c;
            StringBuilder stringBuilder = new StringBuilder("\n        |SELECT\n        |    shakeId,\n        |    reportType,\n        |    reportSource,\n        |    description,\n        |    feature,\n        |    subFeature,\n        |    notificationEmail,\n        |    isAutoTicket,\n        |    autoTicketHash,\n        |    shouldCreateJiraTicket,\n        |    withScreenshot,\n        |    networkBandwidth,\n        |    networkConnectivityType,\n        |    shakeSensitivityType,\n        |    createTime,\n        |    status,\n        |    options,\n        |    withAttachments,\n        |    fragmentName,\n        |    fragmentFeature,\n        |    jiraMetaInfo,\n        |    isVideoShake,\n        |    withCameraRollAttachment,\n        |    cameraRollAttachmentNames,\n        |    isAnonymousTicket,\n        |    otherInfo,\n        |    breadcrumbData,\n        |    serializedOtherInfo\n        |FROM\n        |    ShakeTicket\n        |WHERE\n        |    status ");
            stringBuilder.append(this.a == null ? "IS" : "=");
            stringBuilder.append(" ?1\n        |ORDER BY _id\n        |LIMIT 1\n        ");
            return aino.executeQuery(null, akfu.a(stringBuilder.toString(), "|"), 1, new a(this));
        }
    }

    /* renamed from: wvb$c */
    static final class c extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String A;
        private /* synthetic */ String B;
        private /* synthetic */ String C;
        private /* synthetic */ wvb a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ aily d;
        private /* synthetic */ String e;
        private /* synthetic */ String f;
        private /* synthetic */ String g;
        private /* synthetic */ String h;
        private /* synthetic */ Boolean i;
        private /* synthetic */ String j = null;
        private /* synthetic */ Boolean k;
        private /* synthetic */ Boolean l;
        private /* synthetic */ Long m;
        private /* synthetic */ String n;
        private /* synthetic */ String o;
        private /* synthetic */ Long p;
        private /* synthetic */ String q;
        private /* synthetic */ String r;
        private /* synthetic */ Boolean s;
        private /* synthetic */ String t;
        private /* synthetic */ String u;
        private /* synthetic */ String v;
        private /* synthetic */ Boolean w;
        private /* synthetic */ Boolean x;
        private /* synthetic */ String y;
        private /* synthetic */ Boolean z;

        c(wvb wvb, String str, String str2, aily aily, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str7, String str8, Long l2, String str9, String str10, Boolean bool4, String str11, String str12, String str13, Boolean bool5, Boolean bool6, Boolean bool7, String str14, String str15, String str16) {
            this.a = wvb;
            this.b = str;
            this.c = str2;
            this.d = aily;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = bool;
            this.k = bool2;
            this.l = bool3;
            this.m = l;
            this.n = str7;
            this.o = str8;
            this.p = l2;
            this.q = str9;
            this.r = str10;
            this.s = bool4;
            this.t = str11;
            this.u = str12;
            this.v = str13;
            this.w = bool5;
            this.x = bool6;
            this.y = null;
            this.z = bool7;
            this.A = str14;
            this.B = str15;
            this.C = str16;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Long l;
            Long l2;
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.b);
            ainp.bindString(2, this.c);
            ainp.bindLong(3, (Long) this.a.b.b.a.encode(this.d));
            ainp.bindString(4, this.e);
            ainp.bindString(5, this.f);
            ainp.bindString(6, this.g);
            ainp.bindString(7, this.h);
            Boolean bool = this.i;
            long j = 1;
            Long l3 = null;
            if (bool == null) {
                l = null;
            } else {
                l = Long.valueOf(bool.booleanValue() ? 1 : 0);
            }
            ainp.bindLong(8, l);
            ainp.bindString(9, null);
            Boolean bool2 = this.k;
            if (bool2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(bool2.booleanValue() ? 1 : 0);
            }
            ainp.bindLong(10, l2);
            bool2 = this.l;
            if (bool2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(bool2.booleanValue() ? 1 : 0);
            }
            ainp.bindLong(11, l2);
            ainp.bindLong(12, this.m);
            ainp.bindString(13, this.n);
            ainp.bindString(14, this.o);
            ainp.bindLong(15, this.p);
            ainp.bindString(16, this.q);
            ainp.bindString(17, this.r);
            bool2 = this.s;
            if (bool2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(bool2.booleanValue() ? 1 : 0);
            }
            ainp.bindLong(18, l2);
            ainp.bindString(19, this.t);
            ainp.bindString(20, this.u);
            ainp.bindString(21, this.v);
            bool2 = this.w;
            if (bool2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(bool2.booleanValue() ? 1 : 0);
            }
            ainp.bindLong(22, l2);
            bool2 = this.x;
            if (bool2 == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(bool2.booleanValue() ? 1 : 0);
            }
            ainp.bindLong(23, l2);
            ainp.bindString(24, null);
            bool2 = this.z;
            if (bool2 != null) {
                if (!bool2.booleanValue()) {
                    j = 0;
                }
                l3 = Long.valueOf(j);
            }
            ainp.bindLong(25, l3);
            ainp.bindString(26, this.A);
            ainp.bindString(27, this.B);
            ainp.bindString(28, this.C);
            return ajxw.a;
        }
    }

    /* renamed from: wvb$d */
    static final class d extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;

        d(String str, String str2) {
            this.a = str;
            this.b = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            ainp.bindString(2, this.b);
            return ajxw.a;
        }
    }

    public wvb(wva wva, aino aino) {
        akcr.b(wva, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.b = wva;
        this.c = aino;
    }

    public final ainb<wsr> a(String str) {
        return new a(this, str, new b(this));
    }

    public final void a(String str, String str2) {
        akcr.b(str2, "shakeId");
        this.c.execute(Integer.valueOf(13), akfu.a("\n        |UPDATE ShakeTicket\n        |SET\n        |    status = ?1\n        |WHERE\n        |    shakeId = ?2\n        ", "|"), 2, new d(str, str2));
        a(this.b.a.a);
    }

    public final void a(String str, String str2, aily aily, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str7, String str8, Long l2, String str9, String str10, Boolean bool4, String str11, String str12, String str13, Boolean bool5, Boolean bool6, Boolean bool7, String str14, String str15, String str16) {
        String str17 = str;
        String str18 = str2;
        aily aily2 = aily;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        Boolean bool8 = bool;
        Boolean bool9 = bool2;
        Boolean bool10 = bool3;
        Long l3 = l;
        String str23 = str7;
        String str24 = str8;
        Long l4 = l2;
        String str25 = str9;
        String str26 = str10;
        Boolean bool11 = bool4;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        Boolean bool12 = bool5;
        Boolean bool13 = bool6;
        Boolean bool14 = bool7;
        String str30 = str14;
        String str31 = str15;
        String str32 = str16;
        String str33 = str17;
        akcr.b(str17, "shakeId");
        akcr.b(str2, "reportType");
        akcr.b(aily, "reportSource");
        aino aino = this.c;
        Integer valueOf = Integer.valueOf(12);
        aino aino2 = aino;
        Integer num = valueOf;
        aino2.execute(num, akfu.a("\n        |INSERT OR REPLACE INTO ShakeTicket(\n        |    shakeId,\n        |    reportType,\n        |    reportSource,\n        |    description,\n        |    feature,\n        |    subFeature,\n        |    notificationEmail,\n        |    isAutoTicket,\n        |    autoTicketHash,\n        |    shouldCreateJiraTicket,\n        |    withScreenshot,\n        |    networkBandwidth,\n        |    networkConnectivityType,\n        |    shakeSensitivityType,\n        |    createTime,\n        |    status,\n        |    options,\n        |    withAttachments,\n        |    fragmentName,\n        |    fragmentFeature,\n        |    jiraMetaInfo,\n        |    isVideoShake,\n        |    withCameraRollAttachment,\n        |    cameraRollAttachmentNames,\n        |    isAnonymousTicket,\n        |    otherInfo,\n        |    breadcrumbData,\n        |    serializedOtherInfo\n        |)\n        |VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28)\n        ", "|"), 28, new c(this, str33, str18, aily2, str19, str20, str21, str22, bool8, bool9, bool10, l3, str23, str24, l4, str25, str26, bool11, str27, str28, str29, bool12, bool13, bool14, str30, str31, str32));
        a(this.b.a.a);
    }
}
