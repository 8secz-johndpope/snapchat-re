package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.jo;
import defpackage.kb;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper extends ItemDecoration implements OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    int mActionState = 0;
    int mActivePointerId = -1;
    Callback mCallback;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    jo mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private a mItemTouchHelperGestureListener;
    float mMaxSwipeVelocity;
    private final OnItemTouchListener mOnItemTouchListener = new OnItemTouchListener() {
        public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            ItemTouchHelper itemTouchHelper;
            if (actionMasked == 0) {
                ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                if (ItemTouchHelper.this.mSelected == null) {
                    b findAnimation = ItemTouchHelper.this.findAnimation(motionEvent);
                    if (findAnimation != null) {
                        ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                        itemTouchHelper2.mInitialTouchX -= findAnimation.j;
                        itemTouchHelper2 = ItemTouchHelper.this;
                        itemTouchHelper2.mInitialTouchY -= findAnimation.k;
                        ItemTouchHelper.this.endRecoverAnimation(findAnimation.e, true);
                        if (ItemTouchHelper.this.mPendingCleanup.remove(findAnimation.e.itemView)) {
                            ItemTouchHelper.this.mCallback.clearView(ItemTouchHelper.this.mRecyclerView, findAnimation.e);
                        }
                        ItemTouchHelper.this.select(findAnimation.e, findAnimation.f);
                        itemTouchHelper = ItemTouchHelper.this;
                        itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                itemTouchHelper = ItemTouchHelper.this;
                itemTouchHelper.mActivePointerId = -1;
                itemTouchHelper.select(null, 0);
            } else if (ItemTouchHelper.this.mActivePointerId != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                if (findPointerIndex >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
            }
            if (ItemTouchHelper.this.mVelocityTracker != null) {
                ItemTouchHelper.this.mVelocityTracker.addMovement(motionEvent);
            }
            return ItemTouchHelper.this.mSelected != null;
        }

        public final void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                ItemTouchHelper.this.select(null, 0);
            }
        }

        public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.a(motionEvent);
            if (ItemTouchHelper.this.mVelocityTracker != null) {
                ItemTouchHelper.this.mVelocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mActivePointerId != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                if (findPointerIndex >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
                ViewHolder viewHolder = ItemTouchHelper.this.mSelected;
                if (viewHolder != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    actionMasked = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionMasked) == ItemTouchHelper.this.mActivePointerId) {
                                        if (actionMasked == 0) {
                                            i = 1;
                                        }
                                        ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(i);
                                        ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                                        itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, actionMasked);
                                    }
                                }
                            } else if (ItemTouchHelper.this.mVelocityTracker != null) {
                                ItemTouchHelper.this.mVelocityTracker.clear();
                            }
                        } else if (findPointerIndex >= 0) {
                            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                            itemTouchHelper2.updateDxDy(motionEvent, itemTouchHelper2.mSelectedFlags, findPointerIndex);
                            ItemTouchHelper.this.moveIfNecessary(viewHolder);
                            ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
                            ItemTouchHelper.this.mScrollRunnable.run();
                            ItemTouchHelper.this.mRecyclerView.invalidate();
                        }
                        return;
                    }
                    ItemTouchHelper.this.select(null, 0);
                    ItemTouchHelper.this.mActivePointerId = -1;
                }
            }
        }
    };
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    final List<View> mPendingCleanup = new ArrayList();
    List<b> mRecoverAnimations = new ArrayList();
    RecyclerView mRecyclerView;
    final Runnable mScrollRunnable = new Runnable() {
        public final void run() {
            if (ItemTouchHelper.this.mSelected != null && ItemTouchHelper.this.scrollIfNecessary()) {
                if (ItemTouchHelper.this.mSelected != null) {
                    ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                    itemTouchHelper.moveIfNecessary(itemTouchHelper.mSelected);
                }
                ItemTouchHelper.this.mRecyclerView.removeCallbacks(ItemTouchHelper.this.mScrollRunnable);
                kb.a(ItemTouchHelper.this.mRecyclerView, (Runnable) this);
            }
        }
    };
    ViewHolder mSelected = null;
    int mSelectedFlags;
    float mSelectedStartX;
    float mSelectedStartY;
    private int mSlop;
    private List<ViewHolder> mSwapTargets;
    float mSwipeEscapeVelocity;
    private final float[] mTmpPosition = new float[2];
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;

    public interface ViewDropHandler {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new Interpolator() {
            public final float getInterpolation(float f) {
                return (((f * f) * f) * f) * f;
            }
        };
        private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() {
            public final float getInterpolation(float f) {
                f -= 1.0f;
                return ((((f * f) * f) * f) * f) + 1.0f;
            }
        };
        private static final ItemTouchUIUtil sUICallback = (VERSION.SDK_INT >= 21 ? new defpackage.oy.a() : new defpackage.oy.b());
        private int mCachedMaxScrollSpeed = -1;

        public static int convertToRelativeDirection(int i, int i2) {
            int i3 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i3 == 0) {
                return i;
            }
            i &= i3 ^ -1;
            if (i2 == 0) {
                i2 = i3 << 2;
            } else {
                i2 = i3 << 1;
                i |= -789517 & i2;
                i2 = (i2 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i | i2;
        }

        public static ItemTouchUIUtil getDefaultUIUtil() {
            return sUICallback;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i << 3);
        }

        public static int makeMovementFlags(int i, int i2) {
            return makeFlag(2, i) | (makeFlag(1, i2) | makeFlag(0, i2 | i));
        }

        public boolean canDropOver(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2) {
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
        public android.support.v7.widget.RecyclerView.ViewHolder chooseDropTarget(android.support.v7.widget.RecyclerView.ViewHolder r15, java.util.List<android.support.v7.widget.RecyclerView.ViewHolder> r16, int r17, int r18) {
            /*
            r14 = this;
            r0 = r15;
            r1 = r0.itemView;
            r1 = r1.getWidth();
            r1 = r17 + r1;
            r2 = r0.itemView;
            r2 = r2.getHeight();
            r2 = r18 + r2;
            r3 = r0.itemView;
            r3 = r3.getLeft();
            r3 = r17 - r3;
            r4 = r0.itemView;
            r4 = r4.getTop();
            r4 = r18 - r4;
            r5 = r16.size();
            r6 = 0;
            r7 = -1;
            r8 = 0;
        L_0x0028:
            if (r8 >= r5) goto L_0x00be;
        L_0x002a:
            r9 = r16;
            r10 = r9.get(r8);
            r10 = (android.support.v7.widget.RecyclerView.ViewHolder) r10;
            if (r3 <= 0) goto L_0x0053;
        L_0x0034:
            r11 = r10.itemView;
            r11 = r11.getRight();
            r11 = r11 - r1;
            if (r11 >= 0) goto L_0x0053;
        L_0x003d:
            r12 = r10.itemView;
            r12 = r12.getRight();
            r13 = r0.itemView;
            r13 = r13.getRight();
            if (r12 <= r13) goto L_0x0053;
        L_0x004b:
            r11 = java.lang.Math.abs(r11);
            if (r11 <= r7) goto L_0x0053;
        L_0x0051:
            r6 = r10;
            goto L_0x0054;
        L_0x0053:
            r11 = r7;
        L_0x0054:
            if (r3 >= 0) goto L_0x0076;
        L_0x0056:
            r7 = r10.itemView;
            r7 = r7.getLeft();
            r7 = r7 - r17;
            if (r7 <= 0) goto L_0x0076;
        L_0x0060:
            r12 = r10.itemView;
            r12 = r12.getLeft();
            r13 = r0.itemView;
            r13 = r13.getLeft();
            if (r12 >= r13) goto L_0x0076;
        L_0x006e:
            r7 = java.lang.Math.abs(r7);
            if (r7 <= r11) goto L_0x0076;
        L_0x0074:
            r11 = r7;
            r6 = r10;
        L_0x0076:
            if (r4 >= 0) goto L_0x0098;
        L_0x0078:
            r7 = r10.itemView;
            r7 = r7.getTop();
            r7 = r7 - r18;
            if (r7 <= 0) goto L_0x0098;
        L_0x0082:
            r12 = r10.itemView;
            r12 = r12.getTop();
            r13 = r0.itemView;
            r13 = r13.getTop();
            if (r12 >= r13) goto L_0x0098;
        L_0x0090:
            r7 = java.lang.Math.abs(r7);
            if (r7 <= r11) goto L_0x0098;
        L_0x0096:
            r11 = r7;
            r6 = r10;
        L_0x0098:
            if (r4 <= 0) goto L_0x00b9;
        L_0x009a:
            r7 = r10.itemView;
            r7 = r7.getBottom();
            r7 = r7 - r2;
            if (r7 >= 0) goto L_0x00b9;
        L_0x00a3:
            r12 = r10.itemView;
            r12 = r12.getBottom();
            r13 = r0.itemView;
            r13 = r13.getBottom();
            if (r12 <= r13) goto L_0x00b9;
        L_0x00b1:
            r7 = java.lang.Math.abs(r7);
            if (r7 <= r11) goto L_0x00b9;
        L_0x00b7:
            r6 = r10;
            goto L_0x00ba;
        L_0x00b9:
            r7 = r11;
        L_0x00ba:
            r8 = r8 + 1;
            goto L_0x0028;
        L_0x00be:
            return r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.ItemTouchHelper$Callback.chooseDropTarget(android.support.v7.widget.RecyclerView$ViewHolder, java.util.List, int, int):android.support.v7.widget.RecyclerView$ViewHolder");
        }

        public void clearView(RecyclerView recyclerView, ViewHolder viewHolder) {
            sUICallback.clearView(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3 = i & RELATIVE_DIR_FLAGS;
            if (i3 == 0) {
                return i;
            }
            i &= i3 ^ -1;
            if (i2 == 0) {
                i2 = i3 >> 2;
            } else {
                i2 = i3 >> 1;
                i |= -3158065 & i2;
                i2 = (i2 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i | i2;
        }

        /* Access modifiers changed, original: final */
        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), kb.a.j(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200 : 250 : i == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean hasDragFlag(RecyclerView recyclerView, ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) != 0;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean hasSwipeFlag(RecyclerView recyclerView, ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_SWIPE_MASK) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int signum = (int) Math.signum((float) i2);
            float f = 1.0f;
            int maxDragScroll = (int) (((float) (signum * getMaxDragScroll(recyclerView))) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j) / 2000.0f;
            }
            maxDragScroll = (int) (((float) maxDragScroll) * sDragScrollInterpolator.getInterpolation(f));
            if (maxDragScroll == 0) {
                if (i2 > 0) {
                    return 1;
                }
                maxDragScroll = -1;
            }
            return maxDragScroll;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            sUICallback.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            sUICallback.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        /* Access modifiers changed, original: 0000 */
        public void onDraw(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, List<b> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) list.get(i2);
                bVar.j = bVar.a == bVar.c ? bVar.e.itemView.getTranslationX() : bVar.a + (bVar.n * (bVar.c - bVar.a));
                bVar.k = bVar.b == bVar.d ? bVar.e.itemView.getTranslationY() : bVar.b + (bVar.n * (bVar.d - bVar.b));
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, bVar.e, bVar.j, bVar.k, bVar.f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                size = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(size);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, ViewHolder viewHolder, List<b> list, int i, float f, float f2) {
            int i2;
            Canvas canvas2 = canvas;
            List<b> list2 = list;
            int size = list.size();
            Object obj = null;
            for (i2 = 0; i2 < size; i2++) {
                b bVar = (b) list2.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, bVar.e, bVar.j, bVar.k, bVar.f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                i2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(i2);
            }
            for (size--; size >= 0; size--) {
                b bVar2 = (b) list2.get(size);
                if (bVar2.m && !bVar2.i) {
                    list2.remove(size);
                } else if (!bVar2.m) {
                    obj = 1;
                }
            }
            if (obj != null) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2);

        public void onMoved(RecyclerView recyclerView, ViewHolder viewHolder, int i, ViewHolder viewHolder2, int i2, int i3, int i4) {
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                sUICallback.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(ViewHolder viewHolder, int i);
    }

    class a extends SimpleOnGestureListener {
        boolean a = true;

        a() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (this.a) {
                View findChildView = ItemTouchHelper.this.findChildView(motionEvent);
                if (findChildView != null) {
                    ViewHolder childViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(findChildView);
                    if (childViewHolder != null && ItemTouchHelper.this.mCallback.hasDragFlag(ItemTouchHelper.this.mRecyclerView, childViewHolder) && motionEvent.getPointerId(0) == ItemTouchHelper.this.mActivePointerId) {
                        int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                        itemTouchHelper.mInitialTouchX = x;
                        itemTouchHelper.mInitialTouchY = y;
                        itemTouchHelper.mDy = MapboxConstants.MINIMUM_ZOOM;
                        itemTouchHelper.mDx = MapboxConstants.MINIMUM_ZOOM;
                        if (itemTouchHelper.mCallback.isLongPressDragEnabled()) {
                            ItemTouchHelper.this.select(childViewHolder, 2);
                        }
                    }
                }
            }
        }
    }

    static class b implements AnimatorListener {
        final float a;
        final float b;
        final float c;
        final float d;
        final ViewHolder e;
        final int f;
        final ValueAnimator g;
        final int h;
        public boolean i;
        float j;
        float k;
        boolean l = false;
        boolean m = false;
        float n;

        b(ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.f = i2;
            this.h = i;
            this.e = viewHolder;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.g = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            this.g.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    b.this.n = valueAnimator.getAnimatedFraction();
                }
            });
            this.g.setTarget(viewHolder.itemView);
            this.g.addListener(this);
            this.n = MapboxConstants.MINIMUM_ZOOM;
        }

        public void onAnimationCancel(Animator animator) {
            this.n = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.m) {
                this.e.setIsRecyclable(true);
            }
            this.m = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i, int i2) {
            this.mDefaultSwipeDirs = i2;
            this.mDefaultDragDirs = i;
        }

        public int getDragDirs(RecyclerView recyclerView, ViewHolder viewHolder) {
            return this.mDefaultDragDirs;
        }

        public int getMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(RecyclerView recyclerView, ViewHolder viewHolder) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i) {
            this.mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.mDefaultSwipeDirs = i;
        }
    }

    public ItemTouchHelper(Callback callback) {
        this.mCallback = callback;
    }

    private void addChildDrawingOrderCallback() {
        if (VERSION.SDK_INT < 21) {
            if (this.mChildDrawingOrderCallback == null) {
                this.mChildDrawingOrderCallback = new ChildDrawingOrderCallback() {
                    public final int onGetChildDrawingOrder(int i, int i2) {
                        if (ItemTouchHelper.this.mOverdrawChild == null) {
                            return i2;
                        }
                        int i3 = ItemTouchHelper.this.mOverdrawChildPosition;
                        if (i3 == -1) {
                            i3 = ItemTouchHelper.this.mRecyclerView.indexOfChild(ItemTouchHelper.this.mOverdrawChild);
                            ItemTouchHelper.this.mOverdrawChildPosition = i3;
                        }
                        return i2 == i + -1 ? i3 : i2 < i3 ? i2 : i2 + 1;
                    }
                };
            }
            this.mRecyclerView.setChildDrawingOrderCallback(this.mChildDrawingOrderCallback);
        }
    }

    private int checkHorizontalSwipe(ViewHolder viewHolder, int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.mDx > MapboxConstants.MINIMUM_ZOOM ? 8 : 4;
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null && this.mActivePointerId >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
                float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
                float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
                if (xVelocity <= MapboxConstants.MINIMUM_ZOOM) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            float width = ((float) this.mRecyclerView.getWidth()) * this.mCallback.getSwipeThreshold(viewHolder);
            if ((i & i3) != 0 && Math.abs(this.mDx) > width) {
                return i3;
            }
        }
        return 0;
    }

    private int checkVerticalSwipe(ViewHolder viewHolder, int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.mDy > MapboxConstants.MINIMUM_ZOOM ? 2 : 1;
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null && this.mActivePointerId >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
                float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
                float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
                if (yVelocity <= MapboxConstants.MINIMUM_ZOOM) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            float height = ((float) this.mRecyclerView.getHeight()) * this.mCallback.getSwipeThreshold(viewHolder);
            if ((i & i3) != 0 && Math.abs(this.mDy) > height) {
                return i3;
            }
        }
        return 0;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            this.mCallback.clearView(this.mRecyclerView, ((b) this.mRecoverAnimations.get(0)).e);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private List<ViewHolder> findSwapTargets(ViewHolder viewHolder) {
        ViewHolder viewHolder2 = viewHolder;
        List list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int round = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int round2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        boundingBoxMargin *= 2;
        int width = (viewHolder2.itemView.getWidth() + round) + boundingBoxMargin;
        int height = (viewHolder2.itemView.getHeight() + round2) + boundingBoxMargin;
        boundingBoxMargin = (round + width) / 2;
        int i = (round2 + height) / 2;
        LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = layoutManager.getChildAt(i2);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int abs = Math.abs(boundingBoxMargin - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i - ((childAt.getTop() + childAt.getBottom()) / 2));
                    abs = (abs * abs) + (abs2 * abs2);
                    abs2 = this.mSwapTargets.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < abs2 && abs > ((Integer) this.mDistances.get(i3)).intValue()) {
                        i4++;
                        i3++;
                        viewHolder2 = viewHolder;
                    }
                    this.mSwapTargets.add(i4, childViewHolder);
                    this.mDistances.add(i4, Integer.valueOf(abs));
                }
            }
            i2++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    private ViewHolder findSwipedView(MotionEvent motionEvent) {
        LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i = this.mActivePointerId;
        if (i == -1) {
            return null;
        }
        i = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(i) - this.mInitialTouchX;
        float y = motionEvent.getY(i) - this.mInitialTouchY;
        x = Math.abs(x);
        y = Math.abs(y);
        int i2 = this.mSlop;
        if (x < ((float) i2) && y < ((float) i2)) {
            return null;
        }
        if (x > y && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if (y > x && layoutManager.canScrollVertically()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        return findChildView == null ? null : this.mRecyclerView.getChildViewHolder(findChildView);
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - ((float) this.mSelected.itemView.getLeft());
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - ((float) this.mSelected.itemView.getTop());
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new a();
        this.mGestureDetector = new jo(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        a aVar = this.mItemTouchHelperGestureListener;
        if (aVar != null) {
            aVar.a = false;
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private int swipeIfNecessary(ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int convertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, kb.a.j(this.mRecyclerView)) >> 8) & ACTION_MODE_IDLE_MASK;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        movementFlags = (movementFlags >> 8) & ACTION_MODE_IDLE_MASK;
        int checkHorizontalSwipe;
        int checkVerticalSwipe;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe <= 0) {
                checkVerticalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
                if (checkVerticalSwipe > 0) {
                    return checkVerticalSwipe;
                }
            } else if ((movementFlags & checkHorizontalSwipe) != 0) {
                return checkHorizontalSwipe;
            } else {
                return Callback.convertToRelativeDirection(checkHorizontalSwipe, kb.a.j(this.mRecyclerView));
            }
        }
        checkHorizontalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
        if (checkHorizontalSwipe > 0) {
            return checkHorizontalSwipe;
        }
        checkVerticalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
        if (checkVerticalSwipe > 0) {
            if ((movementFlags & checkVerticalSwipe) == 0) {
                checkVerticalSwipe = Callback.convertToRelativeDirection(checkVerticalSwipe, kb.a.j(this.mRecyclerView));
            }
            return checkVerticalSwipe;
        }
        return 0;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                setupCallbacks();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:46:0x008f, code skipped:
            return false;
     */
    public boolean checkSelectForSwipe(int r10, android.view.MotionEvent r11, int r12) {
        /*
        r9 = this;
        r0 = r9.mSelected;
        r1 = 0;
        if (r0 != 0) goto L_0x008f;
    L_0x0005:
        r0 = 2;
        if (r10 != r0) goto L_0x008f;
    L_0x0008:
        r10 = r9.mActionState;
        if (r10 == r0) goto L_0x008f;
    L_0x000c:
        r10 = r9.mCallback;
        r10 = r10.isItemViewSwipeEnabled();
        if (r10 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x008f;
    L_0x0015:
        r10 = r9.mRecyclerView;
        r10 = r10.getScrollState();
        r2 = 1;
        if (r10 != r2) goto L_0x001f;
    L_0x001e:
        return r1;
    L_0x001f:
        r10 = r9.findSwipedView(r11);
        if (r10 != 0) goto L_0x0026;
    L_0x0025:
        return r1;
    L_0x0026:
        r3 = r9.mCallback;
        r4 = r9.mRecyclerView;
        r3 = r3.getAbsoluteMovementFlags(r4, r10);
        r3 = r3 >> 8;
        r3 = r3 & 255;
        if (r3 != 0) goto L_0x0035;
    L_0x0034:
        return r1;
    L_0x0035:
        r4 = r11.getX(r12);
        r12 = r11.getY(r12);
        r5 = r9.mInitialTouchX;
        r4 = r4 - r5;
        r5 = r9.mInitialTouchY;
        r12 = r12 - r5;
        r5 = java.lang.Math.abs(r4);
        r6 = java.lang.Math.abs(r12);
        r7 = r9.mSlop;
        r8 = (float) r7;
        r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r8 >= 0) goto L_0x0058;
    L_0x0052:
        r7 = (float) r7;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x0058;
    L_0x0057:
        return r1;
    L_0x0058:
        r7 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x006f;
    L_0x005d:
        r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r12 >= 0) goto L_0x0066;
    L_0x0061:
        r12 = r3 & 4;
        if (r12 != 0) goto L_0x0066;
    L_0x0065:
        return r1;
    L_0x0066:
        r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r12 <= 0) goto L_0x0081;
    L_0x006a:
        r12 = r3 & 8;
        if (r12 != 0) goto L_0x0081;
    L_0x006e:
        return r1;
    L_0x006f:
        r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1));
        if (r4 >= 0) goto L_0x0078;
    L_0x0073:
        r4 = r3 & 1;
        if (r4 != 0) goto L_0x0078;
    L_0x0077:
        return r1;
    L_0x0078:
        r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1));
        if (r12 <= 0) goto L_0x0081;
    L_0x007c:
        r12 = r3 & 2;
        if (r12 != 0) goto L_0x0081;
    L_0x0080:
        return r1;
    L_0x0081:
        r9.mDy = r7;
        r9.mDx = r7;
        r11 = r11.getPointerId(r1);
        r9.mActivePointerId = r11;
        r9.select(r10, r2);
        return r2;
    L_0x008f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.ItemTouchHelper.checkSelectForSwipe(int, android.view.MotionEvent, int):boolean");
    }

    /* Access modifiers changed, original: 0000 */
    public int endRecoverAnimation(ViewHolder viewHolder, boolean z) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            b bVar = (b) this.mRecoverAnimations.get(size);
            if (bVar.e == viewHolder) {
                bVar.l |= z;
                if (!bVar.m) {
                    bVar.g.cancel();
                }
                this.mRecoverAnimations.remove(size);
                return bVar.h;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public b findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            b bVar = (b) this.mRecoverAnimations.get(size);
            if (bVar.e.itemView == findChildView) {
                return bVar;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public View findChildView(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (hitTest(view, x, y, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            b bVar = (b) this.mRecoverAnimations.get(size);
            View view2 = bVar.e.itemView;
            if (hitTest(view2, x, y, bVar.j, bVar.k)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x, y);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        rect.setEmpty();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i = 0; i < size; i++) {
            if (!((b) this.mRecoverAnimations.get(i)).m) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void moveIfNecessary(ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            int i = (int) (this.mSelectedStartX + this.mDx);
            int i2 = (int) (this.mSelectedStartY + this.mDy);
            if (((float) Math.abs(i2 - viewHolder.itemView.getTop())) >= ((float) viewHolder.itemView.getHeight()) * moveThreshold || ((float) Math.abs(i - viewHolder.itemView.getLeft())) >= ((float) viewHolder.itemView.getWidth()) * moveThreshold) {
                List findSwapTargets = findSwapTargets(viewHolder);
                if (findSwapTargets.size() != 0) {
                    ViewHolder chooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, findSwapTargets, i, i2);
                    if (chooseDropTarget == null) {
                        this.mSwapTargets.clear();
                        this.mDistances.clear();
                        return;
                    }
                    int adapterPosition = chooseDropTarget.getAdapterPosition();
                    int adapterPosition2 = viewHolder.getAdapterPosition();
                    if (this.mCallback.onMove(this.mRecyclerView, viewHolder, chooseDropTarget)) {
                        this.mCallback.onMoved(this.mRecyclerView, viewHolder, adapterPosition2, chooseDropTarget, adapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    public void onChildViewAttachedToWindow(View view) {
    }

    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder != null) {
            ViewHolder viewHolder = this.mSelected;
            if (viewHolder == null || childViewHolder != viewHolder) {
                endRecoverAnimation(childViewHolder, false);
                if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
                    this.mCallback.clearView(this.mRecyclerView, childViewHolder);
                }
                return;
            }
            select(null, 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
        float f;
        float f2;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = MapboxConstants.MINIMUM_ZOOM;
            f = MapboxConstants.MINIMUM_ZOOM;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = MapboxConstants.MINIMUM_ZOOM;
            f = MapboxConstants.MINIMUM_ZOOM;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    /* Access modifiers changed, original: 0000 */
    public void postDispatchSwipe(final b bVar, final int i) {
        this.mRecyclerView.post(new Runnable() {
            public final void run() {
                if (!(ItemTouchHelper.this.mRecyclerView == null || !ItemTouchHelper.this.mRecyclerView.isAttachedToWindow() || bVar.l || bVar.e.getAdapterPosition() == -1)) {
                    ItemAnimator itemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                        ItemTouchHelper.this.mCallback.onSwiped(bVar.e, i);
                        return;
                    }
                    ItemTouchHelper.this.mRecyclerView.post(this);
                }
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Missing block: B:32:0x00c5, code skipped:
            if (r1 > 0) goto L_0x00c9;
     */
    public boolean scrollIfNecessary() {
        /*
        r16 = this;
        r0 = r16;
        r1 = r0.mSelected;
        r2 = 0;
        r3 = -9223372036854775808;
        if (r1 != 0) goto L_0x000c;
    L_0x0009:
        r0.mDragScrollStartTimeInMs = r3;
        return r2;
    L_0x000c:
        r5 = java.lang.System.currentTimeMillis();
        r7 = r0.mDragScrollStartTimeInMs;
        r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r1 != 0) goto L_0x0019;
    L_0x0016:
        r7 = 0;
        goto L_0x001b;
    L_0x0019:
        r7 = r5 - r7;
    L_0x001b:
        r1 = r0.mRecyclerView;
        r1 = r1.getLayoutManager();
        r9 = r0.mTmpRect;
        if (r9 != 0) goto L_0x002c;
    L_0x0025:
        r9 = new android.graphics.Rect;
        r9.<init>();
        r0.mTmpRect = r9;
    L_0x002c:
        r9 = r0.mSelected;
        r9 = r9.itemView;
        r10 = r0.mTmpRect;
        r1.calculateItemDecorationsForChild(r9, r10);
        r9 = r1.canScrollHorizontally();
        r10 = 0;
        if (r9 == 0) goto L_0x007f;
    L_0x003c:
        r9 = r0.mSelectedStartX;
        r11 = r0.mDx;
        r9 = r9 + r11;
        r9 = (int) r9;
        r11 = r0.mTmpRect;
        r11 = r11.left;
        r11 = r9 - r11;
        r12 = r0.mRecyclerView;
        r12 = r12.getPaddingLeft();
        r11 = r11 - r12;
        r12 = r0.mDx;
        r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r12 >= 0) goto L_0x0059;
    L_0x0055:
        if (r11 >= 0) goto L_0x0059;
    L_0x0057:
        r12 = r11;
        goto L_0x0080;
    L_0x0059:
        r11 = r0.mDx;
        r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1));
        if (r11 <= 0) goto L_0x007f;
    L_0x005f:
        r11 = r0.mSelected;
        r11 = r11.itemView;
        r11 = r11.getWidth();
        r9 = r9 + r11;
        r11 = r0.mTmpRect;
        r11 = r11.right;
        r9 = r9 + r11;
        r11 = r0.mRecyclerView;
        r11 = r11.getWidth();
        r12 = r0.mRecyclerView;
        r12 = r12.getPaddingRight();
        r11 = r11 - r12;
        r9 = r9 - r11;
        if (r9 <= 0) goto L_0x007f;
    L_0x007d:
        r12 = r9;
        goto L_0x0080;
    L_0x007f:
        r12 = 0;
    L_0x0080:
        r1 = r1.canScrollVertically();
        if (r1 == 0) goto L_0x00c8;
    L_0x0086:
        r1 = r0.mSelectedStartY;
        r9 = r0.mDy;
        r1 = r1 + r9;
        r1 = (int) r1;
        r9 = r0.mTmpRect;
        r9 = r9.top;
        r9 = r1 - r9;
        r11 = r0.mRecyclerView;
        r11 = r11.getPaddingTop();
        r9 = r9 - r11;
        r11 = r0.mDy;
        r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1));
        if (r11 >= 0) goto L_0x00a3;
    L_0x009f:
        if (r9 >= 0) goto L_0x00a3;
    L_0x00a1:
        r1 = r9;
        goto L_0x00c9;
    L_0x00a3:
        r9 = r0.mDy;
        r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r9 <= 0) goto L_0x00c8;
    L_0x00a9:
        r9 = r0.mSelected;
        r9 = r9.itemView;
        r9 = r9.getHeight();
        r1 = r1 + r9;
        r9 = r0.mTmpRect;
        r9 = r9.bottom;
        r1 = r1 + r9;
        r9 = r0.mRecyclerView;
        r9 = r9.getHeight();
        r10 = r0.mRecyclerView;
        r10 = r10.getPaddingBottom();
        r9 = r9 - r10;
        r1 = r1 - r9;
        if (r1 <= 0) goto L_0x00c8;
    L_0x00c7:
        goto L_0x00c9;
    L_0x00c8:
        r1 = 0;
    L_0x00c9:
        if (r12 == 0) goto L_0x00e2;
    L_0x00cb:
        r9 = r0.mCallback;
        r10 = r0.mRecyclerView;
        r11 = r0.mSelected;
        r11 = r11.itemView;
        r11 = r11.getWidth();
        r13 = r0.mRecyclerView;
        r13 = r13.getWidth();
        r14 = r7;
        r12 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14);
    L_0x00e2:
        r14 = r12;
        if (r1 == 0) goto L_0x0101;
    L_0x00e5:
        r9 = r0.mCallback;
        r10 = r0.mRecyclerView;
        r11 = r0.mSelected;
        r11 = r11.itemView;
        r11 = r11.getHeight();
        r12 = r0.mRecyclerView;
        r13 = r12.getHeight();
        r12 = r1;
        r1 = r14;
        r14 = r7;
        r7 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14);
        r12 = r1;
        r1 = r7;
        goto L_0x0102;
    L_0x0101:
        r12 = r14;
    L_0x0102:
        if (r12 != 0) goto L_0x010a;
    L_0x0104:
        if (r1 == 0) goto L_0x0107;
    L_0x0106:
        goto L_0x010a;
    L_0x0107:
        r0.mDragScrollStartTimeInMs = r3;
        return r2;
    L_0x010a:
        r7 = r0.mDragScrollStartTimeInMs;
        r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r2 != 0) goto L_0x0112;
    L_0x0110:
        r0.mDragScrollStartTimeInMs = r5;
    L_0x0112:
        r2 = r0.mRecyclerView;
        r2.scrollBy(r12, r1);
        r1 = 1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.helper.ItemTouchHelper.scrollIfNecessary():boolean");
    }

    /* Access modifiers changed, original: 0000 */
    public void select(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (viewHolder2 != this.mSelected || i2 != this.mActionState) {
            boolean z;
            Object obj;
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            int i3 = this.mActionState;
            endRecoverAnimation(viewHolder2, true);
            this.mActionState = i2;
            if (i2 == 2) {
                this.mOverdrawChild = viewHolder2.itemView;
                addChildDrawingOrderCallback();
            }
            int i4 = (1 << ((i2 << 3) + 8)) - 1;
            final ViewHolder viewHolder3 = this.mSelected;
            if (viewHolder3 != null) {
                if (viewHolder3.itemView.getParent() != null) {
                    float signum;
                    float f;
                    int swipeIfNecessary = i3 == 2 ? 0 : swipeIfNecessary(viewHolder3);
                    releaseVelocityTracker();
                    if (swipeIfNecessary == 1 || swipeIfNecessary == 2) {
                        signum = Math.signum(this.mDy) * ((float) this.mRecyclerView.getHeight());
                        f = MapboxConstants.MINIMUM_ZOOM;
                    } else {
                        f = (swipeIfNecessary == 4 || swipeIfNecessary == 8 || swipeIfNecessary == 16 || swipeIfNecessary == 32) ? Math.signum(this.mDx) * ((float) this.mRecyclerView.getWidth()) : MapboxConstants.MINIMUM_ZOOM;
                        signum = MapboxConstants.MINIMUM_ZOOM;
                    }
                    int i5 = i3 == 2 ? 8 : swipeIfNecessary > 0 ? 2 : 4;
                    getSelectedDxDy(this.mTmpPosition);
                    float[] fArr = this.mTmpPosition;
                    float f2 = fArr[0];
                    float f3 = fArr[1];
                    b bVar = r0;
                    int i6 = i5;
                    z = false;
                    final int i7 = swipeIfNecessary;
                    b anonymousClass3 = new b(this, viewHolder3, i5, i3, f2, f3, f, signum) {
                        private /* synthetic */ ItemTouchHelper q;

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            if (!this.l) {
                                if (i7 <= 0) {
                                    this.q.mCallback.clearView(this.q.mRecyclerView, viewHolder3);
                                } else {
                                    this.q.mPendingCleanup.add(viewHolder3.itemView);
                                    this.i = true;
                                    int i = i7;
                                    if (i > 0) {
                                        this.q.postDispatchSwipe(this, i);
                                    }
                                }
                                if (this.q.mOverdrawChild == viewHolder3.itemView) {
                                    this.q.removeChildDrawingOrderCallbackIfNecessary(viewHolder3.itemView);
                                }
                            }
                        }
                    };
                    bVar.g.setDuration(this.mCallback.getAnimationDuration(this.mRecyclerView, i6, f - f2, signum - f3));
                    this.mRecoverAnimations.add(bVar);
                    bVar.e.setIsRecyclable(false);
                    bVar.g.start();
                    obj = 1;
                } else {
                    z = false;
                    removeChildDrawingOrderCallbackIfNecessary(viewHolder3.itemView);
                    this.mCallback.clearView(this.mRecyclerView, viewHolder3);
                    obj = null;
                }
                this.mSelected = null;
            } else {
                z = false;
                obj = null;
            }
            if (viewHolder2 != null) {
                this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder2) & i4) >> (this.mActionState << 3);
                this.mSelectedStartX = (float) viewHolder2.itemView.getLeft();
                this.mSelectedStartY = (float) viewHolder2.itemView.getTop();
                this.mSelected = viewHolder2;
                if (i == 2) {
                    this.mSelected.itemView.performHapticFeedback(z);
                }
            }
            ViewParent parent = this.mRecyclerView.getParent();
            if (parent != null) {
                if (this.mSelected != null) {
                    z = true;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            }
            if (obj == null) {
                this.mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
            }
            this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
            this.mRecyclerView.invalidate();
        }
    }

    public void startDrag(ViewHolder viewHolder) {
        boolean hasDragFlag = this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder);
        String str = TAG;
        if (!hasDragFlag) {
            Log.e(str, "Start drag has been called but dragging is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(str, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = MapboxConstants.MINIMUM_ZOOM;
            this.mDx = MapboxConstants.MINIMUM_ZOOM;
            select(viewHolder, 2);
        }
    }

    public void startSwipe(ViewHolder viewHolder) {
        boolean hasSwipeFlag = this.mCallback.hasSwipeFlag(this.mRecyclerView, viewHolder);
        String str = TAG;
        if (!hasSwipeFlag) {
            Log.e(str, "Start swipe has been called but swiping is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(str, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = MapboxConstants.MINIMUM_ZOOM;
            this.mDx = MapboxConstants.MINIMUM_ZOOM;
            select(viewHolder, 1);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updateDxDy(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.mDx = x - this.mInitialTouchX;
        this.mDy = y - this.mInitialTouchY;
        if ((i & 4) == 0) {
            this.mDx = Math.max(MapboxConstants.MINIMUM_ZOOM, this.mDx);
        }
        if ((i & 8) == 0) {
            this.mDx = Math.min(MapboxConstants.MINIMUM_ZOOM, this.mDx);
        }
        if ((i & 1) == 0) {
            this.mDy = Math.max(MapboxConstants.MINIMUM_ZOOM, this.mDy);
        }
        if ((i & 2) == 0) {
            this.mDy = Math.min(MapboxConstants.MINIMUM_ZOOM, this.mDy);
        }
    }
}
