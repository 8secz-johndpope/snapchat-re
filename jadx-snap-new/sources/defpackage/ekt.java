package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import com.snap.ui.view.TakeSnapButton;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.ekn.b;
import java.util.Set;

/* renamed from: ekt */
public final class ekt implements b {
    private static final int[] d = new int[]{R.id.neon_header_avatar_container, R.id.hova_header_search_icon, R.id.neon_header_title, R.id.neon_add_friend_button_container};
    private static final int[] e = new int[]{R.id.feed_icon_container, R.id.discoverfeed_icon_container, R.id.memories_icon_container, R.id.map_icon_container, R.id.nav_tab_container};
    private final View a;
    private final View b;
    private final View c;
    private final Set<Supplier<View>> f;
    private final Set<Supplier<View>> g;
    private final SparseBooleanArray h = new SparseBooleanArray();
    private final SparseIntArray i = new SparseIntArray();
    private final SparseArray<Float> j = new SparseArray();
    private final SparseArray<Float> k = new SparseArray();
    private View l = null;
    private View m = null;
    private final ViewStub n;
    private final ViewStub o;
    private final TakeSnapButton p;
    private final View q;
    private final int r;
    private final float s;
    private final long t;

    public ekt(ViewFinder viewFinder, Activity activity) {
        this.b = viewFinder.findViewById(R.id.feed_icon_container);
        this.c = viewFinder.findViewById(R.id.discoverfeed_icon_container);
        this.a = viewFinder.findViewById(R.id.memories_icon_container);
        this.n = (ViewStub) viewFinder.findViewById(R.id.camera_left_back_button_stub);
        this.o = (ViewStub) viewFinder.findViewById(R.id.camera_dismiss_button_stub);
        this.p = (TakeSnapButton) Preconditions.checkNotNull(viewFinder.findViewById(R.id.camera_capture_button));
        this.q = (View) Preconditions.checkNotNull(viewFinder.findViewById(R.id.camera_flip_button));
        this.r = ((MarginLayoutParams) this.p.getLayoutParams()).bottomMargin;
        this.s = activity.getResources().getDimension(R.dimen.camera_fade_out_animation_translation_y);
        this.t = (long) activity.getResources().getInteger(R.integer.camera_fade_out_animation_duration);
        this.g = ekt.a(viewFinder, e);
        this.f = ekt.a(viewFinder, d);
    }

    private static Set<Supplier<View>> a(ViewFinder viewFinder, int... iArr) {
        Builder builder = ImmutableSet.builder();
        for (int -__lambda_ekt_oy5ubbrd4kxz9uizzclpkzdbgk8 : iArr) {
            builder.add(Suppliers.memoize(new -$$Lambda$ekt$OY5uBBRd4KXZ9UIZzClpkZDbgK8(viewFinder, -__lambda_ekt_oy5ubbrd4kxz9uizzclpkzdbgk8)));
        }
        return builder.build();
    }

    private static /* synthetic */ Rect b(View view, Object obj) {
        akcr.b(view, "receiver$0");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public final void a() {
        UnmodifiableIterator it = Sets.union(this.g, this.f).iterator();
        while (it.hasNext()) {
            View view = (View) ((Supplier) it.next()).get();
            if (view != null) {
                Float f = (Float) this.j.get(view.getId());
                if (f != null) {
                    zil.a(view, this.i.get(view.getId()), f.floatValue(), ((Float) this.k.get(view.getId())).floatValue());
                    view.setClickable(this.h.get(view.getId()));
                }
            }
        }
    }

    public final void b() {
        UnmodifiableIterator it = Sets.union(this.g, this.f).iterator();
        while (it.hasNext()) {
            View view = (View) ((Supplier) it.next()).get();
            if (view != null) {
                this.i.put(view.getId(), view.getVisibility());
                this.j.put(view.getId(), Float.valueOf(view.getAlpha()));
                this.k.put(view.getId(), Float.valueOf(view.getTranslationY()));
                this.h.put(view.getId(), view.isClickable());
                view.setClickable(false);
                zil.a(view, Ints.contains(d, view.getId()) ? -this.s : this.s, this.t);
            }
        }
    }

    public final void c() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.p.getLayoutParams();
        marginLayoutParams.bottomMargin = this.r;
        this.p.setLayoutParams(marginLayoutParams);
    }

    public final void d() {
        this.p.setVisibility(4);
    }

    public final void e() {
        this.p.setVisibility(0);
    }

    public final void f() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.p.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) this.p.getTranslatedBottomMargin();
        this.p.setLayoutParams(marginLayoutParams);
    }

    public final void g() {
        View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void h() {
        View view = this.a;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public final void i() {
        ViewStub viewStub = this.n;
        if (viewStub == null || viewStub.getParent() == null) {
            View view = this.l;
            if (view != null) {
                view.setVisibility(0);
            }
            return;
        }
        this.l = this.n.inflate();
    }

    public final void j() {
        View view = this.l;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public final void k() {
        ViewStub viewStub = this.o;
        if (viewStub == null || viewStub.getParent() == null) {
            View view = this.m;
            if (view != null) {
                view.setVisibility(0);
            }
            return;
        }
        this.m = this.o.inflate();
    }

    public final void l() {
        View view = this.m;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public final ajdp<Object> m() {
        View view = this.l;
        return view != null ? cfl.c(view) : ajvo.a(ajot.a);
    }

    public final ajdp<Object> n() {
        View view = this.m;
        return view != null ? cfl.c(view) : ajvo.a(ajot.a);
    }

    public final ajdp<dps> o() {
        TakeSnapButton takeSnapButton = this.p;
        ajdt p = cfl.d(takeSnapButton).p(new -$$Lambda$ekt$g1HW5AfUVRZW9hNPLmN0w2b9-hQ(takeSnapButton)).p(-$$Lambda$ekt$VK1R_rEwo3xpw22lMR5kt1NSZpQ.INSTANCE);
        View view = this.q;
        return ajdp.b(p, cfl.d(view).p(new -$$Lambda$ekt$uxGHwhEIwmzdANrg_2o6HJQR1bw(view)).p(-$$Lambda$ekt$9E0IjnIyYi1GFWYSKeubHi57j9I.INSTANCE));
    }
}
