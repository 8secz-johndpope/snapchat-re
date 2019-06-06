package defpackage;

import android.graphics.Canvas;

/* renamed from: tpb */
public interface tpb extends tpq {

    /* renamed from: tpb$a */
    public static final class a {

        /* renamed from: tpb$a$a */
        public static final class a extends akcs implements akbl<String, Boolean> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((String) obj, "it");
                return Boolean.TRUE;
            }
        }
    }

    String Z_();

    ajcx a(abyy abyy, Canvas canvas, int i, int i2);

    ajcx a(Canvas canvas, boolean z, akbl<? super String, Boolean> akbl);

    void a(akbw<? super String, ? super String, Boolean> akbw, int i);
}
