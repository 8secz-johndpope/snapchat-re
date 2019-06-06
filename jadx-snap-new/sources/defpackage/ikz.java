package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: ikz */
public final class ikz {
    private static a e = new a();
    public int a = 17;
    public int b;
    public int c;
    private final ImageView d;

    /* renamed from: ikz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private static Rect a(int i, int i2, int i3, int i4, int i5) {
            float f = (float) i;
            float f2 = (float) i2;
            b bVar = (f / f2) / (((float) i3) / ((float) i4)) > 1.0f ? new b((int) (((float) (i * i4)) / f2), i4) : new b(i3, (int) (((float) (i2 * i3)) / f));
            Rect rect = new Rect();
            if (abtp.c(i5)) {
                rect.left = bVar.a - i3;
            } else if (abtp.d(i5)) {
                rect.right = bVar.a - i3;
            }
            if (abtp.a(i5)) {
                rect.top = bVar.b - i4;
            } else if (abtp.b(i5)) {
                rect.bottom = bVar.b - i4;
            }
            return rect;
        }

        private static b a(int i, int i2) {
            return new b(i, i2);
        }

        private static b a(int i, int i2, int i3, int i4) {
            float f = ((float) i) / ((float) i2);
            float f2 = (float) i3;
            float f3 = (float) i4;
            f /= f2 / f3;
            return f > 1.0f ? new b(i3, (int) (f3 / f)) : new b((int) (f2 * f), i4);
        }

        public static b a(int i, int i2, int i3, int i4, ScaleType scaleType) {
            akcr.b(scaleType, "scaleType");
            int i5 = ila.a[scaleType.ordinal()];
            return i5 != 1 ? i5 != 2 ? i5 != 3 ? a.b(i, i2, i3, i4) : a.b(i, i2, i3, i4) : a.a(i, i2, i3, i4) : a.a(i3, i4);
        }

        private static b b(int i, int i2, int i3, int i4) {
            float f = ((float) i) / ((float) i2);
            float f2 = (float) i3;
            float f3 = (float) i4;
            f /= f2 / f3;
            return f > 1.0f ? new b((int) (f2 * f), i4) : new b(i3, (int) (f3 / f));
        }
    }

    /* renamed from: ikz$b */
    public static final class b {
        final int a;
        final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.a == bVar.a ? 1 : null) != null) {
                        if ((this.b == bVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WidthHeightPair(width=");
            stringBuilder.append(this.a);
            stringBuilder.append(", height=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public ikz(ImageView imageView) {
        akcr.b(imageView, "hostImageView");
        this.d = imageView;
    }

    private final ViewGroup a() {
        ViewParent parent = this.d.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        return (ViewGroup) parent;
    }

    private final void a(int i, int i2) {
        LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams != null) {
            if (i == 0) {
                i = -2;
            }
            layoutParams.width = i;
            if (i2 == 0) {
                i2 = -2;
            }
            layoutParams.height = i2;
            this.d.setLayoutParams(layoutParams);
        }
    }

    private final void b() {
        ViewGroup a = a();
        if (a != null && this.b > 0 && this.c > 0) {
            ScaleType scaleType = this.d.getScaleType();
            if (!(scaleType == null || scaleType == ScaleType.MATRIX)) {
                int i = this.b;
                int i2 = this.c;
                int width = a.getWidth();
                int height = a.getHeight();
                ScaleType scaleType2 = this.d.getScaleType();
                akcr.a((Object) scaleType2, "hostImageView.getScaleType()");
                b a2 = a.a(i, i2, width, height, scaleType2);
                a(a2.a, a2.b);
            }
        }
    }

    private final void c() {
        ViewGroup a = a();
        if (a != null && this.b > 0 && this.c > 0) {
            if (this.d.getScaleType() == ScaleType.CENTER_CROP) {
                Rect a2 = a.a(this.b, this.c, a.getWidth(), a.getHeight(), this.a);
                this.d.setPadding(a2.left, a2.top, a2.right, a2.bottom);
                return;
            }
            this.d.setPadding(0, 0, 0, 0);
        }
    }

    public final void a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        c();
        b();
    }
}
