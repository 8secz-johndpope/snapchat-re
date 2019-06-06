package defpackage;

/* renamed from: ijg */
public final class ijg {

    /* renamed from: ijg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ijg$b */
    static final class b extends akcs implements akbl<aenn, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            String str = ((aenn) obj).e.o;
            return str != null ? str : "";
        }
    }

    static {
        a aVar = new a();
    }

    /* JADX WARNING: Missing block: B:3:0x004e, code skipped:
            if (r8 == null) goto L_0x0050;
     */
    public static android.net.Uri a(defpackage.abzy r8, int r9, int r10) {
        /*
        r0 = "geofilter";
        defpackage.akcr.b(r8, r0);
        r1 = defpackage.gfr.a.b();
        r1 = r1.buildUpon();
        r0 = r1.appendPath(r0);
        r1 = "overlay";
        r0 = r0.appendPath(r1);
        r1 = r8.a();
        r2 = "OVERLAY_GEOFILTER_ID";
        r0 = r0.appendQueryParameter(r2, r1);
        r9 = java.lang.String.valueOf(r9);
        r1 = "OVERLAY_WIDTH";
        r9 = r0.appendQueryParameter(r1, r9);
        r10 = java.lang.String.valueOf(r10);
        r0 = "OVERLAY_HEIGHT";
        r9 = r9.appendQueryParameter(r0, r10);
        r8 = r8.g();
        if (r8 == 0) goto L_0x0050;
    L_0x003b:
        r0 = r8;
        r0 = (java.lang.Iterable) r0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r8 = defpackage.ijg.b.a;
        r6 = r8;
        r6 = (defpackage.akbl) r6;
        r7 = 31;
        r8 = defpackage.ajyu.a(r0, r1, r2, r3, r4, r5, r6, r7);
        if (r8 != 0) goto L_0x0052;
    L_0x0050:
        r8 = "";
    L_0x0052:
        r10 = "DYNAMIC_TEXT";
        r8 = r9.appendQueryParameter(r10, r8);
        r8 = r8.build();
        r9 = "SnapContentBaseUriProvid…\n                .build()";
        defpackage.akcr.a(r8, r9);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijg.a(abzy, int, int):android.net.Uri");
    }
}
