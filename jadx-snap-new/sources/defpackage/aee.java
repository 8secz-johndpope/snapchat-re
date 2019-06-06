package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.ContextThemeWrapper;

/* renamed from: aee */
public final class aee {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Theme theme) {
        try {
            if (a) {
                return ma.b(theme != null ? new ContextThemeWrapper(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.getDrawable(context2, i);
            }
            throw e;
        } catch (NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return hh.a(context2.getResources(), i, theme);
    }
}
