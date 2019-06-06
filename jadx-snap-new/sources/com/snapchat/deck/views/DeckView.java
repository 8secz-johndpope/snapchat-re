package com.snapchat.deck.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.snapchat.android.R;
import defpackage.acgs;
import defpackage.achp;
import defpackage.achz;
import defpackage.acja;
import defpackage.acjd;
import defpackage.acjg;
import java.util.ArrayList;
import java.util.Arrays;

public class DeckView extends acja {
    boolean b = true;
    private int[] c;
    private acgs<?, ?> d;
    private acjg e;
    private acjd<?, ?> f;

    public DeckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DeckView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }

    private boolean a(MotionEvent motionEvent) {
        acjd acjd = this.f;
        Object obj = (acjd == null || acjd.c() == null) ? 1 : null;
        return (obj != null || this.d.b()) ? true : this.e.a(motionEvent);
    }

    public final void a(acgs<?, ?> acgs) {
        setChildrenDrawingOrderEnabled(true);
        this.d = acgs;
        this.e = new acjg(this, acgs);
        this.f = acgs.b.c;
        setOnHierarchyChangeListener(new OnHierarchyChangeListener() {
            public final void onChildViewAdded(View view, View view2) {
                DeckView.this.b = true;
            }

            public final void onChildViewRemoved(View view, View view2) {
                DeckView.this.b = true;
            }
        });
    }

    public final void a(achz achz) {
        acjg acjg = this.e;
        int i = 0;
        while (i < acjg.a.size() && !((achp) acjg.a.get(i)).a(achz)) {
            i++;
        }
    }

    public final boolean a() {
        return this.e.c();
    }

    /* Access modifiers changed, original: protected */
    public int[] a(int i, acjd<?, ?> acjd) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[acjd.a(((Integer) getChildAt(i2).getTag(R.id.page_id)).intValue())] = i2;
        }
        return iArr;
    }

    /* Access modifiers changed, original: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.b) {
            this.c = a(i, this.f);
            for (int i3 : this.c) {
                if (i3 < 0 || i3 >= i) {
                    StringBuilder stringBuilder = new StringBuilder("recalculate returning invalid cache ");
                    stringBuilder.append(toString());
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            this.b = false;
        }
        return this.c[i2];
    }

    /* Access modifiers changed, original: protected */
    public boolean isChildrenDrawingOrderEnabled() {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        acjg acjg = this.e;
        Object obj = (acjg == null || acjg.c() || this.a) ? 1 : null;
        if (obj != null) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    public void requestLayout() {
        acjg acjg = this.e;
        Object obj = (acjg == null || acjg.c() || !this.a) ? 1 : null;
        if (obj != null) {
            super.requestLayout();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(getChildCount());
        for (int i = 0; i < getChildCount(); i++) {
            Object resourceEntryName;
            View childAt = getChildAt(i);
            if (childAt.getTag(R.id.page_id) == null) {
                resourceEntryName = childAt.getId() == -1 ? "no id view" : getResources().getResourceEntryName(childAt.getId());
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(String.valueOf(getChildAt(i).getTag(R.id.page_id)));
                stringBuilder.append(getChildAt(i).getTag(R.id.page_type));
                resourceEntryName = stringBuilder.toString();
            }
            arrayList.add(resourceEntryName);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(arrayList);
        stringBuilder2.append(" with drawing order cache ");
        stringBuilder2.append(Arrays.toString(this.c));
        stringBuilder2.append(" and navigationStack ");
        acjd acjd = this.f;
        stringBuilder2.append(acjd == null ? "not yet initialized" : acjd.g());
        return stringBuilder2.toString();
    }
}
