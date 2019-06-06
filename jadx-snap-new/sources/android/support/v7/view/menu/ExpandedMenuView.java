package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import defpackage.mz;
import defpackage.mz.b;
import defpackage.nb;
import defpackage.nh;

public final class ExpandedMenuView extends ListView implements OnItemClickListener, b, nh {
    private static final int[] a = new int[]{16842964, 16843049};
    private mz b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ExpandedMenuView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, a, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider(obtainStyledAttributes.getDrawable(1));
        }
        obtainStyledAttributes.recycle();
    }

    public final void initialize(mz mzVar) {
        this.b = mzVar;
    }

    public final boolean invokeItem(nb nbVar) {
        return this.b.a((MenuItem) nbVar, null, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((nb) getAdapter().getItem(i));
    }
}
