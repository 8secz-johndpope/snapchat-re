package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.map.feature.carousel.MapCardsRecyclerView;
import com.snapchat.map.util.OverScrollerSpringBehavior;
import com.snapchat.map.util.OverScrollerSpringBehavior.b;
import defpackage.ackr.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* renamed from: acol */
public final class acol {
    MapCardsRecyclerView a;
    View b;
    Animation c;
    public boolean d;
    private final aclg e;
    private final b f;
    private final nbo g;
    private final acpv h;
    private final acnk i;
    private final njw j;
    private final niw k;
    private final acog l = null;
    private Animation m;
    private a n;
    private abur<View> o;

    /* renamed from: acol$3 */
    class 3 implements AnimationListener {
        3() {
        }

        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
            acol.this.a.setVisibility(0);
        }
    }

    /* renamed from: acol$4 */
    class 4 implements Runnable {
        4() {
        }

        public final void run() {
            acol.this.a.startAnimation(acol.this.c);
        }
    }

    /* renamed from: acol$5 */
    class 5 implements AnimationListener {
        5() {
        }

        public final void onAnimationEnd(Animation animation) {
            acol.this.a.setVisibility(8);
            acol.this.b.setVisibility(8);
            acol.this.a.setTranslationY(1.0f);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: acol$a */
    public interface a {
        void a(List<Object> list);
    }

    /* renamed from: acol$b */
    public interface b {
        void a();
    }

    /* renamed from: acol$2 */
    class 2 implements b {
        2() {
        }

        public final void a(float f) {
            acol.this.a.setTranslationY(-f);
        }

        public final void a(float f, boolean z) {
            acol.this.a.animate().translationY(MapboxConstants.MINIMUM_ZOOM).setDuration(200).start();
        }
    }

    public acol(aclg aclg, b bVar, niw niw, njw njw, nbo nbo, acpv acpv, acnk acnk) {
        this.e = aclg;
        this.f = bVar;
        this.k = niw;
        this.j = njw;
        this.g = nbo;
        this.h = acpv;
        this.i = acnk;
    }

    private void a(njp njp, List<String> list, njo njo) {
        final String b = this.k.b();
        HashSet hashSet = new HashSet();
        hashSet.add(this.k.b());
        for (njv c : njp.b()) {
            hashSet.add(c.c());
        }
        hashSet.add(b);
        int i = 0;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (hashSet.contains(str)) {
                alhq a = this.g.a(str);
                if (a != null) {
                    nkh d = this.j.d(str);
                    if (d != null) {
                        acov acov = new acov(d, b);
                        acov.e = a;
                        arrayList.add(acov);
                        if (!TextUtils.equals(b, str)) {
                            i++;
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator<acov>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                acov acov = (acov) obj2;
                alhq alhq = ((acov) obj).e;
                alhq alhq2 = acov.e;
                return (alhq == null || alhq2 == null) ? 0 : TextUtils.equals(alhq.a, b) ? 1 : TextUtils.equals(alhq2.a, b) ? -1 : Long.compare(alhq2.d, alhq.d);
            }
        });
        acoj acoj = new acoj(njp, null, i);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(acoj);
        arrayList2.addAll(arrayList);
        this.n.a(arrayList2);
        this.a.a();
    }

    public final void a() {
        if (this.d) {
            this.f.a();
            this.e.f.t.a();
            this.e.f.m.d = a.MARKER_DRAWING_PRIORITY;
            this.e.a.m();
            if (this.m == null) {
                this.m = AnimationUtils.loadAnimation(this.a.getContext(), R.anim.slide_down);
                this.m.setAnimationListener(new 5());
            }
            this.a.clearAnimation();
            this.a.startAnimation(this.m);
            this.d = false;
        }
    }

    public final void a(View view) {
        this.o = new abur(view, (int) R.id.map_group, (int) R.id.map_group);
    }

    public final void a(njp njp, List<String> list) {
        if (!this.d) {
            if (this.b == null) {
                acoi acoi = new acoi(this.e.f(), this.h, this.i);
                final View a = this.o.a();
                this.b = a;
                this.a = (MapCardsRecyclerView) a.findViewById(R.id.map_group_list);
                Context context = a.getContext();
                MapCardsRecyclerView mapCardsRecyclerView = this.a;
                mapCardsRecyclerView.getClass();
                this.i.j.a(acoi.a.f().f(new -$$Lambda$acol$U4zm3anxsd52O4DbvN5MOxlJF_s(this, new -$$Lambda$wvFOHhX1mjI2UCXRNcdzNQKuQx4(mapCardsRecyclerView))));
                this.n = acoi;
                this.a.setAdapter(acoi);
                this.a.setLayoutManager(new LinearLayoutManager(context));
                this.a.setClipToPadding(false);
                OverScrollerSpringBehavior.a(a, (int) R.id.map_group_top_spring).a = new b() {
                    public final void a(float f) {
                        acol.this.a.setTranslationY(f);
                    }

                    public final void a(float f, boolean z) {
                        int dimensionPixelSize = a.getContext().getResources().getDimensionPixelSize(R.dimen.map_carousel_card_height);
                        if (z || f <= ((float) dimensionPixelSize) * 0.3f) {
                            acol.this.a.animate().translationY(MapboxConstants.MINIMUM_ZOOM).setDuration(200).start();
                        } else {
                            acol.this.a();
                        }
                    }
                };
                OverScrollerSpringBehavior.a(a, (int) R.id.map_group_bottom_spring).a = new 2();
            }
            this.e.f.t.a(new HashSet(list));
            this.e.a.m();
            this.b.setVisibility(0);
            a(njp, new ArrayList(list), null);
            if (this.c == null) {
                this.c = AnimationUtils.loadAnimation(this.a.getContext(), R.anim.slide_up);
                this.c.setAnimationListener(new 3());
            }
            this.a.clearAnimation();
            this.a.postDelayed(new 4(), 1000);
            this.d = true;
        }
    }

    public final boolean b() {
        return this.d;
    }
}
