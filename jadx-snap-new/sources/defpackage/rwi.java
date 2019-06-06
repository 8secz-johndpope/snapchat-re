package defpackage;

import android.content.Context;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snapchat.android.R;

/* renamed from: rwi */
public final class rwi extends zgi {
    final Context a;
    final ajwy<sdu> b;
    private final ajwy<oex> c;

    /* renamed from: rwi$a */
    static final class a<T> implements ajfb<vjg> {
        private /* synthetic */ rwi a;

        a(rwi rwi) {
            this.a = rwi;
        }

        public final /* synthetic */ void accept(Object obj) {
            vjg vjg = (vjg) obj;
            boolean z = vjg instanceof vjf;
            Integer valueOf = Integer.valueOf(R.color.regular_blue);
            String str = "exportString";
            rwi rwi;
            int b;
            String quantityString;
            if (z) {
                rwi = this.a;
                b = vjg.b();
                quantityString = rwi.a.getResources().getQuantityString(R.plurals.media_export_service_processing, b, new Object[]{Integer.valueOf(b)});
                akcr.a((Object) quantityString, str);
                ((sdu) rwi.b.get()).b(sdt.a(new seg(quantityString, valueOf, 12)).a(sec.EXPORT_STARTED).a());
            } else if (vjg instanceof vjc) {
                rwi rwi2 = this.a;
                String string = rwi2.a.getString(R.string.in_app_export_failed);
                akcr.a((Object) string, "context.getString(R.string.in_app_export_failed)");
                ((sdu) rwi2.b.get()).b(sdt.a(new seg(string, Integer.valueOf(R.color.regular_red), 12)).a(sec.EXPORT_FAILED).a());
            } else {
                if (vjg instanceof vje) {
                    rwi = this.a;
                    b = vjg.b();
                    quantityString = rwi.a.getResources().getQuantityString(R.plurals.media_export_service_success, b, new Object[]{Integer.valueOf(b)});
                    akcr.a((Object) quantityString, str);
                    ((sdu) rwi.b.get()).b(sdt.a(new seg(quantityString, valueOf, 12)).a(sec.EXPORT_SUCCESS).a());
                }
            }
        }
    }

    public rwi(zgk<b> zgk, Context context, ajwy<sdu> ajwy, ajwy<oex> ajwy2) {
        akcr.b(zgk, "taskScoper");
        akcr.b(context, "context");
        akcr.b(ajwy, "notificationEmitter");
        akcr.b(ajwy2, "notifier");
        super(zgk);
        this.a = context;
        this.b = ajwy;
        this.c = ajwy2;
    }

    public final ajej a() {
        Object f = ((oex) this.c.get()).a().f((ajfb) new a(this));
        akcr.a(f, "notifier.get().observeEx…      }\n                }");
        return f;
    }
}
