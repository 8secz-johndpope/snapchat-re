package defpackage;

import com.google.common.base.Supplier;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ois */
public final class ois implements Supplier<adiv> {
    private final acae a;
    private final acaj b;
    private final Map<acae, Supplier<adiv>> c;
    private final float d;
    private final float e;
    private final float f;

    public ois(acae acae, Map<acae, Supplier<adiv>> map) {
        this(acae, map, null, 1.0f, 1.0f, 1.0f);
    }

    public ois(acae acae, Map<acae, Supplier<adiv>> map, acaj acaj, float f, float f2, float f3) {
        this.a = acae;
        this.c = map;
        this.b = acaj;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    private adiv b() {
        acaj acaj = this.b;
        if (acaj == null) {
            acaj = new acaj();
        }
        adix adix = new adix(this.d, this.e, this.f);
        adix.a(acaj.a, acaj.b, acaj.c, acaj.d, acaj.d, adix.a.f, adix.a.g);
        return adix;
    }

    private adiv c() {
        if (this.c.containsKey(this.a)) {
            return (adiv) ((Supplier) this.c.get(this.a)).get();
        }
        StringBuilder stringBuilder = new StringBuilder("Unsupported visual filter type: ");
        stringBuilder.append(this.a);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final adiv get() {
        ArrayList arrayList = new ArrayList();
        if (!(this.e == 1.0f && this.f == 1.0f && acaj.b(this.b))) {
            arrayList.add(b());
        }
        acae acae = this.a;
        if (!(acae == null || acae == acae.UNFILTERED)) {
            arrayList.add(c());
        }
        return arrayList.isEmpty() ? new adii() : arrayList.size() == 1 ? (adiv) arrayList.get(0) : new adiq((adiv[]) arrayList.toArray(new adiv[arrayList.size()]));
    }
}
