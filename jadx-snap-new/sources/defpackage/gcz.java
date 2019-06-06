package defpackage;

import android.content.Context;
import com.snapchat.android.R;

/* renamed from: gcz */
public final class gcz {
    final aipn<ifb> a;
    private final Context b;

    public gcz(Context context, aipn<ifb> aipn) {
        akcr.b(context, "context");
        akcr.b(aipn, "lazyUserAgent");
        this.b = context;
        this.a = aipn;
    }

    public final String a() {
        Object string = this.b.getString(R.string.effective_request_locale_code);
        if ((akcr.a(string, (Object) "en") ^ 1) != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(";q=1, en;q=0.9");
            string = stringBuilder.toString();
        }
        akcr.a(string, "effeciveLocale");
        return string;
    }
}
