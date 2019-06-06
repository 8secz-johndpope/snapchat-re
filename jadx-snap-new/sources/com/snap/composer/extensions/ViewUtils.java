package com.snap.composer.extensions;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.snap.composer.attributes.impl.animations.transition.ComposerTransitionInfo;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.nodes.ComposerViewNode;
import com.snap.composer.utils.ComposerObjects;
import com.snap.composer.views.touches.ComposerGestureRecognizer;
import com.snap.composer.views.touches.GestureRecognizers;
import defpackage.akcr;

public final class ViewUtils {
    public static final ViewUtils INSTANCE = new ViewUtils();

    private ViewUtils() {
    }

    private static ComposerObjects a(View view, boolean z) {
        Object tag = view.getTag();
        if (!(tag instanceof ComposerObjects)) {
            tag = null;
        }
        ComposerObjects composerObjects = (ComposerObjects) tag;
        if (composerObjects != null || !z) {
            return composerObjects;
        }
        composerObjects = new ComposerObjects();
        view.setTag(composerObjects);
        return composerObjects;
    }

    public static /* synthetic */ GestureRecognizers getGestureRecognizers$default(ViewUtils viewUtils, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return viewUtils.getGestureRecognizers(view, z);
    }

    public final void addGestureRecognizer(View view, ComposerGestureRecognizer composerGestureRecognizer) {
        akcr.b(view, "view");
        akcr.b(composerGestureRecognizer, "gestureRecognizer");
        getOrCreateGestureRecognizers(view).addGestureRecognizer(composerGestureRecognizer);
    }

    public final void applyLayoutToComposerChildren(ViewGroup viewGroup) {
        akcr.b(viewGroup, "viewGroup");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childAt = viewGroup.getChildAt(i);
            akcr.a(childAt, "childView");
            if (childAt.isLayoutRequested()) {
                ComposerObjects a = a(childAt, false);
                if (a != null) {
                    ComposerViewNode composerViewNode = a.getComposerViewNode();
                    if (composerViewNode != null) {
                        int calculatedX = composerViewNode.getCalculatedX();
                        int calculatedY = composerViewNode.getCalculatedY();
                        childAt.layout(calculatedX, calculatedY, childAt.getMeasuredWidth() + calculatedX, childAt.getMeasuredHeight() + calculatedY);
                        composerViewNode.didApplyLayout();
                    }
                }
            }
        }
    }

    public final void cancelAnimation(View view, Object obj) {
        akcr.b(view, "view");
        akcr.b(obj, "key");
        ComposerTransitionInfo transitionInfo = getTransitionInfo(view);
        if (transitionInfo != null) {
            transitionInfo.cancelAnimator(obj);
        }
    }

    public final void cancelAnimations(View view) {
        akcr.b(view, "view");
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.clearAnimation();
        ComposerTransitionInfo transitionInfo = getTransitionInfo(view);
        if (transitionInfo != null) {
            transitionInfo.cancelAllAnimators();
        }
    }

    public final ComposerContext findComposerContext(View view) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, false);
        return a != null ? a.getComposerContext() : null;
    }

    public final ComposerViewNode findViewNode(View view) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, false);
        return a != null ? a.getComposerViewNode() : null;
    }

    public final GestureRecognizers getGestureRecognizers(View view, boolean z) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, z);
        if (z) {
            if ((a != null ? a.getGestureRecognizers() : null) == null && a != null) {
                a.setGestureRecognizers(new GestureRecognizers());
            }
        }
        return a != null ? a.getGestureRecognizers() : null;
    }

    public final GestureRecognizers getOrCreateGestureRecognizers(View view) {
        akcr.b(view, "view");
        GestureRecognizers gestureRecognizers = getGestureRecognizers(view, true);
        if (gestureRecognizers == null) {
            akcr.a();
        }
        return gestureRecognizers;
    }

    public final ComposerTransitionInfo getOrCreateTransitionInfo(View view) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, true);
        ComposerTransitionInfo composerTransitionInfo = a != null ? a.getComposerTransitionInfo() : null;
        if (composerTransitionInfo == null) {
            composerTransitionInfo = new ComposerTransitionInfo();
            if (a != null) {
                a.setComposerTransitionInfo(composerTransitionInfo);
            }
        }
        return composerTransitionInfo;
    }

    public final ComposerTransitionInfo getTransitionInfo(View view) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, false);
        return a != null ? a.getComposerTransitionInfo() : null;
    }

    public final void invalidateLayout(View view) {
        akcr.b(view, "view");
        ComposerViewNode findViewNode = findViewNode(view);
        if (findViewNode != null) {
            findViewNode.invalidateLayout();
        }
    }

    public final void measureComposerChildren(ViewGroup viewGroup) {
        akcr.b(viewGroup, "viewGroup");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childAt = viewGroup.getChildAt(i);
            akcr.a(childAt, "childView");
            if (childAt.isLayoutRequested()) {
                ComposerObjects a = a(childAt, false);
                if (a != null) {
                    ComposerViewNode composerViewNode = a.getComposerViewNode();
                    if (composerViewNode != null) {
                        childAt.measure(MeasureSpec.makeMeasureSpec(composerViewNode.getCalculatedWidth(), AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(composerViewNode.getCalculatedHeight(), AudioPlayer.INFINITY_LOOP_COUNT));
                    }
                }
            }
        }
    }

    public final void notifyAttributeChanged(View view, String str, Object obj) {
        akcr.b(view, "view");
        akcr.b(str, "attributeName");
        ComposerViewNode findViewNode = findViewNode(view);
        if (findViewNode != null) {
            ComposerContext findComposerContext = findComposerContext(view);
            if (findComposerContext != null) {
                findComposerContext.valueChangedForAttribute(findViewNode, str, obj);
            }
        }
    }

    public final void removeGestureRecognizers(View view) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, false);
        if (a != null) {
            GestureRecognizers gestureRecognizers = a.getGestureRecognizers();
            if (gestureRecognizers != null) {
                gestureRecognizers.removeAllGestureRecognizers();
            }
        }
    }

    public final void setComposerContext(View view, ComposerContext composerContext) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, true);
        if (a != null) {
            a.setComposerContext(composerContext);
        }
    }

    public final void setViewNode(View view, ComposerViewNode composerViewNode) {
        akcr.b(view, "view");
        ComposerObjects a = a(view, true);
        if (a != null) {
            a.setComposerViewNode(composerViewNode);
        }
    }
}
