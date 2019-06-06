package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abry.a;

/* renamed from: abrz */
public final class abrz {
    public static Typeface a(Context context, a aVar) {
        try {
            return hh.a(context, aVar.mResId);
        } catch (NotFoundException | NullPointerException unused) {
            return Typeface.DEFAULT;
        }
    }

    public static BufferType a(BufferType bufferType) {
        return abnl.q ? bufferType : bufferType == BufferType.EDITABLE ? BufferType.EDITABLE : BufferType.SPANNABLE;
    }

    public static void a(TextView textView, float f) {
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            if (!abnl.q || VERSION.SDK_INT < 21) {
                textView.setSpannableFactory(new abrx(f));
            } else {
                textView.setLetterSpacing(f);
            }
        }
    }
}
