package defpackage;

import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanFilter.Builder;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xbm */
public final class xbm implements aiqc<List<ScanFilter>> {
    static final xbm a = new xbm();

    public final /* synthetic */ Object get() {
        ArrayList arrayList = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            arrayList.add(new Builder().build());
        }
        return (List) aiqf.a(arrayList, "Cannot return null from a non-@Nullable @Provides method");
    }
}
