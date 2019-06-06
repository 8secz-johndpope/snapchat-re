package defpackage;

import android.app.Activity;
import com.google.common.base.Supplier;
import com.snapchat.android.R;

/* compiled from: lambda */
/* renamed from: -$$Lambda$ejg$29bCIEK-t0C0XNW2KZOcBTsMX0s */
public final /* synthetic */ class -$$Lambda$ejg$29bCIEK-t0C0XNW2KZOcBTsMX0s implements Supplier {
    private final /* synthetic */ Activity f$0;

    public /* synthetic */ -$$Lambda$ejg$29bCIEK-t0C0XNW2KZOcBTsMX0s(Activity activity) {
        this.f$0 = activity;
    }

    public final Object get() {
        return Float.valueOf(this.f$0.getResources().getDimension(R.dimen.camera_hands_free_tooltip_translation_y));
    }
}
