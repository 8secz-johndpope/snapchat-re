package com.snap.scan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.scan.lenses.LensStudioPairingHttpInterface;
import com.snap.scan.lenses.LensStudioUnpairingHttpInterface;
import com.snap.scan.lenses.RemoveLensHttpInterface;
import com.snap.scan.lenses.UnlockLensHttpInterface;
import com.snap.scan.ui.view.CardsView;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achq;
import defpackage.acih;
import defpackage.aecr;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajxw;
import defpackage.akcr;
import defpackage.akqq;
import defpackage.cjj;
import defpackage.fip;
import defpackage.gvl;
import defpackage.iqs;
import defpackage.iqt;
import defpackage.isj;
import defpackage.ith;
import defpackage.kgv;
import defpackage.kkv;
import defpackage.tnj;
import defpackage.vow;
import defpackage.voz;
import defpackage.vpb;
import defpackage.vpb.e;
import defpackage.vpc;
import defpackage.vpd;
import defpackage.vpe;
import defpackage.vpg;
import defpackage.vrm;
import defpackage.vso;
import defpackage.vso.b;
import defpackage.vso.c;
import defpackage.vso.d;
import defpackage.vvo;
import defpackage.vwl;
import defpackage.vwn;
import defpackage.vwo;
import defpackage.vwv;
import defpackage.vww;
import defpackage.wyv;
import defpackage.zfw;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zlx;
import defpackage.zmh;
import defpackage.zms;
import defpackage.zpo;
import defpackage.zpq.a;
import org.greenrobot.eventbus.ThreadMode;

public class ScanCardFragmentImpl extends ScanCardFragment {
    private final Predicate<Void> A = -$$Lambda$ScanCardFragmentImpl$mQCMiMlEKNaOK-PYKCogXXZ8IMk.INSTANCE;
    private final achq<zjm> B;
    private View C;
    private CardsView D;
    private View E;
    private vpb F;
    public vpe a;
    public iqs b;
    public aipn<vww> c;
    public fip d;
    public UnlockLensHttpInterface e;
    public LensStudioPairingHttpInterface f;
    public LensStudioUnpairingHttpInterface g;
    public RemoveLensHttpInterface h;
    public zpo i;
    public a j;
    public vpd k;
    public voz l;
    public cjj m;
    public achb<zjm, zjk> n;
    public wyv o;
    public gvl p;
    public kkv q;
    public kgv r;
    public vpc s;
    public vrm t;
    public vwv u;
    public tnj v;
    private final zfw w;
    private final ajei x;
    private final ajws<vso> y;
    private final zkf z;

    public ScanCardFragmentImpl() {
        String str = "ScanCardFragmentImpl";
        this.B = new achq(vpg.a, null, this.A, str);
        this.w = new zfw(vpg.e.callsite(str));
        this.x = new ajei();
        this.z = new zkf();
        this.y = new ajwo();
    }

    private void c(acih acih) {
        if (acih instanceof vpb) {
            this.F = (vpb) acih;
            this.a.a(this.F);
        }
    }

    private /* synthetic */ void d(vso vso) {
        super.o_();
    }

    private void h() {
        this.C.setVisibility(0);
        this.C.setAlpha(MapboxConstants.MINIMUM_ZOOM);
    }

    private void i() {
        this.D.invalidateItemDecorations();
        this.E.animate().alpha(MapboxConstants.MINIMUM_ZOOM).start();
        this.C.animate().alpha(1.0f).start();
    }

    private void j() {
        this.y.a((Object) c.a);
    }

    private /* synthetic */ ajxw k() {
        j();
        return ajxw.a;
    }

    public final long S_() {
        return 120000;
    }

