package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: sdc */
public final class sdc {
    static final ImmutableList<sdr> a(List<sdr> list) {
        ImmutableList copyOf;
        synchronized (list) {
            copyOf = ImmutableList.copyOf((Collection) list);
        }
        return copyOf;
    }
}
