package com.snap.spectacles.lib.fragments;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.imageloading.view.SnapImageView;
import com.snap.spectacles.api.SpectaclesFragment;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter;
import com.snap.spectacles.sharedui.FadeAnimationTextSwitcher;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abpz;
import defpackage.abqi;
import defpackage.abtp;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.acig;
import defpackage.acio;
import defpackage.acis;
import defpackage.ajcx;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajhn;
import defpackage.ajsn;
import defpackage.ajvo;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akdy;
import defpackage.aken;
import defpackage.akfr;
import defpackage.akgb;
import defpackage.akgc;
import defpackage.jwc;
import defpackage.jwe;
import defpackage.jwj;
import defpackage.jwl;
import defpackage.jwv;
import defpackage.kaz;
import defpackage.xai;
import defpackage.xbd;
import defpackage.xcl;
import defpackage.xdb;
import defpackage.xlh;
import defpackage.xll;
import defpackage.xlm;
import defpackage.xmk;
import defpackage.xnc;
import defpackage.xpw;
import defpackage.xqd;
import defpackage.xsb;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import net.sqlcipher.database.SQLiteDatabase;

public final class SpectaclesPairFragment extends SpectaclesFragment implements defpackage.l, xmk {
    static final Uri n = Uri.parse("market://details?id=com.snapchat.android");
    public static final zjm o = new zjm(xai.f, "SpectaclesPair", false, false, false, false, null, false, false, false, false, null, 4092);
    public static final acgu<zjm> p;
    public static final acgu<zjm> q;
    private final ajxe A = ajxh.a(new r(this));
    private ajej B;
    private final ajxe C = ajxh.a(new g(this));
    public achb<zjm, zjk> a;
    public SpectaclesPairPresenter b;
    public ajwy<xbd> e;
    public xpw f;
    public zkf g;
    public zgb h;
    public jwe i;
    TextView j;
    final ajxe k = ajxh.a(new c(this));
    AnimationDrawable l;
    AnimationDrawable m;
    private Button r;
    private FadeAnimationTextSwitcher s;
    private FadeAnimationTextSwitcher t;
    private SnapImageView u;
    private SnapImageView v;
    private EditText w;
    private SnapFontTextView x;
    private SnapImageView y;
    private SnapImageView z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class aa implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        aa(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            if (this.a.isAdded()) {
                this.a.h().a(true);
            }
        }
    }

    static final class ab implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        ab(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            SpectaclesPairFragment spectaclesPairFragment = this.a;
            if (spectaclesPairFragment.isVisible()) {
                zjm zjm = new zjm(xai.f, "spectacles_confirm_disable_location", false, false, true, false, null, false, false, false, false, null, 4076);
                Context context = spectaclesPairFragment.getContext();
                achb achb = spectaclesPairFragment.a;
                String str = "navigationHost";
                if (achb == null) {
                    akcr.a(str);
                }
                zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a("Confirm Disable Location").a((int) R.string.okay, (akbl) new u(spectaclesPairFragment), true), (akbl) v.a, true, Integer.valueOf(R.string.cancel), null, null, 24).a();
                achb achb2 = spectaclesPairFragment.a;
                if (achb2 == null) {
                    akcr.a(str);
                }
                achb2.a((achd) a, a.a, null);
            }
        }
    }

    public static final class ae extends ClickableSpan {
        private /* synthetic */ SpectaclesPairFragment a;

        ae(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            akcr.b(view, "textView");
            com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f fVar = this.a.h().o;
            SpectaclesPairPresenter.this.b(fVar, new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f.l(fVar));
            SpectaclesPairFragment.a(this.a);
        }

        public final void updateDrawState(TextPaint textPaint) {
            akcr.b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    static final class ah implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        ah(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            if (this.a.isAdded()) {
                CharSequence obj = SpectaclesPairFragment.c(this.a).getText().toString();
                int length = obj.length() - 1;
                int i = 0;
                Object obj2 = null;
                while (i <= length) {
                    Object obj3 = obj.charAt(obj2 == null ? i : length) <= ' ' ? 1 : null;
                    if (obj2 != null) {
                        if (obj3 == null) {
                            break;
                        }
                        length--;
                    } else if (obj3 == null) {
                        obj2 = 1;
                    } else {
                        i++;
                    }
                }
                String obj4 = obj.subSequence(i, length + 1).toString();
                SpectaclesPairPresenter h = this.a.h();
                akcr.b(obj4, "nameCandidate");
                h.p.a(ajcx.b((Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.ad(h, obj4)).b((ajdw) h.e.b()).e());
            }
        }
    }

    static final class ai implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        ai(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            SpectaclesPairFragment.d(this.a);
        }
    }

    static final class aj implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        aj(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            this.a.h().h();
        }
    }

    public static final class ak implements TextWatcher {
        private String a;
        private /* synthetic */ SpectaclesPairFragment b;
        private /* synthetic */ String c;

        ak(SpectaclesPairFragment spectaclesPairFragment, String str) {
            this.b = spectaclesPairFragment;
            this.c = str;
        }

        public final void afterTextChanged(Editable editable) {
            akcr.b(editable, "editable");
            String obj = editable.toString();
            CharSequence charSequence = obj;
            if (!TextUtils.equals(this.a, charSequence)) {
                this.a = null;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.c);
                stringBuilder.append(' ');
                String stringBuilder2 = stringBuilder.toString();
                boolean z = false;
                if (!TextUtils.isEmpty(charSequence) && akgb.b(obj, stringBuilder2, false)) {
                    z = true;
                }
                obj = new akfr(stringBuilder2).b(charSequence, "");
                if (z) {
                    this.b.i();
                    if (xpw.a(obj)) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(stringBuilder2);
                        this.b.i();
                        stringBuilder3.append(xpw.a(obj, 25));
                        this.a = stringBuilder3.toString();
                        SpectaclesPairFragment.c(this.b).setText(this.a);
                        Selection.setSelection(SpectaclesPairFragment.c(this.b).getText(), SpectaclesPairFragment.c(this.b).getText().length());
                    }
                    return;
                }
                this.a = stringBuilder2;
                SpectaclesPairFragment.c(this.b).setText(this.a);
                Selection.setSelection(SpectaclesPairFragment.c(this.b).getText(), SpectaclesPairFragment.c(this.b).getText().length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            akcr.b(charSequence, "charSequence");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            akcr.b(charSequence, "charSequence");
        }
    }

    public static final class al extends ClickableSpan {
        private /* synthetic */ SpectaclesPairFragment a;

        al(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            akcr.b(view, "textView");
            SpectaclesPairFragment.d(this.a);
        }

        public final void updateDrawState(TextPaint textPaint) {
            akcr.b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    static final class as implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        as(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            this.a.h().h();
        }
    }

    public enum b {
        SETTINGS_ADD_SPEC,
        SETTINGS_REPAIR_DIALOG,
        SETTINGS_REPAIR_FROM_ICON
    }

    static final class h implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        h(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            this.a.h().h();
        }
    }

    static final class i implements OnClickListener {
        private /* synthetic */ SpectaclesPairFragment a;

        i(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onClick(View view) {
            com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f fVar = this.a.h().o;
            SpectaclesPairPresenter.this.b(fVar, new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f.h(fVar));
            SpectaclesPairFragment.a(this.a);
        }
    }

    static final class at implements ajev {
        private /* synthetic */ SpectaclesPairFragment a;

        at(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void run() {
            TextView textView = this.a.j;
            if (textView == null) {
                akcr.a("needHelpView");
            }
            textView.setVisibility(0);
        }
    }

    static final class f<T, R> implements ajfc<Throwable, ajeb<? extends kaz<jwj>>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "e");
            return ajvo.a(ajsn.a);
        }
    }

    public static final class j implements defpackage.jxj.a {
        private /* synthetic */ SpectaclesPairFragment a;

        j(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final void onFailure(jwl jwl) {
            akcr.b(jwl, "failureReason");
            SpectaclesPairFragment.b(this.a).setVisibility(8);
        }

        public final void onImageReady(jwv jwv) {
            akcr.b(jwv, "metrics");
            SpectaclesPairFragment.b(this.a).setVisibility(0);
        }
    }

    static final class k<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ SpectaclesPairFragment a;
        private /* synthetic */ defpackage.xqd.a b;
        private /* synthetic */ boolean c;
        private /* synthetic */ ajei d;

        k(SpectaclesPairFragment spectaclesPairFragment, defpackage.xqd.a aVar, boolean z, ajei ajei) {
            this.a = spectaclesPairFragment;
            this.b = aVar;
            this.c = z;
            this.d = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, Event.INDEX);
            SpectaclesPairFragment spectaclesPairFragment = this.a;
            obj = ((jwc) spectaclesPairFragment.k.b()).a(xqd.a(this.b, num.intValue(), this.c), xai.a.d.b, new defpackage.jxa.a().a(this.d).b()).h(f.a);
            akcr.a(obj, "bitmapLoader.loadBitmap(…never()\n                }");
            return obj.i();
        }
    }

    static final class l<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ SpectaclesPairFragment a;
        private /* synthetic */ AnimationDrawable b;
        private /* synthetic */ int c;

        l(SpectaclesPairFragment spectaclesPairFragment, AnimationDrawable animationDrawable, int i) {
            this.a = spectaclesPairFragment;
            this.b = animationDrawable;
            this.c = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (kaz) obj;
            SpectaclesPairFragment spectaclesPairFragment = this.a;
            AnimationDrawable animationDrawable = this.b;
            akcr.a(obj, "it");
            int i = this.c;
            obj = obj.a();
            akcr.a(obj, "refCountDisposableBitmap.get()");
            obj = ((jwj) obj).a();
            akcr.a(obj, "disposableBitmap.underlyingBitmap");
            animationDrawable.addFrame(new BitmapDrawable(spectaclesPairFragment.getContext().getResources(), obj), i);
        }
    }

    static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ AnimationDrawable a;

        m(AnimationDrawable animationDrawable) {
            this.a = animationDrawable;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((List) obj, "it");
            return ajdx.b(this.a);
        }
    }

    static final class n<T> implements ajfb<AnimationDrawable> {
        private /* synthetic */ SpectaclesPairFragment a;

        n(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            AnimationDrawable animationDrawable = (AnimationDrawable) obj;
            SpectaclesPairFragment spectaclesPairFragment = this.a;
            spectaclesPairFragment.m = animationDrawable;
            if (spectaclesPairFragment.h().h == com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d.PAIRING_SUCCEEDED) {
                this.a.m();
            }
        }
    }

    static final class o<T, R> implements ajfc<Throwable, ajeb<? extends AnimationDrawable>> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajvo.a(ajsn.a);
        }
    }

    static final class p<T> implements ajfb<AnimationDrawable> {
        private /* synthetic */ SpectaclesPairFragment a;

        p(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            AnimationDrawable animationDrawable = (AnimationDrawable) obj;
            SpectaclesPairFragment spectaclesPairFragment = this.a;
            spectaclesPairFragment.l = animationDrawable;
            if (spectaclesPairFragment.h().h == com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d.SETTING_UP_BT_CLASSIC_CONNECTION || this.a.h().h == com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d.SETTING_UP_BLE_CONNECTION) {
                this.a.l();
            }
        }
    }

    static final class q<T, R> implements ajfc<Throwable, ajeb<? extends AnimationDrawable>> {
        public static final q a = new q();

        q() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajvo.a(ajsn.a);
        }
    }

    static final class ac extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        ac(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c = true;
            com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f fVar = this.a.h().o;
            SpectaclesPairPresenter.this.b(fVar, new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f.m(fVar));
            return ajxw.a;
        }
    }

    static final class ad extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        ad(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c();
            return ajxw.a;
        }
    }

    static final class af extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        af(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            Context context = this.a.getContext();
            this.a.a(false);
            SpectaclesPairFragment spectaclesPairFragment = this.a;
            achb achb = spectaclesPairFragment.a;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            xlm xlm = new xlm(context, achb, spectaclesPairFragment.b(), new xll(R.string.spectacles_pairing_incompatible_dialog_title, "https://support.spectacles.com/hc/articles/360000975386", true));
            achb achb2 = spectaclesPairFragment.a;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb2.a((achd) xlm, xlm.p, null);
            return ajxw.a;
        }
    }

    static final class ag extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        ag(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c();
            return ajxw.a;
        }
    }

    static final class am extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        am(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SpectaclesPairPresenter h = this.a.h();
            com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f fVar = h.o;
            SpectaclesPairPresenter.this.b(fVar, new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.f.i(fVar));
            h.d();
            if (h.t.l()) {
                h.b().h().a(defpackage.xed.a.LOW_LATENCY, 0);
            }
            h.o.a();
            return ajxw.a;
        }
    }

    static final class an extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        an(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c();
            return ajxw.a;
        }
    }

    static final class ao extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        ao(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SpectaclesPairFragment.a(this.a);
            return ajxw.a;
        }
    }

    static final class ap extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        ap(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c();
            return ajxw.a;
        }
    }

    static final class aq extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        aq(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c();
            return ajxw.a;
        }
    }

    static final class ar extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        ar(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SpectaclesPairPresenter h = this.a.h();
            com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d dVar = h.h;
            akcr.b(dVar, "pairingState");
            int i = xnc.c[dVar.ordinal()];
            if (i == 1) {
                h.f();
            } else if (i == 2) {
                h.g();
            } else if (i == 3) {
                h.n.a(ajvo.a(ajhn.a).b(com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.e.PAIRING_BT_CLASSIC_TIMEOUT.timeout, TimeUnit.SECONDS).a((ajdw) h.e.f()).b((ajev) new com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.al(h)).e());
            }
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbk<jwc> {
        private /* synthetic */ SpectaclesPairFragment a;

        c(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            jwe jwe = this.a.i;
            if (jwe == null) {
                akcr.a("bitmapLoaderFactory");
            }
            return jwe.a();
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        d(SpectaclesPairFragment spectaclesPairFragment, String str, String str2) {
            this.a = spectaclesPairFragment;
            this.b = str;
            this.c = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.b, this.c);
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        e(SpectaclesPairFragment spectaclesPairFragment, String str, String str2) {
            this.a = spectaclesPairFragment;
            this.b = str;
            this.c = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.b, this.c);
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbk<InputMethodManager> {
        private /* synthetic */ SpectaclesPairFragment a;

        g(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.getContext().getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    static final class r extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesPairFragment a;

        r(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.h == null) {
                akcr.a("schedulersProvider");
            }
            return zgb.a(xai.f.callsite("SpectaclesPairFragment"));
        }
    }

    static final class s extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        s(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(false);
            return ajxw.a;
        }
    }

    static final class t extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        t(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ajwy ajwy = this.a.e;
            if (ajwy == null) {
                akcr.a("specsCoreComponent");
            }
            ((xbd) ajwy.get()).h().a();
            this.a.a(false);
            return ajxw.a;
        }
    }

    static final class u extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        u(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().a(false);
            return ajxw.a;
        }
    }

    static final class v extends akcs implements akbl<View, ajxw> {
        public static final v a = new v();

        v() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        w(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            Context context = this.a.getContext();
            Intent intent = new Intent("android.intent.action.VIEW", SpectaclesPairFragment.n);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
            return ajxw.a;
        }
    }

    static final class x extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        x(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c();
            return ajxw.a;
        }
    }

    static final class y extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        y(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            xdb xdb = this.a.h().j;
            if (xdb != null) {
                xdb.a(xcl.BLE_NAME_ACTION_REQUIRED);
            }
            return ajxw.a;
        }
    }

    static final class z extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesPairFragment a;

        z(SpectaclesPairFragment spectaclesPairFragment) {
            this.a = spectaclesPairFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.h().c();
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesPairFragment.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(SpectaclesPairFragment.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(SpectaclesPairFragment.class), "keyboardManager", "getKeyboardManager()Landroid/view/inputmethod/InputMethodManager;")};
        a aVar = new a();
        acgu a = acgu.a(acis.b, (achg) o, true);
        p = a;
        q = a.j();
    }

    private final ajdx<AnimationDrawable> a(int i, int i2, defpackage.xqd.a aVar, ajei ajei, AnimationDrawable animationDrawable, boolean z) {
        Object a = ajdp.b((Iterable) new akdy(0, i)).a((ajfc) new k(this, aVar, z, ajei)).b((ajdw) v().f()).a((ajdw) v().b()).d((ajfb) new l(this, animationDrawable, i2)).a(16).a((ajfc) new m(animationDrawable));
        akcr.a(a, "Observable.fromIterable(…awable)\n                }");
        return a;
    }

    public static final /* synthetic */ SnapImageView b(SpectaclesPairFragment spectaclesPairFragment) {
        SnapImageView snapImageView = spectaclesPairFragment.v;
        if (snapImageView == null) {
            akcr.a("pressAndHoldImageView");
        }
        return snapImageView;
    }

    public static final /* synthetic */ EditText c(SpectaclesPairFragment spectaclesPairFragment) {
        EditText editText = spectaclesPairFragment.w;
        if (editText == null) {
            akcr.a("nameDeviceEditText");
        }
        return editText;
    }

    public static final /* synthetic */ void d(SpectaclesPairFragment spectaclesPairFragment) {
        Context context = spectaclesPairFragment.getContext();
        achb achb = spectaclesPairFragment.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        xlm xlm = new xlm(context, achb, spectaclesPairFragment.b(), new xll(R.string.laguna_product_sales_terms, "https://www.spectacles.com/terms/", false));
        achb achb2 = spectaclesPairFragment.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) xlm, xlm.p, null);
    }

    private final zfw v() {
        return (zfw) this.A.b();
    }

    private final InputMethodManager x() {
        return (InputMethodManager) this.C.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:219:0x039e in {2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 41, 44, 47, 50, 53, 56, 59, 62, 65, 66, 67, 70, 73, 76, 79, 82, 85, 88, 91, 94, 96, 99, 102, 105, 108, 111, 114, 117, 120, 123, 126, 129, 132, 134, 135, 137, 141, 144, 145, 148, 151, 154, 157, 160, 163, 166, 169, 172, 175, 178, 181, 184, 187, 190, 193, 196, 199, 202, 205, 208, 211, 214, 216, 218} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter.d r17) {
        /*
        r16 = this;
        r0 = r16;
        r1 = "state";
        r2 = r17;
        defpackage.akcr.b(r2, r1);
        r1 = r0.x;
        if (r1 != 0) goto L_0x0012;
        r3 = "secondaryButton";
        defpackage.akcr.a(r3);
        r3 = 8;
        r1.setVisibility(r3);
        r1 = r0.r;
        r4 = "primaryButton";
        if (r1 != 0) goto L_0x0020;
        defpackage.akcr.a(r4);
        r5 = new com.snap.spectacles.lib.fragments.SpectaclesPairFragment$as;
        r5.<init>(r0);
        r5 = (android.view.View.OnClickListener) r5;
        r1.setOnClickListener(r5);
        r1 = r16.getView();
        if (r1 == 0) goto L_0x003e;
        r5 = r16.getResources();
        r6 = 2131100179; // 0x7f060213 float:1.7812732E38 double:1.0529033863E-314;
        r5 = r5.getColor(r6);
        r1.setBackgroundColor(r5);
        r1 = r0.r;
        if (r1 != 0) goto L_0x0045;
        defpackage.akcr.a(r4);
        r5 = 2131886486; // 0x7f120196 float:1.9407552E38 double:1.0532918736E-314;
        r1.setText(r5);
        r1 = r0.r;
        if (r1 != 0) goto L_0x0052;
        defpackage.akcr.a(r4);
        r5 = r16.getResources();
        r6 = 2131099716; // 0x7f060044 float:1.7811793E38 double:1.0529031575E-314;
        r5 = r5.getColor(r6);
        r1.setTextColor(r5);
        r1 = r0.r;
        if (r1 != 0) goto L_0x0067;
        defpackage.akcr.a(r4);
        r5 = 2131232684; // 0x7f0807ac float:1.8081484E38 double:1.0529688525E-314;
        r1.setBackgroundResource(r5);
        r1 = r0.j;
        r7 = "needHelpView";
        if (r1 != 0) goto L_0x0076;
        defpackage.akcr.a(r7);
        r8 = r16.getResources();
        r8 = r8.getColor(r6);
        r1.setTextColor(r8);
        r1 = r0.s;
        r8 = "statusTextView";
        if (r1 != 0) goto L_0x008a;
        defpackage.akcr.a(r8);
        r9 = r16.getResources();
        r9 = r9.getColor(r6);
        r1.b(r9);
        r1 = r0.t;
        r9 = "descriptionTextView";
        if (r1 != 0) goto L_0x009e;
        defpackage.akcr.a(r9);
        r10 = r16.getResources();
        r10 = r10.getColor(r6);
        r1.b(r10);
        r1 = r0.r;
        if (r1 != 0) goto L_0x00b0;
        defpackage.akcr.a(r4);
        r1 = r1.getLayoutParams();
        if (r1 == 0) goto L_0x0396;
        r1 = (android.widget.LinearLayout.LayoutParams) r1;
        r10 = r16.getResources();
        r11 = 2131167130; // 0x7f07079a float:1.7948525E38 double:1.0529364645E-314;
        r10 = r10.getDimensionPixelOffset(r11);
        r1.bottomMargin = r10;
        r1 = defpackage.xlg.a;
        r2 = r17.ordinal();
        r1 = r1[r2];
        r2 = 1;
        r10 = "ViewUtils.getDpiSuffix(context)";
        r11 = "checkMarkAnimation";
        r12 = "checkMarkBackground";
        r13 = "nameDeviceEditText";
        r14 = 4;
        r15 = "pressAndHoldImageView";
        r5 = 0;
        if (r1 == r2) goto L_0x02e8;
        r2 = 2;
        r6 = 2131889823; // 0x7f120e9f float:1.941432E38 double:1.0532935223E-314;
        if (r1 == r2) goto L_0x024f;
        r2 = 3;
        if (r1 == r2) goto L_0x01a1;
        if (r1 == r14) goto L_0x0144;
        r2 = 5;
        if (r1 == r2) goto L_0x00eb;
        goto L_0x0143;
        r1 = r0.v;
        if (r1 != 0) goto L_0x00f2;
        defpackage.akcr.a(r15);
        r1.setVisibility(r3);
        r1 = r0.s;
        if (r1 != 0) goto L_0x00fc;
        defpackage.akcr.a(r8);
        r2 = 2131888040; // 0x7f1207a8 float:1.9410704E38 double:1.0532926413E-314;
        r1.a(r2);
        r1 = r0.s;
        if (r1 != 0) goto L_0x0109;
        defpackage.akcr.a(r8);
        r1.setVisibility(r5);
        r1 = r0.t;
        if (r1 != 0) goto L_0x0113;
        defpackage.akcr.a(r9);
        r1.setVisibility(r3);
        r1 = r0.r;
        if (r1 != 0) goto L_0x011d;
        defpackage.akcr.a(r4);
        r1.setVisibility(r14);
        r1 = r0.j;
        if (r1 != 0) goto L_0x0127;
        defpackage.akcr.a(r7);
        r1.setVisibility(r14);
        r1 = r0.w;
        if (r1 != 0) goto L_0x0131;
        defpackage.akcr.a(r13);
        r1.setVisibility(r3);
        r1 = r0.y;
        if (r1 != 0) goto L_0x013d;
        r2 = "snakeLoadingImageView";
        defpackage.akcr.a(r2);
        r1.setVisibility(r3);
        r16.m();
        return;
        r1 = r0.u;
        if (r1 != 0) goto L_0x014b;
        defpackage.akcr.a(r12);
        r1.setVisibility(r3);
        r1 = r0.z;
        if (r1 != 0) goto L_0x0155;
        defpackage.akcr.a(r11);
        r1.setVisibility(r3);
        r1 = r0.s;
        if (r1 != 0) goto L_0x015f;
        defpackage.akcr.a(r8);
        r1.setVisibility(r5);
        r1 = r0.t;
        if (r1 != 0) goto L_0x0169;
        defpackage.akcr.a(r9);
        r1.setVisibility(r5);
        r1 = r0.v;
        if (r1 != 0) goto L_0x0173;
        defpackage.akcr.a(r15);
        r1.setVisibility(r3);
        r1 = r0.r;
        if (r1 != 0) goto L_0x017d;
        defpackage.akcr.a(r4);
        r1.setVisibility(r5);
        r1 = r0.y;
        if (r1 != 0) goto L_0x0189;
        r2 = "snakeLoadingImageView";
        defpackage.akcr.a(r2);
        r1.setVisibility(r3);
        r1 = r0.j;
        if (r1 != 0) goto L_0x0193;
        defpackage.akcr.a(r7);
        r1.setVisibility(r5);
        r1 = r0.w;
        if (r1 != 0) goto L_0x019d;
        defpackage.akcr.a(r13);
        r1.setVisibility(r3);
        return;
        r1 = r0.u;
        if (r1 != 0) goto L_0x01a8;
        defpackage.akcr.a(r12);
        r1.setVisibility(r3);
        r1 = r0.z;
        if (r1 != 0) goto L_0x01b2;
        defpackage.akcr.a(r11);
        r1.setVisibility(r3);
        r1 = r0.s;
        if (r1 != 0) goto L_0x01bc;
        defpackage.akcr.a(r8);
        r1.a(r6);
        r1 = r0.s;
        if (r1 != 0) goto L_0x01c6;
        defpackage.akcr.a(r8);
        r1.setVisibility(r5);
        r1 = r0.t;
        if (r1 != 0) goto L_0x01d0;
        defpackage.akcr.a(r9);
        r2 = 2131889861; // 0x7f120ec5 float:1.9414398E38 double:1.053293541E-314;
        r1.a(r2);
        r1 = r0.t;
        if (r1 != 0) goto L_0x01dd;
        defpackage.akcr.a(r9);
        r1.setVisibility(r5);
        r1 = r0.r;
        if (r1 != 0) goto L_0x01e7;
        defpackage.akcr.a(r4);
        r1.setVisibility(r5);
        r1 = r0.r;
        if (r1 != 0) goto L_0x01f1;
        defpackage.akcr.a(r4);
        r2 = r16.getResources();
        r6 = 2131099716; // 0x7f060044 float:1.7811793E38 double:1.0529031575E-314;
        r2 = r2.getColor(r6);
        r1.setTextColor(r2);
        r1 = r0.r;
        if (r1 != 0) goto L_0x0206;
        defpackage.akcr.a(r4);
        r2 = 2131232684; // 0x7f0807ac float:1.8081484E38 double:1.0529688525E-314;
        r1.setBackgroundResource(r2);
        r1 = r0.j;
        if (r1 != 0) goto L_0x0213;
        defpackage.akcr.a(r7);
        r1.setVisibility(r14);
        r1 = r0.w;
        if (r1 != 0) goto L_0x021d;
        defpackage.akcr.a(r13);
        r1.setVisibility(r3);
        r1 = r0.v;
        if (r1 != 0) goto L_0x0227;
        defpackage.akcr.a(r15);
        r2 = r16.getContext();
        r2 = defpackage.abtp.i(r2);
        defpackage.akcr.a(r2, r10);
        r3 = "spectacles_pairing_step_connecting_animation_graphic";
        r2 = defpackage.xqd.a(r2, r3);
        r3 = o;
        r3 = r3.d;
        r3 = r3.b;
        r1.setImageUri(r2, r3);
        r1 = r0.v;
        if (r1 != 0) goto L_0x0248;
        defpackage.akcr.a(r15);
        r1.setVisibility(r5);
        r16.l();
        return;
        r1 = r0.B;
        if (r1 == 0) goto L_0x0264;
        if (r1 == 0) goto L_0x0258;
        r1.dispose();
        r1 = r0.B;
        if (r1 == 0) goto L_0x0261;
        r2 = r0.d;
        r2.b(r1);
        r1 = 0;
        r0.B = r1;
        r1 = r0.u;
        if (r1 != 0) goto L_0x026b;
        defpackage.akcr.a(r12);
        r1.setVisibility(r3);
        r1 = r0.z;
        if (r1 != 0) goto L_0x0275;
        defpackage.akcr.a(r11);
        r1.setVisibility(r3);
        r1 = r0.s;
        if (r1 != 0) goto L_0x027f;
        defpackage.akcr.a(r8);
        r1.a(r6);
        r1 = r0.s;
        if (r1 != 0) goto L_0x0289;
        defpackage.akcr.a(r8);
        r1.setVisibility(r5);
        r1 = r0.t;
        if (r1 != 0) goto L_0x0293;
        defpackage.akcr.a(r9);
        r2 = 2131889861; // 0x7f120ec5 float:1.9414398E38 double:1.053293541E-314;
        r1.a(r2);
        r1 = r0.t;
        if (r1 != 0) goto L_0x02a0;
        defpackage.akcr.a(r9);
        r1.setVisibility(r5);
        r1 = r0.r;
        if (r1 != 0) goto L_0x02aa;
        defpackage.akcr.a(r4);
        r1.setVisibility(r5);
        r1 = r0.j;
        if (r1 != 0) goto L_0x02b4;
        defpackage.akcr.a(r7);
        r1.setVisibility(r14);
        r1 = r0.w;
        if (r1 != 0) goto L_0x02be;
        defpackage.akcr.a(r13);
        r1.setVisibility(r3);
        r1 = r0.v;
        if (r1 != 0) goto L_0x02c8;
        defpackage.akcr.a(r15);
        r2 = r16.getContext();
        r2 = defpackage.abtp.i(r2);
        defpackage.akcr.a(r2, r10);
        r3 = "spectacles_pairing_step_connecting_animation_graphic";
        r2 = defpackage.xqd.a(r2, r3);
        r3 = o;
        r3 = r3.d;
        r3 = r3.b;
        r1.setImageUri(r2, r3);
        r1 = r0.v;
        if (r1 != 0) goto L_0x0248;
        goto L_0x0245;
        r1 = r0.u;
        if (r1 != 0) goto L_0x02ef;
        defpackage.akcr.a(r12);
        r1.setVisibility(r3);
        r1 = r0.z;
        if (r1 != 0) goto L_0x02f9;
        defpackage.akcr.a(r11);
        r1.setVisibility(r3);
        r1 = r0.s;
        if (r1 != 0) goto L_0x0303;
        defpackage.akcr.a(r8);
        r2 = 2131889908; // 0x7f120ef4 float:1.9414493E38 double:1.0532935643E-314;
        r1.a(r2);
        r1 = r0.s;
        if (r1 != 0) goto L_0x0310;
        defpackage.akcr.a(r8);
        r1.setVisibility(r5);
        r1 = r0.t;
        if (r1 != 0) goto L_0x031a;
        defpackage.akcr.a(r9);
        r2 = 2131889907; // 0x7f120ef3 float:1.941449E38 double:1.053293564E-314;
        r1.a(r2);
        r1 = r0.t;
        if (r1 != 0) goto L_0x0327;
        defpackage.akcr.a(r9);
        r1.setVisibility(r5);
        r1 = r0.r;
        if (r1 != 0) goto L_0x0331;
        defpackage.akcr.a(r4);
        r1.setVisibility(r5);
        r1 = r0.j;
        if (r1 != 0) goto L_0x033b;
        defpackage.akcr.a(r7);
        r1.setVisibility(r14);
        r1 = r0.w;
        if (r1 != 0) goto L_0x0345;
        defpackage.akcr.a(r13);
        r1.setVisibility(r3);
        r1 = 5;
        r3 = java.util.concurrent.TimeUnit.SECONDS;
        r4 = defpackage.ajef.a();
        r1 = defpackage.ajcx.a(r1, r3, r4);
        r2 = new com.snap.spectacles.lib.fragments.SpectaclesPairFragment$at;
        r2.<init>(r0);
        r2 = (defpackage.ajev) r2;
        r1 = r1.g(r2);
        r0.B = r1;
        r1 = r0.B;
        if (r1 == 0) goto L_0x036a;
        r2 = r0.d;
        r2.a(r1);
        r1 = r0.v;
        if (r1 != 0) goto L_0x0371;
        defpackage.akcr.a(r15);
        r2 = r16.getContext();
        r2 = defpackage.abtp.i(r2);
        defpackage.akcr.a(r2, r10);
        r3 = "spectacles_pairing_confirm_graphic";
        r2 = defpackage.xqd.a(r2, r3);
        r3 = o;
        r3 = r3.d;
        r3 = r3.b;
        r1.setImageUri(r2, r3);
        r1 = r0.v;
        if (r1 != 0) goto L_0x0392;
        defpackage.akcr.a(r15);
        r1.setVisibility(r5);
        return;
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesPairFragment.a(com.snap.spectacles.lib.fragments.presenters.SpectaclesPairPresenter$d):void");
    }

    public final void a(String str) {
        zjm zjm = new zjm(xai.f, "spectacles_disconnect_previous_device", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str2 = "navigationHost";
        if (achb == null) {
            akcr.a(str2);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 16);
        String string = getString(R.string.spectacles_pairing_previous_device_disconnect_description, str);
        akcr.a((Object) string, "getString(com.snap.spect…onnect_description, name)");
        zgy a = aVar.b(string).a((int) R.string.okay, (akbl) new y(this), true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str2);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void a(String str, String str2) {
        akcr.b(str, "deviceName");
        akcr.b(str2, FriendmojiModel.EMOJI);
        SnapImageView snapImageView = this.u;
        if (snapImageView == null) {
            akcr.a("checkMarkBackground");
        }
        snapImageView.setVisibility(8);
        snapImageView = this.v;
        if (snapImageView == null) {
            akcr.a("pressAndHoldImageView");
        }
        snapImageView.setVisibility(8);
        snapImageView = this.y;
        if (snapImageView == null) {
            akcr.a("snakeLoadingImageView");
        }
        snapImageView.setVisibility(8);
        Button button = this.r;
        String str3 = "primaryButton";
        if (button == null) {
            akcr.a(str3);
        }
        button.setBackgroundResource(R.drawable.black_button_background);
        button = this.r;
        if (button == null) {
            akcr.a(str3);
        }
        button.setTextColor(getResources().getColor(R.color.white));
        button = this.r;
        if (button == null) {
            akcr.a(str3);
        }
        button.setText(R.string.okay);
        button = this.r;
        if (button == null) {
            akcr.a(str3);
        }
        button.setOnClickListener(new ah(this));
        button = this.r;
        if (button == null) {
            akcr.a(str3);
        }
        LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = getResources().getDimensionPixelOffset(R.dimen.laguna_pairing_need_help_margin_bottom);
            EditText editText = this.w;
            str3 = "nameDeviceEditText";
            if (editText == null) {
                akcr.a(str3);
            }
            editText.setVisibility(0);
            editText = this.w;
            if (editText == null) {
                akcr.a(str3);
            }
            editText.setText(str);
            EditText editText2 = this.w;
            if (editText2 == null) {
                akcr.a(str3);
            }
            editText = this.w;
            if (editText == null) {
                akcr.a(str3);
            }
            editText2.setSelection(editText.length());
            FadeAnimationTextSwitcher fadeAnimationTextSwitcher = this.s;
            String str4 = "statusTextView";
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str4);
            }
            fadeAnimationTextSwitcher.a((int) R.string.laguna_name_your_specs);
            fadeAnimationTextSwitcher = this.s;
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str4);
            }
            fadeAnimationTextSwitcher.setVisibility(0);
            fadeAnimationTextSwitcher = this.t;
            str4 = "descriptionTextView";
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str4);
            }
            fadeAnimationTextSwitcher.a((int) R.string.laguna_name_intro);
            fadeAnimationTextSwitcher = this.t;
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str4);
            }
            fadeAnimationTextSwitcher.setVisibility(0);
            al alVar = new al(this);
            Object string = getString(R.string.laguna_product_sales_terms);
            akcr.a(string, "getString(com.snap.spect…guna_product_sales_terms)");
            Object string2 = getString(R.string.laguna_agree_to_terms, "{*-1-*}");
            akcr.a(string2, "getString(com.snap.spect…na_agree_to_terms, token)");
            int a = akgc.a((CharSequence) string2, "{*-1-*}", 0, false, 6);
            SpannableString spannableString = new SpannableString(getString(R.string.laguna_agree_to_terms, string));
            spannableString.setSpan(alVar, a, string.length() + a, 33);
            TextView textView = this.j;
            str4 = "needHelpView";
            if (textView == null) {
                akcr.a(str4);
            }
            textView.setVisibility(0);
            textView = this.j;
            if (textView == null) {
                akcr.a(str4);
            }
            textView.setText(spannableString);
            textView = this.j;
            if (textView == null) {
                akcr.a(str4);
            }
            textView.setMaxLines(2);
            textView = this.j;
            if (textView == null) {
                akcr.a(str4);
            }
            textView.setSingleLine(false);
            textView = this.j;
            if (textView == null) {
                akcr.a(str4);
            }
            textView.setOnClickListener(new ai(this));
            SnapFontTextView snapFontTextView = this.x;
            str4 = "secondaryButton";
            if (snapFontTextView == null) {
                akcr.a(str4);
            }
            snapFontTextView.setVisibility(0);
            snapFontTextView = this.x;
            if (snapFontTextView == null) {
                akcr.a(str4);
            }
            snapFontTextView.setOnClickListener(new aj(this));
            editText2 = this.w;
            if (editText2 == null) {
                akcr.a(str3);
            }
            editText2.addTextChangedListener(new ak(this, str2));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void a(boolean z) {
        if (z) {
            zkf zkf = this.g;
            if (zkf == null) {
                akcr.a("rxBus");
            }
            zkf.a().a(new xlh());
        }
        achb achb = this.a;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.b((acig) new acio(xai.a, false, false));
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        akcr.b(str3, "name");
        akcr.b(str4, FriendmojiModel.EMOJI);
        InputMethodManager x = x();
        EditText editText = this.w;
        if (editText == null) {
            akcr.a("nameDeviceEditText");
        }
        x.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        zjm zjm = new zjm(xai.f, "spectacles_naming_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str5 = "navigationHost";
        if (achb == null) {
            akcr.a(str5);
        }
        zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.choose_another_name).b((int) R.string.laguna_name_too_short).a((int) R.string.retry, (akbl) new d(this, str3, str4), true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str5);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void c(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        akcr.b(str3, "name");
        akcr.b(str4, FriendmojiModel.EMOJI);
        InputMethodManager x = x();
        EditText editText = this.w;
        if (editText == null) {
            akcr.a("nameDeviceEditText");
        }
        x.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        zjm zjm = new zjm(xai.f, "spectacles_naming_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str5 = "navigationHost";
        if (achb == null) {
            akcr.a(str5);
        }
        defpackage.zgy.a a = new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.choose_another_name);
        String string = getString(R.string.laguna_confusing_name, str3);
        akcr.a((Object) string, "getString(com.snap.spect…una_confusing_name, name)");
        zgy a2 = a.b(string).a((int) R.string.retry, (akbl) new e(this, str3, str4), true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str5);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    public final void d(String str, String str2) {
        akcr.b(str, "deviceSerialNumber");
        akcr.b(str2, "onboardingName");
        zjm zjm = SpectaclesOnboardingFragment.e;
        SpectaclesPairPresenter spectaclesPairPresenter = this.b;
        if (spectaclesPairPresenter == null) {
            akcr.a("presenter");
        }
        zjf zjf = new zjf(zjm, com.snap.spectacles.lib.fragments.SpectaclesOnboardingFragment.a.a(str, str2, spectaclesPairPresenter.a()), acgv.a().a());
        achb achb = this.a;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achd achd = zjf;
        acgu acgu = SpectaclesOnboardingFragment.f;
        akcr.a((Object) acgu, "SpectaclesOnboardingFrag…PECTACLES_PRESENT_DEFAULT");
        achb.a(achd, acgu, null);
    }

    public final SpectaclesPairPresenter h() {
        SpectaclesPairPresenter spectaclesPairPresenter = this.b;
        if (spectaclesPairPresenter == null) {
            akcr.a("presenter");
        }
        return spectaclesPairPresenter;
    }

    public final xpw i() {
        xpw xpw = this.f;
        if (xpw == null) {
            akcr.a("deviceUtils");
        }
        return xpw;
    }

    public final void j() {
        if (isAdded()) {
            zjm zjm = new zjm(xai.f, "spectacles_stop_pairing", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = getContext();
            achb achb = this.a;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.stop_pairing_question).b((int) R.string.stop_pairing_description).a((int) R.string.stop_pairing, (akbl) new aq(this), false), (akbl) new ar(this), true, Integer.valueOf(R.string.resume_pairing), null, null, 24).a();
            achb achb2 = this.a;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb2.a((achd) a, a.a, null);
        }
    }

    public final void k() {
        if (isVisible()) {
            zjm zjm = new zjm(xai.f, "spectacles_device_not_supported", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = getContext();
            achb achb = this.a;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.device_not_supported_title).b((int) R.string.device_not_supported_description).a((int) R.string.update_now, (akbl) new w(this), false), (akbl) new x(this), true, Integer.valueOf(R.string.cancel), null, null, 24).a();
            achb achb2 = this.a;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb2.a((achd) a, a.a, null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void l() {
        AnimationDrawable animationDrawable = this.l;
        if (animationDrawable != null) {
            SnapImageView snapImageView = this.y;
            String str = "snakeLoadingImageView";
            if (snapImageView == null) {
                akcr.a(str);
            }
            snapImageView.setVisibility(0);
            snapImageView = this.y;
            if (snapImageView == null) {
                akcr.a(str);
            }
            snapImageView.setImageDrawable(animationDrawable);
            animationDrawable.start();
        }
    }

    /* Access modifiers changed, original: final */
    public final void m() {
        AnimationDrawable animationDrawable = this.m;
        if (animationDrawable != null) {
            SnapImageView snapImageView = this.u;
            String str = "checkMarkBackground";
            if (snapImageView == null) {
                akcr.a(str);
            }
            Object i = abtp.i(getContext());
            akcr.a(i, "ViewUtils.getDpiSuffix(context)");
            snapImageView.setImageUri(xqd.a(i, "pairing_success_animation_checkmark"), o.d.b);
            snapImageView = this.u;
            if (snapImageView == null) {
                akcr.a(str);
            }
            snapImageView.setVisibility(0);
            snapImageView = this.z;
            String str2 = "checkMarkAnimation";
            if (snapImageView == null) {
                akcr.a(str2);
            }
            snapImageView.setImageDrawable(animationDrawable);
            snapImageView = this.z;
            if (snapImageView == null) {
                akcr.a(str2);
            }
            snapImageView.setVisibility(0);
            animationDrawable.start();
        }
    }

    public final void n() {
        if (isAdded()) {
            zjm zjm = new zjm(xai.f, "spectacles_pairing_failed", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = getContext();
            achb achb = this.a;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.spectacles_pairing_failed_dialog_title).b((int) R.string.laguna_pairing_bt_off_body).a((int) R.string.okay, (akbl) new t(this), false).a();
            achb achb2 = this.a;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb2.a((achd) a, a.a, null);
        }
    }

    public final void o() {
        zjm zjm = new zjm(xai.f, "spectacles_pairing_failed", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.spectacles_pairing_failed_dialog_title).b((int) R.string.pairing_generic_failed_with_retry_dialog_description).a((int) R.string.retry, (akbl) new am(this), true), (akbl) new an(this), false, Integer.valueOf(R.string.cancel), null, null, 24).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a, a.a, null);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        SpectaclesPairPresenter spectaclesPairPresenter = this.b;
        String str = "presenter";
        if (spectaclesPairPresenter == null) {
            akcr.a(str);
        }
        spectaclesPairPresenter.takeTarget((xmk) this);
        spectaclesPairPresenter = this.b;
        if (spectaclesPairPresenter == null) {
            akcr.a(str);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            akcr.a();
        }
        Object string = arguments.getString("ARG_KEY_PAIR_FRAGMENT_CALLER");
        akcr.a(string, "arguments!!.getString(AR…KEY_PAIR_FRAGMENT_CALLER)");
        b valueOf = b.valueOf(string);
        akcr.b(valueOf, "<set-?>");
        spectaclesPairPresenter.a = valueOf;
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(false);
        Context context2 = getContext();
        String str2 = Event.ACTIVITY;
        Object systemService = context2.getSystemService(str2);
        String str3 = "null cannot be cast to non-null type android.app.ActivityManager";
        if (systemService != null) {
            int isLowRamDevice = ((ActivityManager) systemService).isLowRamDevice() ^ 1;
            ajej c = a(isLowRamDevice != 0 ? 46 : 23, isLowRamDevice != 0 ? 40 : 80, defpackage.xqd.a.SNAKE, this.d, animationDrawable, isLowRamDevice).a((ajdw) v().l()).c((ajfb) new p(this)).h(q.a).c();
            akcr.a((Object) c, "loadSnakeAnimation()\n   …             .subscribe()");
            ajvv.a(c, this.d);
            animationDrawable = new AnimationDrawable();
            animationDrawable.setOneShot(true);
            systemService = getContext().getSystemService(str2);
            if (systemService != null) {
                isLowRamDevice = ((ActivityManager) systemService).isLowRamDevice() ^ 1;
                c = a(isLowRamDevice != 0 ? 36 : 18, isLowRamDevice != 0 ? 30 : 60, defpackage.xqd.a.CHECKMARK, this.d, animationDrawable, isLowRamDevice).a((ajdw) v().l()).c((ajfb) new n(this)).h(o.a).c();
                akcr.a((Object) c, "loadCheckMarkAnimation()…             .subscribe()");
                ajvv.a(c, this.d);
                return;
            }
            throw new ajxt(str3);
        }
        throw new ajxt(str3);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SpectaclesPairPresenter spectaclesPairPresenter = this.b;
        if (spectaclesPairPresenter == null) {
            akcr.a("presenter");
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            akcr.a();
        }
        spectaclesPairPresenter.b = arguments.getString("ARG_KEY_PRESET_SPECTACLES_PAIRING_CODE_DETECTED_BLE_ADDRESS");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.pair_spectacles_fragment, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.spectacles_pair_back_button_bottom);
        akcr.a(findViewById, "view.findViewById(R.id.s…_pair_back_button_bottom)");
        this.r = (Button) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_pair_status_text);
        akcr.a(findViewById, "view.findViewById(R.id.s…ctacles_pair_status_text)");
        this.s = (FadeAnimationTextSwitcher) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_pair_description_text);
        akcr.a(findViewById, "view.findViewById(R.id.s…es_pair_description_text)");
        this.t = (FadeAnimationTextSwitcher) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_pair_check_mark);
        akcr.a(findViewById, "view.findViewById(R.id.spectacles_pair_check_mark)");
        this.u = (SnapImageView) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_press_and_hold_image);
        akcr.a(findViewById, "view.findViewById(R.id.s…les_press_and_hold_image)");
        this.v = (SnapImageView) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_snake_loading_image);
        akcr.a(findViewById, "view.findViewById(R.id.s…cles_snake_loading_image)");
        this.y = (SnapImageView) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_pair_check_mark_animation);
        akcr.a(findViewById, "view.findViewById(R.id.s…air_check_mark_animation)");
        this.z = (SnapImageView) findViewById;
        FadeAnimationTextSwitcher fadeAnimationTextSwitcher = this.s;
        if (fadeAnimationTextSwitcher == null) {
            akcr.a("statusTextView");
        }
        fadeAnimationTextSwitcher.a(xsb.a(getContext()));
        fadeAnimationTextSwitcher = this.t;
        if (fadeAnimationTextSwitcher == null) {
            akcr.a("descriptionTextView");
        }
        fadeAnimationTextSwitcher.a(xsb.b(getContext()));
        Button button = this.r;
        if (button == null) {
            akcr.a("primaryButton");
        }
        button.setOnClickListener(new h(this));
        findViewById = inflate.findViewById(R.id.spectacles_pairing_need_help);
        akcr.a(findViewById, "view.findViewById(R.id.s…tacles_pairing_need_help)");
        this.j = (TextView) findViewById;
        TextView textView = this.j;
        if (textView == null) {
            akcr.a("needHelpView");
        }
        textView.setOnClickListener(new i(this));
        findViewById = inflate.findViewById(R.id.edit_text);
        akcr.a(findViewById, "view.findViewById(R.id.edit_text)");
        this.w = (EditText) findViewById;
        findViewById = inflate.findViewById(R.id.spectacles_pairing_cancel_pairing);
        akcr.a(findViewById, "view.findViewById(R.id.s…s_pairing_cancel_pairing)");
        this.x = (SnapFontTextView) findViewById;
        SnapImageView snapImageView = this.v;
        if (snapImageView == null) {
            akcr.a("pressAndHoldImageView");
        }
        snapImageView.setRequestListener(new j(this));
        return inflate;
    }

    public final void onDetach() {
        SpectaclesPairPresenter spectaclesPairPresenter = this.b;
        if (spectaclesPairPresenter == null) {
            akcr.a("presenter");
        }
        spectaclesPairPresenter.dropTarget();
        AnimationDrawable animationDrawable = this.l;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        this.l = null;
        AnimationDrawable animationDrawable2 = this.m;
        if (animationDrawable2 != null) {
            animationDrawable2.stop();
        }
        this.m = null;
        super.onDetach();
    }

    public final void p() {
        if (isAdded()) {
            String string;
            zjm zjm = new zjm(xai.f, "spectacles_pairing_failed", false, false, true, false, null, false, false, false, false, null, 4076);
            try {
                string = getString(R.string.spectacles_pairing_failed_dialog_description, abqi.a(abpz.FACE_WITH_COLD_SWEAT));
                akcr.a((Object) string, "getString(com.snap.spect…ji.FACE_WITH_COLD_SWEAT))");
            } catch (Exception unused) {
                string = getString(R.string.spectacles_pairing_failed_dialog_description);
                akcr.a((Object) string, "getString(com.snap.spect…ailed_dialog_description)");
            }
            String str = string;
            Context context = getContext();
            achb achb = this.a;
            String str2 = "navigationHost";
            if (achb == null) {
                akcr.a(str2);
            }
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.spectacles_pairing_failed_dialog_title).b(str).a((int) R.string.spectacles_pairing_failed_dialog_primary_btn, (akbl) new ao(this), false), (akbl) new ap(this), true, Integer.valueOf(R.string.stop_pairing), null, null, 24).a();
            achb achb2 = this.a;
            if (achb2 == null) {
                akcr.a(str2);
            }
            achb2.a((achd) a, a.a, null);
        }
    }

    public final void q() {
        String string = getResources().getString(R.string.laguna_previously_paired_title, new Object[]{abqi.a(abpz.WHITE_RIGHT_POINTING_BACKHAND_INDEX), abqi.a(abpz.SMILING_FACE_WITH_SUNGLASSES), abqi.a(abpz.WHITE_LEFT_POINTING_BACKHAND_INDEX)});
        String string2 = getResources().getString(R.string.laguna_previously_paired_body);
        zjm zjm = new zjm(xai.f, "spectacles_naming_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, achb, zjm, false, null, 16);
        akcr.a((Object) string, "title");
        defpackage.zgy.a a = aVar.a(string);
        akcr.a((Object) string2, "description");
        zgy a2 = a.b(string2).a((int) R.string.okay, (akbl) new s(this), false).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    public final void r() {
        SnapImageView snapImageView = this.u;
        if (snapImageView == null) {
            akcr.a("checkMarkBackground");
        }
        snapImageView.setVisibility(8);
        snapImageView = this.z;
        if (snapImageView == null) {
            akcr.a("checkMarkAnimation");
        }
        snapImageView.setVisibility(8);
        snapImageView = this.v;
        String str = "pressAndHoldImageView";
        if (snapImageView == null) {
            akcr.a(str);
        }
        snapImageView.setVisibility(8);
        snapImageView = this.y;
        if (snapImageView == null) {
            akcr.a("snakeLoadingImageView");
        }
        snapImageView.setVisibility(8);
        EditText editText = this.w;
        if (editText == null) {
            akcr.a("nameDeviceEditText");
        }
        editText.setVisibility(8);
        Button button = this.r;
        String str2 = "primaryButton";
        if (button == null) {
            akcr.a(str2);
        }
        button.setVisibility(0);
        button = this.r;
        if (button == null) {
            akcr.a(str2);
        }
        button.setBackgroundResource(R.drawable.black_button_background);
        button = this.r;
        if (button == null) {
            akcr.a(str2);
        }
        button.setTextColor(getResources().getColor(R.color.white));
        button = this.r;
        if (button == null) {
            akcr.a(str2);
        }
        button.setText(getString(R.string.spectacles_pairing_location_title));
        button = this.r;
        if (button == null) {
            akcr.a(str2);
        }
        button.setOnClickListener(new aa(this));
        button = this.r;
        if (button == null) {
            akcr.a(str2);
        }
        LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = getResources().getDimensionPixelOffset(R.dimen.laguna_pairing_need_help_margin_bottom);
            FadeAnimationTextSwitcher fadeAnimationTextSwitcher = this.s;
            str2 = "statusTextView";
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str2);
            }
            fadeAnimationTextSwitcher.setText("Title");
            fadeAnimationTextSwitcher = this.s;
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str2);
            }
            fadeAnimationTextSwitcher.setVisibility(0);
            fadeAnimationTextSwitcher = this.t;
            str2 = "descriptionTextView";
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str2);
            }
            fadeAnimationTextSwitcher.setText("Description");
            fadeAnimationTextSwitcher = this.t;
            if (fadeAnimationTextSwitcher == null) {
                akcr.a(str2);
            }
            fadeAnimationTextSwitcher.setVisibility(0);
            snapImageView = this.v;
            if (snapImageView == null) {
                akcr.a(str);
            }
            Object i = abtp.i(getContext());
            akcr.a(i, "ViewUtils.getDpiSuffix(context)");
            snapImageView.setImageUri(xqd.a(i, "spectacles_pairing_confirm_graphic"), o.d.b);
            snapImageView = this.v;
            if (snapImageView == null) {
                akcr.a(str);
            }
            snapImageView.setVisibility(0);
            TextView textView = this.j;
            if (textView == null) {
                akcr.a("needHelpView");
            }
            textView.setVisibility(8);
            SnapFontTextView snapFontTextView = this.x;
            String str3 = "secondaryButton";
            if (snapFontTextView == null) {
                akcr.a(str3);
            }
            snapFontTextView.setVisibility(0);
            snapFontTextView = this.x;
            if (snapFontTextView == null) {
                akcr.a(str3);
            }
            snapFontTextView.setText(getString(R.string.pairing_disable_location_data));
            snapFontTextView = this.x;
            if (snapFontTextView == null) {
                akcr.a(str3);
            }
            snapFontTextView.setOnClickListener(new ab(this));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void s() {
        if (isVisible()) {
            ae aeVar = new ae(this);
            Object string = getString(R.string.spectacles_pairing_inactivity_dialog_description_link_text);
            akcr.a(string, "getString(com.snap.spect…og_description_link_text)");
            Object string2 = getString(R.string.spectacles_pairing_inactivity_dialog_description, "{*-1-*}");
            akcr.a(string2, "getString(com.snap.spect…ialog_description, token)");
            int a = akgc.a((CharSequence) string2, "{*-1-*}", 0, false, 6);
            SpannableString spannableString = new SpannableString(getString(R.string.spectacles_pairing_inactivity_dialog_description, string));
            spannableString.setSpan(aeVar, a, string.length() + a, 33);
            zjm zjm = new zjm(xai.f, "spectacles_stop_pairing", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = getContext();
            achb achb = this.a;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            zgy a2 = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.spectacles_pairing_inactivity_dialog_title).a((CharSequence) spannableString).a((int) R.string.spectacles_pairing_inactivity_dialog_primary_btn, (akbl) new ac(this), true), (akbl) new ad(this), true, Integer.valueOf(R.string.stop_pairing), null, null, 24).a();
            achb achb2 = this.a;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb2.a((achd) a2, a2.a, null);
            SpectaclesPairPresenter spectaclesPairPresenter = this.b;
            if (spectaclesPairPresenter == null) {
                akcr.a("presenter");
            }
            spectaclesPairPresenter.o.f();
        }
    }

    public final void t() {
        if (isVisible()) {
            zjm zjm = new zjm(xai.f, "spectacles_set_location_failed", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = getContext();
            achb achb = this.a;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            zgy a = new defpackage.zgy.a(context, achb, zjm, false, null, 16).a("Failed").b("Request Failed").a((int) R.string.okay, (akbl) new z(this), true).a();
            achb achb2 = this.a;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb2.a((achd) a, a.a, null);
        }
    }

    public final void u() {
        if (isVisible()) {
            zjm zjm = new zjm(xai.f, "spectacles_incompatible_device", false, false, true, false, null, false, false, false, false, null, 4076);
            Context context = getContext();
            achb achb = this.a;
            String str = "navigationHost";
            if (achb == null) {
                akcr.a(str);
            }
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(context, achb, zjm, false, null, 16).a((int) R.string.spectacles_pairing_incompatible_dialog_title).b((int) R.string.spectacles_pairing_incompatible_dialog_description).a((int) R.string.spectacles_pairing_incompatible_dialog_primary_btn, (akbl) new af(this), false), (akbl) new ag(this), false, Integer.valueOf(R.string.stop_pairing), null, null, 24).a();
            achb achb2 = this.a;
            if (achb2 == null) {
                akcr.a(str);
            }
            achb2.a((achd) a, a.a, null);
        }
    }
}
