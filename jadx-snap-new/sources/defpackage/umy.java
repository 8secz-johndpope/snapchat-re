package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.ViewStubWrapper;
import com.snap.ui.view.ViewStubWrapper.OnInflatedListener;
import com.snapchat.android.R;

/* renamed from: umy */
public final class umy extends FrameLayout {
    private static int d = 2131559500;
    TextView a;
    ViewStubWrapper<TextView> b;
    int c = 0;
    private ImageView e;
    private ImageView f;
    private final int g;
    private final float h;
    private final float i;

    public umy(Context context, ajdw ajdw) {
        super(context);
        final Resources resources = context.getResources();
        umy.inflate(context, d, this);
        this.f = (ImageView) findViewById(R.id.timer_infinite);
        this.e = (ImageView) findViewById(R.id.timer_icon);
        this.b = new ViewStubWrapper((ViewStub) findViewById(R.id.timer_value_viewstub));
        this.b.setOnInflatedListener(new OnInflatedListener<TextView>() {
            public final /* synthetic */ void onInflated(Object obj) {
                umy umy = umy.this;
                umy.a = (TextView) umy.b.get();
                umy.this.a.setShadowLayer(resources.getDimension(R.dimen.timer_button_text_shadow_radius), MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, resources.getColor(R.color.timer_text_shadow_color));
                if (umy.this.c != 0) {
                    umy = umy.this;
                    umy.a(umy.c);
                    umy.this.c = 0;
                }
            }
        });
        this.b.inflateAsync(ajdw);
        this.g = resources.getDimensionPixelSize(R.dimen.tools_button_padding);
        ImageView imageView = this.e;
        int i = this.g;
        imageView.setPadding(i, i, i, i);
        this.h = (float) resources.getDimensionPixelSize(R.dimen.snap_preview_button_timer_text_size_for_single_digit);
        this.i = (float) resources.getDimensionPixelSize(R.dimen.snap_preview_button_timer_text_size_for_double_digits);
    }

    public final void a() {
        TextView textView = this.a;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f.setVisibility(0);
    }

    public final void a(int i) {
        if (this.a == null) {
            this.c = i;
            return;
        }
        TextView textView;
        float f;
        this.f.setVisibility(8);
        this.a.setVisibility(0);
        if (i > 9) {
            textView = this.a;
            f = this.i;
        } else {
            textView = this.a;
            f = this.h;
        }
        textView.setTextSize(0, f);
        this.a.setText(String.valueOf(i));
    }
}
