package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import defpackage.acob.c;
import defpackage.acob.d;
import defpackage.acog.a;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: acof */
public final class acof extends ViewHolder implements acoe {
    final TextView a;
    final niw b;
    final Resources c;
    final acoh d;
    final acnj e;
    final a f = new a(this);
    long g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final View k;
    private final View l;
    private final View m;
    private final acqo n;
    private final acon o;
    private final nct p;
    private final acpv q;
    private final boolean r;
    private final View s;
    private final View t;
    private final ajei u;
    private final zfw v;
    private final acoa w;
    private final acob x;
    private final acqt y;

    /* renamed from: acof$3 */
    class 3 implements OnClickListener {
        3() {
        }

        public final void onClick(View view) {
            if (TextUtils.isEmpty(acof.this.b.c())) {
                acof.this.e.a(aaua.MAP);
            } else {
                acof.this.e.b(aaua.MAP);
            }
        }
    }

    /* renamed from: acof$a */
    static class a {
        final WeakReference<acof> a;

        public a(acof acof) {
            this.a = new WeakReference(acof);
        }
    }

    /* renamed from: acof$1 */
    class 1 implements ajfb<Boolean> {
        1() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            a aVar = acof.this.f;
            boolean booleanValue = bool.booleanValue();
            acof acof = (acof) aVar.a.get();
            if (acof != null) {
                if (booleanValue) {
                    Drawable drawable = acof.c.getDrawable(R.drawable.map_chat_group_icon);
                    int dimensionPixelSize = acof.c.getDimensionPixelSize(R.dimen.carousel_unread_chat_indicator);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    acof.a.setCompoundDrawables(drawable, null, null, null);
                    acof.a.setCompoundDrawablePadding(abtp.b(3.0f, acof.itemView.getContext()));
                    return;
                }
                acof.a.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    public acof(View view, acpv acpv, acnk acnk, boolean z) {
        super(view);
        this.q = acpv;
        this.r = z;
        this.b = acnk.c;
        this.p = acnk.a;
        this.h = view.findViewById(R.id.avatar_container);
        this.i = (TextView) view.findViewById(R.id.user_fullname);
        this.j = (TextView) view.findViewById(R.id.user_status_text);
        this.a = (TextView) view.findViewById(R.id.user_subtext);
        this.k = view.findViewById(R.id.user_name_container);
        this.l = view.findViewById(R.id.carousel_end_button_container);
        this.m = view.findViewById(R.id.create_bitmoji);
        this.w = new acoa();
        this.x = new acob(view, acnk.l);
        acob acob = this.x;
        acoa acoa = this.w;
        zfw zfw = acnk.i;
        ajei ajei = acnk.j;
        ncn ncn = (ncn) acnk.k.get();
        akcr.b(acoa, "viewModel");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(ncn, "nycSharingManager");
        Object j = acoa.a.j(ajfu.a);
        akcr.a(j, "mode.distinctUntilChanged()");
        ajej f = j.u(new c(acob, ncn, zfw)).a((ajdw) zfw.l()).f((ajfb) new acod(new d(acob)));
        akcr.a((Object) f, "viewModel.observeOnBound… .subscribe(::showOrHide)");
        ajvv.a(f, ajei);
        this.s = view.findViewById(R.id.create_group_button);
        this.t = view.findViewById(R.id.chat_button);
        this.c = this.itemView.getResources();
        this.n = acnk.d;
        this.o = acnk.e.a();
        this.d = acnk.b;
        this.e = acnk.g;
        this.u = acnk.j;
        this.v = acnk.i;
        this.y = acnk.m;
    }

    private OnLongClickListener a(final String str, final String str2, final acnj acnj) {
        return TextUtils.equals(this.b.b(), str2) ? null : new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                acnj.a(str, str2);
                return true;
            }
        };
    }

    private void a(String str) {
        this.a.setText(str);
    }

