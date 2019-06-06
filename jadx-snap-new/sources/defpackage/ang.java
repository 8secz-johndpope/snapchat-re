package defpackage;

import android.graphics.Bitmap;
import java.io.OutputStream;

/* renamed from: ang */
public final class ang implements air<and> {
    private final air<Bitmap> a;
    private final air<amu> b;
    private String c;

    public ang(air<Bitmap> air, air<amu> air2) {
        this.a = air;
        this.b = air2;
    }

    public final String a() {
        if (this.c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.a());
            stringBuilder.append(this.b.a());
            this.c = stringBuilder.toString();
        }
        return this.c;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        and and = (and) ((ajn) obj).a();
        ajn ajn = and.b;
        return ajn != null ? this.a.a(ajn, outputStream) : this.b.a(and.a, outputStream);
    }
}
