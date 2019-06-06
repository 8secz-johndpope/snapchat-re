package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;

/* renamed from: ttx */
public final class ttx extends zly<tqj, tue> {
    boolean a;
    private SnapImageView b;
    private LoadingSpinnerView c;
    private final ajei d = new ajei();

    /* renamed from: ttx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ttx$b */
    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ ttx a;
        private /* synthetic */ tue b;

        b(ttx ttx, tue tue) {
            this.a = ttx;
            this.b = tue;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 0) {
                this.a.a(this.b);
            } else {
                this.a.a();
            }
            this.a.a = true;
        }
    }

    static {
        a aVar = new a();
    }

    private final void b() {
        a();
        getItemView().animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(1000).setInterpolator(new AccelerateDecelerateInterpolator()).start();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        getItemView().animate().cancel();
        getItemView().setAlpha(1.0f);
        LoadingSpinnerView loadingSpinnerView = this.c;
        if (loadingSpinnerView == null) {
            akcr.a("loadingSpinner");
        }
        loadingSpinnerView.setAlpha(MapboxConstants.MINIMUM_ZOOM);
    }

    /* Access modifiers changed, original: final */
    public final void a(tue tue) {
        int i = tty.a[tue.c.ordinal()];
        if (i == 1) {
            LoadingSpinnerView loadingSpinnerView = this.c;
            if (loadingSpinnerView == null) {
                akcr.a("loadingSpinner");
            }
            loadingSpinnerView.setAlpha(1.0f);
        } else if (i != 2) {
            if (i == 3) {
                b();
            }
        } else {
            a();
        }
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        akcr.b((tqj) zlx, "bindingContext");
        akcr.b(view, "itemView");
        Object findViewById = view.findViewById(R.id.lens_icon);
        akcr.a(findViewById, "itemView.findViewById(R.id.lens_icon)");
        this.b = (SnapImageView) findViewById;
        findViewById = view.findViewById(R.id.loading_progress_view);
        akcr.a(findViewById, "itemView.findViewById(R.id.loading_progress_view)");
        this.c = (LoadingSpinnerView) findViewById;
        LoadingSpinnerView loadingSpinnerView = this.c;
        if (loadingSpinnerView == null) {
            akcr.a("loadingSpinner");
        }
        loadingSpinnerView.a(-1);
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        tue tue = (tue) zmy;
        akcr.b(tue, MapboxEvent.KEY_MODEL);
        SnapImageView snapImageView = this.b;
        if (snapImageView == null) {
            akcr.a("icon");
        }
        snapImageView.setImageUri(tue.b, toc.d.getPage());
        a(tue);
        this.d.a(((tqj) e()).a().j(ajfu.a).f((ajfb) new b(this, tue)));
    }

    public final void onRecycle() {
        super.onRecycle();
        this.d.a();
        a();
    }
}
