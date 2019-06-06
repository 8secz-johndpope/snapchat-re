package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: acma */
public final class acma {
    private final WeakReference<aclg> a;
    private final aclt b;
    private final nbo c;
    private final nct d;

    public acma(aclg aclg, aclt aclt, nbo nbo, nct nct) {
        akcr.b(aclg, "snapMap");
        akcr.b(aclt, "eventSender");
        akcr.b(nbo, "friendLocationManager");
        akcr.b(nct, "userLocationManager");
        this.b = aclt;
        this.c = nbo;
        this.d = nct;
        this.a = new WeakReference(aclg);
    }

    public final void a(acuu acuu, aarj aarj) {
        akcr.b(acuu, "poiSO");
        akcr.b(aarj, "result");
        aclg aclg = (aclg) this.a.get();
        if (aclg != null) {
            adbv j = aclg.j();
            if (j != null) {
                acmj j2 = j.j();
                if (j2 != null) {
                    akcr.a((Object) j2, "snapMapWk.get()?.viewHost?.mapController ?: return");
                    Object obj = acuu.k().a;
                    akcr.a(obj, "poiSO.poiContainer.pointOfInterest");
                    aclt aclt = this.b;
                    Object obj2 = obj.c;
                    String str = "poi.point";
                    akcr.a(obj2, str);
                    double a = obj2.a();
                    obj2 = obj.c;
                    akcr.a(obj2, str);
                    double b = obj2.b();
                    double a2 = adbu.a(j2);
                    String b2 = obj.b();
                    nct nct = this.d;
                    Object obj3 = obj.c;
                    akcr.a(obj3, str);
                    double a3 = obj3.a();
                    obj3 = obj.c;
                    akcr.a(obj3, str);
                    a3 = aclv.a(nct, a3, obj3.b());
                    nbo nbo = this.c;
                    obj3 = obj.c;
                    akcr.a(obj3, str);
                    double a4 = obj3.a();
                    obj = obj.c;
                    akcr.a(obj, str);
                    aclt.a(a, b, a2, aarj, b2, a3, aclv.a(nbo, a4, obj.b()));
                }
            }
        }
    }

    public final void a(cgi cgi, aarj aarj) {
        akcr.b(cgi, "latLng");
        akcr.b(aarj, "result");
        aclg aclg = (aclg) this.a.get();
        if (aclg != null) {
            adbv j = aclg.j();
            if (j != null) {
                acmj j2 = j.j();
                if (j2 != null) {
                    akcr.a((Object) j2, "snapMapWk?.get()?.viewHo…?.mapController ?: return");
                    this.b.a(cgi.getLatitude(), cgi.getLongitude(), adbu.a(j2), aarj, null, aclv.a(this.d, cgi.getLatitude(), cgi.getLongitude()), aclv.a(this.c, cgi.getLatitude(), cgi.getLongitude()));
                }
            }
        }
    }
}
