package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: absj */
public final class absj {
    private final Context a;
    private final int b;
    private int c;
    private int d;

    /* renamed from: absj$a */
    public static class a {
        public static final absj a = new absj(AppContext.get(), (byte) 0);
    }

    private absj(Context context) {
        this.b = 25;
        this.a = context;
    }

    /* synthetic */ absj(Context context, byte b) {
        this(context);
    }

    @Deprecated
    public static absj a() {
        return a.a;
    }

    public final void a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + b(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    public final int b() {
        if (this.c == 0) {
            Resources resources = this.a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            this.c = identifier > 0 ? resources.getDimensionPixelSize(identifier) : abso.a(25.0f, this.a);
        }
        return this.c;
    }

    public final void b(View view) {
        view.setPadding(view.getPaddingStart(), view.getPaddingTop() + b(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public final int c() {
        if (this.d == 0) {
            this.d = this.a.getResources().getDimensionPixelSize(R.dimen.neon_header_height) + b();
        }
        return this.d;
    }
}
