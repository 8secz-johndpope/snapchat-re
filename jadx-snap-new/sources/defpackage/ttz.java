package defpackage;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;

/* renamed from: ttz */
public final class ttz extends zly<tqj, tuf> {
    View a;
    ImageView b;
    boolean c;
    private final tyt d = new tyt();
    private final ajei e = new ajei();

    /* renamed from: ttz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ttz$b */
    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ ttz a;

        b(ttz ttz) {
            this.a = ttz;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 0) {
                ttz ttz = this.a;
                boolean z = ttz.c;
                View view = ttz.a;
                String str = "background";
                if (view == null) {
                    akcr.a(str);
                }
                view.animate().cancel();
                ImageView imageView = ttz.b;
                String str2 = "icon";
                if (imageView == null) {
                    akcr.a(str2);
                }
                imageView.animate().cancel();
                View view2;
                ImageView imageView2;
                if (z) {
                    view2 = ttz.a;
                    if (view2 == null) {
                        akcr.a(str);
                    }
                    view2.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(300).setInterpolator(new LinearInterpolator()).start();
                    imageView2 = ttz.b;
                    if (imageView2 == null) {
                        akcr.a(str2);
                    }
                    imageView2.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                } else {
                    view2 = ttz.a;
                    if (view2 == null) {
                        akcr.a(str);
                    }
                    view2.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                    imageView2 = ttz.b;
                    if (imageView2 == null) {
                        akcr.a(str2);
                    }
                    imageView2.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                }
            } else {
                this.a.a();
            }
            this.a.c = true;
        }
    }

    static {
        a aVar = new a();
    }

    public final void a() {
        View view = this.a;
        String str = "background";
        if (view == null) {
            akcr.a(str);
        }
        view.animate().cancel();
        ImageView imageView = this.b;
        String str2 = "icon";
        if (imageView == null) {
            akcr.a(str2);
        }
        imageView.animate().cancel();
        view = this.a;
        if (view == null) {
            akcr.a(str);
        }
        view.setAlpha(1.0f);
        imageView = this.b;
        if (imageView == null) {
            akcr.a(str2);
        }
        imageView.setAlpha(1.0f);
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        akcr.b((tqj) zlx, "bindingContext");
        akcr.b(view, "itemView");
        Object findViewById = view.findViewById(R.id.background);
        akcr.a(findViewById, "itemView.findViewById(R.id.background)");
        this.a = findViewById;
        View findViewById2 = view.findViewById(R.id.motion_filter_icon);
        if (findViewById2 != null) {
            this.b = (ImageView) findViewById2;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.ImageView");
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        tuf tuf = (tuf) zmy;
        akcr.b(tuf, MapboxEvent.KEY_MODEL);
        getItemView().setContentDescription(tuf.a.name());
        ImageView imageView = this.b;
        if (imageView == null) {
            akcr.a("icon");
        }
        imageView.setImageResource(tyt.a(tuf.a));
        this.e.a(((tqj) e()).a().j(ajfu.a).f((ajfb) new b(this)));
    }

    public final void onRecycle() {
        super.onRecycle();
        this.e.a();
        a();
    }
}