    private void a(njv njv, alhq alhq) {
        this.u.a(this.d.a(njv.b()).a((ajdw) this.v.l()).e(new 1()));
        if (alhq != null) {
            String a = this.n.a(alhq.d);
            float f = alhq.k;
            if (f > 100.0f) {
                Resources resources = this.c;
                r7 = new Object[2];
                r7[0] = resources.getString(R.string.seen_last_at_caps, new Object[]{a.toLowerCase(Locale.getDefault())});
                r7[1] = adbj.a(this.c, f);
                a = resources.getString(R.string.nyc_time_with_accuracy, r7);
            } else {
                a = this.c.getString(R.string.seen_last_at_caps, new Object[]{a.toLowerCase(Locale.getDefault())});
            }
            a(a);
            if (njv.c() != null) {
                acqs a2 = this.y.a(njv.c(), this.b.b(), alhq);
                MarginLayoutParams marginLayoutParams;
                if (a2 == null || TextUtils.isEmpty(a2.a)) {
                    this.j.setVisibility(8);
                    this.j.setText("");
                    marginLayoutParams = (MarginLayoutParams) this.k.getLayoutParams();
                    marginLayoutParams.bottomMargin = 0;
                    this.k.setLayoutParams(marginLayoutParams);
                } else {
                    this.j.setVisibility(0);
                    this.j.setText(this.c.getString(R.string.status_quotes, new Object[]{a2.a}));
                    marginLayoutParams = (MarginLayoutParams) this.k.getLayoutParams();
                    marginLayoutParams.bottomMargin = this.c.getDimensionPixelOffset(R.dimen.default_gap_half);
                    this.k.setLayoutParams(marginLayoutParams);
                    return;
                }
            }
            return;
        }
        a(this.c.getString(R.string.nyc_carousel_tap_to_chat));
    }

    public final void a(ajwo<Optional<? extends acop>> ajwo) {
        this.x.a((ajwo) ajwo);
    }

    public final void a(final nkh nkh, alhq alhq, final a aVar) {
        boolean equals = TextUtils.equals(this.b.b(), nkh.c());
        Object obj = 1;
        Object obj2 = (equals && TextUtils.isEmpty(this.b.c())) ? 1 : null;
        if (equals) {
            nkh.b(this.b.c());
            nkh.c(this.b.d());
        }
        this.i.setText(equals ? this.c.getString(R.string.me) : nkb.a(nkh));
        if (equals && obj2 == null) {
            TextView textView = this.i;
            textView.setCompoundDrawablePadding((int) abtp.a(2.0f, textView.getContext()));
            textView = this.i;
            textView.setCompoundDrawablesWithIntrinsicBounds(null, null, textView.getResources().getDrawable(R.drawable.user_card_settings_gear), null);
        } else {
            this.i.setCompoundDrawables(null, null, null, null);
        }
        OnLongClickListener a = a(nkh.b(), nkh.c(), this.e);
        2 2 = new OnClickListener() {
            public final void onClick(View view) {
                long currentTimeMillis = System.currentTimeMillis();
                if (acof.this.g == 0 || currentTimeMillis - acof.this.g > 500) {
                    acof acof = acof.this;
                    acof.g = currentTimeMillis;
                    if (TextUtils.equals(acof.b.b(), nkh.c())) {
                        acof.this.e.a();
                        return;
                    }
                    acof.this.d.a(nkh.b(), aVar);
                }
            }
        };
        if (equals) {
            this.a.setCompoundDrawables(null, null, null, null);
            if (obj2 == null) {
                Location a2 = this.p.a();
                if (a2 != null) {
                    float accuracy = a2.getAccuracy();
                    if (accuracy > 100.0f) {
                        a(adbj.a(this.c, accuracy));
                        this.itemView.setOnClickListener(2);
                    }
                }
                obj = null;
                this.itemView.setOnClickListener(2);
            } else {
                this.itemView.setOnClickListener(null);
                obj = null;
            }
            if (obj == null) {
                a(this.c.getString(obj2 != null ? R.string.nyc_carousel_tap_for_bitmoji : R.string.nyc_carousel_tap_for_settings));
            }
        } else {
            a(nkh, alhq);
        }
        this.k.setOnClickListener(2);
        this.k.setOnLongClickListener(a);
        this.h.setOnLongClickListener(a);
        if (obj2 == null) {
            this.o.a(this.h, (njv) nkh);
        }
        this.l.setVisibility(obj2 != null ? 0 : 8);
        this.m.setVisibility(obj2 != null ? 0 : 8);
        this.s.setVisibility(obj2 != null ? 0 : 8);
        this.h.setVisibility(obj2 != null ? 8 : 0);
        if (obj2 != null) {
            3 3 = new 3();
            this.itemView.setOnClickListener(3);
            this.k.setOnClickListener(3);
            this.l.setOnClickListener(3);
            this.m.setOnClickListener(3);
        }
        if (obj2 != null || equals) {
            this.t.setVisibility(8);
            this.t.setOnClickListener(null);
        } else {
            this.l.setVisibility(0);
            this.t.setVisibility(0);
            this.t.setOnClickListener(2);
        }
        this.w.a(equals, this.r, nkh, this.q);
    }
}
