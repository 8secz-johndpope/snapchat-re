package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snapchat.android.R;
import defpackage.zgy.a;
import java.util.List;

/* renamed from: deu */
public final class deu implements czl, gvn {
    final zfw a = zgb.a(ddg.l, "BitmojiAuthDeepLinkHandler");
    final Context b;
    final ajei c;
    final aipn<BitmojiFsnHttpInterface> d;
    final gpb e;
    final ddt f;
    final aipn<zjw> g;
    final aipn<ddd> h;
    private final List<String> i;
    private dgo j;

    /* renamed from: deu$a */
    static final class a implements Runnable {
        final /* synthetic */ deu a;
        private /* synthetic */ Uri b;

        /* renamed from: deu$a$a */
        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ a a;

            /* renamed from: deu$a$a$1 */
            static final class 1<T> implements ajfb<Throwable> {
                private /* synthetic */ a a;

                1(a aVar) {
                    this.a = aVar;
                }

                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }

            a(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                ((ddd) this.a.a.h.get()).b(aaua.EXTERNAL, this.a.a.f.a());
                ajej a = ((BitmojiFsnHttpInterface) this.a.a.d.get()).getBitmojiRequestToken(new aedh()).b((ajdw) this.a.a.a.g()).d((ajfb) new 1(this)).a((ajfb) new dev(new akbl<aeeh, ajxw>(this.a.a) {
                    public final String getName() {
                        return "onBitmojiRequestTokenSuccess";
                    }

                    public final akej getOwner() {
                        return akde.a(deu.class);
                    }

                    public final String getSignature() {
                        return "onBitmojiRequestTokenSuccess(Lcom/snapchat/soju/android/BitmojiRequestTokenResponse;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        aeeh aeeh = (aeeh) obj;
                        akcr.b(aeeh, "p1");
                        deu deu = (deu) this.receiver;
                        if (aeeh.a == null) {
                            deu.b();
                        } else {
                            defpackage.ddt.a aVar = deu.e.a().f == null ? defpackage.ddt.a.CREATE : defpackage.ddt.a.LOGIN;
                            ddt ddt = deu.f;
                            String str = aeeh.a;
                            akcr.a((Object) str, "response.bitmojiRequestToken");
                            ddt.a(aVar, str, aaua.EXTERNAL);
                        }
                        return ajxw.a;
                    }
                }), (ajfb) new dev(new akbl<Throwable, ajxw>(this.a.a) {
                    public final String getName() {
                        return "onBitmojiRequestTokenFailure";
                    }

                    public final akej getOwner() {
                        return akde.a(deu.class);
                    }

                    public final String getSignature() {
                        return "onBitmojiRequestTokenFailure(Ljava/lang/Throwable;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        ((deu) this.receiver).b();
                        return ajxw.a;
                    }
                }));
                akcr.a((Object) a, "bitmojiFsnHttpInterface.…tmojiRequestTokenFailure)");
                ajvv.a(a, this.a.a.c);
                return ajxw.a;
            }
        }

        a(deu deu, Uri uri) {
            this.a = deu;
            this.b = uri;
        }

        public final void run() {
            String queryParameter = this.b.getQueryParameter("is_linking");
            boolean parseBoolean = queryParameter != null ? Boolean.parseBoolean(queryParameter) : false;
            ((ddd) this.a.h.get()).a(aaua.EXTERNAL);
            defpackage.zgy.a a = dgo.a(new zjm(ddg.l, "create_bitmoji_dialog", false, false, true, false, null, false, false, false, false, null, 4076), ((zjw) this.a.g.get()).d, this.a.b, true).a(parseBoolean ? R.string.bitmoji_connect_title : R.string.bitmoji_create_title);
            Context context = this.a.b;
            int i = parseBoolean ? R.string.bitmoji_connect_message : R.string.bitmoji_create_message;
            Object[] objArr = new Object[1];
            String b = this.a.e.b();
            if (b == null) {
                b = "";
            }
            objArr[0] = b;
            String string = context.getString(i, objArr);
            akcr.a((Object) string, "context.getString(if (is…AuthStore.username ?: \"\")");
            zgy a2 = defpackage.zgy.a.a(a.b(string).a(parseBoolean ? R.string.bitmoji_connect_option : R.string.bitmoji_create_option, (akbl) new a(this), true), null, false, null, null, null, 31).a();
            zjw.a((zjw) this.a.g.get(), dnh.a, false, new acip(((zjw) this.a.g.get()).d, a2, a2.a), null, 8);
        }
    }

    public deu(Context context, ajei ajei, zgb zgb, aipn<BitmojiFsnHttpInterface> aipn, gpb gpb, ddt ddt, aipn<zjw> aipn2, aipn<ddd> aipn3, dgo dgo) {
        akcr.b(context, "context");
        akcr.b(ajei, "disposable");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "bitmojiFsnHttpInterface");
        akcr.b(gpb, "userAuthStore");
        akcr.b(ddt, "bitmojiUtils");
        akcr.b(aipn2, "deepLinkNavigator");
        akcr.b(aipn3, "bitmojiEventsAnalytics");
        akcr.b(dgo, "bitmojiDialogController");
        this.b = context;
        this.c = ajei;
        this.d = aipn;
        this.e = gpb;
        this.f = ddt;
        this.g = aipn2;
        this.h = aipn3;
        this.j = dgo;
        Object of = ImmutableList.of("snapchat://bitmoji/auth/..*");
        akcr.a(of, "ImmutableList.of(\"snapchat://bitmoji/auth/..*\")");
        this.i = (List) of;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.BITMOJI;
    }

    public final List<String> a() {
        return this.i;
    }

    public final aahz b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        zgy a = a.a(new a(this.b, ((zjw) this.g.get()).d, new zjm(ddg.l, "bitmoji_please_try_again_dialog", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.bitmoji_please_try_again), null, false, null, null, null, 31).a();
        zjw.a((zjw) this.g.get(), dnh.a, false, new acip(((zjw) this.g.get()).d, a, a.a), null, 8);
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object a = ajcx.a((Runnable) new a(this, uri));
        akcr.a(a, "Completable.fromRunnable…igationAction))\n        }");
        return a;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
