package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.snapchat.android.R;
import com.snapchat.deck.views.DeckView;
import defpackage.zhg.a;

/* renamed from: zjh */
public class zjh extends DeckView {
    private int c;
    private final zji d;

    public zjh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private zjh(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.d = new zji();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, 0, 0);
        this.c = obtainStyledAttributes.getResourceId(0, 0);
        if (this.c != 0) {
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("hova_view id must be specified in XML");
    }

    public final int[] a(int i, acjd acjd) {
        int i2 = this.c;
        -$$Lambda$0ZumKwIo_RG0egS-SAXNwLUvZKo -__lambda_0zumkwio_rg0egs-saxnwluvzko = new -$$Lambda$0ZumKwIo_RG0egS-SAXNwLUvZKo(this);
        akcr.b(acjd, "navigationStack");
        akcr.b(-__lambda_0zumkwio_rg0egs-saxnwluvzko, "getChildAt");
        int[] iArr = new int[(i - 1)];
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            View view = (View) -__lambda_0zumkwio_rg0egs-saxnwluvzko.invoke(Integer.valueOf(i4));
            if (view.getId() == i2) {
                i3 = i4;
            } else {
                Object tag = view.getTag(R.id.page_id);
                if (tag != null) {
                    iArr[acjd.a(((Integer) tag).intValue())] = i4;
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.Int");
                }
            }
        }
        int[] iArr2 = new int[i];
        Object obj = null;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i5 = iArr[length];
            if (obj != null) {
                iArr2[length] = i5;
            } else {
                Object tag2 = ((View) -__lambda_0zumkwio_rg0egs-saxnwluvzko.invoke(Integer.valueOf(i5))).getTag(R.id.page_type);
                if (tag2 == null) {
                    throw new ajxt("null cannot be cast to non-null type com.snap.ui.deck.MainPageType");
                } else if (((zjm) tag2).g) {
                    iArr2[length + 1] = i3;
                    iArr2[length] = i5;
                    obj = 1;
                } else {
                    iArr2[length + 1] = i5;
                }
            }
        }
        if (obj == null) {
            iArr2[0] = i3;
        }
        return iArr2;
    }
}
