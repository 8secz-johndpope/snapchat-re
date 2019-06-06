package com.snap.talk.ui.fullscreen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtl;
import defpackage.abtp;
import defpackage.akcr;
import defpackage.idb;
import defpackage.zai;
import defpackage.zaz;
import defpackage.zbk;
import defpackage.zbl;
import defpackage.zcb;
import defpackage.zcf;
import defpackage.zci;
import defpackage.zck;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupFullscreenPane extends zaz {
    final a b;
    final View c;
    final Map<zai, Rect> d = new LinkedHashMap();
    final Map<zai, float[]> e = new HashMap();
    private final zcf f = new zcf();
    private final b g;
    private final int h;
    private final int i;
    private int j;

    static class a extends zcb<zai> {
        public a(Context context) {
            super(context);
        }

        public final void onViewRemoved(View view) {
            super.onViewRemoved(view);
            zai zai = (zai) view;
            zai.resetPivot();
            zai.g = defpackage.zai.a.PRESENCE_PILL;
            zai.e();
        }
    }

    class b extends zbl {
        private boolean a;

        public b() {
            super(GroupFullscreenPane.this.c);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            GroupFullscreenPane.this.setEnabled(this.a);
            for (zai h : GroupFullscreenPane.this.d.keySet()) {
                h.h();
            }
            for (zai h2 : GroupFullscreenPane.this.d.keySet()) {
                h2.bringToFront();
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.a = GroupFullscreenPane.this.isEnabled();
            GroupFullscreenPane.this.setEnabled(false);
            for (zai i : GroupFullscreenPane.this.d.keySet()) {
                i.i();
            }
        }
    }

    public GroupFullscreenPane(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View view = new View(context);
        this.c = view;
        addView(view, new LayoutParams(-1, -1));
        a aVar = new a(context);
        this.b = aVar;
        addView(aVar, new LayoutParams(-1, -1));
        this.c.setBackgroundColor(ContextCompat.getColor(context, 17170444));
        this.c.setVisibility(8);
        abtl g = abtp.g(context);
        this.i = g.b();
        this.h = g.c();
        setClipChildren(false);
        setClipToPadding(false);
        this.g = new b();
    }

    private Animator a(final Collection<zai> collection) {
        return zbk.a(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                for (zai zai : collection) {
                    defpackage.zai.b bVar = defpackage.zai.b.VIDEO;
                    if (zai.getParent() != null) {
                        bVar = zai.h;
                        zai.g(defpackage.zai.b.VIDEO_FROZEN);
                        zai.g = defpackage.zai.a.FULLSCREEN;
                        ((ViewGroup) zai.getParent()).removeViewInLayout(zai);
                    }
                    zai.setVisibility(0);
                    zai.g(bVar);
                }
                for (Entry entry : GroupFullscreenPane.this.e.entrySet()) {
                    zai zai2 = (zai) entry.getKey();
                    float[] fArr = (float[]) entry.getValue();
                    zai2.setPivotY(MapboxConstants.MINIMUM_ZOOM);
                    zai2.setPivotX(MapboxConstants.MINIMUM_ZOOM);
                    zai2.setScaleX(fArr[0]);
                    zai2.setScaleY(fArr[1]);
                    zai2.setTranslationX(fArr[2]);
                    zai2.setTranslationY(fArr[3]);
                    zai2.b(fArr[4]);
                }
                a aVar = GroupFullscreenPane.this.b;
                aVar.a = ImmutableMap.copyOf(GroupFullscreenPane.this.d);
                aVar.requestLayout();
            }
        });
    }

    private /* synthetic */ void a() {
        for (zai zai : this.d.keySet()) {
            zai.j = MapboxConstants.MINIMUM_ZOOM;
            zai.invalidate();
        }
    }

    private Animator b(Collection<zai> collection) {
        this.e.clear();
        return idb.a((Animator[]) FluentIterable.from(this.d.entrySet()).transform(new -$$Lambda$GroupFullscreenPane$Ve4S-Ur7JFrhJK6nQR8203KpdoA(this, collection)).toArray(Animator.class));
    }

    private /* synthetic */ void b() {
        for (zai resetPivot : this.d.keySet()) {
            resetPivot.resetPivot();
        }
    }

    private void c(List<zai> list, int i) {
        this.j = i;
        ImmutableList a = this.f.a(this.i, this.h - i, list.size());
        this.d.clear();
        for (int i2 = 0; i2 < a.size(); i2++) {
            this.d.put(list.get(i2), a.get(i2));
        }
    }

    public final Animator a(List<zai> list, int i) {
        c(list, i);
        Animator b = b(Collections.emptySet());
        Animator a = idb.a((Animator[]) FluentIterable.from(list).transform(new -$$Lambda$GroupFullscreenPane$bffPAise0WiVDnwg6i-UXyrlm0A(this)).toArray(Animator.class));
        Animator a2 = a((Collection) list);
        ValueAnimator a3 = akcr.b(new View[]{this.c}, "views");
        a2 = idb.f(a2, idb.a(b, a, a3));
        a2.addListener(this.g);
        return a2;
    }

    public final Animator a(Map<zai, Rect> map) {
        Animator a = idb.a(ObjectAnimator.ofFloat(this.c, ALPHA, new float[]{this.c.getAlpha(), MapboxConstants.MINIMUM_ZOOM}), (Animator[]) FluentIterable.from(map.entrySet()).transform(new -$$Lambda$GroupFullscreenPane$qzwDwPUO6GrPu75ClimViJoSAAI(this)).toArray(Animator.class));
        a.addListener(this.g);
        defpackage.zbk.a b = zbk.b(new -$$Lambda$GroupFullscreenPane$QPIEN3lZCxrITGgNGA8BhMgJXb8(this));
        b.b = new -$$Lambda$GroupFullscreenPane$SnwKvZNLEuOTcq6gDYx7MB4lHU0(this);
        a.addListener(b);
        return a;
    }

    public final void a(int i) {
        a(i > 0);
        int i2 = this.h;
        float f = ((float) (i2 - i)) / ((float) (i2 - this.j));
        for (zai zai : this.d.keySet()) {
            zai.setScaleY(f);
            zai.setY(((float) zai.getTop()) * f);
        }
    }

    public final void a(zci zci) {
        this.a = new zck(this.b, this.c, zci, this);
    }

    public final void a(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final Animator b(List<zai> list, int i) {
        Animator animator;
        ImmutableSet immutableCopy = Sets.difference(this.d.keySet(), Sets.newHashSet((Iterable) list)).immutableCopy();
        Collection immutableCopy2 = Sets.difference(Sets.newHashSet((Iterable) list), this.d.keySet()).immutableCopy();
        c(list, i);
        Animator animator2 = null;
        if (immutableCopy.isEmpty()) {
            animator = null;
        } else {
            animator = idb.a((Animator[]) FluentIterable.from(immutableCopy).transform(-$$Lambda$GroupFullscreenPane$lw5HMBkx3_-5M5rT-nU8W48vjHY.INSTANCE).toArray(Animator.class));
        }
        Animator b = b(immutableCopy2);
        if (!(animator == null && b == null)) {
            animator2 = a(immutableCopy2);
            animator2.addListener(zbk.b(new -$$Lambda$GroupFullscreenPane$VYFeWF1QNT-aUAb10N1FyygjV10(immutableCopy2)));
        }
        animator = idb.b(animator, animator2, b);
        if (animator != null) {
            animator.addListener(this.g);
        }
        return animator;
    }

    public boolean canScrollHorizontally(int i) {
        return true;
    }
}
