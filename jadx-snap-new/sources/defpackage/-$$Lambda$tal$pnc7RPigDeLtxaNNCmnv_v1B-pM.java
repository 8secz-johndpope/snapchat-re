package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Supplier;

/* compiled from: lambda */
/* renamed from: -$$Lambda$tal$pnc7RPigDeLtxaNNCmnv_v1B-pM */
public final /* synthetic */ class -$$Lambda$tal$pnc7RPigDeLtxaNNCmnv_v1B-pM implements Supplier {
    public static final /* synthetic */ -$$Lambda$tal$pnc7RPigDeLtxaNNCmnv_v1B-pM INSTANCE = new -$$Lambda$tal$pnc7RPigDeLtxaNNCmnv_v1B-pM();

    private /* synthetic */ -$$Lambda$tal$pnc7RPigDeLtxaNNCmnv_v1B-pM() {
    }

    public final Object get() {
        return new Handler(Looper.getMainLooper());
    }
}
