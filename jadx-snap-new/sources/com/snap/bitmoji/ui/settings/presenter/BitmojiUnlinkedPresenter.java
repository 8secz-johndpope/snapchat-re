package com.snap.bitmoji.ui.settings.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snap.bitmoji.ui.settings.view.CreateBitmojiButton;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.achb;
import defpackage.achd;
import defpackage.aedh;
import defpackage.aeeh;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.ddd;
import defpackage.ddg;
import defpackage.ddt;
import defpackage.dfp;
import defpackage.dhk;
import defpackage.dhp;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkq;
import defpackage.zll;
import defpackage.zln;
import java.util.concurrent.atomic.AtomicBoolean;

public class BitmojiUnlinkedPresenter extends zll<dhp> implements k {
    final zfw a = zgb.a(ddg.l, "BitmojiUnlinkedPresenter");
    final ajei b = new ajei();
    CreateBitmojiButton c;
    final ddt d;
    final dfp e;
    final aipn<BitmojiFsnHttpInterface> f;
    final aipn<ddd> g;
    private final AtomicBoolean h = new AtomicBoolean();
    private final OnClickListener i = new a(this);
    private final Context j;
    private final aipn<achb<zjm, zjk>> k;
    private final zkq l;

    static final class a implements OnClickListener {
        private /* synthetic */ BitmojiUnlinkedPresenter a;

        a(BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter) {
            this.a = bitmojiUnlinkedPresenter;
        }

        public final void onClick(View view) {
            ajvv.a(this.a.e.b(aaua.SETTINGS, new akbk<ajxw>(this.a) {
                public final String getName() {
                    return "createBitmojiWithExternalApp";
                }

                public final akej getOwner() {
                    return akde.a(BitmojiUnlinkedPresenter.class);
                }

                public final String getSignature() {
                    return "createBitmojiWithExternalApp()V";
                }

                public final /* synthetic */ Object invoke() {
                    BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter = (BitmojiUnlinkedPresenter) this.receiver;
                    boolean a = bitmojiUnlinkedPresenter.d.a();
                    dhp dhp = (dhp) bitmojiUnlinkedPresenter.getTarget();
                    if (dhp != null) {
                        aaua b = dhp.b();
                        if (b != null) {
                            ((ddd) bitmojiUnlinkedPresenter.g.get()).b(b, a);
                        }
                    }
                    CreateBitmojiButton createBitmojiButton = bitmojiUnlinkedPresenter.c;
                    if (createBitmojiButton == null) {
                        akcr.a("createBitmojiButton");
                    }
                    createBitmojiButton.setState(1);
                    if (a) {
                        BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter2 = bitmojiUnlinkedPresenter;
                        akcr.a(zln.bindTo$default(bitmojiUnlinkedPresenter, ((BitmojiFsnHttpInterface) bitmojiUnlinkedPresenter.f.get()).getBitmojiRequestToken(new aedh()).b((ajdw) bitmojiUnlinkedPresenter.a.g()).d((ajfb) b.a).a((ajdw) bitmojiUnlinkedPresenter.a.l()).a((ajfb) new dhk(new c(bitmojiUnlinkedPresenter2)), (ajfb) new dhk(new d(bitmojiUnlinkedPresenter2))), bitmojiUnlinkedPresenter, null, null, 6, null), "bitmojiFsnHttpInterface.…            .bindTo(this)");
                    } else {
                        bitmojiUnlinkedPresenter.d.b();
                    }
                    return ajxw.a;
                }
            }), this.a.b);
        }
    }

    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c extends akcq implements akbl<aeeh, ajxw> {
        c(BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter) {
            super(1, bitmojiUnlinkedPresenter);
        }

        public final String getName() {
            return "onBitmojiRequestTokenSuccess";
        }

        public final akej getOwner() {
            return akde.a(BitmojiUnlinkedPresenter.class);
        }

        public final String getSignature() {
            return "onBitmojiRequestTokenSuccess(Lcom/snapchat/soju/android/BitmojiRequestTokenResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aeeh aeeh = (aeeh) obj;
            akcr.b(aeeh, "p1");
            BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter = (BitmojiUnlinkedPresenter) this.receiver;
            if (TextUtils.isEmpty(aeeh.a)) {
                bitmojiUnlinkedPresenter.a();
            }
            CreateBitmojiButton createBitmojiButton = bitmojiUnlinkedPresenter.c;
            if (createBitmojiButton == null) {
                akcr.a("createBitmojiButton");
            }
            createBitmojiButton.setState(0);
            ddt ddt = bitmojiUnlinkedPresenter.d;
            defpackage.ddt.a aVar = defpackage.ddt.a.AUTH;
            String str = aeeh.a;
            akcr.a((Object) str, "response.bitmojiRequestToken");
            ddt.a(aVar, str, aaua.SETTINGS);
            return ajxw.a;
        }
    }

    static final class d extends akcq implements akbl<Throwable, ajxw> {
        d(BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter) {
            super(1, bitmojiUnlinkedPresenter);
        }

        public final String getName() {
            return "onBitmojiRequestTokenFailure";
        }

        public final akej getOwner() {
            return akde.a(BitmojiUnlinkedPresenter.class);
        }

        public final String getSignature() {
            return "onBitmojiRequestTokenFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((BitmojiUnlinkedPresenter) this.receiver).a();
            return ajxw.a;
        }
    }

    public BitmojiUnlinkedPresenter(Context context, ddt ddt, dfp dfp, aipn<BitmojiFsnHttpInterface> aipn, zgb zgb, aipn<achb<zjm, zjk>> aipn2, zkq zkq, aipn<ddd> aipn3) {
        akcr.b(context, "context");
        akcr.b(ddt, "bitmojiUtils");
        akcr.b(dfp, "avatarBuilderGateway");
        akcr.b(aipn, "bitmojiFsnHttpInterface");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn2, "navigationHost");
        akcr.b(zkq, "insetsDetector");
        akcr.b(aipn3, "bitmojiEventsAnalytics");
        this.j = context;
        this.d = ddt;
        this.e = dfp;
        this.f = aipn;
        this.k = aipn2;
        this.l = zkq;
        this.g = aipn3;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        CreateBitmojiButton createBitmojiButton = this.c;
        if (createBitmojiButton == null) {
            akcr.a("createBitmojiButton");
        }
        createBitmojiButton.setState(0);
        zjm zjm = new zjm(ddg.l, "bitmoji_request_token_failure_dialog", false, false, true, false, null, false, false, false, false, null, 4076);
        achb achb = (achb) this.k.get();
        Context context = this.j;
        akcr.a((Object) achb, "it");
        zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.bitmoji_please_try_again), null, false, null, null, null, 31).a();
        achb.a((achd) a, a.a, null);
    }

    /* renamed from: a */
    public final void takeTarget(dhp dhp) {
        akcr.b(dhp, "target");
        super.takeTarget(dhp);
        dhp.getLifecycle().a(this);
    }

    public void dropTarget() {
        dhp dhp = (dhp) getTarget();
        if (dhp != null) {
            j lifecycle = dhp.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onFragmentDestroy() {
        this.b.dispose();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        dhp dhp = (dhp) getTarget();
        if (dhp != null) {
            aaua b = dhp.b();
            if (b != null) {
                ((ddd) this.g.get()).a(b, false);
                ((ddd) this.g.get()).a(b);
            }
        }
        if (this.h.compareAndSet(false, true)) {
            dhp = (dhp) getTarget();
            if (dhp != null) {
                CreateBitmojiButton a = dhp.a();
                a.setState(0);
                a.setOnClickListener(this.i);
                this.c = a;
            }
        }
    }
}
