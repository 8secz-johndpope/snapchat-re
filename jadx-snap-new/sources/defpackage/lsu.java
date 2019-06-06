package defpackage;

import com.snapchat.android.R;

/* renamed from: lsu */
public final class lsu {
    static final lsu g = new lsu(R.layout.lenses_camera_carousel_view, Integer.valueOf(R.id.lenses_camera_carousel_imagepicker_viewstub), Integer.valueOf(R.id.lenses_camera_carousel_info_button_viewstub), Integer.valueOf(R.id.lenses_camera_cta_view_stub), Integer.valueOf(R.id.lenses_camera_locked_composite_view_stub), Integer.valueOf(R.id.lenses_camera_carousel_bitmoji_viewstub));
    public static final lsu h = new lsu(R.layout.lenses_camera_carousel_view_for_talk);
    public static final lsu i = new lsu(R.layout.lenses_camera_carousel_single_lens);
    public final int a;
    final Integer b;
    final Integer c;
    final Integer d;
    final Integer e;
    final Integer f;

    /* renamed from: lsu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    private /* synthetic */ lsu(int i) {
        this(i, null, null, null, null, null);
    }

    private lsu(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lsu) {
                lsu lsu = (lsu) obj;
                if (!((this.a == lsu.a ? 1 : null) != null && akcr.a(this.b, lsu.b) && akcr.a(this.c, lsu.c) && akcr.a(this.d, lsu.d) && akcr.a(this.e, lsu.e) && akcr.a(this.f, lsu.f))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        int i2 = 0;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.c;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.d;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.e;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.f;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutConfiguration(root=");
        stringBuilder.append(this.a);
        stringBuilder.append(", imagePickerViewStubIdRes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", infoButtonViewStubIdRes=");
        stringBuilder.append(this.c);
        stringBuilder.append(", ctaButtonViewStubIdRes=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lockedViewStubIdRes=");
        stringBuilder.append(this.e);
        stringBuilder.append(", bitmojiPopupViewStubIdRes=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
