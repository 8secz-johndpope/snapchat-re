package com.snap.preview.tools.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.tyq;
import defpackage.tzp;
import defpackage.uac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PreviewVerticalToolbarView extends LinearLayout implements tzp {
    final Map<String, uac> a;
    final Map<String, FrameLayout> b;
    private AnimatorSet c;

    public PreviewVerticalToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private PreviewVerticalToolbarView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        setLayoutParams(new LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(1);
    }

    private List<Animator> b() {
        View childAt;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                break;
            }
        }
        childAt = null;
        if (childAt == null) {
            return arrayList;
        }
        for (View view : a()) {
            arrayList.add(tyq.a(view, childAt.getX() - view.getX(), childAt.getY() - view.getY()));
        }
        return arrayList;
    }

    private List<Animator> b(String str, int i) {
        Entry entry;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.entrySet().iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            entry = (Entry) it.next();
            View view = ((uac) entry.getValue()).d;
            if (!(((String) entry.getKey()).equals(str) || view.getVisibility() == 8)) {
                if (!((uac) entry.getValue()).j) {
                    i2 = 4;
                }
                arrayList.add(tyq.a(view, i, i2));
            }
        }
        for (Entry entry2 : this.b.entrySet()) {
            if (!(((String) entry2.getKey()).equals(str) || ((FrameLayout) entry2.getValue()).getVisibility() == 8)) {
                arrayList.add(tyq.a((View) entry2.getValue(), i, 0));
            }
        }
        return arrayList;
    }

    private List<Animator> c() {
        ArrayList arrayList = new ArrayList();
        for (View a : a()) {
            arrayList.add(tyq.a(a, (float) MapboxConstants.MINIMUM_ZOOM, (float) MapboxConstants.MINIMUM_ZOOM));
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final */
    public final List<FrameLayout> a() {
        ArrayList arrayList = new ArrayList();
        for (uac uac : this.a.values()) {
            arrayList.add(uac.d);
        }
        arrayList.addAll(this.b.values());
        return arrayList;
    }

    public final uac a(String str) {
        return (uac) this.a.get(str);
    }

    public final void a(FrameLayout frameLayout) {
        addView(frameLayout);
    }

    public final void a(String str, int i) {
        FrameLayout frameLayout = a(str) == null ? (FrameLayout) this.b.get(str) : a(str).d;
        if (frameLayout != null && frameLayout.getVisibility() != i) {
            frameLayout.setVisibility(i);
        }
    }

    public final void a(String str, FrameLayout frameLayout) {
        this.b.put(str, frameLayout);
    }

    public final void a(String str, uac uac) {
        this.a.put(str, uac);
        this.b.remove(str);
    }

    public final void b(final String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b());
        arrayList.addAll(b(str, 0));
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c = new AnimatorSet();
        this.c.playTogether(arrayList);
        this.c.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                FrameLayout frameLayout;
                for (Entry entry : PreviewVerticalToolbarView.this.a.entrySet()) {
                    frameLayout = ((uac) entry.getValue()).d;
                    if (((String) entry.getKey()).equals(str)) {
                        frameLayout.setClickable(true);
                    } else if (frameLayout.getVisibility() != 8) {
                        frameLayout.setVisibility(4);
                    }
                }
                for (Entry entry2 : PreviewVerticalToolbarView.this.b.entrySet()) {
                    frameLayout = (FrameLayout) entry2.getValue();
                    if (((String) entry2.getKey()).equals(str)) {
                        frameLayout.setClickable(true);
                    } else if (frameLayout.getVisibility() != 8) {
                        frameLayout.setVisibility(4);
                    }
                }
            }

            public final void onAnimationStart(Animator animator) {
                for (FrameLayout clickable : PreviewVerticalToolbarView.this.a()) {
                    clickable.setClickable(false);
                }
                for (Entry entry : PreviewVerticalToolbarView.this.a.entrySet()) {
                    if (((String) entry.getKey()).equals(str)) {
                        ((uac) entry.getValue()).a(true);
                    }
                }
            }
        });
        this.c.start();
    }

    public final void c(final String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c());
        arrayList.addAll(b(str, 1));
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.c = new AnimatorSet();
        this.c.playTogether(arrayList);
        this.c.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                for (FrameLayout clickable : PreviewVerticalToolbarView.this.a()) {
                    clickable.setClickable(true);
                }
                for (Entry entry : PreviewVerticalToolbarView.this.a.entrySet()) {
                    if (((String) entry.getKey()).equals(str)) {
                        ((uac) entry.getValue()).a(false);
                    }
                }
            }

            public final void onAnimationStart(Animator animator) {
                Iterator it = PreviewVerticalToolbarView.this.a.entrySet().iterator();
                while (true) {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    FrameLayout frameLayout = ((uac) entry.getValue()).d;
                    if (frameLayout.getVisibility() != 8) {
                        frameLayout.setClickable(false);
                        if (!((uac) entry.getValue()).j) {
                            i = 4;
                        }
                        frameLayout.setVisibility(i);
                    }
                }
                for (FrameLayout frameLayout2 : PreviewVerticalToolbarView.this.b.values()) {
                    if (frameLayout2.getVisibility() != 8) {
                        frameLayout2.setClickable(false);
                        frameLayout2.setVisibility(0);
                    }
                }
            }
        });
        this.c.start();
    }
}
