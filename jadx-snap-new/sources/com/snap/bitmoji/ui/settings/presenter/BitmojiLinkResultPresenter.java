package com.snap.bitmoji.ui.settings.presenter;

import android.content.Context;
import android.net.Uri;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.abkq;
import defpackage.afnd;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.ddg;
import defpackage.ddq;
import defpackage.dds;
import defpackage.dhl;
import defpackage.gpb;
import defpackage.j;
import defpackage.jwl;
import defpackage.jwv;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import defpackage.zln;
import java.util.concurrent.atomic.AtomicBoolean;

public final class BitmojiLinkResultPresenter extends zll<dhl> implements k {
    LoadingSpinnerView a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final zfw c = zgb.a(ddg.l, "BitmojiLinkResultPresenter");
    private SnapImageView d;
    private final Context e;
    private final gpb f;

    public static final class a implements defpackage.jxj.a {
        private /* synthetic */ SnapImageView a;
        private /* synthetic */ BitmojiLinkResultPresenter b;

        a(SnapImageView snapImageView, BitmojiLinkResultPresenter bitmojiLinkResultPresenter) {
            this.a = snapImageView;
            this.b = bitmojiLinkResultPresenter;
        }

        public final void onFailure(jwl jwl) {
            akcr.b(jwl, "failureReason");
            SnapImageView a = BitmojiLinkResultPresenter.a(this.b);
            Object context = this.a.getContext();
            akcr.a(context, "context");
            a.setImageDrawable(context.getResources().getDrawable(R.drawable.bitmoji_teaser));
        }

        public final void onImageReady(jwv jwv) {
            akcr.b(jwv, "metrics");
            LoadingSpinnerView loadingSpinnerView = this.b.a;
            if (loadingSpinnerView == null) {
                akcr.a("bitmojiImageLoadingSpinnerView");
            }
            loadingSpinnerView.setVisibility(8);
            BitmojiLinkResultPresenter.a(this.b).setVisibility(0);
        }
    }

    static final class b<T> implements ajfb<abkq> {
        private /* synthetic */ BitmojiLinkResultPresenter a;
        private /* synthetic */ String b;

        b(BitmojiLinkResultPresenter bitmojiLinkResultPresenter, String str) {
            this.a = bitmojiLinkResultPresenter;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Uri a;
            String str = ((abkq) obj).f;
            if (str != null) {
                String str2 = this.b;
                if (str2 == null) {
                    str2 = ddq.a();
                }
                a = dds.a(str, str2, afnd.PROFILE, false, 2, 8);
            } else {
                a = null;
            }
            if (a != null) {
                BitmojiLinkResultPresenter.a(this.a).setImageUri(a, ddg.l.getPage());
            }
        }
    }

    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public BitmojiLinkResultPresenter(Context context, gpb gpb, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(gpb, "userAuthStore");
        akcr.b(zgb, "schedulersProvider");
        this.e = context;
        this.f = gpb;
    }

    /* renamed from: a */
    public final void takeTarget(dhl dhl) {
        akcr.b(dhl, "target");
        super.takeTarget(dhl);
        dhl.getLifecycle().a(this);
    }

    public final void dropTarget() {
        dhl dhl = (dhl) getTarget();
        if (dhl != null) {
            j lifecycle = dhl.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        if (this.b.compareAndSet(false, true)) {
            Object obj = (dhl) getTarget();
            if (obj != null) {
                akcr.a(obj, "it");
                String c = obj.c();
                this.a = obj.a();
                SnapImageView b = obj.b();
                b.setRequestListener(new a(b, this));
                this.d = b;
                b = this.d;
                String str = "bitmojiImageView";
                if (b == null) {
                    akcr.a(str);
                }
                b.setImageDrawable(this.e.getResources().getDrawable(R.drawable.bitmoji_teaser));
                LoadingSpinnerView loadingSpinnerView = this.a;
                if (loadingSpinnerView == null) {
                    akcr.a("bitmojiImageLoadingSpinnerView");
                }
                loadingSpinnerView.setVisibility(8);
                b = this.d;
                if (b == null) {
                    akcr.a(str);
                }
                b.setVisibility(0);
                zln.bindTo$default(this, this.f.c().e().b((ajdw) this.c.g()).a((ajdw) this.c.l()).a((ajfb) new b(this, c), (ajfb) c.a), this, null, null, 6, null);
            }
        }
    }
}
