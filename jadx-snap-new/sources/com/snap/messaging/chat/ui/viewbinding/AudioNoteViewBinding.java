package com.snap.messaging.chat.ui.viewbinding;

import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.ui.messaging.chatitem.AudioNoteView;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.ajvv;
import defpackage.ajwa;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.gdy;
import defpackage.gfu;
import defpackage.gqr;
import defpackage.k;
import defpackage.kpc;
import defpackage.pql;
import defpackage.pyl;
import defpackage.pyl.e;
import defpackage.pyl.i;
import defpackage.pyl.j;
import defpackage.pyl.l;
import defpackage.pyl.m;
import defpackage.qfd;
import defpackage.qhs;
import defpackage.qhw;
import defpackage.qiu;
import defpackage.qiv;
import defpackage.qjf;
import defpackage.qks;
import defpackage.qkw;
import defpackage.s;
import defpackage.std;
import defpackage.zfw;
import defpackage.zky;
import defpackage.zla;
import defpackage.zmy;

public final class AudioNoteViewBinding extends qhw<qkw> implements OnLongClickListener, k {
    AudioNoteView a;
    private qiv b;
    private qiu c;
    private final qjf d = new qjf();
    private pyl e;
    private View f;
    private ViewGroup g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c<T> implements ajfb<ajxm<? extends Boolean, ? extends zky>> {
        private /* synthetic */ AudioNoteViewBinding a;

        c(AudioNoteViewBinding audioNoteViewBinding) {
            this.a = audioNoteViewBinding;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            AudioNoteViewBinding audioNoteViewBinding = this.a;
            boolean booleanValue = ((Boolean) ajxm.a).booleanValue();
            zky zky = (zky) ajxm.b;
            akcr.b(zky, "state");
            int i = 2;
            if (booleanValue) {
                i = 1;
            } else {
                akcr.b(zky, "receiver$0");
                int i2 = zla.a[zky.ordinal()];
                if (i2 == 1) {
                    i = 3;
                } else if (i2 == 2) {
                    i = 4;
                }
            }
            AudioNoteView audioNoteView = audioNoteViewBinding.a;
            if (audioNoteView == null) {
                akcr.a("audioNoteView");
            }
            audioNoteView.a(i);
        }
    }

    static final class b extends akcq implements akbl<View, ajxw> {
        b(AudioNoteViewBinding audioNoteViewBinding) {
            super(1, audioNoteViewBinding);
        }

        public final String getName() {
            return "onClick";
        }

        public final akej getOwner() {
            return akde.a(AudioNoteViewBinding.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            akcr.b(view, "p1");
            ((AudioNoteViewBinding) this.receiver).onClick(view);
            return ajxw.a;
        }
    }

    static final class d extends akcq implements akbl<View, Boolean> {
        d(AudioNoteViewBinding audioNoteViewBinding) {
            super(1, audioNoteViewBinding);
        }

        public final String getName() {
            return "onLongClick";
        }

        public final akej getOwner() {
            return akde.a(AudioNoteViewBinding.class);
        }

        public final String getSignature() {
            return "onLongClick(Landroid/view/View;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            akcr.b(view, "p1");
            return Boolean.valueOf(((AudioNoteViewBinding) this.receiver).onLongClick(view));
        }
    }

    static {
        a aVar = new a();
    }

    private void a(qkw qkw, qkw qkw2) {
        akcr.b(qkw, MapboxEvent.KEY_MODEL);
        qks qks = qkw;
        super.onBind(qks, (qks) qkw2);
        ((qfd) e()).m.a(this);
        AudioNoteView audioNoteView = this.a;
        if (audioNoteView == null) {
            akcr.a("audioNoteView");
        }
        pyl pyl = this.e;
        String str = "audioNotePlaySession";
        if (pyl == null) {
            akcr.a(str);
        }
        audioNoteView.a(pyl.h, ContextCompat.getColor(AppContext.get(), R.color.regular_blue));
        pyl pyl2 = this.e;
        if (pyl2 == null) {
            akcr.a(str);
        }
        Uri uri = qkw.i;
        akcr.b(uri, "mediaUri");
        if (pyl2.c.compareAndSet(false, true)) {
            pyl2.e.a(Boolean.TRUE);
            Object a = pyl2.j.a(uri, pql.b, true, new gdy[0]).b((ajdw) pyl2.k.f()).f(defpackage.pyl.b.a).b((ajev) new defpackage.pyl.c(pyl2)).a((ajfb) defpackage.pyl.d.a, (ajfb) new e(pyl2, uri));
            akcr.a(a, "contentResolver.resolve(…e)\n                    })");
            std.a(a, pyl2.a);
        }
        qiv qiv = this.b;
        if (qiv == null) {
            akcr.a("colorViewBindingDelegate");
        }
        qiv.a(qks, getEventDispatcher());
        this.d.a(getEventDispatcher(), qks);
        qiu qiu = this.c;
        if (qiu == null) {
            akcr.a("chatActionMenuHandler");
        }
        qiu.a(qks, getEventDispatcher());
    }

