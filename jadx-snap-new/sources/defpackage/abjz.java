package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import defpackage.abkb.a;

/* renamed from: abjz */
public final class abjz implements abka {
    private static a a = new a(TelemetryConstants.FLUSH_DELAY_MS);

    /* renamed from: abjz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
        a aVar2 = new a(3000);
    }

    public final int a(a aVar) {
        akcr.b(aVar, "locationParams");
        return 100;
    }

    public final a a() {
        return a;
    }

    public final void a(StringBuilder stringBuilder) {
        akcr.b(stringBuilder, "builder");
    }

    public final void a(boolean z) {
    }

    public final long b(a aVar) {
        akcr.b(aVar, "locationParams");
        return aVar.a();
    }

    public final void b(boolean z) {
    }

    public final long c(a aVar) {
        akcr.b(aVar, "locationParams");
        return aVar.a();
    }

    public final long d(a aVar) {
        akcr.b(aVar, "locationParams");
        return aVar.a();
    }

    public final long e(a aVar) {
        akcr.b(aVar, "locationParams");
        return 0;
    }
}
