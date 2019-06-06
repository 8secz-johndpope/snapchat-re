package defpackage;

import android.widget.ImageView;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;

/* renamed from: ekd */
public class ekd {
    public final ImageView a;
    public final eea b = new eea(this.a);
    private final float c;
    private final long d;

    public ekd(ViewFinder viewFinder) {
        this.a = (ImageView) Preconditions.checkNotNull(viewFinder.findViewById(R.id.camera_flash_button));
        this.a.setOnTouchListener(this.b);
        this.c = -this.a.getResources().getDimension(R.dimen.camera_fade_out_animation_translation_y);
        this.d = (long) this.a.getResources().getInteger(R.integer.camera_fade_out_animation_duration);
    }

    public final void a() {
        zil.a(this.a, 0, 1.0f, MapboxConstants.MINIMUM_ZOOM);
    }

    public final void b() {
        zil.a(this.a, this.c, this.d);
    }
}
