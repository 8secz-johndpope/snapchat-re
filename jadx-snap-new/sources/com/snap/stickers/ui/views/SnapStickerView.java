package com.snap.stickers.ui.views;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.idl;
import defpackage.iha;
import defpackage.xyz;
import defpackage.yeb;
import defpackage.yec;

public final class SnapStickerView extends FrameLayout {
    public yeb a;
    private final ajxe b;
    private AttributeSet c;
    private int d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<T> implements ajfb<yeb> {
        private /* synthetic */ SnapStickerView a;
        private /* synthetic */ Uri b;
        private /* synthetic */ idl c;

        b(SnapStickerView snapStickerView, Uri uri, idl idl) {
            this.a = snapStickerView;
            this.b = uri;
            this.c = idl;
        }

        public final /* synthetic */ void accept(Object obj) {
            yeb yeb = (yeb) obj;
            SnapStickerView snapStickerView = this.a;
            snapStickerView.a = yeb;
            yeb = snapStickerView.a;
            snapStickerView.addView(yeb != null ? yeb.b() : null);
            yeb = this.a.a;
            if (yeb != null) {
                yeb.a(this.b, this.c, null);
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

    static final class d extends akcs implements akbl<yec, ajxw> {
        final /* synthetic */ String a;
        final /* synthetic */ xyz b;
        final /* synthetic */ Uri c;

        /* renamed from: com.snap.stickers.ui.views.SnapStickerView$d$1 */
        static final class AnonymousClass1 extends akcs implements akbl<yec, String> {
            private /* synthetic */ d a;

            AnonymousClass1(d dVar) {
                this.a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((yec) obj, "receiver$0");
                return this.a.a;
            }
        }

        /* renamed from: com.snap.stickers.ui.views.SnapStickerView$d$2 */
        static final class AnonymousClass2 extends akcs implements akbl<yec, ajdx<iha>> {
            private /* synthetic */ d a;

            AnonymousClass2(d dVar) {
                this.a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((yec) obj, "receiver$0");
                return this.a.b.b;
            }
        }

        /* renamed from: com.snap.stickers.ui.views.SnapStickerView$d$3 */
        static final class AnonymousClass3 extends akcs implements akbl<yec, Uri> {
            private /* synthetic */ d a;

            AnonymousClass3(d dVar) {
                this.a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((yec) obj, "receiver$0");
                return this.a.c;
            }
        }

        d(String str, xyz xyz, Uri uri) {
            this.a = str;
            this.b = xyz;
            this.c = uri;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            yec yec = (yec) obj;
            akcr.b(yec, "receiver$0");
            yec.g(new AnonymousClass1(this));
            yec.a(new AnonymousClass2(this));
            yec.h(new AnonymousClass3(this));
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbk<ajei> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SnapStickerView.class), "snapStickerViewDisposable", "getSnapStickerViewDisposable()Lio/reactivex/disposables/CompositeDisposable;");
        a aVar = new a();
    }

    public SnapStickerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private SnapStickerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = ajxh.a(e.a);
        this.c = attributeSet;
        this.d = 0;
    }

    private final ajei a() {
        return (ajei) this.b.b();
    }

    private final void a(Uri uri, idl idl, int i, String str, xyz xyz, Uri uri2) {
        removeAllViews();
        Object context = getContext();
        akcr.a(context, "context");
        ajej a = defpackage.yeb.b.a(new yec(uri, idl, context, i, new d(null, xyz, null)), false).a((ajfb) new b(this, uri, idl), (ajfb) c.a);
        akcr.a((Object) a, "SnapImageWrapper.createV… Uri\")\n                })");
        ajvv.a(a, a());
    }

    private void a(Uri uri, idl idl, int i, xyz xyz) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(idl, "uiPage");
        akcr.b(xyz, "bindingContext");
        yeb yeb = this.a;
        if (yeb != null) {
            if (yeb.c() != uri.getBooleanQueryParameter("animated", false)) {
                a(uri, idl, i, null, xyz, null);
                return;
            } else {
                yeb.a(uri, idl, null);
                return;
            }
        }
        a(uri, idl, i, null, xyz, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a().a();
    }
}
