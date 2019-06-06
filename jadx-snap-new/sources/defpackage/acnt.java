package defpackage;

import android.support.v4.view.ViewPager.e;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.snapchat.android.R;
import com.snapchat.map.feature.carousel.MapCarouselView;
import com.snapchat.map.util.OverScrollerSpringBehavior;
import com.snapchat.map.util.OverScrollerSpringBehavior.b;
import java.util.HashMap;
import java.util.List;

/* renamed from: acnt */
public final class acnt {
    public final HashMap<String, acov> a = new HashMap();
    final acom b;
    final aclg c;
    final aclw d;
    final niw e;
    final acqq f;
    public MapCarouselView g;
    public acnu h;
    public acnr i;
    List<acow> j;
    int k;
    int l;
    long m;
    long n;
    public boolean o;
    Animation p;
    boolean q = true;
    private final acpv r;
    private final acnk s;
    private Animation t;
    private abur<View> u;
    private final e v = new 5();

    /* renamed from: acnt$3 */
    class 3 implements AnimationListener {
        3() {
        }

        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
            acnt acnt = acnt.this;
            acnt.o = false;
            acnt.a(0);
        }
    }

    /* renamed from: acnt$5 */
    class 5 implements e {
        5() {
        }

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                acnt acnt = acnt.this;
                acnt.l = acnt.g.h();
                return;
            }
            if (i == 2) {
                if (acnt.this.g.h() - acnt.this.l > 0) {
                    acnt.this.d.a(zyr.SWIPE_LEFT);
                }
                if (acnt.this.g.h() - acnt.this.l < 0) {
                    acnt.this.d.a(zyr.SWIPE_RIGHT);
                }
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            acnt acnt = acnt.this;
            acnt.l = i;
            acvm d = acnt.f.b.h.d();
            if (acnt.this.i.a.isEmpty()) {
                acnt.this.e();
            } else if (acnt.this.g.getVisibility() == 0 || d != null) {
                acow a = acnt.this.i.a(acnt.this.h.c(i));
                if (a != null) {
                    if (a.a().isEmpty()) {
                        acnt.this.e();
                        return;
                    }
                    String str = !TextUtils.isEmpty(a.c) ? a.c : ((acov) a.b.get(0)).a;
                    acnt.this.f.a(str, aarb.CAROUSEL);
                    acnt.this.c.f.w.a.a(acqk.a);
                    if (!TextUtils.equals(str, acnt.this.e.b())) {
                        acnt.this.c.h.a(false);
                    }
                }
                acnt.this.g.b(false);
            }
        }
    }

    public acnt(acom acom, aclg aclg, niw niw, aclw aclw, acpv acpv, ajdp<Boolean> ajdp, zfw zfw, ajei ajei, acqq acqq, acnk acnk) {
        this.b = acom;
        this.c = aclg;
        this.d = aclw;
        this.e = niw;
        this.r = acpv;
        this.s = acnk;
        ajei.a(ajdp.a((ajdw) zfw.l()).f(new -$$Lambda$acnt$NaqdjMMjimVscneF36apGYHk47s(this)));
        this.f = acqq;
    }

    public final void a() {
        acnq acnq = new acnq(this.c.f(), this.r, this.s);
        this.s.j.a(this.s.l.f((ajfb) new -$$Lambda$acnt$u4k3bl2yO56X2bhAaxDv9Hajzfs(this)));
        this.h = new acnu(acnq);
        this.i = new acnr(this.h);
        this.h.a = new acns(this.i);
        final View a = this.u.a();
        final MapCarouselView mapCarouselView = (MapCarouselView) a.findViewById(R.id.map_carousel);
        this.g = mapCarouselView;
        OverScrollerSpringBehavior.a(a, (int) R.id.map_carousel_top_spring).a = new b() {
            private final float a = a.getContext().getResources().getDimension(R.dimen.map_carousel_card_height);

            public final void a(float f) {
                mapCarouselView.setTranslationY(f);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:? A:{SYNTHETIC, RETURN} */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
            public final void a(float r3, boolean r4) {
                /*
                r2 = this;
                r0 = r1;
                r0 = r0.e();
                r0 = (defpackage.acnz) r0;
                r1 = 1;
                if (r4 != 0) goto L_0x0038;
            L_0x000b:
                if (r0 == 0) goto L_0x0038;
            L_0x000d:
                r4 = r0.c;
                r4 = r4.a();
                if (r4 == 0) goto L_0x0038;
            L_0x0015:
                r4 = r4.size();
                if (r4 <= r1) goto L_0x001e;
            L_0x001b:
                r4 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
                goto L_0x0020;
            L_0x001e:
                r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            L_0x0020:
                r0 = r2.a;
                r4 = r4 * r0;
                r0 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
                r4 = r4 * r0;
                r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
                if (r3 <= 0) goto L_0x0038;
            L_0x002b:
                r3 = defpackage.acnt.this;
                r3 = r3.f;
                r3.e();
                r3 = defpackage.acnt.this;
                r3.g();
                goto L_0x0039;
            L_0x0038:
                r1 = 0;
            L_0x0039:
                if (r1 != 0) goto L_0x0040;
            L_0x003b:
                r3 = r1;
                r3.f();
            L_0x0040:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acnt$1.a(float, boolean):void");
            }
        };
        OverScrollerSpringBehavior.a(a, (int) R.id.map_carousel_bottom_spring).a = new b() {
            public final void a(float f) {
                mapCarouselView.setTranslationY(-f);
            }

            public final void a(float f, boolean z) {
                mapCarouselView.f();
            }
        };
        mapCarouselView.a((jz) this.h);
        mapCarouselView.a(this.v);
        this.p = AnimationUtils.loadAnimation(a.getContext(), R.anim.slide_up);
        this.p.setAnimationListener(new 3());
        this.t = AnimationUtils.loadAnimation(a.getContext(), R.anim.slide_down);
        this.t.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                if (acnt.this.o) {
                    acnt.this.a(8);
                    boolean z = true;
                    mapCarouselView.b(true);
                    mapCarouselView.setTranslationY(1.0f);
                    acnt acnt = acnt.this;
                    if (acnt.g != null) {
                        if (acnt.j == null || acnt.m <= acnt.n) {
                            z = false;
                        }
                        if (!z) {
                            acnt.f();
                        } else if (acnt.j != null) {
                            acnt.a(acnt.j, acnt.k);
                        }
                    }
                }
                acnt.this.o = false;
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                acnt.this.b.b();
                acnt.this.o = true;
            }
        });
        List list = this.j;
        if (list != null) {
            a(list, this.k);
        }
    }

    public final void a(int i) {
        MapCarouselView mapCarouselView = this.g;
        if (mapCarouselView != null) {
            mapCarouselView.setVisibility(i);
            this.b.a();
        }
    }

    public final void a(View view) {
        this.u = new abur(view, (int) R.id.map_carousel_root, (int) R.id.map_carousel_root);
    }

    public final void a(String str, acov acov) {
        this.a.put(str, acov);
    }

    public final void a(List<acow> list, int i) {
        MapCarouselView mapCarouselView = this.g;
        if (mapCarouselView == null) {
            this.j = list;
            this.k = i;
        } else if (mapCarouselView.getVisibility() == 0 && (this.o || i == -1 || list.isEmpty())) {
            this.j = list;
            this.k = i;
            this.m = System.currentTimeMillis();
            if (i == -1) {
                this.f.d();
                g();
            }
        } else {
            this.n = System.currentTimeMillis();
            if (this.n > this.m) {
                f();
            }
            int a = this.h.a();
            int size = list.size();
            boolean a2 = acnu.a(a);
            boolean a3 = acnu.a(size);
            this.i.a(list, this.g.h(), i);
            this.h.notifyDataSetChanged();
            for (int i2 = 0; i2 < this.g.getChildCount(); i2++) {
                acnz acnz = (acnz) this.g.getChildAt(i2);
                acow a4 = this.i.a(this.h.c(((Integer) acnz.getTag(R.id.position_id)).intValue()));
                if (a4 != null) {
                    acnz.a(a4);
                }
            }
            if (a2 != a3) {
                mapCarouselView = this.g;
                a3 = true;
                if (size > 1) {
                    a3 = false;
                }
                mapCarouselView.a(a3);
                this.g.a(i, false);
            }
        }
    }

    public final boolean b() {
        MapCarouselView mapCarouselView = this.g;
        return (mapCarouselView == null || mapCarouselView.getVisibility() == 8) ? false : true;
    }

    public final boolean c() {
        return this.o;
    }

    public final void d() {
        a(8);
    }

    public final void e() {
        if (!(this.g == null || this.o || !b())) {
            this.t.reset();
            this.g.clearAnimation();
            this.g.startAnimation(this.t);
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        if (this.j != null) {
            this.j = null;
            this.m = 0;
            this.k = 0;
        }
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        if (this.g != null) {
            for (acow a : this.i.a) {
                a.a(null);
            }
            e();
        }
    }

    public final MapCarouselView h() {
        return this.g;
    }
}
