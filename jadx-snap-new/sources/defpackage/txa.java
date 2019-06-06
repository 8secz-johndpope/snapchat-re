package defpackage;

import android.app.Activity;
import android.widget.Toast;
import com.brightcove.player.event.Event;
import com.snapchat.android.R;
import java.util.concurrent.Callable;

/* renamed from: txa */
public final class txa implements tpw {
    final ajei a = new ajei();
    zfw b;
    final Activity c;
    final ajdv<ajxw> d;
    private final String e = "PreviewMediaPersistenceActivator";
    private final zgb f;
    private final toc g;
    private final twz h;

    /* renamed from: txa$b */
    static final class b extends akcq implements akbl<Throwable, ajxw> {
        b(txa txa) {
            super(1, txa);
        }

        public final String getName() {
            return "onPersistError";
        }

        public final akej getOwner() {
            return akde.a(txa.class);
        }

        public final String getSignature() {
            return "onPersistError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            txa txa = (txa) this.receiver;
            ajei ajei = txa.a;
            ajcx b = ajcx.b((Callable) new a(txa));
            zfw zfw = txa.b;
            if (zfw == null) {
                akcr.a("schedulers");
            }
            ajei.a(b.b((ajdw) zfw.l()).e());
            return ajxw.a;
        }
    }

    /* renamed from: txa$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ txa a;

        a(txa txa) {
            this.a = txa;
        }

        public final /* synthetic */ Object call() {
            Toast.makeText(this.a.c.getBaseContext(), R.string.snap_failed, 1).show();
            this.a.d.a(ajxw.a);
            return ajxw.a;
        }
    }

    public txa(zgb zgb, toc toc, Activity activity, ajdv<ajxw> ajdv, twz twz) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajdv, "exitPreviewRequestObserver");
        akcr.b(twz, "mediaReaderManager");
        this.f = zgb;
        this.g = toc;
        this.c = activity;
        this.d = ajdv;
        this.h = twz;
    }

    public final String a() {
        return this.e;
    }

    public final ajej start() {
        this.b = zgb.a(this.g.callsite("PreviewMediaPersistenceActivator"));
        twz twz = this.h;
        akbl bVar = new b(this);
        akcr.b(bVar, "errorHandler");
        twz.a = bVar;
        igk.a(twz, this.a);
        return this.a;
    }
}
