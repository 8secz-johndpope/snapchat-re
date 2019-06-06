package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.common.base.Supplier;
import java.io.File;

/* renamed from: acyy */
public final class acyy implements acmq {
    final acyx a = a();
    final Context b;
    private final SparseArray<acyx> c = new SparseArray(3);
    private final Supplier<File> d = new c(this);
    private final ajxe e = ajxh.a(new b(this));
    private final zgb f;

    /* renamed from: acyy$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acyy$c */
    static final class c<T> implements Supplier<File> {
        private /* synthetic */ acyy a;

        c(acyy acyy) {
            this.a = acyy;
        }

        public final /* synthetic */ Object get() {
            File file = new File(this.a.b.getFilesDir(), "com.snapchat.map");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: acyy$b */
    static final class b extends akcs implements akbk<acyx> {
        private /* synthetic */ acyy a;

        b(acyy acyy) {
            this.a = acyy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b(acmm.DEFAULT);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acyy.class), "mDefaultManager", "getMDefaultManager()Lcom/snapchat/map/mapbox/MapboxStyleManager;");
        a aVar = new a();
    }

    public acyy(Context context, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        this.b = context;
        this.f = zgb;
    }

    private final acyx a() {
        return (acyx) this.e.b();
    }

    public final acmp a(acmm acmm) {
        akcr.b(acmm, "mapStyle");
        return b(acmm);
    }

    public final void a(ajwy<? extends aczu> ajwy, ajwy<aczt> ajwy2) {
        akcr.b(ajwy, "client");
        akcr.b(ajwy2, "contentDownloader");
        a().b(ajwy, ajwy2, "onAppResumed");
    }

    public final synchronized acyx b(acmm acmm) {
        acyx acyx;
        akcr.b(acmm, "style");
        int ordinal = acmm.ordinal();
        acyx = (acyx) this.c.get(ordinal);
        if (acyx == null) {
            acyx = new acyx(this.b, ordinal, this.d);
            this.c.put(ordinal, acyx);
        }
        return acyx;
    }
}
