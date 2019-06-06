package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.snapchat.android.R;

/* renamed from: tmp */
public final class tmp {
    final String a = "PermissionsPresenter";
    public ajej b;
    public View c;
    public final Context d;
    final ajwy<zgb> e;
    private final ajxe f = ajxh.a(new a(this.k));
    private View g;
    private View h;
    private View i;
    private final ajxe j;
    private final ajwy<ifs> k;

    /* renamed from: tmp$a */
    static final class a extends akcq implements akbk<ifs> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ifs) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: tmp$c */
    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ tmp a;

        c(tmp tmp) {
            this.a = tmp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.e.get();
            return zgb.a(wnr.d.callsite(this.a.a));
        }
    }

    /* renamed from: tmp$d */
    static final class d implements OnClickListener {
        private /* synthetic */ tmp a;

        d(tmp tmp) {
            this.a = tmp;
        }

        public final void onClick(View view) {
            tmp tmp = this.a;
            Context context = tmp.d;
            if (context != null) {
                Activity activity = (Activity) context;
                tmp.b.dispose();
                Object a = tmp.a().b(activity, ifu.MAIN_APP_START).b((ajdw) tmp.b().f()).a((ajdw) tmp.b().l()).p(new b(tmp)).a(igu.b(), igu.a(tmp.a));
                akcr.a(a, "permissionHelper\n       …rrorLoggingConsumer(TAG))");
                tmp.b = a;
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: tmp$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ tmp a;

        b(tmp tmp) {
            this.a = tmp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ifx ifx = (ifx) obj;
            akcr.b(ifx, "requestPermissionsResult");
            if (ifx.a(ifu.MAIN_APP_START)) {
                if (ifx.b()) {
                    this.a.c();
                    if (ifx.c() && !this.a.a().e()) {
                        ifs a = this.a.a();
                        Context context = this.a.d;
                        if (context != null) {
                            a.a((Activity) context, ifu.MAIN_APP_AFTER_CRITICAL_PERMISSIONS_GRANTED);
                        } else {
                            throw new ajxt("null cannot be cast to non-null type android.app.Activity");
                        }
                    }
                } else if (ifx.d()) {
                    this.a.a().r();
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tmp.class), "permissionHelper", "getPermissionHelper()Lcom/snap/framework/permission/PermissionHelper;"), new akdc(akde.a(tmp.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public tmp(Context context, ajwy<ifs> ajwy, ajwy<zgb> ajwy2) {
        akcr.b(context, "context");
        akcr.b(ajwy, "permissionHelperProvider");
        akcr.b(ajwy2, "schedulersProvider");
        this.d = context;
        this.k = ajwy;
        this.e = ajwy2;
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        this.b = obj;
        this.j = ajxh.a(new c(this));
    }

    public final ifs a() {
        return (ifs) this.f.b();
    }

    public final void a(View view) {
        this.c = view;
        if (view == null) {
            view = null;
            this.g = null;
            this.h = null;
        } else {
            view.setOnClickListener(new d(this));
            this.g = view.findViewById(R.id.camera_and_storage_permission_text);
            this.h = view.findViewById(R.id.camera_permission_text);
            view = view.findViewById(R.id.storage_permission_text);
        }
        this.i = view;
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.j.b();
    }

    public final void c() {
        View view = this.c;
        if (view != null) {
            if (view == null) {
                akcr.a();
            }
            view.setVisibility(8);
            view = this.c;
            if (view == null) {
                akcr.a();
            }
            if (view.getParent() != null) {
                view = this.c;
                if (view == null) {
                    akcr.a();
                }
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.c);
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            a(null);
        }
    }

    public final void d() {
        if (!(this.h == null || this.i == null || this.g == null)) {
            int i = 1;
            int d = a().d() ^ 1;
            int j = a().j() ^ 1;
            View view;
            if (((j == 0 ? 1 : 0) & d) != 0) {
                view = this.h;
                if (view == null) {
                    akcr.a();
                }
                view.setVisibility(0);
                view = this.i;
                if (view == null) {
                    akcr.a();
                }
                view.setVisibility(8);
                view = this.g;
                if (view == null) {
                    akcr.a();
                }
                view.setVisibility(8);
                return;
            }
            if (d != 0) {
                i = 0;
            }
            if ((i & j) != 0) {
                view = this.h;
                if (view == null) {
                    akcr.a();
                }
                view.setVisibility(8);
                view = this.i;
                if (view == null) {
                    akcr.a();
                }
                view.setVisibility(0);
                view = this.g;
                if (view == null) {
                    akcr.a();
                }
                view.setVisibility(8);
                return;
            }
            view = this.h;
            if (view == null) {
                akcr.a();
            }
            view.setVisibility(8);
            view = this.i;
            if (view == null) {
                akcr.a();
            }
            view.setVisibility(8);
            view = this.g;
            if (view == null) {
                akcr.a();
            }
            view.setVisibility(0);
        }
    }
}