    public final void a(qfd qfd, View view) {
        akcr.b(qfd, "bindingContext");
        akcr.b(view, "itemView");
        super.a(qfd, view);
        Object findViewById = view.findViewById(R.id.audio_note);
        akcr.a(findViewById, "itemView.findViewById(R.id.audio_note)");
        this.a = (AudioNoteView) findViewById;
        findViewById = view.findViewById(R.id.chat_message_content_container);
        akcr.a(findViewById, "itemView.findViewById(R.…essage_content_container)");
        this.f = findViewById;
        findViewById = view.findViewById(R.id.in_screen_message_content);
        akcr.a(findViewById, "itemView.findViewById(R.…n_screen_message_content)");
        this.g = (ViewGroup) findViewById;
        View view2 = this.f;
        String str = "chatMessageContentContainer";
        if (view2 == null) {
            akcr.a(str);
        }
        view2.setOnClickListener(this);
        view2 = this.f;
        if (view2 == null) {
            akcr.a(str);
        }
        view2.setOnLongClickListener(this);
        AudioNoteView audioNoteView = this.a;
        if (audioNoteView == null) {
            akcr.a("audioNoteView");
        }
        AudioNoteViewBinding audioNoteViewBinding = this;
        audioNoteView.setOnClickListener(new qhs(new b(audioNoteViewBinding)));
        gqr gqr = qfd.c;
        gfu gfu = qfd.f;
        zfw zfw = qfd.e;
        Object obj = qfd.A.get();
        akcr.a(obj, "bindingContext.codecLeasingEngine.get()");
        this.e = new pyl(gqr, gfu, zfw, (kpc) obj);
        pyl pyl = this.e;
        str = "audioNotePlaySession";
        if (pyl == null) {
            akcr.a(str);
        }
        ajvv.a((ajej) pyl, qfd.a);
        pyl = this.e;
        if (pyl == null) {
            akcr.a(str);
        }
        findViewById = pyl.e.j(ajfu.a);
        akcr.a(findViewById, "loadingSubject.distinctUntilChanged()");
        pyl pyl2 = this.e;
        if (pyl2 == null) {
            akcr.a(str);
        }
        Object j = pyl2.f.j(ajfu.a);
        akcr.a(j, "playbackStateSubject.distinctUntilChanged()");
        ajej f = ajwa.a(findViewById, j).a((ajdw) qfd.e.l()).f((ajfb) new c(this));
        akcr.a((Object) f, "combineLatest(loadingSou…second)\n                }");
        ajvv.a(f, qfd.a);
        this.b = new qiv(view);
        this.d.a(view, new d(audioNoteViewBinding), qfd);
        this.c = new qiu(qfd);
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        a((qkw) zmy, (qkw) zmy2);
    }

    public final void onClick(View view) {
        akcr.b(view, "view");
        Object obj = this.a;
        if (obj == null) {
            akcr.a("audioNoteView");
        }
        if (akcr.a((Object) view, obj)) {
            pyl pyl = this.e;
            if (pyl == null) {
                akcr.a("audioNotePlaySession");
            }
            zmy model = getModel();
            if (model == null) {
                akcr.a();
            }
            Uri uri = ((qkw) model).i;
            akcr.b(uri, "mediaUri");
            if (pyl.d.compareAndSet(true, false)) {
                if ((((zky) pyl.f.p()) == zky.STARTED ? 1 : null) == null) {
                    pyl.e.a(Boolean.TRUE);
                    obj = pyl.j.a(uri, pql.b, true, new gdy[0]).b((ajdw) pyl.k.f()).f(new i(pyl)).a((ajdw) pyl.k.l()).b((ajev) new j(pyl)).c((ajfb) new pyl.k(pyl)).a((ajdw) pyl.k.f()).a((ajfb) new l(pyl), (ajfb) new m(pyl, uri));
                    akcr.a(obj, "contentResolver.resolve(…lsite)\n                })");
                    std.a(obj, pyl.a);
                    return;
                }
                pyl.b();
            }
            return;
        }
        super.onClick(view);
    }

    public final boolean onLongClick(View view) {
        akcr.b(view, "view");
        if (b().clientStatus() != MessageClientStatus.OK) {
            return false;
        }
        qiu qiu = this.c;
        if (qiu == null) {
            akcr.a("chatActionMenuHandler");
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            akcr.a("inScreenMessageContent");
        }
        qiu.a(viewGroup);
        return true;
    }

    public final void onRecycle() {
        super.onRecycle();
        ((qfd) e()).m.b(this);
        pyl pyl = this.e;
        if (pyl == null) {
            akcr.a("audioNotePlaySession");
        }
        pyl.c();
        pyl.d.set(true);
        pyl.c.set(false);
        pyl.e.a(Boolean.FALSE);
        pyl.f.a(zky.IDLE);
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onStop() {
        pyl pyl = this.e;
        if (pyl == null) {
            akcr.a("audioNotePlaySession");
        }
        pyl.b();
    }
}
