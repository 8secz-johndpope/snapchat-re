package defpackage;

import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.snap.core.db.record.UnlockablesModel;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;

/* renamed from: acob */
public final class acob {
    static final int g = Color.parseColor("#0EADFF");
    ajwo<Optional<? extends acop>> a;
    final View b;
    final View c;
    final ImageView d;
    final SnapFontTextView e;
    final ajwo<acop> f;

    /* renamed from: acob$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acob$e */
    static final class e implements OnClickListener {
        private /* synthetic */ acob a;
        private /* synthetic */ acop b;

        e(acob acob, acop acop) {
            this.a = acob;
            this.b = acop;
        }

        public final void onClick(View view) {
            this.a.f.a(this.b);
        }
    }

    /* renamed from: acob$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ acob a;
        private /* synthetic */ acnv b;

        b(acob acob, acnv acnv) {
            this.a = acob;
            this.b = acnv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isSharingLocation");
            if (bool.booleanValue()) {
                obj = ajdp.b(acob.a(this.b));
                str = "Observable.just(exploreMode(data))";
            } else {
                obj = ajdp.b(Optional.of(new acoq(this.b.c)));
                str = "Observable.just(Optional…rAddFriend(data.friend)))";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: acob$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ acob a;
        private /* synthetic */ ncn b;
        private /* synthetic */ zfw c;

        c(acob acob, ncn ncn, zfw zfw) {
            this.a = acob;
            this.b = ncn;
            this.c = zfw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            acnv acnv = (acnv) obj;
            akcr.b(acnv, UnlockablesModel.DATA);
            if (acnv.c.n()) {
                acob acob = this.a;
                ncn ncn = this.b;
                zfw zfw = this.c;
                if (acnv.a || !acnv.b) {
                    return acoc.a;
                }
                String c = acnv.c.c();
                if (c != null) {
                    obj = ncn.a((ajdw) zfw.b(), c).k((ajfc) new b(acob, acnv));
                    str = "nycSharingManager.isShar…      }\n                }";
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            obj = ajdp.b(acob.a(acnv));
            str = "Observable.just(exploreMode(data))";
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: acob$d */
    static final class d extends akcq implements akbl<Optional<? extends acop>, ajxw> {
        d(acob acob) {
            super(1, acob);
        }

        public final String getName() {
            return "showOrHide";
        }

        public final akej getOwner() {
            return akde.a(acob.class);
        }

        public final String getSignature() {
            return "showOrHide(Lcom/google/common/base/Optional;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Optional) obj;
            akcr.b(obj, "p1");
            acob acob = (acob) this.receiver;
            if (obj.isPresent()) {
                acob.c.setVisibility(0);
                acob.b.setVisibility(0);
                acop acop = (acop) obj.get();
                if (acop instanceof acor) {
                    if (((acor) acop).b) {
                        acob.d.setColorFilter(-16777216);
                        acob.e.setTextColor(-16777216);
                        acob.e.setTypeface(null, 0);
                    } else {
                        acob.d.setColorFilter(acob.g);
                        acob.e.setTextColor(acob.g);
                        acob.e.setTypeface(null, 1);
                    }
                    acob.d.setVisibility(0);
                    acob.d.setImageDrawable(acob.d.getContext().getDrawable(R.drawable.explore_compass));
                    acob.e.setText(R.string.explore_update);
                }
                if (acop instanceof acoq) {
                    acoq acoq = (acoq) acop;
                    acob.d.setColorFilter(acob.g);
                    acob.e.setTextColor(acob.g);
                    acob.e.setTypeface(null, 1);
                    acob.d.setVisibility(0);
                    acob.d.setImageDrawable(acob.d.getContext().getDrawable(R.drawable.share_location_pin));
                    acob.e.setText(acob.e.getResources().getString(R.string.share_location_best_friend_text, new Object[]{nkb.b(acoq.a)}));
                }
                acob.b.setOnClickListener(new e(acob, acop));
            } else {
                acob.b.setVisibility(8);
                acob.c.setVisibility(8);
            }
            ajwo ajwo = acob.a;
            if (ajwo != null) {
                ajwo.a(obj);
            }
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public acob(View view, ajwo<acop> ajwo) {
        akcr.b(view, "view");
        akcr.b(ajwo, "onClickBehaviorSubject");
        this.f = ajwo;
        Object findViewById = view.findViewById(R.id.second_row);
        akcr.a(findViewById, "view.findViewById(R.id.second_row)");
        this.b = findViewById;
        findViewById = view.findViewById(R.id.merge_separator);
        akcr.a(findViewById, "view.findViewById(R.id.merge_separator)");
        this.c = findViewById;
        findViewById = view.findViewById(R.id.second_row_icon);
        akcr.a(findViewById, "view.findViewById(R.id.second_row_icon)");
        this.d = (ImageView) findViewById;
        Object findViewById2 = view.findViewById(R.id.second_row_text);
        akcr.a(findViewById2, "view.findViewById(R.id.second_row_text)");
        this.e = (SnapFontTextView) findViewById2;
    }

    public final void a(ajwo<Optional<? extends acop>> ajwo) {
        akcr.b(ajwo, "objectPublishSubject");
        this.a = ajwo;
    }
}
