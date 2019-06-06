package defpackage;

import java.util.List;

/* renamed from: rzo */
public final class rzo<Req extends sak, PendingState, ExecutingState> implements rys<Req, PendingState, ExecutingState> {
    private final List<a<Req, PendingState, ExecutingState>> a;

    /* renamed from: rzo$a */
    public interface a<Req extends sak, PendingState, ExecutingState> {
        ryv<Req> a(PendingState pendingState, ExecutingState executingState);
    }

    public rzo(List<a<Req, PendingState, ExecutingState>> list) {
        this.a = list;
    }

    public final ryv<Req> a(PendingState pendingState, ExecutingState executingState) {
        for (a a : this.a) {
            ryv a2 = a.a(pendingState, executingState);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
