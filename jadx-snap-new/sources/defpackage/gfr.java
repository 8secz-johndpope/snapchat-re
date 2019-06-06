package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gfr */
public final class gfr {
    public static volatile String a;
    static final ajxe b = ajxh.a(b.a);
    private static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: gfr$b */
    static final class b extends akcs implements akbk<Uri> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Builder().scheme("content").authority(a.a()).build();
        }
    }

    /* renamed from: gfr$a */
    public static final class a {
        static {
            new aken[1][0] = new akdc(akde.a(a.class), "BASE_URI", "getBASE_URI()Landroid/net/Uri;");
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static String a() {
            String str = gfr.a;
            if (str == null) {
                akcr.a("AUTHORITY");
            }
            return str;
        }

        public static Uri b() {
            return (Uri) gfr.b.b();
        }
    }

    static {
        a aVar = new a();
    }

    public gfr(Context context) {
        akcr.b(context, "context");
        if (c.compareAndSet(false, true)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(".provider");
            a = stringBuilder.toString();
        }
    }
}
