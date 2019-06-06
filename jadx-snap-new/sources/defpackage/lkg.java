package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.brightcove.player.event.Event;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.miq.e;
import defpackage.mwy.b;

/* renamed from: lkg */
public final class lkg implements mwy {
    final zjm a = new zjm(this.e, "DefaultModalDialogLauncher", false, false, true, false, null, false, false, false, false, null, 4076);
    boolean b;
    final Context c;
    final achb<zjm, zjk> d;
    final ide e;
    private final zfw f;

    /* renamed from: lkg$a */
    static final class a implements ajda {
        final /* synthetic */ lkg a;
        final /* synthetic */ b b;

        /* renamed from: lkg$a$2 */
        static final class 2 implements ajfa {
            private /* synthetic */ a a;

            2(a aVar) {
                this.a = aVar;
            }

            public final void cancel() {
                if (this.a.a.b) {
                    this.a.a.d.a((achg) this.a.a.a, true, true, null);
                    this.a.a.b = false;
                }
            }
        }

        /* renamed from: lkg$a$1 */
        static final class 1 extends akcs implements akbl<View, ajxw> {
            public static final 1 a = new 1();

            1() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                return ajxw.a;
            }
        }

        /* renamed from: lkg$a$a */
        static final class a extends akcs implements akbl<View, ajxw> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                return ajxw.a;
            }
        }

        /* renamed from: lkg$a$b */
        static final class b extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                View view = (View) obj;
                akcr.b(view, "view");
                miq miq = this.a.b.a;
                if (miq instanceof e) {
                    SnapImageView snapImageView = (SnapImageView) view;
                    Object parse = Uri.parse(((e) miq).a());
                    akcr.a(parse, "android.net.Uri.parse(iconUri.uri)");
                    snapImageView.setImageUri(parse, this.a.a.e.getAttributionFor("lensIconOnModalDialog"));
                } else {
                    view.setVisibility(8);
                }
                this.a.a.b = true;
                return ajxw.a;
            }
        }

        /* renamed from: lkg$a$c */
        static final class c extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ a a;
            private /* synthetic */ ajcy b;

            c(a aVar, ajcy ajcy) {
                this.a = aVar;
                this.b = ajcy;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.b = false;
                this.b.a();
                return ajxw.a;
            }
        }

        /* renamed from: lkg$a$d */
        static final class d extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ a a;

            d(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.b.h.run();
                return ajxw.a;
            }
        }

        a(lkg lkg, b bVar) {
            this.a = lkg;
            this.b = bVar;
        }

        public final void subscribe(ajcy ajcy) {
            akcr.b(ajcy, Event.EMITTER);
            if (!ajcy.isDisposed()) {
                defpackage.zgy.a aVar = new defpackage.zgy.a(this.a.c, this.a.d, this.a.a, false, null, 24);
                String str = this.b.b;
                if (str == null) {
                    str = lkg.a(this.a, this.b.c);
                }
                defpackage.zgy.a a = aVar.a(str);
                str = this.b.d;
                if (str == null) {
                    str = lkg.a(this.a, this.b.e);
                }
                a = defpackage.zgy.a.a(a.b(str), (int) R.layout.lenses_modal_dialog_lens_icon, (akbl) a.a, (akbl) new b(this), (akbl) new c(this, ajcy), false, 16);
                str = this.b.g;
                if (str == null) {
                    str = this.a.c.getString(R.string.lenses_modal_dialog_button_done);
                    akcr.a((Object) str, "context.getString(R.stri…modal_dialog_button_done)");
                }
                a = a.a(str, (akbl) new d(this), true).b();
                if (this.b.f) {
                    a.a((int) R.string.lenses_modal_dialog_button_cancel, (akbl) 1.a);
                }
                zgy a2 = a.a();
                this.a.d.a((achd) a2, a2.a, null);
                ajcy.a((ajfa) new 2(this));
            }
        }
    }

    public lkg(Context context, achb<zjm, zjk> achb, zfw zfw, ide ide) {
        Context context2 = context;
        achb<zjm, zjk> achb2 = achb;
        zfw zfw2 = zfw;
        ide ide2 = ide;
        akcr.b(context2, "context");
        akcr.b(achb2, "navigationHost");
        akcr.b(zfw2, "qualifiedSchedulers");
        akcr.b(ide2, "attributedFeature");
        this.c = context2;
        this.d = achb2;
        this.f = zfw2;
        this.e = ide2;
    }

    public static final /* synthetic */ String a(lkg lkg, mhs mhs) {
        int identifier;
        if (mhs instanceof mhs.b) {
            identifier = lkg.c.getResources().getIdentifier(((mhs.b) mhs).a, "string", lkg.c.getPackageName());
        } else {
            identifier = 0;
        }
        if (identifier != 0) {
            Object string = lkg.c.getResources().getString(identifier);
            akcr.a(string, "context.resources.getString(stringId)");
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder("Missing translation for [");
        stringBuilder.append(mhs);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final ajcx a(b bVar) {
        akcr.b(bVar, "request");
        Object c = ajcx.a((ajda) new a(this, bVar)).b((ajdw) this.f.l()).c((ajdw) this.f.l());
        akcr.a(c, "Completable.create { emi…dSchedulers.mainThread())");
        return c;
    }
}
