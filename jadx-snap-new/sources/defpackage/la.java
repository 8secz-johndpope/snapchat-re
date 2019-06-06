package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: la */
public final class la {
    public static final b a = (VERSION.SDK_INT >= 21 ? new c() : new a());

    /* renamed from: la$a */
    static class a implements b {
        a() {
        }

        public ColorStateList a(ImageView imageView) {
            return imageView instanceof lg ? ((lg) imageView).getSupportImageTintList() : null;
        }

        public void a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof lg) {
                ((lg) imageView).setSupportImageTintList(colorStateList);
            }
        }

        public void a(ImageView imageView, Mode mode) {
            if (imageView instanceof lg) {
                ((lg) imageView).setSupportImageTintMode(mode);
            }
        }

        public Mode b(ImageView imageView) {
            return imageView instanceof lg ? ((lg) imageView).getSupportImageTintMode() : null;
        }
    }

    /* renamed from: la$c */
    static class c extends a {
        c() {
        }

        public final ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        public final void a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        public final void a(ImageView imageView, Mode mode) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (drawable != null && obj != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        public final Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    /* renamed from: la$b */
    public interface b {
        ColorStateList a(ImageView imageView);

        void a(ImageView imageView, ColorStateList colorStateList);

        void a(ImageView imageView, Mode mode);

        Mode b(ImageView imageView);
    }

    public static ColorStateList a(ImageView imageView) {
        return a.a(imageView);
    }

    public static void a(ImageView imageView, ColorStateList colorStateList) {
        a.a(imageView, colorStateList);
    }

    public static void a(ImageView imageView, Mode mode) {
        a.a(imageView, mode);
    }
}
