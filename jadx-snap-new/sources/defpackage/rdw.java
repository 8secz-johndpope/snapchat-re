package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import com.snapchat.android.R;
import java.util.Calendar;

/* renamed from: rdw */
public final class rdw {
    final Calendar a;
    final Drawable b;
    final Drawable c;
    final int d;
    final int e;
    final int f;
    final float g;
    private final ajxe h;

    /* renamed from: rdw$a */
    static final class a extends akcs implements akbk<Context> {
        private /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.a;
            if (context != null) {
                context = context.getApplicationContext();
                if (context != null) {
                    return context;
                }
            }
            throw new IllegalStateException("Invalid context");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rdw.class), "context", "getContext()Landroid/content/Context;");
    }

    public rdw(Context context, ihh ihh) {
        akcr.b(ihh, "clock");
        this.h = ajxh.a(new a(context));
        Object instance = Calendar.getInstance();
        akcr.a(instance, "calendar");
        instance.setTimeInMillis(ihh.a());
        this.a = instance;
        instance = ContextCompat.getDrawable(a(), R.drawable.ff_timestamp_separator_background);
        if (instance == null) {
            akcr.a();
        }
        int dimensionPixelOffset = a().getResources().getDimensionPixelOffset(R.dimen.ff_friends_feed_status_separator_size);
        instance.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
        String str = "ContextCompat.getDrawabl…s(0, 0, size, size)\n    }";
        akcr.a(instance, str);
        this.b = instance;
        instance = ContextCompat.getDrawable(a(), R.drawable.ff_official_badge);
        if (instance == null) {
            akcr.a();
        }
        int dimensionPixelOffset2 = a().getResources().getDimensionPixelOffset(R.dimen.ff_friends_feed_subtext_icon_size);
        instance.setBounds(0, 0, dimensionPixelOffset2, dimensionPixelOffset2);
        akcr.a(instance, str);
        this.c = instance;
        this.d = a().getResources().getDimensionPixelOffset(R.dimen.ff_feed_cell_primary_text_size);
        this.e = a().getResources().getDimensionPixelOffset(R.dimen.ff_feed_cell_secondary_text_size);
        this.f = a().getResources().getDimensionPixelOffset(R.dimen.ff_friends_feed_secondary_text_margin);
        this.g = a().getResources().getDimension(R.dimen.ff_friends_feed_friendmoji_text_size);
    }

    private Context a() {
        return (Context) this.h.b();
    }

    public final String a(int i) {
        in.a("");
        try {
            String string = a().getResources().getString(i);
            return string;
        } finally {
            in.a();
        }
    }

    public final int b(int i) {
        in.a("");
        try {
            i = ContextCompat.getColor(a(), i);
            return i;
        } finally {
            in.a();
        }
    }
}
