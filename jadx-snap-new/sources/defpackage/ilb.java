package defpackage;

import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.imageloading.view.SnapAnimatedImageView;
import com.snapchat.android.R;
import defpackage.jvy.b.a;

/* renamed from: ilb */
public final class ilb extends ilc {
    private final ajxe a = ajxh.a(new b(this));
    private SnapAnimatedImageView b;

    /* renamed from: ilb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ilb$b */
    static final class b extends akcs implements akbk<idj> {
        private /* synthetic */ ilb a;

        b(ilb ilb) {
            this.a = ilb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((tqj) this.a.e()).l.getPage();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ilb.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/StaticUiPage;");
        a aVar = new a();
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: a */
    public final void onBind(ilj ilj, ilj ilj2) {
        akcr.b(ilj, MapboxEvent.KEY_MODEL);
        super.onBind(ilj, ilj2);
        SnapAnimatedImageView snapAnimatedImageView = this.b;
        if (snapAnimatedImageView == null) {
            akcr.a("imageView");
        }
        snapAnimatedImageView.a(new a().a().b().c());
        snapAnimatedImageView.a(ilj.d, (idj) this.a.b());
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(tqj tqj, View view) {
        akcr.b(tqj, "bindingContext");
        akcr.b(view, "itemView");
        super.a(tqj, view);
        Object findViewById = view.findViewById(R.id.image);
        akcr.a(findViewById, "itemView.findViewById(R.id.image)");
        this.b = (SnapAnimatedImageView) findViewById;
    }

    public final void onRecycle() {
        super.onRecycle();
        SnapAnimatedImageView snapAnimatedImageView = this.b;
        if (snapAnimatedImageView == null) {
            akcr.a("imageView");
        }
        snapAnimatedImageView.c();
    }
}
