package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import org.opencv.imgproc.Imgproc;

/* renamed from: kk */
public final class kk {
    public final AccessibilityNodeInfo a;
    private int b = -1;

    /* renamed from: kk$a */
    public static class a {
        public final Object a;

        public a(Object obj) {
            this.a = obj;
        }
    }

    /* renamed from: kk$b */
    public static class b {
        final Object a;

        private b(Object obj) {
            this.a = obj;
        }

        public static b a(int i, int i2, int i3, int i4, boolean z) {
            return VERSION.SDK_INT >= 21 ? new b(CollectionItemInfo.obtain(i, i2, i3, i4, z, false)) : VERSION.SDK_INT >= 19 ? new b(CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new b(null);
        }
    }

    private kk(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static kk a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new kk(accessibilityNodeInfo);
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final void a(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.a.setCollectionItemInfo((CollectionItemInfo) ((b) obj).a);
        }
    }

    public final void a(boolean z) {
        this.a.setCheckable(z);
    }

    public final void b(boolean z) {
        this.a.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kk kkVar = (kk) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (kkVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(kkVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        return accessibilityNodeInfo == null ? 0 : accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        this.a.getBoundsInParent(rect);
        stringBuilder.append("; boundsInParent: ".concat(String.valueOf(rect)));
        this.a.getBoundsInScreen(rect);
        stringBuilder.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.a.getPackageName());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.a.getClassName());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.a.getText());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.a.getContentDescription());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(VERSION.SDK_INT >= 18 ? this.a.getViewIdResourceName() : null);
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.a.isCheckable());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.a.isChecked());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.a.isFocusable());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.a.isFocused());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.a.isSelected());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.a.isClickable());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.a.isLongClickable());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.a.isEnabled());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.a.isPassword());
        StringBuilder stringBuilder2 = new StringBuilder("; scrollable: ");
        stringBuilder2.append(this.a.isScrollable());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; [");
        int actions = this.a.getActions();
        while (actions != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ -1;
            if (numberOfTrailingZeros == 1) {
                str = "ACTION_FOCUS";
            } else if (numberOfTrailingZeros != 2) {
                switch (numberOfTrailingZeros) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case RasterSource.DEFAULT_TILE_SIZE /*512*/:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case Imgproc.INTER_TAB_SIZE2 /*1024*/:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case ItemAnimator.FLAG_MOVED /*2048*/:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case Imgproc.FLOODFILL_FIXED_RANGE /*65536*/:
                        str = "ACTION_CUT";
                        break;
                    case Imgproc.FLOODFILL_MASK_ONLY /*131072*/:
                        str = "ACTION_SET_SELECTION";
                        break;
                    default:
                        str = "ACTION_UNKNOWN";
                        break;
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            stringBuilder.append(str);
            if (actions != 0) {
                stringBuilder.append(ppy.d);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
