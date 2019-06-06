package defpackage;

import android.app.Activity;
import android.content.Context;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.FeedMemberModel;
import com.snap.preview.api.PreviewFragment;
import com.snap.preview.app.bindings.PreviewFragmentImpl;
import defpackage.tqx.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tsm */
public final class tsm implements tph {
    final AtomicReference<PreviewFragment> a = new AtomicReference();
    final ajei b = new ajei();
    final ftl c;
    final ajwy<tpy> d;
    final ilv e;
    final Activity f;
    private final ajxe g;

    /* renamed from: tsm$a */
    static final class a extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        a(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("PreviewPagePreloaderImpl"));
        }
    }

    /* renamed from: tsm$b */
    static final class b implements Runnable {
        final /* synthetic */ tsm a;

        /* renamed from: tsm$b$1 */
        static final class 1<T> implements ajfb<Long> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (this.a.a.a.getAndSet(null) != null) {
                    this.a.a.e.c(ipc.PRELOAD.a("action", FeedMemberModel.REMOVED), 1);
                }
            }
        }

        b(tsm tsm) {
            this.a = tsm;
        }

        public final void run() {
            if (this.a.c.a((fth) tum.PREVIEW_PAGE_PRELOAD) || this.a.c.a((fth) tum.BLACK_SCREEN_ANIMATION)) {
                Object obj = (tpy) this.a.d.get();
                ajej start = obj.start();
                akcr.a((Object) start, "previewToolInflator.start()");
                ajvv.a(start, this.a.b);
                AtomicReference atomicReference = this.a.a;
                PreviewFragmentImpl previewFragmentImpl = new PreviewFragmentImpl();
                akcr.a(obj, "previewToolInflator");
                Activity activity = this.a.f;
                akcr.b(obj, "preloadedPreviewToolInflator");
                akcr.b(activity, Event.ACTIVITY);
                previewFragmentImpl.H.set(obj);
                previewFragmentImpl.a(activity);
                Context baseContext = activity.getBaseContext();
                akcr.a((Object) baseContext, "activity.baseContext");
                previewFragmentImpl.a(baseContext);
                a aVar = previewFragmentImpl.r;
                if (aVar == null) {
                    akcr.a("enterPreviewAnimationComponentBuilder");
                }
                ftl ftl = previewFragmentImpl.D;
                String str = "previewConfigurationProvider";
                if (ftl == null) {
                    akcr.a(str);
                }
                zfw n = previewFragmentImpl.n();
                akcr.b(ftl, str);
                akcr.b(n, "schedulers");
                akcr.a(ftl.b((fth) tum.BLACK_SCREEN_ANIMATION).b((ajdw) n.f()).e((ajfb) new a.a(aVar)), "previewConfigurationProv…                        }");
                atomicReference.set(previewFragmentImpl);
                this.a.e.c(ipc.PRELOAD.a("action", "preloaded"), 1);
                ajej f = ajdp.a(30, TimeUnit.SECONDS, (ajdw) this.a.b().l()).b((ajdw) this.a.b().l()).f((ajfb) new 1(this));
                akcr.a((Object) f, "Observable.timer(30, Tim…                      } }");
                ajvv.a(f, this.a.b);
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tsm.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public tsm(zgb zgb, toc toc, ftl ftl, ajwy<tpy> ajwy, ilv ilv, Activity activity) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(ftl, "configurationProvider");
        akcr.b(ajwy, "previewToolInflatorProvider");
        akcr.b(ilv, "graphene");
        akcr.b(activity, Event.ACTIVITY);
        this.c = ftl;
        this.d = ajwy;
        this.e = ilv;
        this.f = activity;
        this.g = ajxh.a(new a(zgb, toc));
    }

    public final PreviewFragment a() {
        this.b.a();
        PreviewFragment previewFragment = (PreviewFragment) this.a.getAndSet(null);
        if (previewFragment != null) {
            this.e.c(ipc.PRELOAD.a("action", "consumed"), 1);
        }
        return previewFragment;
    }

    /* Access modifiers changed, original: final */
    public final zfw b() {
        return (zfw) this.g.b();
    }

    public final ajej start() {
        if (this.a.get() != null) {
            Object obj = ajfq.INSTANCE;
            akcr.a(obj, "Disposables.disposed()");
            return obj;
        }
        ajej a = b().h().a((Runnable) new b(this));
        akcr.a((Object) a, "schedulers.userInteracti…siteDisposable)\n        }");
        ajvv.a(a, this.b);
        return this.b;
    }
}
