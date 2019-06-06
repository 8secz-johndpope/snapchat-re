package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

/* renamed from: rdh */
public class rdh extends ItemDecoration {
    private Drawable a;
    private int b = 1;
    private final Rect c = new Rect();

    public final void a(Drawable drawable) {
        if (drawable != null) {
            this.a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* Access modifiers changed, original: protected */
    public boolean a(View view, RecyclerView recyclerView) {
        return true;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        if (this.a == null || !a(view, recyclerView)) {
            rect.set(0, 0, 0, 0);
        } else if (this.b == 1) {
            rect.set(0, 0, 0, this.a.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.a.getIntrinsicWidth(), 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
        if (!(recyclerView.getLayoutManager() == null || this.a == null)) {
            int i = 0;
            int paddingLeft;
            int width;
            int childCount;
            View childAt;
            int round;
            if (this.b == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                childCount = recyclerView.getChildCount();
                while (i < childCount) {
                    childAt = recyclerView.getChildAt(i);
                    if (a(childAt, recyclerView)) {
                        recyclerView.getDecoratedBoundsWithMargins(childAt, this.c);
                        round = this.c.bottom + Math.round(childAt.getTranslationY());
                        this.a.setBounds(paddingLeft, round - this.a.getIntrinsicHeight(), width, round);
                        this.a.draw(canvas);
                    }
                    i++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingTop();
                width = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingLeft, recyclerView.getWidth() - recyclerView.getPaddingRight(), width);
            } else {
                width = recyclerView.getHeight();
                paddingLeft = 0;
            }
            childCount = recyclerView.getChildCount();
            while (i < childCount) {
                childAt = recyclerView.getChildAt(i);
                if (a(childAt, recyclerView)) {
                    recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.c);
                    round = this.c.right + Math.round(childAt.getTranslationX());
                    this.a.setBounds(round - this.a.getIntrinsicWidth(), paddingLeft, round, width);
                    this.a.draw(canvas);
                }
                i++;
            }
            canvas.restore();
        }
    }
}
