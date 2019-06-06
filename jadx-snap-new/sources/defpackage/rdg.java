package defpackage;

import android.content.Context;
import android.view.View;
import com.snap.core.db.record.StoryInteractionSignalsModel;
import java.lang.ref.WeakReference;

/* renamed from: rdg */
public final class rdg extends ajed implements zma {
    final WeakReference<Context> a;
    private final rbp b;

    /* renamed from: rdg$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ rdg a;

        a(rdg rdg) {
            this.a = rdg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            qzi qzi = (qzi) obj;
            akcr.b(qzi, "it");
            return qzi.a == qzf.UNDEFINED ? znk.a : znk.a(new ref(this.a.a, qzi));
        }
    }

    /* renamed from: rdg$b */
    static final class b<T1, T2, R> implements ajex<Boolean, znh<zmy>, znh<zmy>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            znh znh = (znh) obj2;
            akcr.b(bool, StoryInteractionSignalsModel.ISHIDDEN);
            akcr.b(znh, "viewModels");
            return bool.booleanValue() ? znk.a : znh;
        }
    }

    public rdg(Context context, rbp rbp) {
        akcr.b(context, "context");
        akcr.b(rbp, "dataSource");
        this.b = rbp;
        this.a = new WeakReference(context);
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        Object a = ajdp.a((ajdt) this.b.a, (ajdt) this.b.i.p(new a(this)), (ajex) b.a);
        akcr.a(a, "Observable.combineLatest…          }\n            )");
        return a;
    }

    public final void onDispose() {
        this.b.h.dispose();
    }
}
