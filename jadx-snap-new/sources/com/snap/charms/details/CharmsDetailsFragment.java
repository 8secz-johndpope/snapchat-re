package com.snap.charms.details;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.abqi;
import defpackage.abry;
import defpackage.abrz;
import defpackage.abtp;
import defpackage.abvs;
import defpackage.abwm;
import defpackage.abwr;
import defpackage.abwx;
import defpackage.abwy;
import defpackage.abwz;
import defpackage.abxd;
import defpackage.abxe;
import defpackage.abxf;
import defpackage.abxg;
import defpackage.abxi;
import defpackage.abxj;
import defpackage.abxl;
import defpackage.abxm;
import defpackage.abxo;
import defpackage.abxp;
import defpackage.abxq;
import defpackage.achb;
import defpackage.achg;
import defpackage.afnd;
import defpackage.ajdj;
import defpackage.ajdn;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwl;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.ajzn;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akca;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.dds;
import defpackage.erf;
import defpackage.esf;
import defpackage.esw;
import defpackage.etb;
import defpackage.etc;
import defpackage.etd;
import defpackage.evb;
import defpackage.ftu;
import defpackage.gdy;
import defpackage.gej;
import defpackage.gfu;
import defpackage.idj;
import defpackage.idl;
import defpackage.igk;
import defpackage.ihl;
import defpackage.iu;
import defpackage.jwc;
import defpackage.jwz;
import defpackage.kaz;
import defpackage.zfw;
import defpackage.zhm;
import defpackage.zhn;
import defpackage.zjk;
import defpackage.zjm;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class CharmsDetailsFragment extends MainPageFragment {
    float A;
    float B;
    float C;
    float D;
    float E;
    float F;
    int G;
    int H;
    int I;
    int J;
    int K;
    int L;
    float M;
    float N;
    float O;
    final List<abxl> P;
    final Map<erf, Long> Q;
    erf R;
    long S;
    final ajei T;
    private final boolean V;
    private final ajxe W;
    private final ajxe X;
    private final ajxe Y;
    private final ajxe Z;
    public b a;
    private float aA;
    private float aB;
    private float aC;
    private float aD;
    private float aE;
    private float aF;
    private float aG;
    private float aH;
    private float aI;
    private float aJ;
    private float aK;
    private int aL;
    private float aM;
    private float aN;
    private abwz aO;
    private final ajxe aa;
    private final ajxe ab;
    private final ajxe ac;
    private final ajxe ad;
    private final ajxe ae;
    private final ajxe af;
    private final ajxe ag;
    private final ajxe ah;
    private final ajxe ai;
    private final ajxe aj;
    private final ajxe ak;
    private final ajxe al;
    private final ajxe am;
    private final ajxe an;
    private final ajxe ao;
    private final ajxe ap;
    private final ajxe aq;
    private final ajxe ar;
    private final ajxe as;
    private final ajxe at;
    private final ajxe au;
    private final ajxe av;
    private final long aw;
    private final long ax;
    private final long ay;
    private float az;
    public achb<zjm, zjk> b;
    public zfw c;
    public jwc d;
    public gfu e;
    public zhn f;
    public defpackage.esz.b g;
    Drawable h;
    public g i;
    public d j;
    public f k;
    public e l;
    public h m;
    final c n = new c(this);
    final ihl o = new ihl();
    final ajxe p = ajxh.a(u.a);
    float q;
    float r;
    float s;
    float t;
    float u;
    float v;
    float w;
    float x;
    float y;
    float z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b {
        final evb a;
        final etd b;
        final esw c;
        final Map<erf, View> d;

        public b(evb evb, etd etd, esw esw, Map<erf, ? extends View> map) {
            akcr.b(evb, "charmItemViewModel");
            akcr.b(etd, "templateResolver");
            akcr.b(esw, "bitmojiResolver");
            akcr.b(map, "charmToViewMapping");
            this.a = evb;
            this.b = etd;
            this.c = esw;
            this.d = map;
        }

        /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof com.snap.charms.details.CharmsDetailsFragment.b;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (com.snap.charms.details.CharmsDetailsFragment.b) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.d;
            r3 = r3.d;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.charms.details.CharmsDetailsFragment$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            evb evb = this.a;
            int i = 0;
            int hashCode = (evb != null ? evb.hashCode() : 0) * 31;
            etd etd = this.b;
            hashCode = (hashCode + (etd != null ? etd.hashCode() : 0)) * 31;
            esw esw = this.c;
            hashCode = (hashCode + (esw != null ? esw.hashCode() : 0)) * 31;
            Map map = this.d;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Configuration(charmItemViewModel=");
            stringBuilder.append(this.a);
            stringBuilder.append(", templateResolver=");
            stringBuilder.append(this.b);
            stringBuilder.append(", bitmojiResolver=");
            stringBuilder.append(this.c);
            stringBuilder.append(", charmToViewMapping=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    final class c extends LruCache<String, ajdj<Drawable>> {
        private /* synthetic */ CharmsDetailsFragment a;

        static final class a<T, R> implements ajfc<T, ajdn<? extends R>> {
            private /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            /* JADX WARNING: Missing block: B:12:0x002e, code skipped:
            defpackage.akax.a(r4, r0);
     */
            private defpackage.ajdj<android.graphics.drawable.Drawable> a(defpackage.gej r4) {
                /*
                r3 = this;
                r0 = "it";
                defpackage.akcr.b(r4, r0);
                r4 = (java.io.Closeable) r4;
                r0 = 0;
                r1 = r4;
                r1 = (defpackage.gej) r1;	 Catch:{ Throwable -> 0x002c }
                r2 = r1.a();	 Catch:{ Throwable -> 0x002c }
                if (r2 == 0) goto L_0x0020;
            L_0x0011:
                r1 = r1.b();	 Catch:{ Throwable -> 0x002c }
                r2 = r3.a;	 Catch:{ Throwable -> 0x002c }
                r1 = android.graphics.drawable.Drawable.createFromStream(r1, r2);	 Catch:{ Throwable -> 0x002c }
                r1 = defpackage.ajdj.b(r1);	 Catch:{ Throwable -> 0x002c }
                goto L_0x0026;
            L_0x0020:
                r1 = defpackage.ajlu.a;	 Catch:{ Throwable -> 0x002c }
                r1 = defpackage.ajvo.a(r1);	 Catch:{ Throwable -> 0x002c }
            L_0x0026:
                defpackage.akax.a(r4, r0);
                return r1;
            L_0x002a:
                r1 = move-exception;
                goto L_0x002e;
            L_0x002c:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x002a }
            L_0x002e:
                defpackage.akax.a(r4, r0);
                throw r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snap.charms.details.CharmsDetailsFragment$c$a.a(gej):ajdj");
            }

            public final /* synthetic */ Object apply(Object obj) {
                return a((gej) obj);
            }
        }

        public c(int i) {
            this.a = i;
            super(20);
        }

        public final /* synthetic */ Object create(Object obj) {
            String str = (String) obj;
            akcr.b(str, FriendmojiModel.EMOJI);
            idj page = esf.d.getPage();
            String a = abqi.a(str);
            akcr.a((Object) a, "EmojiUtils.getTwitterAssetName(emoji)");
            Uri a2 = ftu.a(a);
            gfu gfu = this.a.e;
            if (gfu == null) {
                akcr.a("contentResolver");
            }
            obj = gfu.a(a2, (idl) page, false, new gdy[0]).b((ajdw) CharmsDetailsFragment.a(this.a).f()).a((ajdw) CharmsDetailsFragment.a(this.a).b()).b((ajfc) new a(str)).c();
            akcr.a(obj, "contentResolver.resolve(…                 .cache()");
            return obj;
        }
    }

    public interface d {
        void a(erf erf);
    }

    public interface e {
        void a(erf erf);
    }

    public interface f {
        void a(erf erf);
    }

    public interface g {
        void a(List<? extends ajxm<? extends erf, Long>> list);
    }

    public interface h {
        void a();

        void a(erf erf);

        void b();
    }

    public static final class ae implements defpackage.abxl.b {
        boolean a;
        final /* synthetic */ abvs b;
        final /* synthetic */ defpackage.akdd.e c;
        private final Runnable d = new AnonymousClass1(this);
        private final List<abxp> e = ajym.b((Object[]) new abxp[]{this.f.h(), this.f.i(), this.f.j(), this.f.k(), this.f.l(), this.f.q(), this.f.r()});
        private /* synthetic */ CharmsDetailsFragment f;

        /* renamed from: com.snap.charms.details.CharmsDetailsFragment$ae$1 */
        public static final class AnonymousClass1 implements Runnable {
            private /* synthetic */ ae a;

            AnonymousClass1(ae aeVar) {
                this.a = aeVar;
            }

            public final void run() {
                ((akbk) this.a.c.a).invoke();
                if (this.a.a) {
                    this.a.b.postDelayed(this, 8);
                }
            }
        }

        ae(CharmsDetailsFragment charmsDetailsFragment, abvs abvs, defpackage.akdd.e eVar) {
            this.f = charmsDetailsFragment;
            this.b = abvs;
            this.c = eVar;
        }

        public final void a(abxp abxp) {
            akcr.b(abxp, "newState");
            this.a = this.e.contains(abxp);
            this.b.post(this.d);
        }
    }

    public static final class af implements defpackage.abxl.b {
        af() {
        }

        public final void a(abxp abxp) {
            akcr.b(abxp, "newState");
        }
    }

    public static final class ai implements defpackage.abxl.b {
        private /* synthetic */ CharmsDetailsFragment a;
        private /* synthetic */ abvs b;

        ai(CharmsDetailsFragment charmsDetailsFragment, abvs abvs) {
            this.a = charmsDetailsFragment;
            this.b = abvs;
        }

        public final void a(abxp abxp) {
            akcr.b(abxp, "newState");
            if (akcr.a((Object) abxp, this.a.f())) {
                this.b.setVisibility(4);
            }
        }
    }

    static final class ak<T, R> implements ajfc<T, R> {
        public static final ak a = new ak();

        ak() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Iterable iterable = (Iterable) obj;
            akcr.b(iterable, "it");
            return ajyu.h(iterable);
        }
    }

    public static final class i<T> implements abxq<T> {
        private final T a;

        public i(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }
    }

    static final class aa extends akcs implements akbw<erf, abwy, ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;
        private /* synthetic */ akbl b;
        private /* synthetic */ evb c;

        aa(CharmsDetailsFragment charmsDetailsFragment, akbl akbl, evb evb) {
            this.a = charmsDetailsFragment;
            this.b = akbl;
            this.c = evb;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            abwy abwy = (abwy) obj2;
            akcr.b((erf) obj, "<anonymous parameter 0>");
            akcr.b(abwy, "element");
            CharmsDetailsFragment.b(this.a);
            abwy.c(((abxm) this.a.ao.b()));
            abwy.a(((abxm) this.a.ap.b()));
            return ajxw.a;
        }
    }

    static final class ab extends akcs implements akbk<ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;
        private /* synthetic */ abxl b;
        private /* synthetic */ int c;
        private /* synthetic */ abxe d;
        private /* synthetic */ float e;
        private /* synthetic */ float f;

        ab(CharmsDetailsFragment charmsDetailsFragment, abxl abxl, int i, abxe abxe, float f, float f2) {
            this.a = charmsDetailsFragment;
            this.b = abxl;
            this.c = i;
            this.d = abxe;
            this.e = f;
            this.f = f2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            CharmsDetailsFragment.k(this.a).c(this.a.s());
            CharmsDetailsFragment.k(this.a).a(this.a.t());
            CharmsDetailsFragment.k(this.a).b(this.a.v());
            return ajxw.a;
        }
    }

    static final class ac extends akcs implements akbk<ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;
        private /* synthetic */ abxl b;
        private /* synthetic */ int c;
        private /* synthetic */ abxe d;
        private /* synthetic */ float e;
        private /* synthetic */ float f;

        ac(CharmsDetailsFragment charmsDetailsFragment, abxl abxl, int i, abxe abxe, float f, float f2) {
            this.a = charmsDetailsFragment;
            this.b = abxl;
            this.c = i;
            this.d = abxe;
            this.e = f;
            this.f = f2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            CharmsDetailsFragment.k(this.a).b(this.a.u());
            return ajxw.a;
        }
    }

    static final class ad extends akcs implements akbk<ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;
        private /* synthetic */ float b;
        private /* synthetic */ float c;

        ad(CharmsDetailsFragment charmsDetailsFragment, float f, float f2) {
            this.a = charmsDetailsFragment;
            this.b = f;
            this.c = f2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            CharmsDetailsFragment.k(this.a).c(this.a.s());
            CharmsDetailsFragment.k(this.a).b(this.a.v());
            return ajxw.a;
        }
    }

    static final class ah extends akcs implements akbk<ajxw> {
        private /* synthetic */ abvs a;

        ah(abvs abvs) {
            this.a = abvs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.requestLayout();
            this.a.postInvalidate();
            return ajxw.a;
        }
    }

    static final class aj extends akcs implements akbl<erf, abwz> {
        final /* synthetic */ CharmsDetailsFragment a;
        final /* synthetic */ evb b;
        final /* synthetic */ List c;
        final /* synthetic */ ajwl d;
        final /* synthetic */ defpackage.akdd.e e;
        private /* synthetic */ Typeface f;
        private /* synthetic */ abxl g;
        private /* synthetic */ Typeface h;
        private /* synthetic */ i i;
        private /* synthetic */ int j;
        private /* synthetic */ Typeface k;
        private /* synthetic */ i l;

        static final class b<T, R> implements ajfc<Throwable, Bitmap> {
            private /* synthetic */ aj a;
            private /* synthetic */ abxl b;
            private /* synthetic */ abxl c;
            private /* synthetic */ Uri d;

            b(aj ajVar, abxl abxl, abxl abxl2, Uri uri) {
                this.a = ajVar;
                this.b = abxl;
                this.c = abxl2;
                this.d = uri;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Throwable) obj, "t");
                return null;
            }
        }

        static final class c<T> implements ajfb<Bitmap> {
            private /* synthetic */ aj a;
            private /* synthetic */ abxl b;
            private /* synthetic */ abxl c;
            private /* synthetic */ Uri d;

            c(aj ajVar, abxl abxl, abxl abxl2, Uri uri) {
                this.a = ajVar;
                this.b = abxl;
                this.c = abxl2;
                this.d = uri;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.c.b(((abxm) this.a.a.av.b()));
            }
        }

        static final class e<T> implements ajfb<Drawable> {
            private /* synthetic */ aj a;
            private /* synthetic */ String b;
            private /* synthetic */ abxl c;
            private /* synthetic */ int d;
            private /* synthetic */ float e;
            private /* synthetic */ abxl f;

            e(aj ajVar, String str, abxl abxl, int i, float f, abxl abxl2) {
                this.a = ajVar;
                this.b = str;
                this.c = abxl;
                this.d = i;
                this.e = f;
                this.f = abxl2;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.c.b(((abxm) this.a.a.au.b()));
            }
        }

        static final class f<T, R> implements ajfc<T, R> {
            private /* synthetic */ aj a;
            private /* synthetic */ String b;
            private /* synthetic */ abxl c;
            private /* synthetic */ int d;
            private /* synthetic */ float e;
            private /* synthetic */ abxl f;

            f(aj ajVar, String str, abxl abxl, int i, float f, abxl abxl2) {
                this.a = ajVar;
                this.b = str;
                this.c = abxl;
                this.d = i;
                this.e = f;
                this.f = abxl2;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Drawable drawable = (Drawable) obj;
                akcr.b(drawable, "it");
                return CharmsDetailsFragment.a(this.a.a, drawable, this.d);
            }
        }

        static final class g<T, R> implements ajfc<Throwable, Bitmap> {
            private /* synthetic */ aj a;
            private /* synthetic */ abxl b;
            private /* synthetic */ abxl c;
            private /* synthetic */ Uri d;

            g(aj ajVar, abxl abxl, abxl abxl2, Uri uri) {
                this.a = ajVar;
                this.b = abxl;
                this.c = abxl2;
                this.d = uri;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Throwable) obj, "t");
                return null;
            }
        }

        static final class h<T> implements ajfb<Bitmap> {
            private /* synthetic */ aj a;
            private /* synthetic */ abxl b;
            private /* synthetic */ abxl c;
            private /* synthetic */ Uri d;

            h(aj ajVar, abxl abxl, abxl abxl2, Uri uri) {
                this.a = ajVar;
                this.b = abxl;
                this.c = abxl2;
                this.d = uri;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.c.b(((abxm) this.a.a.av.b()));
            }
        }

        static final class i<T, R> implements ajfc<T, R> {
            private /* synthetic */ Drawable a;
            private /* synthetic */ aj b;
            private /* synthetic */ erf c;
            private /* synthetic */ int d;
            private /* synthetic */ abxl e;

            i(Drawable drawable, aj ajVar, erf erf, int i, abxl abxl) {
                this.a = drawable;
                this.b = ajVar;
                this.c = erf;
                this.d = i;
                this.e = abxl;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Drawable drawable = (Drawable) obj;
                akcr.b(drawable, "drawable");
                return evb.b(this.c) != defpackage.erk.b.STICKER ? CharmsDetailsFragment.a(this.b.a, drawable, this.d) : drawable;
            }
        }

        static final class j<T, R> implements ajfc<Throwable, Bitmap> {
            private /* synthetic */ String a;
            private /* synthetic */ aj b;
            private /* synthetic */ float c;
            private /* synthetic */ abxl d;
            private /* synthetic */ abxl e;

            j(String str, aj ajVar, float f, abxl abxl, abxl abxl2) {
                this.a = str;
                this.b = ajVar;
                this.c = f;
                this.d = abxl;
                this.e = abxl2;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Throwable) obj, "t");
                return null;
            }
        }

        static final class k<T> implements ajfb<Bitmap> {
            private /* synthetic */ String a;
            private /* synthetic */ aj b;
            private /* synthetic */ float c;
            private /* synthetic */ abxl d;
            private /* synthetic */ abxl e;

            k(String str, aj ajVar, float f, abxl abxl, abxl abxl2) {
                this.a = str;
                this.b = ajVar;
                this.c = f;
                this.d = abxl;
                this.e = abxl2;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.e.b(((abxm) this.b.a.au.b()));
            }
        }

        static final class m<T, R> implements ajfc<T, R> {
            public static final m a = new m();

            m() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                kaz kaz = (kaz) obj;
                akcr.b(kaz, "it");
                Object a = kaz.a("CharmsDetailsFragment");
                akcr.a(a, "it.clone(TAG)");
                Bitmap a2 = jwz.a(a);
                kaz.dispose();
                return a2;
            }
        }

        static final class n<T, R> implements ajfc<T, R> {
            public static final n a = new n();

            n() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                kaz kaz = (kaz) obj;
                akcr.b(kaz, "it");
                Object a = kaz.a("CharmsDetailsFragment");
                akcr.a(a, "it.clone(TAG)");
                Bitmap a2 = jwz.a(a);
                kaz.dispose();
                return a2;
            }
        }

        static final class t<T, R> implements ajfc<T, R> {
            public static final t a = new t();

            t() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                kaz kaz = (kaz) obj;
                akcr.b(kaz, "it");
                Object a = kaz.a("CharmsDetailsFragment");
                akcr.a(a, "it.clone(TAG)");
                Bitmap a2 = jwz.a(a);
                kaz.dispose();
                return a2;
            }
        }

        static final class a extends akcs implements akbk<ajxw> {
            private /* synthetic */ aj a;
            private /* synthetic */ abxl b;

            a(aj ajVar, abxl abxl) {
                this.a = ajVar;
                this.b = abxl;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.b.b(((abxm) this.a.a.aq.b()));
                return ajxw.a;
            }
        }

        static final class d extends akcs implements akbk<ajxw> {
            private /* synthetic */ aj a;
            private /* synthetic */ abxl b;

            d(aj ajVar, abxl abxl) {
                this.a = ajVar;
                this.b = abxl;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.b.b(this.a.a.v());
                this.b.c(((abxm) this.a.a.aq.b()));
                return ajxw.a;
            }
        }

        static final class l extends akcs implements akbk<ajxw> {
            final /* synthetic */ aj a;
            final /* synthetic */ erf b;
            private /* synthetic */ Drawable c;
            private /* synthetic */ abxl d;

            /* renamed from: com.snap.charms.details.CharmsDetailsFragment$aj$l$1 */
            static final class AnonymousClass1 extends akcs implements akbk<ajxw> {
                private /* synthetic */ l a;

                AnonymousClass1(l lVar) {
                    this.a = lVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    f fVar = this.a.a.a.k;
                    if (fVar != null) {
                        fVar.a(this.a.b);
                    }
                    this.a.a.c.remove(this.a.b);
                    if (this.a.a.c.isEmpty()) {
                        CharmsDetailsFragment.c(this.a.a.a).a((achg) esf.b, true, false, null);
                    } else {
                        this.a.a.d.a(this.a.a.c);
                        akbk akbk = (akbk) this.a.a.e.a;
                        if (akbk != null) {
                            akbk.invoke();
                        }
                        CharmsDetailsFragment.c(this.a.a.a).a((achg) zhm.a, true, true, null);
                    }
                    return ajxw.a;
                }
            }

            /* renamed from: com.snap.charms.details.CharmsDetailsFragment$aj$l$2 */
            static final class AnonymousClass2 extends akcs implements akbk<ajxw> {
                private /* synthetic */ l a;

                AnonymousClass2(l lVar) {
                    this.a = lVar;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    e eVar = this.a.a.a.l;
                    if (eVar != null) {
                        eVar.a(this.a.b);
                    }
                    return ajxw.a;
                }
            }

            l(Drawable drawable, aj ajVar, erf erf, abxl abxl) {
                this.c = drawable;
                this.a = ajVar;
                this.b = erf;
                this.d = abxl;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                zhn zhn = this.a.a.f;
                if (zhn == null) {
                    akcr.a("actionMenuLauncher");
                }
                zjm zjm = esf.c;
                Context context = this.a.a.getContext();
                defpackage.esz.b bVar = this.a.a.g;
                if (bVar == null) {
                    akcr.a("websiteOpener");
                }
                zhn.a(zjm, new etb(context, bVar, new AnonymousClass1(this), new AnonymousClass2(this), this.b, this.a.b.b, this.a.b.c, this.a.b.i));
                return ajxw.a;
            }
        }

        static final class o extends akcq implements akca<Integer, Integer, Float, Integer> {
            public static final o a = new o();

            o() {
                super(3);
            }

            public final String getName() {
                return "colorInterpolator";
            }

            public final akej getOwner() {
                return akde.a(defpackage.abxo.a.class);
            }

            public final String getSignature() {
                return "colorInterpolator(IIF)I";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return Integer.valueOf(defpackage.abxo.a.a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).floatValue()));
            }
        }

        static final class p extends akcq implements akca<Integer, Integer, Float, Integer> {
            public static final p a = new p();

            p() {
                super(3);
            }

            public final String getName() {
                return "colorInterpolator";
            }

            public final akej getOwner() {
                return akde.a(defpackage.abxo.a.class);
            }

            public final String getSignature() {
                return "colorInterpolator(IIF)I";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return Integer.valueOf(defpackage.abxo.a.a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).floatValue()));
            }
        }

        static final class q extends akcq implements akca<Float, Float, Float, Float> {
            public static final q a = new q();

            q() {
                super(3);
            }

            public final String getName() {
                return "floatInterpolator";
            }

            public final akej getOwner() {
                return akde.a(defpackage.abxo.a.class);
            }

            public final String getSignature() {
                return "floatInterpolator(FFF)F";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                float floatValue = ((Number) obj).floatValue();
                return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * ((Number) obj3).floatValue()));
            }
        }

        static final class r extends akcq implements akca<Integer, Integer, Float, Integer> {
            public static final r a = new r();

            r() {
                super(3);
            }

            public final String getName() {
                return "colorInterpolator";
            }

            public final akej getOwner() {
                return akde.a(defpackage.abxo.a.class);
            }

            public final String getSignature() {
                return "colorInterpolator(IIF)I";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return Integer.valueOf(defpackage.abxo.a.a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).floatValue()));
            }
        }

        static final class s extends akcq implements akca<Float, Float, Float, Float> {
            public static final s a = new s();

            s() {
                super(3);
            }

            public final String getName() {
                return "floatInterpolator";
            }

            public final akej getOwner() {
                return akde.a(defpackage.abxo.a.class);
            }

            public final String getSignature() {
                return "floatInterpolator(FFF)F";
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                float floatValue = ((Number) obj).floatValue();
                return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * ((Number) obj3).floatValue()));
            }
        }

        aj(CharmsDetailsFragment charmsDetailsFragment, evb evb, Typeface typeface, abxl abxl, Typeface typeface2, i iVar, int i, Typeface typeface3, i iVar2, List list, ajwl ajwl, defpackage.akdd.e eVar) {
            this.a = charmsDetailsFragment;
            this.b = evb;
            this.f = typeface;
            this.g = abxl;
            this.h = typeface2;
            this.i = iVar;
            this.j = i;
            this.k = typeface3;
            this.l = iVar2;
            this.c = list;
            this.d = ajwl;
            this.e = eVar;
            super(1);
        }

        private abwz a(erf erf) {
            String a;
            int i;
            float f;
            ajdp p;
            abxl abxl;
            String str;
            abxd abxd;
            String str2;
            String str3;
            abxd abxd2;
            defpackage.abxd.f fVar;
            ajdx a2;
            erf erf2;
            defpackage.abxd.f fVar2;
            int i2;
            defpackage.abwz.e eVar;
            CharmsDetailsFragment charmsDetailsFragment;
            abwy b;
            abxd b2;
            final erf erf3 = erf;
            String str4 = "charm";
            akcr.b(erf3, str4);
            try {
                a = this.b.a(erf3);
            } catch (IllegalArgumentException unused) {
                a = null;
            }
            boolean a3 = CharmsDetailsFragment.d(this.a).c.a(erf3);
            boolean b3 = CharmsDetailsFragment.d(this.a).c.b(erf3);
            defpackage.abxl.a aVar = new defpackage.abxl.a();
            aVar.a(ajym.b((Object[]) new abxp[]{this.a.n(), this.a.o(), this.a.p(), this.a.q(), this.a.r()}));
            aVar.d = this.a.n();
            aVar.a(this.a.n()).a(((abxm) this.a.au.b())).a(this.a.o());
            aVar.a(this.a.n()).a(((abxm) this.a.av.b())).a(((abxm) this.a.aq.b())).a(this.a.p());
            aVar.a(this.a.o()).a(((abxm) this.a.av.b())).a(((abxm) this.a.aq.b())).a(this.a.q());
            String str5 = a;
            aVar.a(this.a.q()).a(180).a(this.a.p());
            aVar.a(this.a.p()).a(this.a.v()).a(this.a.r());
            aVar.a(this.a.r()).a(100).a(this.a.o());
            abxl a4 = aVar.a();
            a4.a((defpackage.abxl.b) new defpackage.abxl.b() {
                public final void a(abxp abxp) {
                    akcr.b(abxp, "newState");
                }
            });
            aVar = new defpackage.abxl.a();
            aVar.a(ajym.b((Object[]) new abxp[]{this.a.a(), this.a.b(), this.a.c(), this.a.d(), this.a.f(), this.a.g(), this.a.h(), this.a.i(), this.a.j(), this.a.k(), this.a.l(), this.a.m()}));
            aVar.d = this.a.a();
            aVar.a(this.a.a()).a(this.a.s()).a(this.a.h());
            aVar.a(this.a.h()).a(100).a(this.a.b());
            aVar.a(this.a.b()).a(((abxm) this.a.ao.b())).a(this.a.c());
            aVar.a(this.a.c()).a(750).a(this.a.i());
            aVar.a(this.a.c()).a(((abxm) this.a.ap.b())).a(this.a.b());
            aVar.a(this.a.i()).a(180).a(this.a.d());
            aVar.a(this.a.i()).a(this.a.v()).a(this.a.m());
            aVar.a(this.a.b()).a(this.a.v()).a(this.a.j());
            aVar.a(this.a.c()).a(this.a.v()).a(this.a.j());
            aVar.a(this.a.b()).a(this.a.t()).a(this.a.k());
            aVar.a(this.a.c()).a(this.a.t()).a(this.a.k());
            aVar.a(this.a.j()).a(100).a(this.a.g());
            aVar.a(this.a.k()).a(100).a(this.a.f());
            aVar.a(this.a.f()).a(this.a.u()).a(this.a.g());
            aVar.a(this.a.d()).a(this.a.v()).a(this.a.l());
            aVar.a(this.a.l()).a(100).a(this.a.g());
            aVar.a(this.a.m()).a(100).a(this.a.g());
            aVar.a(this.a.i(), (akbk) new a(this, a4));
            aVar.a(ajym.b((Object[]) new abxp[]{this.a.j(), this.a.l()}), (akbk) new d(this, a4));
            abxl a5 = aVar.a();
            a5.a((defpackage.abxl.b) new defpackage.abxl.b() {
                public final void a(abxp abxp) {
                    akcr.b(abxp, "newState");
                }
            });
            this.a.P.add(a4);
            this.a.P.add(a5);
            int i3 = (int) this.a.y;
            Object obj = this.a.h;
            if (obj != null) {
                defpackage.abxd.f fVar3 = new defpackage.abxd.f();
                ajdp b4 = ajdp.b(obj);
                abxl abxl2 = a4;
                erf erf4 = erf;
                defpackage.abxd.f fVar4 = fVar3;
                i = i3;
                f = MapboxConstants.MINIMUM_ZOOM;
                p = b4.p(new i(obj, this, erf4, i, abxl2));
                akcr.a((Object) p, "Observable.just(placehol…                        }");
                fVar4.a(p);
                fVar4.a(ScaleType.CENTER);
                CharmsDetailsFragment charmsDetailsFragment2 = this.a;
                defpackage.abxr.a aVar2 = new defpackage.abxr.a(new ap(abxo.a));
                abxl[] abxlArr = new abxl[1];
                abxl = abxl2;
                abxlArr[0] = abxl;
                aVar2.a(abxlArr);
                aVar2.a(charmsDetailsFragment2.n()).a = Float.valueOf(1.0f);
                str = str4;
                aVar2.a(charmsDetailsFragment2.o()).a(Float.valueOf(1.0f), Float.valueOf(MapboxConstants.MINIMUM_ZOOM), 50);
                aVar2.a(charmsDetailsFragment2.p()).a = Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
                fVar4.a((abxq) aVar2.a());
                abxd = (abxd) igk.a(fVar4.a(), this.a.T);
            } else {
                abxl = a4;
                str = str4;
                f = MapboxConstants.MINIMUM_ZOOM;
                abxd = null;
            }
            float f2 = (a3 || b3) ? MapboxConstants.MINIMUM_ZOOM : 1.0f;
            String str6 = "bitmapLoader.loadBitmap(…n(scheduler.mainThread())";
            String str7;
            if (etc.a[evb.b(erf).ordinal()] != 1) {
                str2 = str5;
                str3 = str2;
                ajdj ajdj = (ajdj) this.a.n.get(str2);
                a4 = abxl;
                str7 = str2;
                i = i3;
                abxd2 = abxd;
                fVar = new defpackage.abxd.f();
                float f3 = f2;
                abxl abxl3 = abxl;
                abxl = a5;
                p = ajdj.c((ajfb) new e(this, str3, a4, i, f3, abxl)).g().b((ajdw) CharmsDetailsFragment.a(this.a).f()).a((ajdw) CharmsDetailsFragment.a(this.a).l()).p(new f(this, str7, abxl3, i, f3, abxl));
                akcr.a((Object) p, "emojiLoaders.get(graphic…InCircle(it, emojiSize) }");
                fVar.a(p);
                fVar.a(ScaleType.CENTER);
                abxl = abxl3;
                fVar.a(CharmsDetailsFragment.a(this.a, f2, a5, abxl));
            } else {
                abxd2 = abxd;
                str7 = str5;
                if (str7 != null) {
                    fVar = new defpackage.abxd.f();
                    fVar.a(ScaleType.FIT_CENTER);
                    fVar.a(CharmsDetailsFragment.a(this.a, f2, a5, abxl));
                    String str8 = str7;
                    float f4 = f2;
                    abxl abxl4 = a5;
                    abxl abxl5 = abxl;
                    a2 = CharmsDetailsFragment.j(this.a).a(Uri.parse(str7), esf.a).a((ajdw) CharmsDetailsFragment.a(this.a).f()).f(t.a).g(new j(str8, this, f4, abxl4, abxl5)).c((ajfb) new k(str8, this, f4, abxl4, abxl5)).a((ajdw) CharmsDetailsFragment.a(this.a).l());
                    akcr.a((Object) a2, str6);
                    fVar.a(a2);
                } else {
                    fVar = null;
                }
            }
            esw esw;
            Uri a6;
            if (a3) {
                esw = CharmsDetailsFragment.d(this.a).c;
                erf2 = erf;
                akcr.b(erf2, str);
                if (esw.a(erf2)) {
                    String a7 = esw.a(erf2, 1);
                    String c = esw.c(erf2);
                    String friendmojiTemplateId = erf.friendmojiTemplateId();
                    if (friendmojiTemplateId == null) {
                        akcr.a();
                    }
                    a6 = dds.a(a7, c, friendmojiTemplateId, afnd.PROFILE, false, esw.a);
                    defpackage.abxd.f fVar5 = new defpackage.abxd.f();
                    fVar5.a(ScaleType.FIT_CENTER);
                    fVar5.a(CharmsDetailsFragment.a(this.a, a5, abxl));
                    a2 = CharmsDetailsFragment.j(this.a).a(a6, esf.a).a((ajdw) CharmsDetailsFragment.a(this.a).f()).f(m.a).g(new g(this, a5, abxl, a6)).c((ajfb) new h(this, a5, abxl, a6)).a((ajdw) CharmsDetailsFragment.a(this.a).l());
                    akcr.a((Object) a2, str6);
                    fVar5.a(a2);
                    fVar2 = fVar5;
                    i2 = 2;
                } else {
                    throw new IllegalArgumentException("Friendmoji requirements are not met, please check before attempting to build a friendmoji url");
                }
            }
            erf2 = erf;
            str3 = str;
            if (b3) {
                esw = CharmsDetailsFragment.d(this.a).c;
                akcr.b(erf2, str3);
                if (esw.b(erf2)) {
                    i2 = 2;
                    String a8 = esw.a(erf2, 2);
                    str2 = erf.solomojiTemplateId();
                    if (str2 == null) {
                        akcr.a();
                    }
                    a6 = dds.a(a8, str2, afnd.PROFILE, false, esw.a);
                    fVar2 = new defpackage.abxd.f();
                    fVar2.a(ScaleType.FIT_CENTER);
                    fVar2.a(CharmsDetailsFragment.a(this.a, a5, abxl));
                    a2 = CharmsDetailsFragment.j(this.a).a(a6, esf.a).a((ajdw) CharmsDetailsFragment.a(this.a).f()).f(n.a).g(new b(this, a5, abxl, a6)).c((ajfb) new c(this, a5, abxl, a6)).a((ajdw) CharmsDetailsFragment.a(this.a).l());
                    akcr.a((Object) a2, str6);
                    fVar2.a(a2);
                } else {
                    throw new IllegalArgumentException("Solomoji requirements are not met, please check before attempting to build a solomoji url");
                }
            }
            i2 = 2;
            abxl.b(((abxm) this.a.av.b()));
            fVar2 = null;
            defpackage.abxh.b bVar = new defpackage.abxh.b(erf.displayName());
            bVar.d = this.a.getResources().getDimension(R.dimen.upchs_detail_title_text_size);
            bVar.f = this.f;
            bVar.a(abwm.CENTER);
            bVar.i = i2;
            bVar.j = true;
            bVar.h = Float.valueOf(this.a.getResources().getDimension(R.dimen.upchs_detail_title_line_height));
            bVar.a(CharmsDetailsFragment.a(this.a, this.g));
            abwy a9 = bVar.a();
            defpackage.abxf.b bVar2 = new defpackage.abxf.b();
            bVar2.a = this.a.getContext();
            bVar2.e = this.a.getResources().getDimension(R.dimen.upchs_detail_description_gradient_size);
            bVar2.f = this.a.getResources().getDimension(R.dimen.upchs_detail_description_gradient_size);
            abxq a10 = CharmsDetailsFragment.a(this.a, this.g);
            akcr.b(a10, "gradientAnimatingAlpha");
            bVar2.h = a10;
            defpackage.abxh.b bVar3 = new defpackage.abxh.b(CharmsDetailsFragment.d(this.a).b.a(erf2));
            bVar3.d = this.a.getResources().getDimension(R.dimen.upchs_detail_description_text_size);
            bVar3.f = this.h;
            bVar3.a(abwm.CENTER);
            bVar3.h = Float.valueOf(this.a.getResources().getDimension(R.dimen.upchs_detail_description_line_height));
            bVar3.e = ContextCompat.getColor(this.a.getContext(), R.color.details_description_text_color);
            bVar3.a(CharmsDetailsFragment.a(this.a, this.g));
            abwy a11 = bVar3.a();
            akcr.b(a11, "element");
            bVar2.d = a11;
            abxf c2 = bVar2.a();
            Object string = this.a.getResources().getString(R.string.upchs_unviewed_label);
            akcr.a(string, "newString");
            boolean a12 = evb.a((CharSequence) string);
            float f5 = a12 ? this.a.z : this.a.A;
            if (erf.unviewed() == 1) {
                eVar = new defpackage.abwz.e();
                charmsDetailsFragment = this.a;
                eVar.a(CharmsDetailsFragment.a(charmsDetailsFragment, Integer.valueOf(charmsDetailsFragment.H), Integer.valueOf(this.a.G), a5, r.a));
                eVar.h = f5 / 1.88f;
                if (a12) {
                    defpackage.abxh.b bVar4 = new defpackage.abxh.b(string);
                    bVar4.e = -1;
                    bVar4.d = this.a.C;
                    bVar4.f = this.f;
                    bVar4.h = Float.valueOf(this.a.z);
                    bVar4.a(CharmsDetailsFragment.a(this.a, Float.valueOf(f), Float.valueOf(1.0f), a5, s.a));
                    defpackage.abwz.h a13 = eVar.a(bVar4.a()).a(-1.0f, this.a.z).a();
                    i iVar = this.i;
                    a13.a((abxq) iVar, (abxq) iVar);
                }
                a11 = eVar.a();
            } else {
                a11 = null;
            }
            Long displayCount = erf.displayCount();
            if (displayCount != null) {
                Object format = ((NumberFormat) this.a.p.b()).format(displayCount.longValue());
                eVar = new defpackage.abwz.e();
                eVar.a(CharmsDetailsFragment.b(this.a, Integer.valueOf(this.j), Integer.valueOf(this.a.K), a5, o.a));
                eVar.h = this.a.N / 1.88f;
                charmsDetailsFragment = this.a;
                abxq b5 = CharmsDetailsFragment.b(charmsDetailsFragment, Integer.valueOf(charmsDetailsFragment.I), Integer.valueOf(this.a.J), a5, p.a);
                float f6 = this.a.O;
                akcr.b(b5, "color");
                defpackage.abwz.e eVar2 = eVar;
                eVar2.g = b5;
                eVar2.f = Float.valueOf(f6);
                akcr.a(format, "fomattedCount");
                defpackage.abxh.b bVar5 = new defpackage.abxh.b(format);
                bVar5.e = this.a.L;
                bVar5.h = Float.valueOf(this.a.N);
                bVar5.d = this.a.M;
                bVar5.f = this.k;
                bVar5.a(CharmsDetailsFragment.b(this.a, Float.valueOf(f), Float.valueOf(1.0f), a5, q.a));
                defpackage.abwz.h a14 = eVar.a(bVar5.a()).b().a();
                i iVar2 = this.l;
                a14.a((abxq) iVar2, (abxq) iVar2);
                b = eVar.a();
            } else {
                b = null;
            }
            Drawable drawable = ContextCompat.getDrawable(this.a.getContext(), R.drawable.action_menu_dots);
            if (drawable != null) {
                defpackage.abxd.f fVar6 = new defpackage.abxd.f();
                fVar6.a = this.a.getContext();
                akcr.b(drawable, "drawable");
                fVar6.e = drawable;
                fVar6.a(ScaleType.CENTER);
                fVar6.a(CharmsDetailsFragment.a(this.a, erf.unviewed() == 1 ? MapboxConstants.MINIMUM_ZOOM : 1.0f, a5));
                abxj a15 = fVar6.a(abxi.CLICK_UP);
                akbk lVar = new l(drawable, this, erf2, a5);
                akcr.b(lVar, "action");
                a15.a = lVar;
                b2 = fVar6.a();
            } else {
                b2 = null;
            }
            defpackage.abxg.a aVar3 = new defpackage.abxg.a();
            defpackage.abxg.b a16 = aVar3.a(a9);
            a16.a = false;
            a16.a(this.a.s);
            aVar3.a(c2).a(this.a.s).d = this.a.x;
            abxg b6 = aVar3.a();
            defpackage.abwz.e eVar3 = new defpackage.abwz.e();
            eVar3.b = a5;
            eVar3.a(CharmsDetailsFragment.a(this.a, this.j, a5));
            eVar3.h = this.a.getResources().getDimension(R.dimen.upchs_detail_card_corner_radius);
            if (abxd2 != null) {
                eVar3.a((abwy) abxd2).a(this.a.s, this.a.t).b(this.a.q, this.a.r);
            }
            if (fVar != null) {
                eVar3.a((abwy) igk.a(fVar.a(), this.a.T)).a(this.a.s, this.a.t).b(this.a.q, this.a.r);
            }
            if (fVar2 != null) {
                eVar3.a((abwy) igk.a(fVar2.a(), this.a.T)).a(this.a.s, this.a.t).b(this.a.q, this.a.r);
            }
            eVar3.a((abwy) b6).a(this.a.s, (this.a.v + this.a.x) + this.a.w).b(this.a.q, (this.a.r + this.a.t) + this.a.u);
            if (a11 != null) {
                defpackage.abwz.h a17 = eVar3.a(a11).a(new defpackage.abwz.f(this.a.B, defpackage.abwz.g.FROM_THE_RIGHT), this.a.B);
                if (a12) {
                    a17.a(-1.0f, this.a.z);
                } else {
                    a17.a(this.a.A, this.a.A);
                }
            }
            if (b != null) {
                eVar3.a(b).a(-1.0f, this.a.N).a(new defpackage.abwz.f(MapboxConstants.MINIMUM_ZOOM, defpackage.abwz.g.CENTERED), this.a.t);
            }
            if (b2 != null) {
                eVar3.a((abwy) b2).a(this.a.D, this.a.D).a(new defpackage.abwz.f(this.a.E, defpackage.abwz.g.FROM_THE_RIGHT), this.a.F);
            }
            return eVar3.a();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return a((erf) obj);
        }
    }

    static final class al extends akcs implements akbk<abxp> {
        public static final al a = new al();

        al() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("PlaceholderState");
        }
    }

    static final class am extends akcs implements akbk<abxm> {
        public static final am a = new am();

        am() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("startDismissingInput");
        }
    }

    static final class at extends akcs implements akbk<abxm> {
        public static final at a = new at();

        at() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("uncenterInput");
        }
    }

    static final class au extends akcs implements akbk<abxm> {
        public static final au a = new au();

        au() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("unviewedImageInput");
        }
    }

    static final class av extends akcs implements akbk<abxp> {
        public static final av a = new av();

        av() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("UnviewedImageState");
        }
    }

    static final class aw extends akcs implements akbk<abxp> {
        public static final aw a = new aw();

        aw() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("UnviewedState");
        }
    }

    static final class ax extends akcs implements akbk<abxp> {
        public static final ax a = new ax();

        ax() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("UniewedToDismissedState");
        }
    }

    static final class ay extends akcs implements akbk<abxp> {
        public static final ay a = new ay();

        ay() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("UnviewedToViewedImageState");
        }
    }

    static final class az extends akcs implements akbk<abxp> {
        public static final az a = new az();

        az() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("UnviewedToViewedAnimationState");
        }
    }

    static final class ba extends akcs implements akbk<abxm> {
        public static final ba a = new ba();

        ba() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("viewedImageInput");
        }
    }

    static final class bb extends akcs implements akbk<abxp> {
        public static final bb a = new bb();

        bb() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("ViewedImageState");
        }
    }

    static final class bc extends akcs implements akbk<abxm> {
        public static final bc a = new bc();

        bc() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("viewedInput");
        }
    }

    static final class bd extends akcs implements akbk<abxp> {
        public static final bd a = new bd();

        bd() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("ViewedState");
        }
    }

    static final class be extends akcs implements akbk<abxp> {
        public static final be a = new be();

        be() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("ViewedToDismissedState");
        }
    }

    static final class bf extends akcs implements akbk<abxp> {
        public static final bf a = new bf();

        bf() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("ViewedToUnviewedImageState");
        }
    }

    static final class j extends akcs implements akbk<abxm> {
        public static final j a = new j();

        j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("centeredInput");
        }
    }

    static final class k extends akcs implements akbk<abxp> {
        public static final k a = new k();

        k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("CenteredState");
        }
    }

    static final class l extends akcs implements akbk<abxp> {
        public static final l a = new l();

        l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("CollapsedState");
        }
    }

    static final class m extends akcs implements akbk<abxp> {
        public static final m a = new m();

        m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("CollapsedToExpandedAnimationState");
        }
    }

    static final class n extends akcs implements akbk<abxm> {
        public static final n a = new n();

        n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("dismissedInput");
        }
    }

    static final class o extends akcs implements akbk<abxp> {
        public static final o a = new o();

        o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("DismissedState");
        }
    }

    static final class p extends akcs implements akbk<abxp> {
        public static final p a = new p();

        p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("DismissingState");
        }
    }

    static final class q extends akcs implements akbk<abxm> {
        public static final q a = new q();

        q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("endDismissingInput");
        }
    }

    static final class r extends akcs implements akbk<abxm> {
        public static final r a = new r();

        r() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxm("expandInput");
        }
    }

    static final class s extends akcs implements akbk<abxp> {
        public static final s a = new s();

        s() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("ExpandedToDismissedState");
        }
    }

    static final class t extends akcs implements akbk<abxp> {
        public static final t a = new t();

        t() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abxp("ExpandedToDismissingState");
        }
    }

    static final class u extends akcs implements akbk<NumberFormat> {
        public static final u a = new u();

        u() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return NumberFormat.getNumberInstance();
        }
    }

    static final class v extends akcs implements akbk<ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;

        v(CharmsDetailsFragment charmsDetailsFragment) {
            this.a = charmsDetailsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            h hVar = this.a.m;
            if (hVar != null) {
                hVar.a();
            }
            return ajxw.a;
        }
    }

    static final class w extends akcs implements akbk<ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;

        w(CharmsDetailsFragment charmsDetailsFragment) {
            this.a = charmsDetailsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            CharmsDetailsFragment.b(this.a);
            g gVar = this.a.i;
            if (gVar != null) {
                gVar.a(ajzn.f(this.a.Q));
            }
            h hVar = this.a.m;
            if (hVar != null) {
                erf erf = this.a.R;
                if (erf == null) {
                    akcr.a();
                }
                hVar.a(erf);
            }
            return ajxw.a;
        }
    }

    static final class x extends akcs implements akbk<ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;

        x(CharmsDetailsFragment charmsDetailsFragment) {
            this.a = charmsDetailsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            h hVar = this.a.m;
            if (hVar != null) {
                hVar.b();
            }
            return ajxw.a;
        }
    }

    static final class y extends akcs implements akbk<ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;

        y(CharmsDetailsFragment charmsDetailsFragment) {
            this.a = charmsDetailsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            h hVar = this.a.m;
            if (hVar != null) {
                hVar.b();
            }
            CharmsDetailsFragment.c(this.a).a((achg) esf.b, true, false, null);
            return ajxw.a;
        }
    }

    static final class z extends akcs implements akbw<erf, abwy, ajxw> {
        private /* synthetic */ CharmsDetailsFragment a;
        private /* synthetic */ akbl b;
        private /* synthetic */ evb c;

        z(CharmsDetailsFragment charmsDetailsFragment, akbl akbl, evb evb) {
            this.a = charmsDetailsFragment;
            this.b = akbl;
            this.c = evb;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            erf erf = (erf) obj;
            abwy abwy = (abwy) obj2;
            akcr.b(erf, "charm");
            akcr.b(abwy, "element");
            CharmsDetailsFragment charmsDetailsFragment = this.a;
            charmsDetailsFragment.S = charmsDetailsFragment.o.a();
            charmsDetailsFragment = this.a;
            charmsDetailsFragment.R = erf;
            d dVar = charmsDetailsFragment.j;
            if (dVar != null) {
                dVar.a(erf);
            }
            abwy.b(((abxm) this.a.ao.b()));
            return ajxw.a;
        }
    }

    static final class ag extends akcq implements akca<Integer, Integer, Float, Integer> {
        public static final ag a = new ag();

        ag() {
            super(3);
        }

        public final String getName() {
            return "colorInterpolator";
        }

        public final akej getOwner() {
            return akde.a(defpackage.abxo.a.class);
        }

        public final String getSignature() {
            return "colorInterpolator(IIF)I";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return Integer.valueOf(defpackage.abxo.a.a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).floatValue()));
        }
    }

    static final class an extends akcq implements akca<Integer, Integer, Float, Integer> {
        an(defpackage.abxo.a aVar) {
            super(3, aVar);
        }

        public final String getName() {
            return "colorInterpolator";
        }

        public final akej getOwner() {
            return akde.a(defpackage.abxo.a.class);
        }

        public final String getSignature() {
            return "colorInterpolator(IIF)I";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return Integer.valueOf(defpackage.abxo.a.a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).floatValue()));
        }
    }

    static final class ao extends akcq implements akca<Float, Float, Float, Float> {
        ao(defpackage.abxo.a aVar) {
            super(3, aVar);
        }

        public final String getName() {
            return "floatInterpolator";
        }

        public final akej getOwner() {
            return akde.a(defpackage.abxo.a.class);
        }

        public final String getSignature() {
            return "floatInterpolator(FFF)F";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj).floatValue();
            return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * ((Number) obj3).floatValue()));
        }
    }

    static final class ap extends akcq implements akca<Float, Float, Float, Float> {
        ap(defpackage.abxo.a aVar) {
            super(3, aVar);
        }

        public final String getName() {
            return "floatInterpolator";
        }

        public final akej getOwner() {
            return akde.a(defpackage.abxo.a.class);
        }

        public final String getSignature() {
            return "floatInterpolator(FFF)F";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj).floatValue();
            return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * ((Number) obj3).floatValue()));
        }
    }

    static final class aq extends akcq implements akca<Float, Float, Float, Float> {
        aq(defpackage.abxo.a aVar) {
            super(3, aVar);
        }

        public final String getName() {
            return "floatInterpolator";
        }

        public final akej getOwner() {
            return akde.a(defpackage.abxo.a.class);
        }

        public final String getSignature() {
            return "floatInterpolator(FFF)F";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj).floatValue();
            return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * ((Number) obj3).floatValue()));
        }
    }

    static final class ar extends akcq implements akca<Float, Float, Float, Float> {
        ar(defpackage.abxo.a aVar) {
            super(3, aVar);
        }

        public final String getName() {
            return "floatInterpolator";
        }

        public final akej getOwner() {
            return akde.a(defpackage.abxo.a.class);
        }

        public final String getSignature() {
            return "floatInterpolator(FFF)F";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj).floatValue();
            return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * ((Number) obj3).floatValue()));
        }
    }

    static final class as extends akcq implements akca<Float, Float, Float, Float> {
        as(defpackage.abxo.a aVar) {
            super(3, aVar);
        }

        public final String getName() {
            return "floatInterpolator";
        }

        public final akej getOwner() {
            return akde.a(defpackage.abxo.a.class);
        }

        public final String getSignature() {
            return "floatInterpolator(FFF)F";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj).floatValue();
            return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * ((Number) obj3).floatValue()));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(CharmsDetailsFragment.class), "numberFormat", "getNumberFormat()Ljava/text/NumberFormat;"), new akdc(akde.a(CharmsDetailsFragment.class), "collapsedState", "getCollapsedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "unviewedState", "getUnviewedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "centeredState", "getCenteredState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "viewedState", "getViewedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "dismissingState", "getDismissingState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "dismissedState", "getDismissedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "collapsedToExpandedState", "getCollapsedToExpandedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "unviewedToViewedState", "getUnviewedToViewedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "expandedToDismissedState", "getExpandedToDismissedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "expandedToDismissingState", "getExpandedToDismissingState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "viewedToDismissedState", "getViewedToDismissedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "unviewedToDismissedState", "getUnviewedToDismissedState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "placeholderState", "getPlaceholderState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "unviewedImageState", "getUnviewedImageState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "viewedImageState", "getViewedImageState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "unviewedToViewedImageState", "getUnviewedToViewedImageState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "viewedToUnviewedImageState", "getViewedToUnviewedImageState()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/State;"), new akdc(akde.a(CharmsDetailsFragment.class), "expandInput", "getExpandInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "centeredInput", "getCenteredInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "uncenterInput", "getUncenterInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "viewedInput", "getViewedInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "startDismissingInput", "getStartDismissingInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "endDismissingInput", "getEndDismissingInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "dismissedInput", "getDismissedInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "unviewedImageInput", "getUnviewedImageInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;"), new akdc(akde.a(CharmsDetailsFragment.class), "viewedImageInput", "getViewedImageInput()Lcom/snapchat/android/framework/ui/views/openview/layer2/stateful/Input;")};
        a aVar = new a();
    }

    public CharmsDetailsFragment() {
        boolean z = true;
        if (iu.a(Locale.getDefault()) != 1) {
            z = false;
        }
        this.V = z;
        this.W = ajxh.a(l.a);
        this.X = ajxh.a(aw.a);
        this.Y = ajxh.a(k.a);
        this.Z = ajxh.a(bd.a);
        this.aa = ajxh.a(p.a);
        this.ab = ajxh.a(o.a);
        this.ac = ajxh.a(m.a);
        this.ad = ajxh.a(az.a);
        this.ae = ajxh.a(s.a);
        this.af = ajxh.a(t.a);
        this.ag = ajxh.a(be.a);
        this.ah = ajxh.a(ax.a);
        this.ai = ajxh.a(al.a);
        this.aj = ajxh.a(av.a);
        this.ak = ajxh.a(bb.a);
        this.al = ajxh.a(ay.a);
        this.am = ajxh.a(bf.a);
        this.an = ajxh.a(r.a);
        this.ao = ajxh.a(j.a);
        this.ap = ajxh.a(at.a);
        this.aq = ajxh.a(bc.a);
        this.ar = ajxh.a(am.a);
        this.as = ajxh.a(q.a);
        this.at = ajxh.a(n.a);
        this.au = ajxh.a(au.a);
        this.av = ajxh.a(ba.a);
        this.aw = 100;
        this.ax = 750;
        this.ay = 180;
        this.P = new ArrayList();
        this.Q = new LinkedHashMap();
        this.S = -1;
        this.T = new ajei();
    }

    public static final /* synthetic */ abxq a(CharmsDetailsFragment charmsDetailsFragment, float f, abxl abxl, abxl abxl2) {
        defpackage.abxr.a aVar = new defpackage.abxr.a(new ar(abxo.a));
        aVar.a(abxl, abxl2);
        defpackage.abxr.b a = aVar.a(charmsDetailsFragment.a(), charmsDetailsFragment.g());
        Float valueOf = Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
        a.a = valueOf;
        a = aVar.a(charmsDetailsFragment.h());
        Float valueOf2 = Float.valueOf(1.0f);
        a.a(valueOf, valueOf2, 100);
        aVar.a(charmsDetailsFragment.b()).a = valueOf2;
        aVar.a(charmsDetailsFragment.q()).a(valueOf2, Float.valueOf(f), 180);
        aVar.a(charmsDetailsFragment.p()).a = Float.valueOf(f);
        aVar.a(charmsDetailsFragment.f()).a(valueOf2, valueOf, 100);
        aVar.a(charmsDetailsFragment.l(), charmsDetailsFragment.m()).a(Float.valueOf(f), valueOf, 100);
        aVar.a(charmsDetailsFragment.j(), charmsDetailsFragment.k()).a(valueOf2, valueOf, 100);
        return aVar.a();
    }

    public static final /* synthetic */ abxq a(CharmsDetailsFragment charmsDetailsFragment, abxl abxl) {
        defpackage.abxr.a aVar = new defpackage.abxr.a(new aq(abxo.a));
        aVar.a(abxl);
        defpackage.abxr.b a = aVar.a(charmsDetailsFragment.a());
        Float valueOf = Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
        a.a = valueOf;
        a = aVar.a(charmsDetailsFragment.h());
        Float valueOf2 = Float.valueOf(1.0f);
        a.a(valueOf, valueOf2, 100);
        aVar.a(charmsDetailsFragment.b(), charmsDetailsFragment.c(), charmsDetailsFragment.i(), charmsDetailsFragment.d()).a = valueOf2;
        aVar.a(charmsDetailsFragment.j(), charmsDetailsFragment.k(), charmsDetailsFragment.l(), charmsDetailsFragment.m()).a(valueOf2, valueOf, 100);
        aVar.a(charmsDetailsFragment.f(), charmsDetailsFragment.g()).a = valueOf;
        return aVar.a();
    }

    public static final /* synthetic */ abxq a(CharmsDetailsFragment charmsDetailsFragment, Object obj, Object obj2, abxl abxl, akca akca) {
        defpackage.abxr.a aVar = new defpackage.abxr.a(akca);
        aVar.a(abxl);
        aVar.a(charmsDetailsFragment.h()).a = obj2;
        aVar.a(charmsDetailsFragment.i()).a(obj2, obj, 100);
        aVar.a(charmsDetailsFragment.d()).a = obj;
        aVar.a(charmsDetailsFragment.k(), charmsDetailsFragment.j()).a(obj2, obj, 100);
        return aVar.a();
    }

    public static final /* synthetic */ abxq b(CharmsDetailsFragment charmsDetailsFragment, Object obj, Object obj2, abxl abxl, akca akca) {
        defpackage.abxr.a aVar = new defpackage.abxr.a(akca);
        aVar.a(abxl);
        aVar.a(charmsDetailsFragment.a(), charmsDetailsFragment.g(), charmsDetailsFragment.f()).a = obj;
        aVar.a(charmsDetailsFragment.h()).a(obj, obj2, 100);
        aVar.a(charmsDetailsFragment.j(), charmsDetailsFragment.k()).a(obj2, obj, 100);
        aVar.a(charmsDetailsFragment.l(), charmsDetailsFragment.m()).a(obj2, obj, 100);
        return aVar.a();
    }

    public static final /* synthetic */ void b(CharmsDetailsFragment charmsDetailsFragment) {
        if (charmsDetailsFragment.S != -1) {
            Map map = charmsDetailsFragment.Q;
            erf erf = charmsDetailsFragment.R;
            if (erf == null) {
                akcr.a();
            }
            Map map2 = charmsDetailsFragment.Q;
            erf erf2 = charmsDetailsFragment.R;
            if (erf2 == null) {
                akcr.a();
            }
            Object obj = map2.get(erf2);
            if (obj == null) {
                obj = Long.valueOf(0);
            }
            map.put(erf, Long.valueOf((((Number) obj).longValue() + charmsDetailsFragment.o.a()) - charmsDetailsFragment.S));
            charmsDetailsFragment.S = -1;
        }
    }

    public static final /* synthetic */ achb c(CharmsDetailsFragment charmsDetailsFragment) {
        achb achb = charmsDetailsFragment.b;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        return achb;
    }

    public static final /* synthetic */ b d(CharmsDetailsFragment charmsDetailsFragment) {
        b bVar = charmsDetailsFragment.a;
        if (bVar == null) {
            akcr.a(Event.CONFIGURATION);
        }
        return bVar;
    }

    public static final /* synthetic */ jwc j(CharmsDetailsFragment charmsDetailsFragment) {
        jwc jwc = charmsDetailsFragment.d;
        if (jwc == null) {
            akcr.a("bitmapLoader");
        }
        return jwc;
    }

    public static final /* synthetic */ abwz k(CharmsDetailsFragment charmsDetailsFragment) {
        abwz abwz = charmsDetailsFragment.aO;
        if (abwz == null) {
            akcr.a("details");
        }
        return abwz;
    }

    /* Access modifiers changed, original: final */
    public final abxp a() {
        return (abxp) this.W.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp b() {
        return (abxp) this.X.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp c() {
        return (abxp) this.Y.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp d() {
        return (abxp) this.Z.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp f() {
        return (abxp) this.aa.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp g() {
        return (abxp) this.ab.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp h() {
        return (abxp) this.ac.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp i() {
        return (abxp) this.ad.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp j() {
        return (abxp) this.ae.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp k() {
        return (abxp) this.af.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp l() {
        return (abxp) this.ag.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp m() {
        return (abxp) this.ah.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp n() {
        return (abxp) this.ai.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp o() {
        return (abxp) this.aj.b();
    }

    public final boolean o_() {
        abwz abwz = this.aO;
        String str = "details";
        if (abwz == null) {
            akcr.a(str);
        }
        abwz.c(s());
        abwz = this.aO;
        if (abwz == null) {
            akcr.a(str);
        }
        abwz.b(v());
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.az = getResources().getDimension(R.dimen.upchs_card_width);
        this.aA = getResources().getDimension(R.dimen.upchs_nested_scroll_height);
        this.aB = getResources().getDimension(R.dimen.upchs_card_padding);
        this.aC = this.az - (this.aB * 2.0f);
        this.aD = getResources().getDimension(R.dimen.upchs_carousel_image_height);
        this.aE = getResources().getDimension(R.dimen.upchs_name_text_height);
        this.aF = getResources().getDimension(R.dimen.upchs_detail_inter_section_padding);
        this.aG = getResources().getDimension(R.dimen.upchs_unviewed_label_margin);
        this.aH = getResources().getDimension(R.dimen.upchs_unviewed_label_height);
        this.aI = getResources().getDimension(R.dimen.upchs_detail_card_width);
        this.aJ = getResources().getDimension(R.dimen.upchs_detail_card_height);
        this.aK = getResources().getDimension(R.dimen.upchs_detail_card_inter_spacing);
        this.q = getResources().getDimension(R.dimen.upchs_detail_card_padding);
        this.r = getResources().getDimension(R.dimen.upchs_detail_card_padding_top);
        this.s = this.aI - (this.q * 2.0f);
        this.t = getResources().getDimension(R.dimen.upchs_detail_image_height);
        this.u = getResources().getDimension(R.dimen.upchs_detail_image_padding_bottom);
        this.v = getResources().getDimension(R.dimen.upchs_detail_title_height);
        this.w = getResources().getDimension(R.dimen.upchs_detail_description_height);
        this.x = getResources().getDimension(R.dimen.upchs_detail_inter_section_padding);
        this.y = getResources().getDimension(R.dimen.upchs_detail_emoji_size);
        this.aL = getResources().getDimensionPixelSize(R.dimen.upchs_detail_emoji_inset);
        this.z = getResources().getDimension(R.dimen.upchs_detail_unviewed_label_height);
        this.A = getResources().getDimension(R.dimen.upchs_detail_unviewed_label_dot_diameter);
        this.B = getResources().getDimension(R.dimen.upchs_detail_unviewed_label_margin);
        this.aM = getResources().getDimension(R.dimen.upchs_detail_unviewed_label_padding);
        this.C = getResources().getDimension(R.dimen.upchs_detail_unviewed_label_text_size);
        this.D = getResources().getDimension(R.dimen.upchs_detail_unviewed_action_menu_size);
        this.E = getResources().getDimension(R.dimen.upchs_detail_unviewed_action_menu_right_padding);
        this.F = getResources().getDimension(R.dimen.upchs_detail_unviewed_action_menu_top_padding);
        this.h = ContextCompat.getDrawable(getContext(), R.drawable.charm_loading_pendant);
        this.G = getResources().getColor(R.color.regular_blue);
        this.H = getResources().getColor(R.color.transparent_blue);
        this.I = getResources().getColor(R.color.details_count_border_transparent_color);
        this.J = getResources().getColor(R.color.details_count_border_color);
        this.K = getResources().getColor(R.color.details_count_bg_color);
        this.L = getResources().getColor(R.color.orange);
        this.aN = getResources().getDimension(R.dimen.upchs_detail_display_count_horizontal_padding);
        this.M = getResources().getDimension(R.dimen.upchs_detail_display_count_text_size);
        this.N = getResources().getDimension(R.dimen.upchs_detail_display_count_height);
        this.O = getResources().getDimension(R.dimen.upchs_detail_display_border_width);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        b bVar = this.a;
        String str = Event.CONFIGURATION;
        if (bVar == null) {
            akcr.a(str);
        }
        evb evb = bVar.a;
        List l = ajyu.l(evb.g);
        ajwl i = ajwl.i(l);
        akcr.a((Object) i, "BehaviorSubject.createDefault(updatingCharms)");
        float a = (float) abtp.a(getContext());
        float b = (float) abtp.b(getContext());
        i iVar = new i(Float.valueOf(this.aM));
        i iVar2 = new i(Float.valueOf(this.aN));
        Context context = getContext();
        Object obj = abry.a;
        String str2 = "ScTypeface.AVENIR_NEXT";
        akcr.a(obj, str2);
        Typeface a2 = abrz.a(context, obj.b());
        context = getContext();
        obj = abry.a;
        akcr.a(obj, str2);
        Typeface a3 = abrz.a(context, obj.c());
        context = getContext();
        obj = abry.a;
        akcr.a(obj, str2);
        Typeface a4 = abrz.a(context, obj.a());
        int color = getResources().getColor(R.color.transparent_white);
        defpackage.akdd.e eVar = new defpackage.akdd.e();
        eVar.a = null;
        defpackage.abxl.a aVar = new defpackage.abxl.a();
        r1 = new abxp[7];
        String str3 = str;
        r1[1] = h();
        r1[2] = b();
        r1[3] = j();
        r1[4] = k();
        r1[5] = f();
        r1[6] = g();
        aVar.a(ajym.b((Object[]) r1));
        aVar.d = a();
        aVar.a(a()).a(s()).a(h());
        evb evb2 = evb;
        aVar.a(h()).a(100).a(b());
        aVar.a(b()).a(v()).a(j());
        aVar.a(b()).a(t()).a(k());
        aVar.a(k()).a(100).a(f());
        aVar.a(f()).a(u()).a(g());
        aVar.a(j()).a(100).a(g());
        aVar.a(h(), (akbk) new v(this));
        aVar.a(ajym.b((Object[]) new abxp[]{j(), k()}), (akbk) new w(this));
        aVar.a(f(), (akbk) new x(this));
        aVar.a(g(), (akbk) new y(this));
        abxl a5 = aVar.a();
        a5.a((defpackage.abxl.b) new af());
        this.P.add(a5);
        abxl abxl = a5;
        defpackage.akdd.e eVar2 = eVar;
        float f = b;
        float f2 = a;
        ajwl ajwl = i;
        akbl ajVar = new aj(this, evb2, a2, abxl, a4, iVar, color, a3, iVar2, l, i, eVar2);
        obj = this.V ? ajwl.p(ak.a) : ajwl;
        akcr.a(obj, "listObservableToUse");
        defpackage.abxe.b bVar2 = new defpackage.abxe.b(obj);
        bVar2.a = getContext();
        String str4 = "<set-?>";
        akcr.b(ajVar, str4);
        bVar2.d = ajVar;
        float f3 = this.aI;
        float f4 = this.aJ;
        defpackage.abxe.b bVar3 = bVar2;
        bVar3.e = true;
        bVar3.f = Float.valueOf(f3);
        bVar3.g = Float.valueOf(f4);
        defpackage.abxe.d dVar = defpackage.abxe.d.HORIZONTAL;
        akcr.b(dVar, str4);
        bVar2.i = dVar;
        bVar2.h = this.aK;
        evb evb3 = evb2;
        bVar2.j = evb3.f;
        bVar2.k = new z(this, ajVar, evb3);
        bVar2.l = new aa(this, ajVar, evb3);
        abxe abxe = (abxe) igk.a(bVar2.a(), this.T);
        Rect rect = new Rect();
        b bVar4 = this.a;
        if (bVar4 == null) {
            akcr.a(str3);
        }
        View view = (View) bVar4.d.get(evb3.f);
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        int color2 = getResources().getColor(R.color.details_dark_overlay_background_color);
        defpackage.abwz.e eVar3 = new defpackage.abwz.e();
        abxl abxl2 = abxl;
        eVar3.b = abxl2;
        eVar3.a = getContext();
        defpackage.abxr.a aVar2 = new defpackage.abxr.a(ag.a);
        aVar2.a(abxl2);
        aVar2.a(a(), g(), f()).a = Integer.valueOf(0);
        aVar2.a(h()).a(Integer.valueOf(0), Integer.valueOf(color2), 100);
        aVar2.a(j(), k()).a(Integer.valueOf(color2), Integer.valueOf(0), 100);
        aVar2.a(b()).a = Integer.valueOf(color2);
        eVar3.a((abxq) aVar2.a());
        a = f2;
        float f5 = f;
        eVar3.a((abwy) abxe).a(a, this.aJ).b().b((a - this.aI) / 2.0f, (f5 - this.aJ) / 2.0f);
        abxj a6 = eVar3.a(abxi.SWIPE_DOWN);
        a5 = abxl2;
        int i2 = color2;
        abxe abxe2 = abxe;
        float f6 = a;
        akbk abVar = new ab(this, a5, i2, abxe2, f6, f5);
        String str5 = "action";
        akcr.b(abVar, str5);
        a6 = a6;
        a6.b = abVar;
        abVar = new ac(this, a5, i2, abxe2, f6, f5);
        akcr.b(abVar, str5);
        a6.c = abVar;
        this.aO = eVar3.a();
        abwz abwz = this.aO;
        if (abwz == null) {
            akcr.a("details");
        }
        Context context2 = abwz.a;
        if (context2 == null) {
            akcr.a();
        }
        abvs abvs = new abvs(context2);
        abvs.a(abwz.a());
        abvs.a(abwz.b());
        abvs.a(abwz.c());
        abvs.a(abwz.d());
        View view2 = abvs;
        abwz.a(view2);
        abvs.setId(R.id.charms_details_carousel);
        defpackage.akdd.e eVar4 = eVar2;
        eVar4.a = new ah(abvs);
        for (abxl a7 : this.P) {
            a7.a((defpackage.abxl.b) new ae(this, abvs, eVar4));
        }
        abxl2.a((defpackage.abxl.b) new ai(this, abvs));
        abwr abwr = new abwr();
        abwr.a(new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, a, (f5 - this.aJ) / 2.0f));
        abwr.a(new RectF(MapboxConstants.MINIMUM_ZOOM, (f5 + this.aJ) / 2.0f, a, f5));
        abwr.a = new ad(this, a, f5);
        abvs.a((abwx) abwr);
        return view2;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.T.dispose();
    }

    public final void onStart() {
        super.onStart();
        abwz abwz = this.aO;
        if (abwz == null) {
            akcr.a("details");
        }
        abwz.b(s());
    }

    public final void onStop() {
        super.onStop();
        h hVar = this.m;
        if (hVar != null) {
            hVar.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final abxp p() {
        return (abxp) this.ak.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp q() {
        return (abxp) this.al.b();
    }

    /* Access modifiers changed, original: final */
    public final abxp r() {
        return (abxp) this.am.b();
    }

    /* Access modifiers changed, original: final */
    public final abxm s() {
        return (abxm) this.an.b();
    }

    /* Access modifiers changed, original: final */
    public final abxm t() {
        return (abxm) this.ar.b();
    }

    /* Access modifiers changed, original: final */
    public final abxm u() {
        return (abxm) this.as.b();
    }

    /* Access modifiers changed, original: final */
    public final abxm v() {
        return (abxm) this.at.b();
    }
}
