package defpackage;

import com.google.common.base.Supplier;
import com.snapchat.android.framework.misc.AppContext;

/* compiled from: lambda */
/* renamed from: -$$Lambda$ifs$taPg5_V-xpKiVq2kPlPhiI_KJGw */
public final /* synthetic */ class -$$Lambda$ifs$taPg5_V-xpKiVq2kPlPhiI_KJGw implements Supplier {
    public static final /* synthetic */ -$$Lambda$ifs$taPg5_V-xpKiVq2kPlPhiI_KJGw INSTANCE = new -$$Lambda$ifs$taPg5_V-xpKiVq2kPlPhiI_KJGw();

    private /* synthetic */ -$$Lambda$ifs$taPg5_V-xpKiVq2kPlPhiI_KJGw() {
    }

    public final Object get() {
        return AppContext.get().getSharedPreferences("permission_ask_status", 0);
    }
}
