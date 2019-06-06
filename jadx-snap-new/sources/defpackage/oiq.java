package defpackage;

import com.google.common.base.Enums;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.adiw.b;
import defpackage.adjm.a;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: oiq */
public final class oiq implements ofq {
    private adhk a;
    private final Map<acae, Supplier<adiv>> b;
    private final Optional<adjm> c;

    protected oiq(Map<acae, Supplier<adiv>> map, adhk adhk, Optional<adjm> optional) {
        this.b = map;
        this.a = adhk;
        this.c = optional;
    }

    public final adiv a(abtl abtl, List<ofx> list, adie adie, adie adie2, boolean z) {
        return new ofp(abtl, adie, adie2, list, z, this.a);
    }

    public final adiv a(acae acae) {
        return new ois(acae, this.b).get();
    }

    public final adiv a(acaj acaj, float f) {
        return new ois(null, this.b, acaj, f, 1.0f, 1.0f).get();
    }

    public final adiv a(acaj acaj, float f, float f2, float f3) {
        return new ois(null, this.b, acaj, f, f2, f3).get();
    }

    public final adiv a(String str) {
        acae acae = (acae) Enums.getIfPresent(acae.class, str).orNull();
        if (acae != null) {
            return a(acae);
        }
        throw new IllegalStateException("Unsupported visual filter type: ".concat(String.valueOf(str)));
    }

    public final adiv a(String str, String str2, Boolean bool) {
        return a(str, str2, bool, false);
    }

    public final adiv a(String str, String str2, Boolean bool, a aVar) {
        return new adir(this.c, str, str2, bool, aVar);
    }

    public final adiv a(String str, String str2, Boolean bool, boolean z) {
        if (z) {
            String str3 = str;
            String str4 = str2;
            Boolean bool2 = bool;
            String str5 = str;
            String str6 = str2;
            Boolean bool3 = bool;
            adiv adir = new adir(this.c, str5, str6, bool3, a.RIGHT);
            adie adie = new adie();
            adie.a(90.0f);
            adie.b(1.0f, 0.5f);
            adie.a(MapboxConstants.MINIMUM_ZOOM, -0.5f);
            adiv adiv = adir;
            adir = new adir(this.c, str5, str6, bool3, a.LEFT);
            adie adie2 = new adie();
            adie2.a(90.0f);
            adie2.b(1.0f, 0.5f);
            adie2.a(MapboxConstants.MINIMUM_ZOOM, 0.5f);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(adir);
            linkedHashSet.add(adiv);
            List linkedList = new LinkedList();
            linkedList.add(adie);
            linkedList.add(adie2);
            return new adiw(linkedHashSet, new adiw.a(adir, adiv, b.VERTICAL, linkedList));
        }
        return a(str, str2, bool, a.UNKNOWN);
    }

    public final Supplier<adiv> a(acae acae, acaj acaj, float f, float f2, float f3) {
        return new ois(acae, this.b, acaj, f, f2, f3);
    }
}
