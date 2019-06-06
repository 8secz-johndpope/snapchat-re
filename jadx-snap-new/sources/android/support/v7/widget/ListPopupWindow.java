package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.addlive.djinni.LogicError;
import com.snapchat.android.R;
import defpackage.kb;
import defpackage.lc;
import defpackage.nk;
import defpackage.nv;
import defpackage.oh;
import java.lang.reflect.Method;

public class ListPopupWindow implements nk {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static Method sClipToWindowEnabledMethod;
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetEpicenterBoundsMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    oh mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final Handler mHandler;
    private final a mHideSelector;
    private boolean mIsAnimatedFromAnchor;
    private OnItemClickListener mItemClickListener;
    private OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    final e mResizePopupRunnable;
    private final c mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final d mTouchInterceptor;

    class a implements Runnable {
        a() {
        }

        public final void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }

    class b extends DataSetObserver {
        b() {
        }

        public final void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    class c implements OnScrollListener {
        c() {
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.isInputMethodNotNeeded() && ListPopupWindow.this.mPopup.getContentView() != null) {
                ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.mResizePopupRunnable);
                ListPopupWindow.this.mResizePopupRunnable.run();
            }
        }
    }

    class d implements OnTouchListener {
        d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.mPopup != null && ListPopupWindow.this.mPopup.isShowing() && x >= 0 && x < ListPopupWindow.this.mPopup.getWidth() && y >= 0 && y < ListPopupWindow.this.mPopup.getHeight()) {
                ListPopupWindow.this.mHandler.postDelayed(ListPopupWindow.this.mResizePopupRunnable, 250);
            } else if (action == 1) {
                ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.mResizePopupRunnable);
            }
            return false;
        }
    }

    class e implements Runnable {
        e() {
        }

        public final void run() {
            if (ListPopupWindow.this.mDropDownList != null) {
                if (kb.a.r(ListPopupWindow.this.mDropDownList) && ListPopupWindow.this.mDropDownList.getCount() > ListPopupWindow.this.mDropDownList.getChildCount() && ListPopupWindow.this.mDropDownList.getChildCount() <= ListPopupWindow.this.mListItemExpandMaximum) {
                    ListPopupWindow.this.mPopup.setInputMethodMode(2);
                    ListPopupWindow.this.show();
                }
            }
        }
    }

    static {
        String str = TAG;
        try {
            sClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            sGetMaxAvailableHeightMethod = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = LogicError.INVALID_ARGUMENT;
        this.mIsAnimatedFromAnchor = true;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new e();
        this.mTouchInterceptor = new d();
        this.mScrollListener = new c();
        this.mHideSelector = new a();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.lx.a.q, i, i2);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.mDropDownVerticalOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        if (this.mDropDownVerticalOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        this.mPopup = new nv(context, attributeSet, i, i2);
        this.mPopup.setInputMethodMode(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0156  */
    private int buildDropDown() {
        /*
        r12 = this;
        r0 = r12.mDropDownList;
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r2 = -1;
        r3 = 1;
        r4 = 0;
        if (r0 != 0) goto L_0x00be;
    L_0x0009:
        r0 = r12.mContext;
        r5 = new android.support.v7.widget.ListPopupWindow$2;
        r5.<init>();
        r12.mShowDropDownRunnable = r5;
        r5 = r12.mModal;
        r5 = r5 ^ r3;
        r5 = r12.createDropDownListView(r0, r5);
        r12.mDropDownList = r5;
        r5 = r12.mDropDownListHighlight;
        if (r5 == 0) goto L_0x0024;
    L_0x001f:
        r6 = r12.mDropDownList;
        r6.setSelector(r5);
    L_0x0024:
        r5 = r12.mDropDownList;
        r6 = r12.mAdapter;
        r5.setAdapter(r6);
        r5 = r12.mDropDownList;
        r6 = r12.mItemClickListener;
        r5.setOnItemClickListener(r6);
        r5 = r12.mDropDownList;
        r5.setFocusable(r3);
        r5 = r12.mDropDownList;
        r5.setFocusableInTouchMode(r3);
        r5 = r12.mDropDownList;
        r6 = new android.support.v7.widget.ListPopupWindow$3;
        r6.<init>();
        r5.setOnItemSelectedListener(r6);
        r5 = r12.mDropDownList;
        r6 = r12.mScrollListener;
        r5.setOnScrollListener(r6);
        r5 = r12.mItemSelectedListener;
        if (r5 == 0) goto L_0x0056;
    L_0x0051:
        r6 = r12.mDropDownList;
        r6.setOnItemSelectedListener(r5);
    L_0x0056:
        r5 = r12.mDropDownList;
        r6 = r12.mPromptView;
        if (r6 == 0) goto L_0x00b7;
    L_0x005c:
        r7 = new android.widget.LinearLayout;
        r7.<init>(r0);
        r7.setOrientation(r3);
        r0 = new android.widget.LinearLayout$LayoutParams;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.<init>(r2, r4, r8);
        r8 = r12.mPromptPosition;
        if (r8 == 0) goto L_0x008e;
    L_0x006f:
        if (r8 == r3) goto L_0x0087;
    L_0x0071:
        r0 = new java.lang.StringBuilder;
        r5 = "Invalid hint position ";
        r0.<init>(r5);
        r5 = r12.mPromptPosition;
        r0.append(r5);
        r0 = r0.toString();
        r5 = "ListPopupWindow";
        android.util.Log.e(r5, r0);
        goto L_0x0094;
    L_0x0087:
        r7.addView(r5, r0);
        r7.addView(r6);
        goto L_0x0094;
    L_0x008e:
        r7.addView(r6);
        r7.addView(r5, r0);
    L_0x0094:
        r0 = r12.mDropDownWidth;
        if (r0 < 0) goto L_0x009b;
    L_0x0098:
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x009d;
    L_0x009b:
        r0 = 0;
        r5 = 0;
    L_0x009d:
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5);
        r6.measure(r0, r4);
        r0 = r6.getLayoutParams();
        r0 = (android.widget.LinearLayout.LayoutParams) r0;
        r5 = r6.getMeasuredHeight();
        r6 = r0.topMargin;
        r5 = r5 + r6;
        r0 = r0.bottomMargin;
        r5 = r5 + r0;
        r0 = r5;
        r5 = r7;
        goto L_0x00b8;
    L_0x00b7:
        r0 = 0;
    L_0x00b8:
        r6 = r12.mPopup;
        r6.setContentView(r5);
        goto L_0x00d9;
    L_0x00be:
        r0 = r12.mPopup;
        r0.getContentView();
        r0 = r12.mPromptView;
        if (r0 == 0) goto L_0x00d8;
    L_0x00c7:
        r5 = r0.getLayoutParams();
        r5 = (android.widget.LinearLayout.LayoutParams) r5;
        r0 = r0.getMeasuredHeight();
        r6 = r5.topMargin;
        r0 = r0 + r6;
        r5 = r5.bottomMargin;
        r0 = r0 + r5;
        goto L_0x00d9;
    L_0x00d8:
        r0 = 0;
    L_0x00d9:
        r5 = r12.mPopup;
        r5 = r5.getBackground();
        if (r5 == 0) goto L_0x00fb;
    L_0x00e1:
        r6 = r12.mTempRect;
        r5.getPadding(r6);
        r5 = r12.mTempRect;
        r5 = r5.top;
        r6 = r12.mTempRect;
        r6 = r6.bottom;
        r5 = r5 + r6;
        r6 = r12.mDropDownVerticalOffsetSet;
        if (r6 != 0) goto L_0x0101;
    L_0x00f3:
        r6 = r12.mTempRect;
        r6 = r6.top;
        r6 = -r6;
        r12.mDropDownVerticalOffset = r6;
        goto L_0x0101;
    L_0x00fb:
        r5 = r12.mTempRect;
        r5.setEmpty();
        r5 = 0;
    L_0x0101:
        r6 = r12.mPopup;
        r6 = r6.getInputMethodMode();
        r7 = 2;
        if (r6 != r7) goto L_0x010b;
    L_0x010a:
        goto L_0x010c;
    L_0x010b:
        r3 = 0;
    L_0x010c:
        r4 = r12.getAnchorView();
        r6 = r12.mDropDownVerticalOffset;
        r3 = r12.getMaxAvailableHeight(r4, r6, r3);
        r4 = r12.mDropDownAlwaysVisible;
        if (r4 != 0) goto L_0x0167;
    L_0x011a:
        r4 = r12.mDropDownHeight;
        if (r4 != r2) goto L_0x011f;
    L_0x011e:
        goto L_0x0167;
    L_0x011f:
        r4 = r12.mDropDownWidth;
        r6 = -2;
        if (r4 == r6) goto L_0x012e;
    L_0x0124:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r4 == r2) goto L_0x012e;
    L_0x0128:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1);
    L_0x012c:
        r7 = r1;
        goto L_0x0149;
    L_0x012e:
        r2 = r12.mContext;
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.widthPixels;
        r4 = r12.mTempRect;
        r4 = r4.left;
        r6 = r12.mTempRect;
        r6 = r6.right;
        r4 = r4 + r6;
        r2 = r2 - r4;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1);
        goto L_0x012c;
    L_0x0149:
        r6 = r12.mDropDownList;
        r8 = 0;
        r9 = -1;
        r10 = r3 - r0;
        r11 = -1;
        r1 = r6.measureHeightOfChildrenCompat(r7, r8, r9, r10, r11);
        if (r1 <= 0) goto L_0x0165;
    L_0x0156:
        r2 = r12.mDropDownList;
        r2 = r2.getPaddingTop();
        r3 = r12.mDropDownList;
        r3 = r3.getPaddingBottom();
        r2 = r2 + r3;
        r5 = r5 + r2;
        r0 = r0 + r5;
    L_0x0165:
        r1 = r1 + r0;
        return r1;
    L_0x0167:
        r3 = r3 + r5;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.buildDropDown():int");
    }

    private int getMaxAvailableHeight(View view, int i, boolean z) {
        Method method = sGetMaxAvailableHeightMethod;
        if (method != null) {
            try {
                view = ((Integer) method.invoke(this.mPopup, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
                return view;
            } catch (Exception unused) {
                Log.i(TAG, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.mPopup.getMaxAvailableHeight(view, i);
    }

    private static boolean isConfirmKey(int i) {
        return i == 66 || i == 23;
    }

    private void removePromptView() {
        View view = this.mPromptView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    private void setPopupClipToScreenEnabled(boolean z) {
        Method method = sClipToWindowEnabledMethod;
        if (method != null) {
            try {
                method.invoke(this.mPopup, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i(TAG, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void clearListSelection() {
        oh ohVar = this.mDropDownList;
        if (ohVar != null) {
            ohVar.setListSelectionHidden(true);
            ohVar.requestLayout();
        }
    }

    public OnTouchListener createDragToOpenListener(View view) {
        return new ForwardingListener(view) {
            public final /* bridge */ /* synthetic */ nk getPopup() {
                return ListPopupWindow.this;
            }
        };
    }

    /* Access modifiers changed, original: 0000 */
    public oh createDropDownListView(Context context, boolean z) {
        return new oh(context, z);
    }

    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }

    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    public int getHeight() {
        return this.mDropDownHeight;
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }

    public ListView getListView() {
        return this.mDropDownList;
    }

    public int getPromptPosition() {
        return this.mPromptPosition;
    }

    public Object getSelectedItem() {
        return !isShowing() ? null : this.mDropDownList.getSelectedItem();
    }

    public long getSelectedItemId() {
        return !isShowing() ? Long.MIN_VALUE : this.mDropDownList.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        return !isShowing() ? -1 : this.mDropDownList.getSelectedItemPosition();
    }

    public View getSelectedView() {
        return !isShowing() ? null : this.mDropDownList.getSelectedView();
    }

    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }

    public int getVerticalOffset() {
        return !this.mDropDownVerticalOffsetSet ? 0 : this.mDropDownVerticalOffset;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }

    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.mModal;
    }

    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isShowing() && i != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i))) {
            int count;
            int selectedItemPosition = this.mDropDownList.getSelectedItemPosition();
            int isAboveAnchor = this.mPopup.isAboveAnchor() ^ 1;
            ListAdapter listAdapter = this.mAdapter;
            int i2 = Integer.MAX_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int lookForSelectablePosition = areAllItemsEnabled ? 0 : this.mDropDownList.lookForSelectablePosition(0, true);
                count = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.mDropDownList.lookForSelectablePosition(listAdapter.getCount() - 1, false);
                i2 = lookForSelectablePosition;
            } else {
                count = Integer.MIN_VALUE;
            }
            if ((isAboveAnchor == 0 || i != 19 || selectedItemPosition > i2) && !(isAboveAnchor == 0 && i == 20 && selectedItemPosition >= count)) {
                this.mDropDownList.setListSelectionHidden(false);
                if (this.mDropDownList.onKeyDown(i, keyEvent)) {
                    this.mPopup.setInputMethodMode(2);
                    this.mDropDownList.requestFocusFromTouch();
                    show();
                    if (i == 19 || i == 20 || i == 23 || i == 66) {
                        return true;
                    }
                } else if (isAboveAnchor == 0 || i != 20) {
                    return isAboveAnchor == 0 && i == 19 && selectedItemPosition == i2;
                } else {
                    if (selectedItemPosition == count) {
                        return true;
                    }
                }
            }
            clearListSelection();
            this.mPopup.setInputMethodMode(1);
            show();
            return true;
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && isShowing()) {
            View view = this.mDropDownAnchorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    dismiss();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!isShowing() || this.mDropDownList.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.mDropDownList.onKeyUp(i, keyEvent);
        if (onKeyUp && isConfirmKey(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean performItemClick(int i) {
        if (!isShowing()) {
            return false;
        }
        if (this.mItemClickListener != null) {
            oh ohVar = this.mDropDownList;
            int i2 = i;
            this.mItemClickListener.onItemClick(ohVar, ohVar.getChildAt(i - ohVar.getFirstVisiblePosition()), i2, ohVar.getAdapter().getItemId(i));
        }
        return true;
    }

    public void postShow() {
        this.mHandler.post(this.mShowDropDownRunnable);
    }

    public void setAdapter(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new b();
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        oh ohVar = this.mDropDownList;
        if (ohVar != null) {
            ohVar.setAdapter(this.mAdapter);
        }
    }

    public void setAnchorView(View view) {
        this.mDropDownAnchorView = view;
    }

    public void setAnimationStyle(int i) {
        this.mPopup.setAnimationStyle(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i) {
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            this.mDropDownWidth = (this.mTempRect.left + this.mTempRect.right) + i;
            return;
        }
        setWidth(i);
    }

    public void setDropDownAlwaysVisible(boolean z) {
        this.mDropDownAlwaysVisible = z;
    }

    public void setDropDownGravity(int i) {
        this.mDropDownGravity = i;
    }

    public void setEpicenterBounds(Rect rect) {
        this.mEpicenterBounds = rect;
    }

    public void setForceIgnoreOutsideTouch(boolean z) {
        this.mForceIgnoreOutsideTouch = z;
    }

    public void setHeight(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.mDropDownHeight = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    public void setHorizontalOffset(int i) {
        this.mDropDownHorizontalOffset = i;
    }

    public void setInputMethodMode(int i) {
        this.mPopup.setInputMethodMode(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void setListItemExpandMax(int i) {
        this.mListItemExpandMaximum = i;
    }

    public void setListSelector(Drawable drawable) {
        this.mDropDownListHighlight = drawable;
    }

    public void setModal(boolean z) {
        this.mModal = z;
        this.mPopup.setFocusable(z);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.mItemSelectedListener = onItemSelectedListener;
    }

    public void setOverlapAnchor(boolean z) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z;
    }

    public void setPromptPosition(int i) {
        this.mPromptPosition = i;
    }

    public void setPromptView(View view) {
        boolean isShowing = isShowing();
        if (isShowing) {
            removePromptView();
        }
        this.mPromptView = view;
        if (isShowing) {
            show();
        }
    }

    public void setSelection(int i) {
        oh ohVar = this.mDropDownList;
        if (isShowing() && ohVar != null) {
            ohVar.setListSelectionHidden(false);
            ohVar.setSelection(i);
            if (ohVar.getChoiceMode() != 0) {
                ohVar.setItemChecked(i, true);
            }
        }
    }

    public void setSoftInputMode(int i) {
        this.mPopup.setSoftInputMode(i);
    }

    public void setVerticalOffset(int i) {
        this.mDropDownVerticalOffset = i;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setWidth(int i) {
        this.mDropDownWidth = i;
    }

    public void setWindowLayoutType(int i) {
        this.mDropDownWindowLayoutType = i;
    }

    public void show() {
        int buildDropDown = buildDropDown();
        boolean isInputMethodNotNeeded = isInputMethodNotNeeded();
        lc.a(this.mPopup, this.mDropDownWindowLayoutType);
        boolean z = true;
        int i;
        if (this.mPopup.isShowing()) {
            if (kb.a.r(getAnchorView())) {
                i = this.mDropDownWidth;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = getAnchorView().getWidth();
                }
                int i2 = this.mDropDownHeight;
                if (i2 == -1) {
                    if (!isInputMethodNotNeeded) {
                        buildDropDown = -1;
                    }
                    if (isInputMethodNotNeeded) {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(0);
                    } else {
                        this.mPopup.setWidth(this.mDropDownWidth == -1 ? -1 : 0);
                        this.mPopup.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    buildDropDown = i2;
                }
                PopupWindow popupWindow = this.mPopup;
                if (this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) {
                    z = false;
                }
                popupWindow.setOutsideTouchable(z);
                this.mPopup.update(getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, i < 0 ? -1 : i, buildDropDown < 0 ? -1 : buildDropDown);
                return;
            }
            return;
        }
        int i3 = this.mDropDownWidth;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = getAnchorView().getWidth();
        }
        i = this.mDropDownHeight;
        if (i == -1) {
            buildDropDown = -1;
        } else if (i != -2) {
            buildDropDown = i;
        }
        this.mPopup.setWidth(i3);
        this.mPopup.setHeight(buildDropDown);
        setPopupClipToScreenEnabled(true);
        PopupWindow popupWindow2 = this.mPopup;
        isInputMethodNotNeeded = (this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) ? false : true;
        popupWindow2.setOutsideTouchable(isInputMethodNotNeeded);
        this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            lc.a(this.mPopup, this.mOverlapAnchor);
        }
        Method method = sSetEpicenterBoundsMethod;
        if (method != null) {
            try {
                method.invoke(this.mPopup, new Object[]{this.mEpicenterBounds});
            } catch (Exception e) {
                Log.e(TAG, "Could not invoke setEpicenterBounds on PopupWindow", e);
            }
        }
        lc.a.a(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            clearListSelection();
        }
        if (!this.mModal) {
            this.mHandler.post(this.mHideSelector);
        }
    }
}
