package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: rlc */
public abstract class rlc extends rkp<rnn> {

    /* renamed from: rlc$a */
    public enum a {
        DEFAULT_ONLY,
        SEARCH_ONLY
    }

    public rlc(riq riq, Context context) {
        super(riq, context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(List<? extends rjd> list) {
        e().a(a(), list.size());
        e().a((List) list);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(List<? extends rjd> list) {
        e().a(5, list.size());
    }
}
