package defpackage;

import android.widget.ImageView;
import com.google.common.base.Preconditions;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;

/* renamed from: ekg */
public class ekg {
    final ImageView a;
    final eea b = new eea(this.a);

    public ekg(ViewFinder viewFinder) {
        this.a = (ImageView) Preconditions.checkNotNull(viewFinder.findViewById(R.id.camera_flip_button));
        this.a.setOnTouchListener(this.b);
    }

    public final ajdp<Object> a() {
        return ajpy.k(cfl.c(this.a)).a();
    }

    public final void a(ebx ebx) {
        this.a.setSelected(ebx == ebx.BACK_FACING);
    }

    public final void a(boolean z) {
        this.a.setVisibility(z ? 0 : 4);
    }
}
