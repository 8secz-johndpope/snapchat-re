package defpackage;

import android.content.Context;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapFontTextView;
import defpackage.abry.a;

/* renamed from: tba */
public final class tba extends SnapFontTextView {
    public int b = -1;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public String l = "";
    public boolean m;
    public a n;
    public siw o;
    private final absl p;

    public tba(Context context) {
        super(context);
        this.p = new absl(context);
        setGravity(17);
    }

    public final void a() {
        animate().cancel();
        setAlpha(1.0f);
    }

    public final void a(int i, int i2) {
        animate().alpha(MapboxConstants.MINIMUM_ZOOM).setStartDelay((long) i2).setDuration((long) i);
    }
}
