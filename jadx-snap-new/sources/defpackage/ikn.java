package defpackage;

/* renamed from: ikn */
public final class ikn {
    public final ajxe a;
    public final zpo b;
    private final ajxe c = ajxh.a(a.a);
    private tpo d;

    /* renamed from: ikn$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ijd.a.callsite("GeofiltersDataSource");
        }
    }

    /* renamed from: ikn$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ ikn a;
        private /* synthetic */ zgb b;

        d(ikn ikn, zgb zgb) {
            this.a = ikn;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.a());
        }
    }

    /* renamed from: ikn$b */
    public static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ikn a;

        public b(ikn ikn) {
            this.a = ikn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            zpp zpp = (zpp) obj;
            akcr.b(zpp, "it");
            return zpp.a((zss) defpackage.zss.b.b.b, this.a.a());
        }
    }

    /* renamed from: ikn$c */
    public static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ ikn a;

        public c(ikn ikn) {
            this.a = ikn;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0162  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r30) {
            /*
            r29 = this;
            r0 = r30;
            r0 = (java.util.List) r0;
            r1 = "it";
            defpackage.akcr.b(r0, r1);
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r2 = 10;
            r2 = defpackage.ajyn.a(r0, r2);
            r1.<init>(r2);
            r1 = (java.util.Collection) r1;
            r0 = r0.iterator();
        L_0x001c:
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x0198;
        L_0x0022:
            r2 = r0.next();
            r2 = (defpackage.zsm) r2;
            r2 = r2.b;
            r26 = new abzy$a;
            r3 = r2.m;
            r4 = "response.isDynamicGeofilter";
            defpackage.akcr.a(r3, r4);
            r3 = r3.booleanValue();
            if (r3 == 0) goto L_0x003c;
        L_0x0039:
            r3 = defpackage.abzu.DYNAMIC;
            goto L_0x003e;
        L_0x003c:
            r3 = defpackage.abzu.STATIC;
        L_0x003e:
            r3 = r3.ordinal();
            r4 = r3;
            r5 = r2.a;
            r6 = r2.c;
            r7 = r2.d;
            r3 = r2.k;
            if (r3 == 0) goto L_0x0081;
        L_0x004d:
            r8 = r3.isEmpty();
            if (r8 == 0) goto L_0x0054;
        L_0x0053:
            goto L_0x0081;
        L_0x0054:
            r8 = 0;
            r3 = r3.get(r8);
            r3 = (java.lang.String) r3;
            r8 = "scaleType";
            defpackage.akcr.a(r3, r8);
            r8 = "serverScaleType";
            defpackage.akcr.b(r3, r8);
            r3 = (java.lang.CharSequence) r3;
            r8 = "scale_aspect_fill";
            r8 = (java.lang.CharSequence) r8;
            r8 = android.text.TextUtils.equals(r3, r8);
            if (r8 == 0) goto L_0x0074;
        L_0x0071:
            r3 = android.widget.ImageView.ScaleType.CENTER_CROP;
            goto L_0x0083;
        L_0x0074:
            r8 = "scale_to_fill";
            r8 = (java.lang.CharSequence) r8;
            r3 = android.text.TextUtils.equals(r3, r8);
            if (r3 == 0) goto L_0x0081;
        L_0x007e:
            r3 = android.widget.ImageView.ScaleType.FIT_XY;
            goto L_0x0083;
        L_0x0081:
            r3 = android.widget.ImageView.ScaleType.FIT_CENTER;
        L_0x0083:
            r8 = r3.ordinal();
            r3 = r2.k;
            r9 = 1;
            r10 = 17;
            if (r3 == 0) goto L_0x0120;
        L_0x008e:
            r11 = r3.size();
            r12 = 2;
            if (r11 >= r12) goto L_0x0097;
        L_0x0095:
            goto L_0x0120;
        L_0x0097:
            r3 = r3.get(r9);
            r3 = (java.lang.String) r3;
            r11 = "gravityString";
            defpackage.akcr.a(r3, r11);
            r11 = "serverGravityString";
            defpackage.akcr.b(r3, r11);
            r3 = (java.lang.CharSequence) r3;
            r11 = "top";
            r11 = (java.lang.CharSequence) r11;
            r11 = android.text.TextUtils.equals(r3, r11);
            if (r11 == 0) goto L_0x00b8;
        L_0x00b3:
            r3 = 49;
            r10 = 49;
            goto L_0x0120;
        L_0x00b8:
            r11 = "bottom";
            r11 = (java.lang.CharSequence) r11;
            r11 = android.text.TextUtils.equals(r3, r11);
            if (r11 == 0) goto L_0x00c7;
        L_0x00c2:
            r3 = 81;
            r10 = 81;
            goto L_0x0120;
        L_0x00c7:
            r11 = "left";
            r11 = (java.lang.CharSequence) r11;
            r11 = android.text.TextUtils.equals(r3, r11);
            if (r11 == 0) goto L_0x00d6;
        L_0x00d1:
            r3 = 19;
            r10 = 19;
            goto L_0x0120;
        L_0x00d6:
            r11 = "right";
            r11 = (java.lang.CharSequence) r11;
            r11 = android.text.TextUtils.equals(r3, r11);
            if (r11 == 0) goto L_0x00e5;
        L_0x00e0:
            r3 = 21;
            r10 = 21;
            goto L_0x0120;
        L_0x00e5:
            r11 = "top_left";
            r11 = (java.lang.CharSequence) r11;
            r11 = android.text.TextUtils.equals(r3, r11);
            if (r11 == 0) goto L_0x00f4;
        L_0x00ef:
            r3 = 51;
            r10 = 51;
            goto L_0x0120;
        L_0x00f4:
            r11 = "top_right";
            r11 = (java.lang.CharSequence) r11;
            r11 = android.text.TextUtils.equals(r3, r11);
            if (r11 == 0) goto L_0x0103;
        L_0x00fe:
            r3 = 53;
            r10 = 53;
            goto L_0x0120;
        L_0x0103:
            r11 = "bottom_left";
            r11 = (java.lang.CharSequence) r11;
            r11 = android.text.TextUtils.equals(r3, r11);
            if (r11 == 0) goto L_0x0112;
        L_0x010d:
            r3 = 83;
            r10 = 83;
            goto L_0x0120;
        L_0x0112:
            r11 = "bottom_right";
            r11 = (java.lang.CharSequence) r11;
            r3 = android.text.TextUtils.equals(r3, r11);
            if (r3 == 0) goto L_0x0120;
        L_0x011c:
            r3 = 85;
            r10 = 85;
        L_0x0120:
            r11 = r2.a();
            r12 = r2.l;
            r13 = r2.t;
            r14 = r2.Y;
            r3 = r2.Z;
            r15 = "response.isAnimated";
            defpackage.akcr.a(r3, r15);
            r15 = r3.booleanValue();
            r16 = 0;
            r3 = r2.af;
            r9 = "response.hasContextCard";
            defpackage.akcr.a(r3, r9);
            r17 = r3.booleanValue();
            r9 = r2.ag;
            r3 = r2.D;
            r27 = r0;
            r0 = r2.W;
            r20 = r2.e();
            r28 = r1;
            r1 = r2.U;
            r21 = r1;
            r1 = r2.T;
            r22 = r1;
            r1 = r2.q;
            r23 = r1;
            r1 = r2.R;
            r2 = r2.L;
            if (r2 == 0) goto L_0x016a;
        L_0x0162:
            r2 = r2.booleanValue();
            r25 = r2;
            r2 = r3;
            goto L_0x016d;
        L_0x016a:
            r2 = r3;
            r25 = 1;
        L_0x016d:
            r3 = r26;
            r18 = r9;
            r9 = r10;
            r10 = r11;
            r11 = r12;
            r12 = r13;
            r13 = r14;
            r14 = r15;
            r15 = r16;
            r16 = r17;
            r17 = r18;
            r18 = r2;
            r19 = r0;
            r24 = r1;
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
            r0 = r26.a();
            r1 = "SerializedGeofilter.Geof…Delivery ?: true).build()";
            defpackage.akcr.a(r0, r1);
            r1 = r28;
            r1.add(r0);
            r0 = r27;
            goto L_0x001c;
        L_0x0198:
            r1 = (java.util.List) r1;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ikn$c.apply(java.lang.Object):java.lang.Object");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ikn.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(ikn.class), "schedules", "getSchedules()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public ikn(zgb zgb, zpo zpo, tpo tpo) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zpo, "unlockablesApi");
        this.b = zpo;
        this.d = tpo;
        this.a = ajxh.a(new d(this, zgb));
    }

    public final idd a() {
        return (idd) this.c.b();
    }
}
