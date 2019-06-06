package defpackage;

import android.net.Uri.Builder;

/* renamed from: addh */
public final class addh {
    public static final Builder a(Builder builder, abbd abbd) {
        if (abbd != null) {
            builder.appendQueryParameter("open_source", abbd.name());
        }
        return builder;
    }
}
