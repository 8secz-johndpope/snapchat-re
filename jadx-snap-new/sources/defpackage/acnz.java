package defpackage;

import android.content.Context;
import com.snapchat.map.feature.carousel.MapCardsRecyclerView;

/* renamed from: acnz */
public final class acnz extends MapCardsRecyclerView {
    acny c;

    public acnz(Context context) {
        super(context);
    }

    public final void a(acny acny) {
        this.c = acny;
        super.setAdapter(acny);
    }

    public final void a(acow acow) {
        abmr.a();
        int size = this.c.a() == null ? 0 : this.c.a().size();
        this.c.a(acow);
        int size2 = acow.a().size();
        if ((size == 1 && size2 > 1) || (size2 == 1 && size > 1)) {
            a();
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    public final boolean canScrollVertically(int i) {
        return true;
    }
}
