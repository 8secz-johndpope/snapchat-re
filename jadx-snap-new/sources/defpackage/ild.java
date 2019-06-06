package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.geofilters.ui.view.SelfScalingImageView;
import com.snapchat.android.R;
import defpackage.jxj.a;

/* renamed from: ild */
public final class ild extends ilc {
    private final ajxe a = ajxh.a(new b(this));
    private SelfScalingImageView b;

    /* renamed from: ild$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ild$c */
    public static final class c implements a {
        private /* synthetic */ SelfScalingImageView a;
        private /* synthetic */ ild b;
        private /* synthetic */ ilj c;

        c(SelfScalingImageView selfScalingImageView, ild ild, ilj ilj) {
            this.a = selfScalingImageView;
            this.b = ild;
            this.c = ilj;
        }

        public final void onFailure(jwl jwl) {
            akcr.b(jwl, "failureReason");
        }

        public final void onImageReady(jwv jwv) {
            akcr.b(jwv, "metrics");
            SelfScalingImageView selfScalingImageView = this.a;
            int i = this.c.b;
            int i2 = jwv.a;
            int i3 = jwv.b;
            ikz ikz = selfScalingImageView.a;
            if (ikz != null) {
                ikz.a(i, i2, i3);
            }
        }
    }

    /* renamed from: ild$b */
    static final class b extends akcs implements akbk<idj> {
        private /* synthetic */ ild a;

        b(ild ild) {
            this.a = ild;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((tqj) this.a.e()).l.getPage();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ild.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/StaticUiPage;");
        a aVar = new a();
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: a */
    public final void onBind(ilj ilj, ilj ilj2) {
        akcr.b(ilj, MapboxEvent.KEY_MODEL);
        super.onBind(ilj, ilj2);
        SelfScalingImageView selfScalingImageView = this.b;
        if (selfScalingImageView == null) {
            akcr.a("imageView");
        }
        selfScalingImageView.setRequestListener(new c(selfScalingImageView, this, ilj));
        selfScalingImageView.setScaleType(ilj.a);
        LayoutParams layoutParams = selfScalingImageView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = ilj.b;
            selfScalingImageView.setLayoutParams(layoutParams2);
            selfScalingImageView.setImageUri(ilj.d, (idj) this.a.b());
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(tqj tqj, View view) {
        akcr.b(tqj, "bindingContext");
        akcr.b(view, "itemView");
        super.a(tqj, view);
        Object findViewById = view.findViewById(R.id.image);
        akcr.a(findViewById, "itemView.findViewById(R.id.image)");
        this.b = (SelfScalingImageView) findViewById;
    }

    public final void onRecycle() {
        super.onRecycle();
        SelfScalingImageView selfScalingImageView = this.b;
        if (selfScalingImageView == null) {
            akcr.a("imageView");
        }
        selfScalingImageView.clear();
    }
}
