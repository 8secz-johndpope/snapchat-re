package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: zje */
public final class zje extends zja {
    private final int a;

    public zje(zjm zjm, int i) {
        akcr.b(zjm, "deckPageType");
        super(zjm, null, null, 4, null);
        this.a = i;
    }

    public final View getContentView() {
        Object inflate = LayoutInflater.from(AppContext.get()).inflate(R.layout.empty_page_layout, null);
        inflate.setBackgroundColor(abtp.a(inflate.getContext(), this.a));
        if (inflate != null) {
            ((TextView) inflate).setText(getDeckPageType().b());
            akcr.a(inflate, "LayoutInflater.from(AppC…pe.tag)\n                }");
            return inflate;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.TextView");
    }
}
