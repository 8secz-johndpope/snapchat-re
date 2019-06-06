package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import defpackage.mz;
import defpackage.nb;
import defpackage.nh;
import defpackage.nq;

public class ActionMenuView extends LinearLayoutCompat implements defpackage.mz.b, nh {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private defpackage.ng.a mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private mz mMenu;
    defpackage.mz.a mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private nq mPresenter;
    private boolean mReserveOverflow;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class LayoutParams extends android.support.v7.widget.LinearLayoutCompat.LayoutParams {
        @ExportedProperty
        public int cellsUsed;
        @ExportedProperty
        public boolean expandable;
        boolean expanded;
        @ExportedProperty
        public int extraPixels;
        @ExportedProperty
        public boolean isOverflowButton;
        @ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.isOverflowButton = false;
        }

        LayoutParams(int i, int i2, boolean z) {
            super(i, i2);
            this.isOverflowButton = z;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static class a implements defpackage.ng.a {
        a() {
        }

        public final void a(mz mzVar, boolean z) {
        }

        public final boolean a(mz mzVar) {
            return false;
        }
    }

    class b implements defpackage.mz.a {
        b() {
        }

        public final void a(mz mzVar) {
            if (ActionMenuView.this.mMenuBuilderCallback != null) {
                ActionMenuView.this.mMenuBuilderCallback.a(mzVar);
            }
        }

        public final boolean a(mz mzVar, MenuItem menuItem) {
            return ActionMenuView.this.mOnMenuItemClickListener != null && ActionMenuView.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f);
        this.mGeneratedItemPadding = (int) (f * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    static int measureChildForCells(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        i3 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        Object obj = (actionMenuItemView == null || !actionMenuItemView.c()) ? null : 1;
        int i5 = 2;
        if (i2 <= 0 || (obj != null && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), i3);
            i2 = view.getMeasuredWidth();
            int i6 = i2 / i;
            if (i2 % i != 0) {
                i6++;
            }
            if (obj == null || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.isOverflowButton || obj == null) {
            z = false;
        }
        layoutParams.expandable = z;
        layoutParams.cellsUsed = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, AudioPlayer.INFINITY_LOOP_COUNT), i3);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x0238 A:{LOOP_START, PHI: r13 , LOOP:5: B:135:0x0238->B:139:0x0255} */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x025a  */
    private void onMeasureExactFormat(int r30, int r31) {
        /*
        r29 = this;
        r0 = r29;
        r1 = android.view.View.MeasureSpec.getMode(r31);
        r2 = android.view.View.MeasureSpec.getSize(r30);
        r3 = android.view.View.MeasureSpec.getSize(r31);
        r4 = r29.getPaddingLeft();
        r5 = r29.getPaddingRight();
        r4 = r4 + r5;
        r5 = r29.getPaddingTop();
        r6 = r29.getPaddingBottom();
        r5 = r5 + r6;
        r6 = -2;
        r7 = r31;
        r6 = getChildMeasureSpec(r7, r5, r6);
        r2 = r2 - r4;
        r4 = r0.mMinCellSize;
        r7 = r2 / r4;
        r8 = r2 % r4;
        r9 = 0;
        if (r7 != 0) goto L_0x0035;
    L_0x0031:
        r0.setMeasuredDimension(r2, r9);
        return;
    L_0x0035:
        r8 = r8 / r7;
        r4 = r4 + r8;
        r8 = r29.getChildCount();
        r14 = r7;
        r7 = 0;
        r10 = 0;
        r12 = 0;
        r13 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
    L_0x0045:
        if (r7 >= r8) goto L_0x00c3;
    L_0x0047:
        r11 = r0.getChildAt(r7);
        r9 = r11.getVisibility();
        r19 = r3;
        r3 = 8;
        if (r9 == r3) goto L_0x00bd;
    L_0x0055:
        r3 = r11 instanceof android.support.v7.view.menu.ActionMenuItemView;
        r13 = r13 + 1;
        if (r3 == 0) goto L_0x0064;
    L_0x005b:
        r9 = r0.mGeneratedItemPadding;
        r20 = r13;
        r13 = 0;
        r11.setPadding(r9, r13, r9, r13);
        goto L_0x0067;
    L_0x0064:
        r20 = r13;
        r13 = 0;
    L_0x0067:
        r9 = r11.getLayoutParams();
        r9 = (android.support.v7.widget.ActionMenuView.LayoutParams) r9;
        r9.expanded = r13;
        r9.extraPixels = r13;
        r9.cellsUsed = r13;
        r9.expandable = r13;
        r9.leftMargin = r13;
        r9.rightMargin = r13;
        if (r3 == 0) goto L_0x0086;
    L_0x007b:
        r3 = r11;
        r3 = (android.support.v7.view.menu.ActionMenuItemView) r3;
        r3 = r3.c();
        if (r3 == 0) goto L_0x0086;
    L_0x0084:
        r3 = 1;
        goto L_0x0087;
    L_0x0086:
        r3 = 0;
    L_0x0087:
        r9.preventEdgeOffset = r3;
        r3 = r9.isOverflowButton;
        if (r3 == 0) goto L_0x008f;
    L_0x008d:
        r3 = 1;
        goto L_0x0090;
    L_0x008f:
        r3 = r14;
    L_0x0090:
        r3 = measureChildForCells(r11, r4, r3, r6, r5);
        r13 = java.lang.Math.max(r15, r3);
        r15 = r9.expandable;
        if (r15 == 0) goto L_0x009e;
    L_0x009c:
        r16 = r16 + 1;
    L_0x009e:
        r9 = r9.isOverflowButton;
        if (r9 == 0) goto L_0x00a3;
    L_0x00a2:
        r12 = 1;
    L_0x00a3:
        r14 = r14 - r3;
        r9 = r11.getMeasuredHeight();
        r10 = java.lang.Math.max(r10, r9);
        r9 = 1;
        if (r3 != r9) goto L_0x00b9;
    L_0x00af:
        r3 = r9 << r7;
        r11 = r10;
        r9 = (long) r3;
        r9 = r17 | r9;
        r17 = r9;
        r10 = r11;
        goto L_0x00ba;
    L_0x00b9:
        r11 = r10;
    L_0x00ba:
        r15 = r13;
        r13 = r20;
    L_0x00bd:
        r7 = r7 + 1;
        r3 = r19;
        r9 = 0;
        goto L_0x0045;
    L_0x00c3:
        r19 = r3;
        r3 = 2;
        if (r12 == 0) goto L_0x00cc;
    L_0x00c8:
        if (r13 != r3) goto L_0x00cc;
    L_0x00ca:
        r5 = 1;
        goto L_0x00cd;
    L_0x00cc:
        r5 = 0;
    L_0x00cd:
        r7 = 0;
    L_0x00ce:
        r20 = 1;
        if (r16 <= 0) goto L_0x0172;
    L_0x00d2:
        if (r14 <= 0) goto L_0x0172;
    L_0x00d4:
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r9 = 0;
        r11 = 0;
        r22 = 0;
    L_0x00de:
        if (r9 >= r8) goto L_0x0111;
    L_0x00e0:
        r24 = r0.getChildAt(r9);
        r24 = r24.getLayoutParams();
        r25 = r7;
        r7 = r24;
        r7 = (android.support.v7.widget.ActionMenuView.LayoutParams) r7;
        r24 = r10;
        r10 = r7.expandable;
        if (r10 == 0) goto L_0x010a;
    L_0x00f4:
        r10 = r7.cellsUsed;
        if (r10 >= r3) goto L_0x0100;
    L_0x00f8:
        r3 = r7.cellsUsed;
        r10 = r20 << r9;
        r22 = r10;
        r11 = 1;
        goto L_0x010a;
    L_0x0100:
        r7 = r7.cellsUsed;
        if (r7 != r3) goto L_0x010a;
    L_0x0104:
        r26 = r20 << r9;
        r22 = r22 | r26;
        r11 = r11 + 1;
    L_0x010a:
        r9 = r9 + 1;
        r10 = r24;
        r7 = r25;
        goto L_0x00de;
    L_0x0111:
        r25 = r7;
        r24 = r10;
        r17 = r17 | r22;
        if (r11 > r14) goto L_0x016e;
    L_0x0119:
        r3 = r3 + 1;
        r7 = 0;
    L_0x011c:
        if (r7 >= r8) goto L_0x0168;
    L_0x011e:
        r9 = r0.getChildAt(r7);
        r10 = r9.getLayoutParams();
        r10 = (android.support.v7.widget.ActionMenuView.LayoutParams) r10;
        r26 = r2;
        r11 = 1;
        r2 = r11 << r7;
        r11 = r1;
        r1 = (long) r2;
        r20 = r22 & r1;
        r27 = 0;
        r25 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1));
        if (r25 != 0) goto L_0x0140;
    L_0x0137:
        r9 = r10.cellsUsed;
        if (r9 != r3) goto L_0x013d;
    L_0x013b:
        r17 = r17 | r1;
    L_0x013d:
        r20 = r3;
        goto L_0x0160;
    L_0x0140:
        if (r5 == 0) goto L_0x0154;
    L_0x0142:
        r1 = r10.preventEdgeOffset;
        if (r1 == 0) goto L_0x0154;
    L_0x0146:
        r1 = 1;
        if (r14 != r1) goto L_0x0154;
    L_0x0149:
        r2 = r0.mGeneratedItemPadding;
        r1 = r2 + r4;
        r20 = r3;
        r3 = 0;
        r9.setPadding(r1, r3, r2, r3);
        goto L_0x0156;
    L_0x0154:
        r20 = r3;
    L_0x0156:
        r1 = r10.cellsUsed;
        r2 = 1;
        r1 = r1 + r2;
        r10.cellsUsed = r1;
        r10.expanded = r2;
        r14 = r14 + -1;
    L_0x0160:
        r7 = r7 + 1;
        r1 = r11;
        r3 = r20;
        r2 = r26;
        goto L_0x011c;
    L_0x0168:
        r10 = r24;
        r3 = 2;
        r7 = 1;
        goto L_0x00ce;
    L_0x016e:
        r11 = r1;
        r26 = r2;
        goto L_0x0179;
    L_0x0172:
        r11 = r1;
        r26 = r2;
        r25 = r7;
        r24 = r10;
    L_0x0179:
        if (r12 != 0) goto L_0x0180;
    L_0x017b:
        r1 = 1;
        if (r13 != r1) goto L_0x0181;
    L_0x017e:
        r2 = 1;
        goto L_0x0182;
    L_0x0180:
        r1 = 1;
    L_0x0181:
        r2 = 0;
    L_0x0182:
        if (r14 <= 0) goto L_0x0233;
    L_0x0184:
        r9 = 0;
        r3 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1));
        if (r3 == 0) goto L_0x0233;
    L_0x018a:
        r13 = r13 - r1;
        if (r14 < r13) goto L_0x0191;
    L_0x018d:
        if (r2 != 0) goto L_0x0191;
    L_0x018f:
        if (r15 <= r1) goto L_0x0233;
    L_0x0191:
        r1 = java.lang.Long.bitCount(r17);
        r1 = (float) r1;
        if (r2 != 0) goto L_0x01d2;
    L_0x0198:
        r2 = r17 & r20;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r9 = 0;
        r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r7 == 0) goto L_0x01b3;
    L_0x01a2:
        r13 = 0;
        r2 = r0.getChildAt(r13);
        r2 = r2.getLayoutParams();
        r2 = (android.support.v7.widget.ActionMenuView.LayoutParams) r2;
        r2 = r2.preventEdgeOffset;
        if (r2 != 0) goto L_0x01b4;
    L_0x01b1:
        r1 = r1 - r5;
        goto L_0x01b4;
    L_0x01b3:
        r13 = 0;
    L_0x01b4:
        r2 = r8 + -1;
        r3 = 1;
        r7 = r3 << r2;
        r9 = (long) r7;
        r9 = r17 & r9;
        r15 = 0;
        r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1));
        if (r3 == 0) goto L_0x01d3;
    L_0x01c2:
        r2 = r0.getChildAt(r2);
        r2 = r2.getLayoutParams();
        r2 = (android.support.v7.widget.ActionMenuView.LayoutParams) r2;
        r2 = r2.preventEdgeOffset;
        if (r2 != 0) goto L_0x01d3;
    L_0x01d0:
        r1 = r1 - r5;
        goto L_0x01d3;
    L_0x01d2:
        r13 = 0;
    L_0x01d3:
        r2 = 0;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x01dd;
    L_0x01d8:
        r14 = r14 * r4;
        r2 = (float) r14;
        r2 = r2 / r1;
        r9 = (int) r2;
        goto L_0x01de;
    L_0x01dd:
        r9 = 0;
    L_0x01de:
        r1 = 0;
    L_0x01df:
        if (r1 >= r8) goto L_0x0234;
    L_0x01e1:
        r2 = 1;
        r3 = r2 << r1;
        r14 = (long) r3;
        r14 = r17 & r14;
        r20 = 0;
        r3 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1));
        if (r3 == 0) goto L_0x022f;
    L_0x01ed:
        r3 = r0.getChildAt(r1);
        r5 = r3.getLayoutParams();
        r5 = (android.support.v7.widget.ActionMenuView.LayoutParams) r5;
        r3 = r3 instanceof android.support.v7.view.menu.ActionMenuItemView;
        if (r3 == 0) goto L_0x020e;
    L_0x01fb:
        r5.extraPixels = r9;
        r5.expanded = r2;
        if (r1 != 0) goto L_0x020b;
    L_0x0201:
        r2 = r5.preventEdgeOffset;
        if (r2 != 0) goto L_0x020b;
    L_0x0205:
        r2 = -r9;
        r3 = 2;
        r2 = r2 / r3;
        r5.leftMargin = r2;
        goto L_0x020c;
    L_0x020b:
        r3 = 2;
    L_0x020c:
        r2 = 1;
        goto L_0x021c;
    L_0x020e:
        r3 = 2;
        r2 = r5.isOverflowButton;
        if (r2 == 0) goto L_0x021f;
    L_0x0213:
        r5.extraPixels = r9;
        r2 = 1;
        r5.expanded = r2;
        r7 = -r9;
        r7 = r7 / r3;
        r5.rightMargin = r7;
    L_0x021c:
        r25 = 1;
        goto L_0x0230;
    L_0x021f:
        r2 = 1;
        if (r1 == 0) goto L_0x0226;
    L_0x0222:
        r7 = r9 / 2;
        r5.leftMargin = r7;
    L_0x0226:
        r7 = r8 + -1;
        if (r1 == r7) goto L_0x0230;
    L_0x022a:
        r7 = r9 / 2;
        r5.rightMargin = r7;
        goto L_0x0230;
    L_0x022f:
        r3 = 2;
    L_0x0230:
        r1 = r1 + 1;
        goto L_0x01df;
    L_0x0233:
        r13 = 0;
    L_0x0234:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r25 == 0) goto L_0x0258;
    L_0x0238:
        if (r13 >= r8) goto L_0x0258;
    L_0x023a:
        r2 = r0.getChildAt(r13);
        r3 = r2.getLayoutParams();
        r3 = (android.support.v7.widget.ActionMenuView.LayoutParams) r3;
        r5 = r3.expanded;
        if (r5 == 0) goto L_0x0255;
    L_0x0248:
        r5 = r3.cellsUsed;
        r5 = r5 * r4;
        r3 = r3.extraPixels;
        r5 = r5 + r3;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1);
        r2.measure(r3, r6);
    L_0x0255:
        r13 = r13 + 1;
        goto L_0x0238;
    L_0x0258:
        if (r11 == r1) goto L_0x025d;
    L_0x025a:
        r1 = r24;
        goto L_0x025f;
    L_0x025d:
        r1 = r19;
    L_0x025f:
        r2 = r26;
        r0.setMeasuredDimension(r2, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasureExactFormat(int, int):void");
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    public void dismissPopupMenus() {
        nq nqVar = this.mPresenter;
        if (nqVar != null) {
            nqVar.f();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.gravity <= 0) {
            layoutParams2.gravity = 16;
        }
        return layoutParams2;
    }

    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            this.mMenu = new mz(context);
            this.mMenu.a(new b());
            this.mPresenter = new nq(context);
            this.mPresenter.c();
            nq nqVar = this.mPresenter;
            defpackage.ng.a aVar = this.mActionMenuPresenterCallback;
            if (aVar == null) {
                aVar = new a();
            }
            nqVar.d = aVar;
            this.mMenu.a(this.mPresenter, this.mPopupContext);
            this.mPresenter.a(this);
        }
        return this.mMenu;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        nq nqVar = this.mPresenter;
        return nqVar.g != null ? nqVar.g.getDrawable() : nqVar.i ? nqVar.h : null;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public boolean hasSupportDividerBeforeChildAt(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z = 0 | ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        if (i > 0 && (childAt2 instanceof ActionMenuChildView)) {
            z |= ((ActionMenuChildView) childAt2).needsDividerBefore();
        }
        return z;
    }

    public boolean hideOverflowMenu() {
        nq nqVar = this.mPresenter;
        return nqVar != null && nqVar.e();
    }

    public void initialize(mz mzVar) {
        this.mMenu = mzVar;
    }

    public boolean invokeItem(nb nbVar) {
        return this.mMenu.a((MenuItem) nbVar, null, 0);
    }

    public boolean isOverflowMenuShowPending() {
        nq nqVar = this.mPresenter;
        return nqVar != null && nqVar.i();
    }

    public boolean isOverflowMenuShowing() {
        nq nqVar = this.mPresenter;
        return nqVar != null && nqVar.h();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nq nqVar = this.mPresenter;
        if (nqVar != null) {
            nqVar.b(false);
            if (this.mPresenter.h()) {
                this.mPresenter.e();
                this.mPresenter.d();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mFormatItems) {
            int i5;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i7 = i3 - i;
            int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
            int i8 = paddingRight;
            int i9 = 0;
            int i10 = 0;
            for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
                View childAt = getChildAt(paddingRight);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.isOverflowButton) {
                        int paddingLeft;
                        int i11;
                        i9 = childAt.getMeasuredWidth();
                        if (hasSupportDividerBeforeChildAt(paddingRight)) {
                            i9 += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (isLayoutRtl) {
                            paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                            i11 = paddingLeft + i9;
                        } else {
                            i11 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                            paddingLeft = i11 - i9;
                        }
                        i5 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i5, i11, measuredHeight + i5);
                        i8 -= i9;
                        i9 = 1;
                    } else {
                        i8 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                        hasSupportDividerBeforeChildAt(paddingRight);
                        i10++;
                    }
                }
            }
            if (childCount == 1 && i9 == 0) {
                View childAt2 = getChildAt(0);
                dividerWidth = childAt2.getMeasuredWidth();
                paddingRight = childAt2.getMeasuredHeight();
                i7 = (i7 / 2) - (dividerWidth / 2);
                i6 -= paddingRight / 2;
                childAt2.layout(i7, i6, dividerWidth + i7, paddingRight + i6);
                return;
            }
            i10 -= i9 ^ 1;
            if (i10 > 0) {
                i5 = i8 / i10;
                dividerWidth = 0;
            } else {
                dividerWidth = 0;
                i5 = 0;
            }
            i7 = Math.max(dividerWidth, i5);
            View childAt3;
            LayoutParams layoutParams2;
            if (isLayoutRtl) {
                paddingRight = getWidth() - getPaddingRight();
                while (dividerWidth < childCount) {
                    childAt3 = getChildAt(dividerWidth);
                    layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                    if (!(childAt3.getVisibility() == 8 || layoutParams2.isOverflowButton)) {
                        paddingRight -= layoutParams2.rightMargin;
                        i9 = childAt3.getMeasuredWidth();
                        i10 = childAt3.getMeasuredHeight();
                        i8 = i6 - (i10 / 2);
                        childAt3.layout(paddingRight - i9, i8, paddingRight, i10 + i8);
                        paddingRight -= (i9 + layoutParams2.leftMargin) + i7;
                    }
                    dividerWidth++;
                }
                return;
            }
            paddingRight = getPaddingLeft();
            while (dividerWidth < childCount) {
                childAt3 = getChildAt(dividerWidth);
                layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (!(childAt3.getVisibility() == 8 || layoutParams2.isOverflowButton)) {
                    paddingRight += layoutParams2.leftMargin;
                    i9 = childAt3.getMeasuredWidth();
                    i10 = childAt3.getMeasuredHeight();
                    i8 = i6 - (i10 / 2);
                    childAt3.layout(paddingRight, i8, paddingRight + i9, i10 + i8);
                    paddingRight += (i9 + layoutParams2.rightMargin) + i7;
                }
                dividerWidth++;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.mFormatItems;
        this.mFormatItems = MeasureSpec.getMode(i) == AudioPlayer.INFINITY_LOOP_COUNT;
        if (z != this.mFormatItems) {
            this.mFormatItemsWidth = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.mFormatItems) {
            mz mzVar = this.mMenu;
            if (!(mzVar == null || size == this.mFormatItemsWidth)) {
                this.mFormatItemsWidth = size;
                mzVar.b(true);
            }
        }
        size = getChildCount();
        if (!this.mFormatItems || size <= 0) {
            for (int i3 = 0; i3 < size; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        onMeasureExactFormat(i, i2);
    }

    public mz peekMenu() {
        return this.mMenu;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mPresenter.k = z;
    }

    public void setMenuCallbacks(defpackage.ng.a aVar, defpackage.mz.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        nq nqVar = this.mPresenter;
        if (nqVar.g != null) {
            nqVar.g.setImageDrawable(drawable);
            return;
        }
        nqVar.i = true;
        nqVar.h = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.mReserveOverflow = z;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
                return;
            }
            this.mPopupContext = new ContextThemeWrapper(getContext(), i);
        }
    }

    public void setPresenter(nq nqVar) {
        this.mPresenter = nqVar;
        this.mPresenter.a(this);
    }

    public boolean showOverflowMenu() {
        nq nqVar = this.mPresenter;
        return nqVar != null && nqVar.d();
    }
}
