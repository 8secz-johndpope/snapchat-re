package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.base.Predicate;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.jxj.b;
import defpackage.siw.a;
import defpackage.siw.c;
import java.util.Collections;
import java.util.List;

/* renamed from: snj */
public class snj extends smz {
    public static Predicate<sqh> k = new c();
    private static String m = "GIF";
    private static final idl n = new b();
    private SnapImageView l;

    /* renamed from: snj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: snj$c */
    public static final class c implements Predicate<sqh> {
        public final /* synthetic */ boolean apply(Object obj) {
            sqh sqh = (sqh) obj;
            return (sqh != null ? (spu) sqh.a(sqh.H) : null) == spu.GIF;
        }
    }

    /* renamed from: snj$b */
    public static final class b implements idl {

        /* renamed from: snj$b$a */
        public static final class a extends ide {
            a(String str, idi idi) {
                super(str, idi);
            }
        }

        b() {
        }

        public final ide getFeature() {
            return new a("Opera", idi.OPERA);
        }

        public final List<String> getHierarchy() {
            Object singletonList = Collections.singletonList("GifImageLayerViewController");
            akcr.a(singletonList, "Collections.singletonLis…mageLayerViewController\")");
            return singletonList;
        }
    }

    static {
        a aVar = new a();
    }

    public snj(Context context) {
        akcr.b(context, "context");
        this(context, new SnapImageView(context, null, 0, null, 14, null));
    }

    private snj(Context context, SnapImageView snapImageView) {
        akcr.b(context, "context");
        akcr.b(snapImageView, "imageView");
        this(context, m);
        snapImageView.setMinimumHeight(1);
        snapImageView.setMinimumWidth(1);
        this.l = snapImageView;
        abth abth = this.a;
        snapImageView = this.l;
        if (snapImageView == null) {
            akcr.a("snapImageView");
        }
        abth.addView(snapImageView);
    }

    private snj(Context context, String str) {
        akcr.b(context, "context");
        akcr.b(str, "layerType");
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        SnapImageView snapImageView = this.l;
        if (snapImageView == null) {
            akcr.a("snapImageView");
        }
        snapImageView.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(c cVar) {
        akcr.b(cVar, "disposableBitmap");
        I();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(sqf sqf, int i, int i2, a aVar) {
        if (sqf == null) {
            akcr.a();
        }
        SnapImageView snapImageView = this.l;
        String str = "snapImageView";
        if (snapImageView == null) {
            akcr.a(str);
        }
        snapImageView.setVisibility(0);
        Object e = new b.a().a((int) R.color.regular_grey).e(true);
        akcr.a(e, "ViewBitmapLoader.Request…            .setGif(true)");
        SnapImageView snapImageView2 = this.l;
        if (snapImageView2 == null) {
            akcr.a(str);
        }
        e = e.b();
        akcr.a(e, "builder.build()");
        snapImageView2.setRequestOptions(e);
        snapImageView = this.l;
        if (snapImageView == null) {
            akcr.a(str);
        }
        Object parse = Uri.parse(sqf.b());
        akcr.a(parse, "Uri.parse(mediaInfo.mediaUri)");
        snapImageView.setImageUri(parse, n);
    }

    public final void b() {
        super.b();
        SnapImageView snapImageView = this.l;
        if (snapImageView == null) {
            akcr.a("snapImageView");
        }
        snapImageView.clear();
    }

    public final String f() {
        return m;
    }
}
