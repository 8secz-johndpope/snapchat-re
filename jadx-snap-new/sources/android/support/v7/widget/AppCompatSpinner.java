package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.snapchat.android.R;
import defpackage.ka;
import defpackage.kb;
import defpackage.ma;
import defpackage.ns;

public class AppCompatSpinner extends Spinner implements ka {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = new int[]{16843505};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final ns mBackgroundTintHelper;
    private int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    private b mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    private final Rect mTempRect;

    static class a implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter2.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter == null ? 0 : spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter == null ? null : spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter == null ? null : spinnerAdapter.getItem(i);
        }

        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter == null ? -1 : spinnerAdapter.getItemId(i);
        }

        public final int getItemViewType(int i) {
            return 0;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            return listAdapter != null ? listAdapter.isEnabled(i) : true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class b extends ListPopupWindow {
        CharSequence a;
        ListAdapter b;
        final Rect c = new Rect();

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new OnItemClickListener(AppCompatSpinner.this) {
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, b.this.b.getItemId(i));
                    }
                    b.this.dismiss();
                }
            });
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            int compatMeasureContentWidth;
            Drawable background = getBackground();
            int i = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.mTempRect);
                i = ViewUtils.isLayoutRtl(AppCompatSpinner.this) ? AppCompatSpinner.this.mTempRect.right : -AppCompatSpinner.this.mTempRect.left;
            } else {
                Rect access$100 = AppCompatSpinner.this.mTempRect;
                AppCompatSpinner.this.mTempRect.right = 0;
                access$100.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.mDropDownWidth == -2) {
                compatMeasureContentWidth = AppCompatSpinner.this.compatMeasureContentWidth((SpinnerAdapter) this.b, getBackground());
                int i2 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.mTempRect.left) - AppCompatSpinner.this.mTempRect.right;
                if (compatMeasureContentWidth > i2) {
                    compatMeasureContentWidth = i2;
                }
                compatMeasureContentWidth = Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight);
            } else {
                compatMeasureContentWidth = AppCompatSpinner.this.mDropDownWidth == -1 ? (width - paddingLeft) - paddingRight : AppCompatSpinner.this.mDropDownWidth;
            }
            setContentWidth(compatMeasureContentWidth);
            setHorizontalOffset(ViewUtils.isLayoutRtl(AppCompatSpinner.this) ? i + ((width - paddingRight) - getWidth()) : i + paddingLeft);
        }

        public final void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.b = listAdapter;
        }

        public final void show() {
            boolean isShowing = isShowing();
            a();
            setInputMethodMode(2);
            super.show();
            getListView().setChoiceMode(1);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (!isShowing) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final AnonymousClass2 anonymousClass2 = new OnGlobalLayoutListener() {
                        public final void onGlobalLayout() {
                            b bVar = b.this;
                            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                            Object obj = (kb.a.r(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(bVar.c)) ? 1 : null;
                            if (obj == null) {
                                b.this.dismiss();
                                return;
                            }
                            b.this.a();
                            super.show();
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(anonymousClass2);
                    setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss() {
                            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(anonymousClass2);
                            }
                        }
                    });
                }
            }
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Missing block: B:20:0x0051, code skipped:
            if (r12 != null) goto L_0x0053;
     */
    /* JADX WARNING: Missing block: B:21:0x0053, code skipped:
            r12.recycle();
     */
    /* JADX WARNING: Missing block: B:29:0x0065, code skipped:
            if (r12 != null) goto L_0x0053;
     */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
        r7 = this;
        r7.<init>(r8, r9, r10);
        r0 = new android.graphics.Rect;
        r0.<init>();
        r7.mTempRect = r0;
        r0 = defpackage.lx.a.x;
        r1 = 0;
        r0 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r8, r9, r0, r10, r1);
        r2 = new ns;
        r2.<init>(r7);
        r7.mBackgroundTintHelper = r2;
        r2 = 0;
        if (r12 == 0) goto L_0x0021;
    L_0x001b:
        r3 = new android.support.v7.view.ContextThemeWrapper;
        r3.<init>(r8, r12);
        goto L_0x0037;
    L_0x0021:
        r12 = 4;
        r12 = r0.getResourceId(r12, r1);
        if (r12 == 0) goto L_0x002e;
    L_0x0028:
        r3 = new android.support.v7.view.ContextThemeWrapper;
        r3.<init>(r8, r12);
        goto L_0x0037;
    L_0x002e:
        r12 = android.os.Build.VERSION.SDK_INT;
        r3 = 23;
        if (r12 >= r3) goto L_0x0036;
    L_0x0034:
        r3 = r8;
        goto L_0x0037;
    L_0x0036:
        r3 = r2;
    L_0x0037:
        r7.mPopupContext = r3;
        r12 = r7.mPopupContext;
        r3 = 1;
        if (r12 == 0) goto L_0x00a2;
    L_0x003e:
        r12 = -1;
        if (r11 != r12) goto L_0x006f;
    L_0x0041:
        r12 = ATTRS_ANDROID_SPINNERMODE;	 Catch:{ Exception -> 0x005c, all -> 0x0059 }
        r12 = r8.obtainStyledAttributes(r9, r12, r10, r1);	 Catch:{ Exception -> 0x005c, all -> 0x0059 }
        r4 = r12.hasValue(r1);	 Catch:{ Exception -> 0x0057 }
        if (r4 == 0) goto L_0x0051;
    L_0x004d:
        r11 = r12.getInt(r1, r1);	 Catch:{ Exception -> 0x0057 }
    L_0x0051:
        if (r12 == 0) goto L_0x006f;
    L_0x0053:
        r12.recycle();
        goto L_0x006f;
    L_0x0057:
        r4 = move-exception;
        goto L_0x005e;
    L_0x0059:
        r8 = move-exception;
        r12 = r2;
        goto L_0x0069;
    L_0x005c:
        r4 = move-exception;
        r12 = r2;
    L_0x005e:
        r5 = "AppCompatSpinner";
        r6 = "Could not read android:spinnerMode";
        android.util.Log.i(r5, r6, r4);	 Catch:{ all -> 0x0068 }
        if (r12 == 0) goto L_0x006f;
    L_0x0067:
        goto L_0x0053;
    L_0x0068:
        r8 = move-exception;
    L_0x0069:
        if (r12 == 0) goto L_0x006e;
    L_0x006b:
        r12.recycle();
    L_0x006e:
        throw r8;
    L_0x006f:
        if (r11 != r3) goto L_0x00a2;
    L_0x0071:
        r11 = new android.support.v7.widget.AppCompatSpinner$b;
        r12 = r7.mPopupContext;
        r11.<init>(r12, r9, r10);
        r12 = r7.mPopupContext;
        r4 = defpackage.lx.a.x;
        r12 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r12, r9, r4, r10, r1);
        r4 = 3;
        r5 = -2;
        r4 = r12.getLayoutDimension(r4, r5);
        r7.mDropDownWidth = r4;
        r4 = r12.getDrawable(r3);
        r11.setBackgroundDrawable(r4);
        r4 = 2;
        r4 = r0.getString(r4);
        r11.a = r4;
        r12.recycle();
        r7.mPopup = r11;
        r12 = new android.support.v7.widget.AppCompatSpinner$1;
        r12.<init>(r7, r11);
        r7.mForwardingListener = r12;
    L_0x00a2:
        r11 = r0.getTextArray(r1);
        if (r11 == 0) goto L_0x00b9;
    L_0x00a8:
        r12 = new android.widget.ArrayAdapter;
        r1 = 17367048; // 0x1090008 float:2.5162948E-38 double:8.580462E-317;
        r12.<init>(r8, r1, r11);
        r8 = 2131559491; // 0x7f0d0443 float:1.8744328E38 double:1.0531303166E-314;
        r12.setDropDownViewResource(r8);
        r7.setAdapter(r12);
    L_0x00b9:
        r0.recycle();
        r7.mPopupSet = r3;
        r8 = r7.mTempAdapter;
        if (r8 == 0) goto L_0x00c7;
    L_0x00c2:
        r7.setAdapter(r8);
        r7.mTempAdapter = r2;
    L_0x00c7:
        r8 = r7.mBackgroundTintHelper;
        r8.a(r9, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* Access modifiers changed, original: 0000 */
    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (max = Math.max(0, max - (15 - (min - max))); max < min; max++) {
            int itemViewType = spinnerAdapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.mTempRect);
            i2 += this.mTempRect.left + this.mTempRect.right;
        }
        return i2;
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.d();
        }
    }

    public int getDropDownHorizontalOffset() {
        b bVar = this.mPopup;
        return bVar != null ? bVar.getHorizontalOffset() : VERSION.SDK_INT >= 16 ? super.getDropDownHorizontalOffset() : 0;
    }

    public int getDropDownVerticalOffset() {
        b bVar = this.mPopup;
        return bVar != null ? bVar.getVerticalOffset() : VERSION.SDK_INT >= 16 ? super.getDropDownVerticalOffset() : 0;
    }

    public int getDropDownWidth() {
        return this.mPopup != null ? this.mDropDownWidth : VERSION.SDK_INT >= 16 ? super.getDropDownWidth() : 0;
    }

    public Drawable getPopupBackground() {
        b bVar = this.mPopup;
        return bVar != null ? bVar.getBackground() : VERSION.SDK_INT >= 16 ? super.getPopupBackground() : null;
    }

    public Context getPopupContext() {
        return this.mPopup != null ? this.mPopupContext : VERSION.SDK_INT >= 23 ? super.getPopupContext() : null;
    }

    public CharSequence getPrompt() {
        b bVar = this.mPopup;
        return bVar != null ? bVar.a : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        ns nsVar = this.mBackgroundTintHelper;
        return nsVar != null ? nsVar.b() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        ns nsVar = this.mBackgroundTintHelper;
        return nsVar != null ? nsVar.c() : null;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.mPopup;
        if (bVar != null && bVar.isShowing()) {
            this.mPopup.dismiss();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.mForwardingListener;
        return (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) ? super.onTouchEvent(motionEvent) : true;
    }

    public boolean performClick() {
        b bVar = this.mPopup;
        if (bVar == null) {
            return super.performClick();
        }
        if (!bVar.isShowing()) {
            this.mPopup.show();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.mPopupSet) {
            super.setAdapter(spinnerAdapter);
            if (this.mPopup != null) {
                Context context = this.mPopupContext;
                if (context == null) {
                    context = getContext();
                }
                this.mPopup.setAdapter(new a(spinnerAdapter, context.getTheme()));
            }
            return;
        }
        this.mTempAdapter = spinnerAdapter;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        b bVar = this.mPopup;
        if (bVar != null) {
            bVar.setHorizontalOffset(i);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        b bVar = this.mPopup;
        if (bVar != null) {
            bVar.setVerticalOffset(i);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        b bVar = this.mPopup;
        if (bVar != null) {
            bVar.setBackgroundDrawable(drawable);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ma.b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        b bVar = this.mPopup;
        if (bVar != null) {
            bVar.a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a(mode);
        }
    }
}
