package android.support.v7.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import com.snapchat.android.R;
import defpackage.mp;
import defpackage.mz;
import defpackage.mz.a;
import defpackage.nf;
import defpackage.nk;

public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private OnTouchListener mDragListener;
    private final mz mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final nf mPopup;

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i) {
        this(context, view, i, R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int i2, int i3) {
        this.mContext = context;
        this.mAnchor = view;
        this.mMenu = new mz(context);
        this.mMenu.a(new a() {
            public final void a(mz mzVar) {
            }

            public final boolean a(mz mzVar, MenuItem menuItem) {
                return PopupMenu.this.mMenuItemClickListener != null ? PopupMenu.this.mMenuItemClickListener.onMenuItemClick(menuItem) : false;
            }
        });
        this.mPopup = new nf(context, this.mMenu, view, false, i2, i3);
        nf nfVar = this.mPopup;
        nfVar.b = i;
        nfVar.c = new android.widget.PopupWindow.OnDismissListener() {
            public final void onDismiss() {
                if (PopupMenu.this.mOnDismissListener != null) {
                    PopupMenu.this.mOnDismissListener.onDismiss(PopupMenu.this);
                }
            }
        };
    }

    public void dismiss() {
        this.mPopup.d();
    }

    public OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new ForwardingListener(this.mAnchor) {
                public final nk getPopup() {
                    return PopupMenu.this.mPopup.b();
                }

                /* Access modifiers changed, original: protected|final */
                public final boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return true;
                }

                /* Access modifiers changed, original: protected|final */
                public final boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return true;
                }
            };
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.b;
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public MenuInflater getMenuInflater() {
        return new mp(this.mContext);
    }

    /* Access modifiers changed, original: 0000 */
    public ListView getMenuListView() {
        return !this.mPopup.f() ? null : this.mPopup.b().getListView();
    }

    public void inflate(int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public void setGravity(int i) {
        this.mPopup.b = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.a();
    }
}
