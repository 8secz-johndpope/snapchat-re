package defpackage;

import com.google.common.base.Predicate;
import java.util.Set;

/* compiled from: lambda */
/* renamed from: -$$Lambda$yxo$IMzjktOuz3PBx7cmIVJdSgiMOhI */
public final /* synthetic */ class -$$Lambda$yxo$IMzjktOuz3PBx7cmIVJdSgiMOhI implements Predicate {
    private final /* synthetic */ Set f$0;

    public /* synthetic */ -$$Lambda$yxo$IMzjktOuz3PBx7cmIVJdSgiMOhI(Set set) {
        this.f$0 = set;
    }

    public final boolean apply(Object obj) {
        return this.f$0.contains(((abjv) obj).a());
    }
}
