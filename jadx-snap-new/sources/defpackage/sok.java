package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: sok */
public class sok extends spa {
    private final Context h;

    sok(Context context) {
        super(context, g);
        this.h = context;
    }

    public final boolean a(ViewGroup viewGroup) {
        Integer e = this.H.e(sqh.cp);
        if (e == null) {
            return false;
        }
        View.inflate(this.h, e.intValue(), viewGroup);
        return true;
    }

    public final String f() {
        return "TUTORIAL";
    }

    public final boolean h() {
        return true;
    }
}
