package defpackage;

import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.adiw.b;
import defpackage.vme.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vmf */
public final class vmf implements ofr {
    final ofq a;
    private final adnj b;
    private final adhl c;

    /* renamed from: vmf$a */
    static final class a<T> implements Supplier<adiv> {
        private /* synthetic */ vmf a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ boolean d;

        a(vmf vmf, String str, String str2, boolean z) {
            this.a = vmf;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final /* synthetic */ Object get() {
            return this.a.a.a(this.b, this.c, Boolean.valueOf(this.d));
        }
    }

    /* renamed from: vmf$b */
    static final class b<T> implements Supplier<adiv> {
        private /* synthetic */ adiw a;

        b(adiw adiw) {
            this.a = adiw;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return this.a;
        }
    }

    /* renamed from: vmf$c */
    static final class c<T> implements Supplier<adiv> {
        private /* synthetic */ vmf a;
        private /* synthetic */ abtl b;
        private /* synthetic */ List c;
        private /* synthetic */ acaj d;
        private /* synthetic */ float e;

        c(vmf vmf, abtl abtl, List list, acaj acaj, float f) {
            this.a = vmf;
            this.b = abtl;
            this.c = list;
            this.d = acaj;
            this.e = f;
        }

        public final /* synthetic */ Object get() {
            return this.a.a.a(this.b, this.c, new adie(), acaj.a(this.d, this.e), false);
        }
    }

    /* renamed from: vmf$d */
    static final class d<T> implements Supplier<adiv> {
        private /* synthetic */ adiv a;

        d(adiv adiv) {
            this.a = adiv;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return this.a;
        }
    }

    public vmf(ofq ofq, adnj adnj, adhl adhl) {
        akcr.b(ofq, "renderPassFactory");
        akcr.b(adnj, "mediaEngineResources");
        akcr.b(adhl, "glesVersion");
        this.a = ofq;
        this.b = adnj;
        this.c = adhl;
    }

    public final jwg a(acae acae, acaj acaj, float f, float f2, float f3) {
        String str = "visualFilterType";
        akcr.b(acae, str);
        if (acae == acae.UNFILTERED && acaj.b(acaj) && f2 == 1.0f && f3 == 1.0f) {
            return null;
        }
        Object a = this.a.a(acae, acaj, f, f2, f3);
        akcr.a(a, "renderPassFactory.create…ectRatio, scaleX, scaleY)");
        akcr.b(acae, str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(acae);
        stringBuilder.append('-');
        stringBuilder.append(acaj);
        return new vme(a, stringBuilder.toString(), new a(0), this.c, this.b);
    }

    public final jwg a(adiv adiv) {
        akcr.b(adiv, "renderPass");
        return new vme(new d(adiv), String.valueOf(adiv), new a(0), this.c, this.b);
    }

    public final jwg a(String str, String str2, boolean z) {
        akcr.b(str, MessageMediaRefModel.URI);
        akcr.b(str2, "mediaId");
        return new vme(new a(this, str, str2, z), String.valueOf(str2), new a(0), this.c, this.b);
    }

    public final jwg a(List<ofx> list, acaj acaj, float f, abtl abtl, long j) {
        akcr.b(list, "pinnableImageTranscodingTargets");
        akcr.b(abtl, MapboxEvent.KEY_RESOLUTION);
        return list.isEmpty() ? null : new vme(new c(this, abtl, list, acaj, f), String.valueOf(list), new a(j * 1000), this.c, this.b);
    }

    public final jwg b(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        akcr.b(str, MessageMediaRefModel.URI);
        akcr.b(str4, "mediaId");
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        adjm.a[] aVarArr = new adjm.a[]{adjm.a.LEFT, adjm.a.RIGHT};
        for (int i = 0; i < 2; i++) {
            adjm.a aVar = aVarArr[i];
            adie adie = new adie();
            adie.a(aVar == adjm.a.LEFT ? -0.5f : 0.5f, MapboxConstants.MINIMUM_ZOOM);
            arrayList2.add(adie);
            arrayList.add(this.a.a(str, str4, Boolean.valueOf(z), aVar));
        }
        return new vme(new b(new adiw(ajyu.m(arrayList), new adiw.a((adiv) arrayList.get(0), (adiv) arrayList.get(1), b.HORIZONTAL, ajym.b((Object[]) new adie[]{(adie) arrayList2.get(0), (adie) arrayList2.get(1)})))), str2, new a(0), this.c, this.b);
    }
}
