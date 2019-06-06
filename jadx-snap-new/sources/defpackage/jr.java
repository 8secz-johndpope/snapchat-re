package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.MenuItem;

/* renamed from: jr */
public final class jr {
    public static final c a = (VERSION.SDK_INT >= 26 ? new a() : new b());

    /* renamed from: jr$c */
    public interface c {
        void a(MenuItem menuItem, char c, int i);

        void a(MenuItem menuItem, ColorStateList colorStateList);

        void a(MenuItem menuItem, Mode mode);

        void a(MenuItem menuItem, CharSequence charSequence);

        void b(MenuItem menuItem, char c, int i);

        void b(MenuItem menuItem, CharSequence charSequence);
    }

    /* renamed from: jr$b */
    static class b implements c {
        b() {
        }

        public void a(MenuItem menuItem, char c, int i) {
        }

        public void a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        public void a(MenuItem menuItem, Mode mode) {
        }

        public void a(MenuItem menuItem, CharSequence charSequence) {
        }

        public void b(MenuItem menuItem, char c, int i) {
        }

        public void b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    /* renamed from: jr$a */
    static class a extends b {
        a() {
        }

        public final void a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        public final void a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        public final void a(MenuItem menuItem, Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        public final void a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        public final void b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        public final void b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
