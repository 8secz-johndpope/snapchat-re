package defpackage;

import android.location.Location;
import defpackage.acup.b;

/* renamed from: adcd */
public final class adcd {
    static final adcd a = new adcd();
    private final float[] b;

    /* renamed from: adcd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static int a(float f, b bVar) {
            akcr.b(bVar, "viewState");
            return adcd.a.a(f, bVar);
        }
    }

    static {
        a aVar = new a();
    }

    private /* synthetic */ adcd() {
        this(new float[1]);
    }

    private adcd(float[] fArr) {
        akcr.b(fArr, "holder");
        this.b = fArr;
    }

    public final int a(float f, b bVar) {
        akcr.b(bVar, "viewState");
        Object obj = bVar.f;
        String str = "viewState.sw";
        akcr.a(obj, str);
        double latitude = obj.getLatitude();
        obj = bVar.f;
        akcr.a(obj, str);
        double longitude = obj.getLongitude();
        obj = bVar.e;
        str = "viewState.ne";
        akcr.a(obj, str);
        double latitude2 = obj.getLatitude();
        obj = bVar.e;
        akcr.a(obj, str);
        Location.distanceBetween(latitude, longitude, latitude2, obj.getLongitude(), this.b);
        latitude = (double) this.b[0];
        longitude = Math.sqrt((double) ((bVar.b * bVar.b) + (bVar.a * bVar.a)));
        Double.isNaN(latitude);
        latitude /= longitude;
        if (latitude <= 0.0d) {
            return 0;
        }
        double d = (double) f;
        Double.isNaN(d);
        return (int) (d / latitude);
    }
}
