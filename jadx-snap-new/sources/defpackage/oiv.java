package defpackage;

import android.graphics.Bitmap;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.adiw.a;
import defpackage.adiw.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: oiv */
public final class oiv implements ofs {
    private static final Integer a = Integer.valueOf(1280);
    private final ofq b;
    private final Map<acae, adiv> c;
    private final adiw d;
    private adit e;
    private adiq f;
    private adiv g;
    private final boolean h = false;

    public oiv(acae acae, boolean z, ofq ofq) {
        Preconditions.checkNotNull(acae);
        this.b = ofq;
        this.c = b(z);
        this.d = new adiw(c(), new a((adiv) this.c.get(acae), (adiv) this.c.get(acae), b.HORIZONTAL, (float) MapboxConstants.MINIMUM_ZOOM));
        a(z);
    }

    private void a(boolean z) {
        adiv adiv = this.f;
        if (adiv == null) {
            adiv = this.d;
        }
        if (z && this.c.containsKey(acae.SMOOTHING)) {
            this.g = new oiu(adiv, (adiv) this.c.get(acae.SMOOTHING), false);
        } else {
            this.g = adiv;
        }
    }

    private Map<acae, adiv> b(boolean z) {
        HashMap hashMap = new HashMap();
        for (acae acae : acae.values()) {
            Object a;
            if (z && acae.c()) {
                a = this.b.a(acae);
            } else {
                a = new adin(this.b.a(acae));
                if (z && acae == acae.SMOOTHING) {
                    a = new adig(a, a);
                }
            }
            hashMap.put(acae, a);
        }
        return hashMap;
    }

    private Set<adiv> c() {
        HashSet hashSet = new HashSet();
        for (adiv add : this.c.values()) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public final adiv a() {
        return this.g;
    }

    public final void a(float f) {
        a aVar = this.d.a;
        this.d.a(new a(aVar.a, aVar.b, aVar.c, f));
    }

    public final void a(float f, float f2, float f3) {
        f3 *= (float) Math.hypot((double) f, (double) f2);
        this.e = new adit(f3 / f, f3 / f2);
        this.f = new adiq(this.e, this.d);
        a(true);
    }

    public final void a(float f, adix adix, adie adie) {
        if (f > MapboxConstants.MINIMUM_ZOOM && adix != null) {
            for (adiv adiv : this.c.values()) {
                if (adiv instanceof oit) {
                    oit oit = (oit) adiv;
                    oit.c = f;
                    oit.b = adix;
                    oit.d = adie;
                }
            }
        }
    }

    public final void a(acae acae, acae acae2) {
        a aVar = this.d.a;
        this.d.a(new a((adiv) this.c.get(acae), (adiv) this.c.get(acae2), aVar.c, aVar.d));
    }

    public final void a(acae acae, Bitmap bitmap) {
        if (bitmap != null && this.c.containsKey(acae)) {
            adiv adiv = (adiv) this.c.get(acae);
            if (adiv instanceof oit) {
                ((oit) adiv).a = bitmap;
            }
        }
    }

    public final void b() {
        for (adiv adiv : this.c.values()) {
            if (adiv instanceof adig) {
                ((adig) adiv).a = false;
            }
        }
    }

    public final void b(float f) {
        adit adit = this.e;
        if (adit != null) {
            adit.a = f;
            adit.b.a();
        }
    }
}
