package android.support.design.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.mz;
import defpackage.nh;

public class NavigationMenuView extends RecyclerView implements nh {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NavigationMenuView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public void initialize(mz mzVar) {
    }
}
