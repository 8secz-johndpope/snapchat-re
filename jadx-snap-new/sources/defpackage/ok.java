package defpackage;

import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

/* renamed from: ok */
public final class ok {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f = 0;
    public int g = 0;
    public boolean h;
    public boolean i;

    public final View a(Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.c);
        this.c += this.d;
        return viewForPosition;
    }

    public final boolean a(State state) {
        int i = this.c;
        return i >= 0 && i < state.getItemCount();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutState{mAvailable=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mCurrentPosition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mItemDirection=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mLayoutDirection=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mStartLine=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mEndLine=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
