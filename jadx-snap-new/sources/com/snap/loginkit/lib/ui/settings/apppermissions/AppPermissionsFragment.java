package com.snap.loginkit.lib.ui.settings.apppermissions;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.absi;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.nif;

public final class AppPermissionsFragment extends MainPageFragment implements nif {
    public AppPermissionsPresenter a;

    public final Bundle b() {
        return getArguments();
    }

    public final Context c() {
        return getActivity();
    }

    public final View d() {
        return getView();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        AppPermissionsPresenter appPermissionsPresenter = this.a;
        if (appPermissionsPresenter == null) {
            akcr.a("presenter");
        }
        appPermissionsPresenter.takeTarget((nif) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.login_kit_connected_app_permissions_layout, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.navbar_inset);
        if (findViewById != null) {
            Object a = absi.a();
            akcr.a(a, "SoftNavBarDetector.getInstance()");
            findViewById.setLayoutParams(new LayoutParams(-1, a.d()));
        }
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        AppPermissionsPresenter appPermissionsPresenter = this.a;
        if (appPermissionsPresenter == null) {
            akcr.a("presenter");
        }
        appPermissionsPresenter.dropTarget();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
        r8 = this;
        r0 = "view";
        defpackage.akcr.b(r9, r0);
        super.onViewCreated(r9, r10);
        r1 = r8.a;
        if (r1 != 0) goto L_0x0011;
    L_0x000c:
        r9 = "presenter";
        defpackage.akcr.a(r9);
    L_0x0011:
        r9 = r1.getTarget();
        r9 = (defpackage.nif) r9;
        if (r9 == 0) goto L_0x027f;
    L_0x0019:
        r9 = r9.b();
        if (r9 != 0) goto L_0x0021;
    L_0x001f:
        goto L_0x027f;
    L_0x0021:
        r10 = "icon";
        r10 = r9.getString(r10);
        r0 = 0;
        if (r10 == 0) goto L_0x007b;
    L_0x002a:
        r2 = r1.getTarget();
        r2 = (defpackage.nif) r2;
        if (r2 == 0) goto L_0x0042;
    L_0x0032:
        r2 = r2.d();
        if (r2 == 0) goto L_0x0042;
    L_0x0038:
        r3 = 2131430260; // 0x7f0b0b74 float:1.8482216E38 double:1.053066468E-314;
        r2 = r2.findViewById(r3);
        r2 = (com.snap.imageloading.view.SnapImageView) r2;
        goto L_0x0043;
    L_0x0042:
        r2 = r0;
    L_0x0043:
        r3 = r1.i;
        r3 = r3.getResources();
        r4 = 2131167726; // 0x7f0709ee float:1.7949734E38 double:1.052936759E-314;
        r3 = r3.getDimension(r4);
        if (r2 == 0) goto L_0x0067;
    L_0x0052:
        r4 = new jxj$b$a;
        r4.<init>();
        r3 = r4.a(r3);
        r3 = r3.b();
        r4 = "ViewBitmapLoader.Request…                 .build()";
        defpackage.akcr.a(r3, r4);
        r2.setRequestOptions(r3);
    L_0x0067:
        if (r2 == 0) goto L_0x007b;
    L_0x0069:
        r10 = android.net.Uri.parse(r10);
        r3 = "Uri.parse(iconUrl)";
        defpackage.akcr.a(r10, r3);
        r3 = defpackage.ngq.a;
        r3 = r3.d;
        r3 = r3.b;
        r2.setImageUri(r10, r3);
    L_0x007b:
        r10 = r1.getTarget();
        r10 = (defpackage.nif) r10;
        if (r10 == 0) goto L_0x009a;
    L_0x0083:
        r10 = r10.c();
        if (r10 == 0) goto L_0x009a;
    L_0x0089:
        r10 = r10.getResources();
        if (r10 == 0) goto L_0x009a;
    L_0x008f:
        r0 = 2131100175; // 0x7f06020f float:1.7812724E38 double:1.0529033843E-314;
        r10 = r10.getColor(r0);
        r0 = java.lang.Integer.valueOf(r10);
    L_0x009a:
        if (r0 != 0) goto L_0x009f;
    L_0x009c:
        defpackage.akcr.a();
    L_0x009f:
        r10 = r0.intValue();
        r0 = "iconBasedColor";
        r10 = r9.getInt(r0, r10);
        r10 = java.lang.Integer.valueOf(r10);
        if (r10 == 0) goto L_0x00e2;
    L_0x00af:
        r0 = 3;
        r0 = new float[r0];
        r10 = r10.intValue();
        android.graphics.Color.colorToHSV(r10, r0);
        r10 = 2;
        r2 = r0[r10];
        r3 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r2 = r2 * r3;
        r0[r10] = r2;
        r2 = r0[r10];
        r3 = 1059481190; // 0x3f266666 float:0.65 double:5.234532584E-315;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x00cd;
    L_0x00cb:
        r0[r10] = r3;
    L_0x00cd:
        r10 = r1.getTarget();
        r10 = (defpackage.nif) r10;
        if (r10 == 0) goto L_0x00e2;
    L_0x00d5:
        r10 = r10.d();
        if (r10 == 0) goto L_0x00e2;
    L_0x00db:
        r0 = android.graphics.Color.HSVToColor(r0);
        r10.setBackgroundColor(r0);
    L_0x00e2:
        r10 = r1.getTarget();
        r10 = (defpackage.nif) r10;
        if (r10 == 0) goto L_0x0106;
    L_0x00ea:
        r10 = r10.d();
        if (r10 == 0) goto L_0x0106;
    L_0x00f0:
        r0 = 2131430261; // 0x7f0b0b75 float:1.8482218E38 double:1.0530664685E-314;
        r10 = r10.findViewById(r0);
        r10 = (android.widget.TextView) r10;
        if (r10 == 0) goto L_0x0106;
    L_0x00fb:
        r0 = "name";
        r0 = r9.getString(r0);
        r0 = (java.lang.CharSequence) r0;
        r10.setText(r0);
    L_0x0106:
        r10 = r1.getTarget();
        r10 = (defpackage.nif) r10;
        if (r10 == 0) goto L_0x0131;
    L_0x010e:
        r10 = r10.d();
        if (r10 == 0) goto L_0x0131;
    L_0x0114:
        r0 = 2131430255; // 0x7f0b0b6f float:1.8482206E38 double:1.0530664655E-314;
        r10 = r10.findViewById(r0);
        if (r10 == 0) goto L_0x0131;
    L_0x011d:
        r0 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$m;
        r2 = r1;
        r2 = (com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter) r2;
        r0.<init>(r2);
        r0 = (defpackage.akbl) r0;
        r2 = new nie;
        r2.<init>(r0);
        r2 = (android.view.View.OnClickListener) r2;
        r10.setOnClickListener(r2);
    L_0x0131:
        r10 = "scopesApproved";
        r9 = r9.getParcelableArray(r10);
        if (r9 == 0) goto L_0x0277;
    L_0x0139:
        r9 = (defpackage.nib[]) r9;
        r1.b = r9;
        r9 = r1.b;
        r10 = "scopeArray";
        if (r9 != 0) goto L_0x0146;
    L_0x0143:
        defpackage.akcr.a(r10);
    L_0x0146:
        if (r9 == 0) goto L_0x0276;
    L_0x0148:
        r9 = r1.b;
        if (r9 != 0) goto L_0x014f;
    L_0x014c:
        defpackage.akcr.a(r10);
    L_0x014f:
        r9 = r9.length;
        r0 = 0;
        if (r9 != 0) goto L_0x0155;
    L_0x0153:
        r9 = 1;
        goto L_0x0156;
    L_0x0155:
        r9 = 0;
    L_0x0156:
        if (r9 == 0) goto L_0x015a;
    L_0x0158:
        goto L_0x0276;
    L_0x015a:
        r9 = r1.i;
        r9 = r9.getResources();
        r2 = 2131166826; // 0x7f07066a float:1.7947908E38 double:1.0529363143E-314;
        r9 = r9.getDimensionPixelSize(r2);
        r2 = new jxa$a;
        r2.<init>();
        r9 = r2.a(r9, r9);
        r9 = r9.b();
        r2 = "RequestOptions.Builder()…e, scopeIconSize).build()";
        defpackage.akcr.a(r9, r2);
        r2 = r1.b;
        if (r2 != 0) goto L_0x0180;
    L_0x017d:
        defpackage.akcr.a(r10);
    L_0x0180:
        r10 = new java.util.ArrayList;
        r3 = r2.length;
        r10.<init>(r3);
        r10 = (java.util.Collection) r10;
        r3 = r2.length;
    L_0x0189:
        if (r0 >= r3) goto L_0x01e1;
    L_0x018b:
        r4 = r2[r0];
        r5 = r4.a();
        r5 = r5.d;
        r5 = android.net.Uri.parse(r5);
        r6 = r1.e;
        r6 = r6.b();
        r6 = (defpackage.jwc) r6;
        r7 = defpackage.ngn.a();
        r6 = r6.a(r5, r7, r9);
        r7 = r1.a;
        r7 = r7.g();
        r7 = (defpackage.ajdw) r7;
        r6 = r6.b(r7);
        r7 = r1.a;
        r7 = r7.l();
        r7 = (defpackage.zfr) r7;
        r7 = (defpackage.ajdw) r7;
        r6 = r6.a(r7);
        r7 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$h;
        r7.<init>(r4, r1, r9);
        r7 = (defpackage.ajfb) r7;
        r4 = r6.a(r7);
        r6 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$l;
        r6.<init>(r5);
        r6 = (defpackage.ajfb) r6;
        r4 = r4.d(r6);
        r4 = r4.e();
        r10.add(r4);
        r0 = r0 + 1;
        goto L_0x0189;
    L_0x01e1:
        r10 = (java.util.List) r10;
        r10 = (java.util.Collection) r10;
        r9 = defpackage.ajyu.h(r10);
        r10 = r1.h;
        r10 = r10.a();
        if (r10 == 0) goto L_0x0246;
    L_0x01f1:
        r2 = defpackage.iek.a(r10);
        if (r2 == 0) goto L_0x0246;
    L_0x01f7:
        r4 = defpackage.afnd.SNAP_KIT;
        r5 = 0;
        r6 = 0;
        r7 = 24;
        r3 = "6972338";
        r10 = defpackage.dds.a(r2, r3, r4, r5, r6, r7);
        r10 = defpackage.ajdx.b(r10);
        r0 = r1.a;
        r0 = r0.f();
        r0 = (defpackage.ajdw) r0;
        r10 = r10.b(r0);
        r0 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$f;
        r0.<init>(r1, r9);
        r0 = (defpackage.ajfc) r0;
        r10 = r10.f(r0);
        r0 = r1.a;
        r0 = r0.l();
        r0 = (defpackage.zfr) r0;
        r0 = (defpackage.ajdw) r0;
        r10 = r10.a(r0);
        r0 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$g;
        r0.<init>(r1, r9);
        r0 = (defpackage.ajfb) r0;
        r10 = r10.a(r0);
        r0 = com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter.i.a;
        r0 = (defpackage.ajfb) r0;
        r10 = r10.d(r0);
        r10 = r10.e();
        r9.add(r10);
    L_0x0246:
        r9 = (java.lang.Iterable) r9;
        r9 = defpackage.ajcx.b(r9);
        r10 = r1.a;
        r10 = r10.l();
        r10 = (defpackage.zfr) r10;
        r10 = (defpackage.ajdw) r10;
        r9 = r9.a(r10);
        r10 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$j;
        r10.<init>(r1);
        r10 = (defpackage.ajev) r10;
        r0 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsPresenter$k;
        r0.<init>(r1);
        r0 = (defpackage.ajfb) r0;
        r2 = r9.a(r10, r0);
        r3 = r1;
        r3 = (defpackage.zln) r3;
        r4 = 0;
        r5 = 0;
        r6 = 6;
        r7 = 0;
        defpackage.zln.bindTo$default(r1, r2, r3, r4, r5, r6, r7);
    L_0x0276:
        return;
    L_0x0277:
        r9 = new ajxt;
        r10 = "null cannot be cast to non-null type kotlin.Array<com.snap.loginkit.lib.ui.scopes.LoginKitScopeItem>";
        r9.<init>(r10);
        throw r9;
    L_0x027f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