    public final void a(acih acih) {
        acih acih2 = acih;
        c(acih);
        CardsView cardsView = this.D;
        -$$Lambda$ScanCardFragmentImpl$5NdKYSaPIeZ3d5edqYv5Ir2Pxdo -__lambda_scancardfragmentimpl_5ndkysapiez3d5edqyv5ir2pxdo = new -$$Lambda$ScanCardFragmentImpl$5NdKYSaPIeZ3d5edqYv5Ir2Pxdo(this);
        akcr.b(-__lambda_scancardfragmentimpl_5ndkysapiez3d5edqyv5ir2pxdo, "listener");
        cardsView.a = -__lambda_scancardfragmentimpl_5ndkysapiez3d5edqyv5ir2pxdo;
        ajei ajei = this.x;
        r3 = new ajej[2];
        zkf zkf = this.z;
        r3[0] = zkf;
        r3[1] = zkf.a(this);
        ajei.a(r3);
        zke zke = this.z.b;
        zfw zfw = this.w;
        UnlockLensHttpInterface unlockLensHttpInterface = this.e;
        LensStudioPairingHttpInterface lensStudioPairingHttpInterface = this.f;
        LensStudioUnpairingHttpInterface lensStudioUnpairingHttpInterface = this.g;
        RemoveLensHttpInterface removeLensHttpInterface = this.h;
        ajws ajws = this.y;
        ajws.getClass();
        -$$Lambda$Q5mt1cNYUcF0T9zLnSuvMNT9L70 -__lambda_q5mt1cnyucf0t9zlnsuvmnt9l70 = r4;
        -$$Lambda$Q5mt1cNYUcF0T9zLnSuvMNT9L70 -__lambda_q5mt1cnyucf0t9zlnsuvmnt9l702 = new -$$Lambda$Q5mt1cNYUcF0T9zLnSuvMNT9L70(ajws);
        zlx vvo = new vvo(zke, zfw, unlockLensHttpInterface, lensStudioPairingHttpInterface, lensStudioUnpairingHttpInterface, removeLensHttpInterface, -__lambda_q5mt1cnyucf0t9zlnsuvmnt9l70, this.d, this.i, this.j, this.k, this.l, this.m, this.o, this.q, this.r, this.s, this.v);
        zms zms = new zms(vvo, vwl.class);
        zms zms2 = zms;
        zmh zmh = new zmh(zms2, vvo.a(), this.w.b(), this.w.l(), ImmutableList.of(this.t.a(getContext(), this.F, this.a.a().d(new -$$Lambda$ScanCardFragmentImpl$KAwKO4_DzcEDTD-3n_APz5mTswE(this)).a((ajdw) this.w.f()).a(new vow(this.c)).e(this.y.b(d.class).p(new -$$Lambda$ScanCardFragmentImpl$KfCaFl8VPa6fapt-pxfnbe9Dz_M(this))))));
        this.D.setAdapter(zmh);
        this.x.a(zmh.e());
        this.x.a(this.y.a((ajfl) -$$Lambda$ScanCardFragmentImpl$QrgafALYVjaNqZyjvnudzgmyrk8.INSTANCE).f(new -$$Lambda$ScanCardFragmentImpl$tkc-IgCaBhrDNG2Bd8Rp1gr3sg4(this)));
        this.x.a(this.y.f((ajfb) new -$$Lambda$ScanCardFragmentImpl$dv2hwtekzcS_Yt1tsVtG0_A3NNg(this)));
        this.x.a(this.y.a((ajfl) -$$Lambda$ScanCardFragmentImpl$Iyl6rrlKyhYYeY7kZNBN46H8684.INSTANCE).f(new -$$Lambda$ScanCardFragmentImpl$wc1QFsajNZEGqt0HcHVtq1qrd6c(this)));
        if ((acih2 instanceof vpb.a) || (acih2 instanceof e)) {
            this.u.a();
        }
    }

    public final ajdp<vso> b() {
        return this.y;
    }

    public final void b(acih acih) {
        c(acih);
    }

    public final boolean o_() {
        this.y.a((Object) b.a);
        return super.o_();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        aipx.a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.scan_fragment, viewGroup, false);
        this.C = inflate.findViewById(R.id.cards_container);
        this.D = (CardsView) inflate.findViewById(R.id.all_cards);
        this.E = inflate.findViewById(R.id.empty_card_view);
        this.n.a(this.B);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.n.a(this.A);
    }

    public void onDetach() {
        super.onDetach();
        if (!this.y.o()) {
            this.y.a();
        }
        if (!this.x.isDisposed()) {
            this.x.a();
        }
        this.u.b();
    }

    @akqq(a = ThreadMode.MAIN)
    public void onScanCardAddFriendTapEvent(vwn vwn) {
        this.b.a(new isj(vwn.a, vwn.b, aecr.ADDED_BY_QR_CODE, null, iqt.SNAPCODE, ith.SCAN_SNAPCODE));
        this.y.a((Object) new vso.a(vwn.a, vwn.b));
        this.y.a((Object) b.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public void onScanCardDismissEvent(vwo vwo) {
        j();
    }

    public final void s_() {
        j();
    }
}
