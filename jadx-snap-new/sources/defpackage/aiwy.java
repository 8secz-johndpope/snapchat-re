package defpackage;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: aiwy */
final class aiwy {
    private ArrayList<a> a = new ArrayList();
    private volatile aiuo b = aiuo.IDLE;

    /* renamed from: aiwy$a */
    static final class a {
        final Runnable a;
        final Executor b;
    }

    aiwy() {
    }

    /* Access modifiers changed, original: final */
    public final void a(aiuo aiuo) {
        Preconditions.checkNotNull(aiuo, "newState");
        if (!(this.b == aiuo || this.b == aiuo.SHUTDOWN)) {
            this.b = aiuo;
            if (!this.a.isEmpty()) {
                ArrayList arrayList = this.a;
                this.a = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    aVar.b.execute(aVar.a);
                }
            }
        }
    }
}
