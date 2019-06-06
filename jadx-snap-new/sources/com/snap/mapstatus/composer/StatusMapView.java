package com.snap.mapstatus.composer;

import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import defpackage.ackm;
import defpackage.acmj;
import defpackage.acpv;
import defpackage.adbn;
import defpackage.akcr;
import defpackage.nct;
import defpackage.niw;
import defpackage.odi;
import defpackage.odi.a;

@Keep
public final class StatusMapView extends FrameLayout {
    public odi statusCreationMapController;

    public StatusMapView(Context context) {
        akcr.b(context, "context");
        super(context);
    }

    public final odi getStatusCreationMapController() {
        odi odi = this.statusCreationMapController;
        if (odi == null) {
            akcr.a("statusCreationMapController");
        }
        return odi;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        odi odi = this.statusCreationMapController;
        if (odi == null) {
            akcr.a("statusCreationMapController");
        }
        ViewGroup viewGroup = this;
        akcr.b(viewGroup, "viewGroup");
        Object b = odi.b.b();
        String str = "standaloneSnapMapHost.snapMap";
        akcr.a(b, str);
        b = b.j();
        akcr.a(b, "standaloneSnapMapHost.snapMap.viewHost");
        b = b.p();
        akcr.a(b, "standaloneSnapMapHost.snapMap.viewHost.viewFactory");
        b = b.c(viewGroup.getContext());
        akcr.a(b, "factory.newMapTextureVie…(viewGroup.context, true)");
        Object a = b.a();
        String str2 = "holder.mapView";
        akcr.a(a, str2);
        a.setLayoutParams(new LayoutParams(-1, -1));
        a = b.a();
        akcr.a(a, str2);
        odi.b.g();
        odi.b.a(b, null);
        b = odi.b.b();
        akcr.a(b, str);
        b.s().a();
        b = odi.b.b();
        akcr.a(b, str);
        ackm e = b.e();
        if (e != null) {
            e.a(false);
        }
        odi.b.a(true);
        viewGroup.addView((View) a);
        odi.b.c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        odi odi = this.statusCreationMapController;
        if (odi == null) {
            akcr.a("statusCreationMapController");
        }
        odi.b.e();
    }

    public final void resetStatusId() {
    }

    public final void setStatusCreationMapController(odi odi) {
        akcr.b(odi, "<set-?>");
        this.statusCreationMapController = odi;
    }

    public final void setStatusId(String str, acpv acpv, niw niw, nct nct) {
        String str2 = "statusId";
        akcr.b(str, str2);
        String str3 = "exploreDataSource";
        akcr.b(acpv, str3);
        String str4 = "mapUserDataProvider";
        akcr.b(niw, str4);
        String str5 = "userLocationManager";
        akcr.b(nct, str5);
        odi odi = this.statusCreationMapController;
        if (odi == null) {
            akcr.a("statusCreationMapController");
        }
        akcr.b(str, str2);
        akcr.b(acpv, str3);
        akcr.b(niw, str4);
        akcr.b(nct, str5);
        Object b = odi.b.b();
        str3 = "standaloneSnapMapHost.snapMap";
        akcr.a(b, str3);
        b = b.j();
        akcr.a(b, "standaloneSnapMapHost.snapMap.viewHost");
        acmj j = b.j();
        if (j != null) {
            odi.a(odi.b, acpv, str, j, niw, nct);
            return;
        }
        odi.a = new a(odi, acpv, str, niw, nct);
        adbn adbn = odi.a;
        if (adbn != null) {
            Object b2 = odi.b.b();
            akcr.a(b2, str3);
            b2.j().a(adbn);
        }
    }
}
