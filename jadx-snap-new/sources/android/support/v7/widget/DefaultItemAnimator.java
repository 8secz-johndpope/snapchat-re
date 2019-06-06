package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.kb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefaultItemAnimator extends SimpleItemAnimator {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<ViewHolder> mAddAnimations = new ArrayList();
    ArrayList<ArrayList<ViewHolder>> mAdditionsList = new ArrayList();
    ArrayList<ViewHolder> mChangeAnimations = new ArrayList();
    ArrayList<ArrayList<a>> mChangesList = new ArrayList();
    ArrayList<ViewHolder> mMoveAnimations = new ArrayList();
    ArrayList<ArrayList<b>> mMovesList = new ArrayList();
    private ArrayList<ViewHolder> mPendingAdditions = new ArrayList();
    private ArrayList<a> mPendingChanges = new ArrayList();
    private ArrayList<b> mPendingMoves = new ArrayList();
    private ArrayList<ViewHolder> mPendingRemovals = new ArrayList();
    ArrayList<ViewHolder> mRemoveAnimations = new ArrayList();

    static class b {
        public ViewHolder a;
        public int b;
        public int c;
        public int d;
        public int e;

        b(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.a = viewHolder;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    static class a {
        public ViewHolder a;
        public ViewHolder b;
        public int c;
        public int d;
        public int e;
        public int f;

        private a(ViewHolder viewHolder, ViewHolder viewHolder2) {
            this.a = viewHolder;
            this.b = viewHolder2;
        }

        a(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ChangeInfo{oldHolder=");
            stringBuilder.append(this.a);
            stringBuilder.append(", newHolder=");
            stringBuilder.append(this.b);
            stringBuilder.append(", fromX=");
            stringBuilder.append(this.c);
            stringBuilder.append(", fromY=");
            stringBuilder.append(this.d);
            stringBuilder.append(", toX=");
            stringBuilder.append(this.e);
            stringBuilder.append(", toY=");
            stringBuilder.append(this.f);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private void animateRemoveImpl(final ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(MapboxConstants.MINIMUM_ZOOM).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                DefaultItemAnimator.this.dispatchRemoveFinished(viewHolder);
                DefaultItemAnimator.this.mRemoveAnimations.remove(viewHolder);
                DefaultItemAnimator.this.dispatchFinishedWhenDone();
            }

            public final void onAnimationStart(Animator animator) {
                DefaultItemAnimator.this.dispatchRemoveStarting(viewHolder);
            }
        }).start();
    }

    private void endChangeAnimation(List<a> list, ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = (a) list.get(size);
            if (endChangeAnimationIfNecessary(aVar, viewHolder) && aVar.a == null && aVar.b == null) {
                list.remove(aVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(a aVar) {
        if (aVar.a != null) {
            endChangeAnimationIfNecessary(aVar, aVar.a);
        }
        if (aVar.b != null) {
            endChangeAnimationIfNecessary(aVar, aVar.b);
        }
    }

    private boolean endChangeAnimationIfNecessary(a aVar, ViewHolder viewHolder) {
        boolean z = false;
        if (aVar.b == viewHolder) {
            aVar.b = null;
        } else if (aVar.a != viewHolder) {
            return false;
        } else {
            aVar.a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
        viewHolder.itemView.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    private void resetAnimation(ViewHolder viewHolder) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
    }

    public boolean animateAdd(ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void animateAddImpl(final ViewHolder viewHolder) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                DefaultItemAnimator.this.dispatchAddFinished(viewHolder);
                DefaultItemAnimator.this.mAddAnimations.remove(viewHolder);
                DefaultItemAnimator.this.dispatchFinishedWhenDone();
            }

            public final void onAnimationStart(Animator animator) {
                DefaultItemAnimator.this.dispatchAddStarting(viewHolder);
            }
        }).start();
    }

    public boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            viewHolder2.itemView.setTranslationX((float) (-i5));
            viewHolder2.itemView.setTranslationY((float) (-i6));
            viewHolder2.itemView.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        }
        this.mPendingChanges.add(new a(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void animateChangeImpl(final a aVar) {
        ViewHolder viewHolder = aVar.a;
        View view = null;
        final View view2 = viewHolder == null ? null : viewHolder.itemView;
        ViewHolder viewHolder2 = aVar.b;
        if (viewHolder2 != null) {
            view = viewHolder2.itemView;
        }
        if (view2 != null) {
            final ViewPropertyAnimator duration = view2.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(aVar.a);
            duration.translationX((float) (aVar.e - aVar.c));
            duration.translationY((float) (aVar.f - aVar.d));
            duration.alpha(MapboxConstants.MINIMUM_ZOOM).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                    view2.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                    DefaultItemAnimator.this.dispatchChangeFinished(aVar.a, true);
                    DefaultItemAnimator.this.mChangeAnimations.remove(aVar.a);
                    DefaultItemAnimator.this.dispatchFinishedWhenDone();
                }

                public final void onAnimationStart(Animator animator) {
                    DefaultItemAnimator.this.dispatchChangeStarting(aVar.a, true);
                }
            }).start();
        }
        if (view != null) {
            final ViewPropertyAnimator animate = view.animate();
            this.mChangeAnimations.add(aVar.b);
            animate.translationX(MapboxConstants.MINIMUM_ZOOM).translationY(MapboxConstants.MINIMUM_ZOOM).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                    view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                    DefaultItemAnimator.this.dispatchChangeFinished(aVar.b, false);
                    DefaultItemAnimator.this.mChangeAnimations.remove(aVar.b);
                    DefaultItemAnimator.this.dispatchFinishedWhenDone();
                }

                public final void onAnimationStart(Animator animator) {
                    DefaultItemAnimator.this.dispatchChangeStarting(aVar.b, false);
                }
            }).start();
        }
    }

    public boolean animateMove(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) viewHolder.itemView.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        resetAnimation(viewHolder);
        i = i3 - translationX;
        i2 = i4 - translationY;
        if (i == 0 && i2 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i != 0) {
            view.setTranslationX((float) (-i));
        }
        if (i2 != 0) {
            view.setTranslationY((float) (-i2));
        }
        this.mPendingMoves.add(new b(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void animateMoveImpl(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        final View view = viewHolder.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(MapboxConstants.MINIMUM_ZOOM);
        }
        if (i6 != 0) {
            view.animate().translationY(MapboxConstants.MINIMUM_ZOOM);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(viewHolder);
        final ViewHolder viewHolder2 = viewHolder;
        animate.setDuration(getMoveDuration()).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                }
                if (i6 != 0) {
                    view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                DefaultItemAnimator.this.dispatchMoveFinished(viewHolder2);
                DefaultItemAnimator.this.mMoveAnimations.remove(viewHolder2);
                DefaultItemAnimator.this.dispatchFinishedWhenDone();
            }

            public final void onAnimationStart(Animator animator) {
                DefaultItemAnimator.this.dispatchMoveStarting(viewHolder2);
            }
        }).start();
    }

    public boolean animateRemove(ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        return true;
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }

    /* Access modifiers changed, original: 0000 */
    public void cancelAll(List<ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((ViewHolder) list.get(size)).itemView.animate().cancel();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimation(ViewHolder viewHolder) {
        ArrayList arrayList;
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((b) this.mPendingMoves.get(size)).a == viewHolder) {
                view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                dispatchMoveFinished(viewHolder);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, viewHolder);
        if (this.mPendingRemovals.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (size = this.mChangesList.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.mChangesList.get(size);
            endChangeAnimation(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size);
            }
        }
        for (size = this.mMovesList.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.mMovesList.get(size);
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                if (((b) arrayList.get(size2)).a == viewHolder) {
                    view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                    view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                    dispatchMoveFinished(viewHolder);
                    arrayList.remove(size2);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(size);
                    }
                } else {
                    size2--;
                }
            }
        }
        for (size = this.mAdditionsList.size() - 1; size >= 0; size--) {
            ArrayList arrayList2 = (ArrayList) this.mAdditionsList.get(size);
            if (arrayList2.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList2.isEmpty()) {
                    this.mAdditionsList.remove(size);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = (b) this.mPendingMoves.get(size);
            View view = bVar.a.itemView;
            view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
            dispatchMoveFinished(bVar.a);
            this.mPendingMoves.remove(size);
        }
        for (size = this.mPendingRemovals.size() - 1; size >= 0; size--) {
            dispatchRemoveFinished((ViewHolder) this.mPendingRemovals.get(size));
            this.mPendingRemovals.remove(size);
        }
        size = this.mPendingAdditions.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ViewHolder viewHolder = (ViewHolder) this.mPendingAdditions.get(size);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.mPendingAdditions.remove(size);
        }
        for (size = this.mPendingChanges.size() - 1; size >= 0; size--) {
            endChangeAnimationIfNecessary((a) this.mPendingChanges.get(size));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            ArrayList arrayList;
            for (size = this.mMovesList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = (ArrayList) this.mMovesList.get(size);
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    b bVar2 = (b) arrayList2.get(size2);
                    View view2 = bVar2.a.itemView;
                    view2.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
                    view2.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                    dispatchMoveFinished(bVar2.a);
                    arrayList2.remove(size2);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(arrayList2);
                    }
                }
            }
            for (size = this.mAdditionsList.size() - 1; size >= 0; size--) {
                arrayList = (ArrayList) this.mAdditionsList.get(size);
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    ViewHolder viewHolder2 = (ViewHolder) arrayList.get(size3);
                    viewHolder2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.mAdditionsList.remove(arrayList);
                    }
                }
            }
            for (size = this.mChangesList.size() - 1; size >= 0; size--) {
                arrayList = (ArrayList) this.mChangesList.get(size);
                for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
                    endChangeAnimationIfNecessary((a) arrayList.get(size4));
                    if (arrayList.isEmpty()) {
                        this.mChangesList.remove(arrayList);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    public void runPendingAnimations() {
        int isEmpty = this.mPendingRemovals.isEmpty() ^ 1;
        int isEmpty2 = this.mPendingMoves.isEmpty() ^ 1;
        int isEmpty3 = this.mPendingChanges.isEmpty() ^ 1;
        int isEmpty4 = this.mPendingAdditions.isEmpty() ^ 1;
        if (isEmpty != 0 || isEmpty2 != 0 || isEmpty4 != 0 || isEmpty3 != 0) {
            final ArrayList arrayList;
            Iterator it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl((ViewHolder) it.next());
            }
            this.mPendingRemovals.clear();
            if (isEmpty2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                AnonymousClass1 anonymousClass1 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            DefaultItemAnimator.this.animateMoveImpl(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
                        }
                        arrayList.clear();
                        DefaultItemAnimator.this.mMovesList.remove(arrayList);
                    }
                };
                if (isEmpty != 0) {
                    kb.a(((b) arrayList.get(0)).a.itemView, anonymousClass1, getRemoveDuration());
                } else {
                    anonymousClass1.run();
                }
            }
            if (isEmpty3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList);
                this.mPendingChanges.clear();
                AnonymousClass2 anonymousClass2 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            DefaultItemAnimator.this.animateChangeImpl((a) it.next());
                        }
                        arrayList.clear();
                        DefaultItemAnimator.this.mChangesList.remove(arrayList);
                    }
                };
                if (isEmpty != 0) {
                    kb.a(((a) arrayList.get(0)).a.itemView, anonymousClass2, getRemoveDuration());
                } else {
                    anonymousClass2.run();
                }
            }
            if (isEmpty4 != 0) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList2);
                this.mPendingAdditions.clear();
                AnonymousClass3 anonymousClass3 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            DefaultItemAnimator.this.animateAddImpl((ViewHolder) it.next());
                        }
                        arrayList2.clear();
                        DefaultItemAnimator.this.mAdditionsList.remove(arrayList2);
                    }
                };
                if (isEmpty == 0 && isEmpty2 == 0 && isEmpty3 == 0) {
                    anonymousClass3.run();
                } else {
                    long j = 0;
                    long removeDuration = isEmpty != 0 ? getRemoveDuration() : 0;
                    long moveDuration = isEmpty2 != 0 ? getMoveDuration() : 0;
                    if (isEmpty3 != 0) {
                        j = getChangeDuration();
                    }
                    kb.a(((ViewHolder) arrayList2.get(0)).itemView, anonymousClass3, removeDuration + Math.max(moveDuration, j));
                }
            }
        }
    }
}
