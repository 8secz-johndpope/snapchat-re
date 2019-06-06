package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.snapchat.android.R;
import defpackage.lkn.b;

/* renamed from: lkm */
public final class lkm implements lkn {
    final Context a;
    final Supplier<sdu> b;

    /* renamed from: lkm$a */
    static final class a implements ajev {
        private /* synthetic */ lkm a;
        private /* synthetic */ b b;

        a(lkm lkm, b bVar) {
            this.a = lkm;
            this.b = bVar;
        }

        public final void run() {
            if (this.b instanceof defpackage.lkn.b.a) {
                String string = this.a.a.getString(R.string.lenses_app_notification_native_support_not_available);
                akcr.a((Object) string, "context.getString(R.stri…ve_support_not_available)");
                ((sdu) this.a.b.get()).b(sdt.a(new seg(string, Integer.valueOf(R.color.error_red), 12)).a(sec.LENSES_IN_APP).a());
                return;
            }
            throw new ajxk();
        }
    }

    public lkm(Context context, Supplier<sdu> supplier) {
        akcr.b(context, "context");
        akcr.b(supplier, "notificationEmitter");
        this.a = context;
        this.b = supplier;
    }

    public final ajcx a(b bVar) {
        akcr.b(bVar, "notification");
        Object a = ajcx.a((ajev) new a(this, bVar));
        akcr.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }
}
