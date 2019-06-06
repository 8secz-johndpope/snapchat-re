package defpackage;

import com.snapchat.android.R;

/* renamed from: actx */
public enum actx {
    RIGHT(R.drawable.status_bubble_right, R.drawable.status_bubble_right_small),
    LEFT(R.drawable.status_bubble_right, R.drawable.status_bubble_right_small, true),
    FAR_RIGHT(R.drawable.status_bubble_far_right, R.drawable.status_bubble_far_right_small),
    FAR_LEFT(R.drawable.status_bubble_far_right, R.drawable.status_bubble_far_right_small, true);
    
    final boolean mirrored;
    final int res;
    final int smallRes;

    private actx(int i, int i2, boolean z) {
        this.res = i;
        this.smallRes = i2;
        this.mirrored = z;
    }
}
