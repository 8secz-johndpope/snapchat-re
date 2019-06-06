package com.snap.loginkit.lib.ui.settings.connectedapps;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.brightcove.player.event.EventType;
import com.google.common.collect.ImmutableList;
import com.snap.imageloading.view.SnapImageView;
import com.snap.loginkit.lib.net.SnapKitHttpInterface;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.abur;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.afuh;
import defpackage.aipn;
import defpackage.ajfb;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.gey;
import defpackage.idl;
import defpackage.j;
import defpackage.jwe;
import defpackage.k;
import defpackage.ngq;
import defpackage.ngr;
import defpackage.nho;
import defpackage.nhp;
import defpackage.nig;
import defpackage.nii;
import defpackage.nik;
import defpackage.nin;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import java.util.Collection;

public final class SettingsConnectedAppsPresenter extends zll<nin> implements k, nii {
    final zfw a = zgb.a(ngr.e, "SettingsConnectedAppsPresenter");
    final ajxe b;
    final aipn<SnapKitHttpInterface> c;
    final achb<zjm, zjk> d;
    final Context e;
    final nhp f;

    static final class c<T> implements ajfb<afuh> {
        private /* synthetic */ SettingsConnectedAppsPresenter a;

        c(SettingsConnectedAppsPresenter settingsConnectedAppsPresenter) {
            this.a = settingsConnectedAppsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (afuh) obj;
            SettingsConnectedAppsPresenter settingsConnectedAppsPresenter = this.a;
            akcr.a(obj, EventType.RESPONSE);
            idl idl = ngq.a.d.b;
            if (obj.a.isEmpty()) {
                nhp nhp = settingsConnectedAppsPresenter.f;
                Object i = abtp.i(settingsConnectedAppsPresenter.e);
                akcr.a(i, "ViewUtils.getDpiSuffix(context)");
                nhp.a(i, idl, new e(settingsConnectedAppsPresenter, idl));
                return;
            }
            abur f;
            nin nin = (nin) settingsConnectedAppsPresenter.getTarget();
            if (nin != null) {
                LoadingSpinnerView c = nin.c();
                if (c != null) {
                    c.setVisibility(8);
                }
            }
            nin = (nin) settingsConnectedAppsPresenter.getTarget();
            if (nin != null) {
                f = nin.f();
                if (f != null && f.b() && f.c()) {
                    f.a(8);
                }
            }
            nin = (nin) settingsConnectedAppsPresenter.getTarget();
            if (nin != null) {
                f = nin.d();
                if (f != null) {
                    f.a(0);
                }
            }
            nig nig = (nig) settingsConnectedAppsPresenter.b.b();
            obj = ImmutableList.copyOf((Collection) obj.a);
            akcr.a(obj, "ImmutableList.copyOf(response.clients)");
            String str = "clients";
            akcr.b(obj, str);
            nik nik = nig.a;
            akcr.b(obj, str);
            nik.a = obj;
            nig.a.notifyDataSetChanged();
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsConnectedAppsPresenter a;

        d(SettingsConnectedAppsPresenter settingsConnectedAppsPresenter) {
            this.a = settingsConnectedAppsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsConnectedAppsPresenter settingsConnectedAppsPresenter = this.a;
            nin nin = (nin) settingsConnectedAppsPresenter.getTarget();
            if (nin != null) {
                Context b = nin.b();
                if (b != null) {
                    zgy a = new defpackage.zgy.a(b, settingsConnectedAppsPresenter.d, ngr.d, false, null, 16).a((int) R.string.error).b((int) R.string.something_went_wrong).a((int) R.string.okay, (akbl) new b(settingsConnectedAppsPresenter), false).a();
                    settingsConnectedAppsPresenter.d.a((achd) a, a.a, null);
                }
            }
        }
    }

    public static final class e implements nho {
        final /* synthetic */ idl a;
        private /* synthetic */ SettingsConnectedAppsPresenter b;

        static final class a<T extends View> implements defpackage.abur.a<View> {
            private /* synthetic */ e a;
            private /* synthetic */ Uri b;

            a(e eVar, Uri uri) {
                this.a = eVar;
                this.b = uri;
            }

            public final void onViewInflated(View view) {
                akcr.b(view, "rootView");
                ((SnapImageView) view.findViewById(R.id.snap_kit_privacy_explainer_image_view)).setImageUri(this.b, this.a.a);
            }
        }

        e(SettingsConnectedAppsPresenter settingsConnectedAppsPresenter, idl idl) {
            this.b = settingsConnectedAppsPresenter;
            this.a = idl;
        }

        public final void a(Uri uri) {
            abur f;
            akcr.b(uri, "privacyGraphicUri");
            nin nin = (nin) this.b.getTarget();
            if (nin != null) {
                LoadingSpinnerView c = nin.c();
                if (c != null) {
                    c.setVisibility(8);
                }
            }
            nin = (nin) this.b.getTarget();
            if (nin != null) {
                abur f2 = nin.f();
                if (f2 != null) {
                    f2.a((defpackage.abur.a) new a(this, uri));
                }
            }
            nin nin2 = (nin) this.b.getTarget();
            if (nin2 != null) {
                f = nin2.f();
                if (f != null) {
                    f.a(0);
                }
            }
            nin2 = (nin) this.b.getTarget();
            if (nin2 != null) {
                f = nin2.d();
                if (f != null && f.b() && f.c()) {
                    f.a(8);
                }
            }
        }

        public final void a(gey gey) {
            akcr.b(gey, "failureReason");
        }
    }

    static final class a extends akcs implements akbk<nig> {
        private /* synthetic */ SettingsConnectedAppsPresenter a;
        private /* synthetic */ jwe b;

        a(SettingsConnectedAppsPresenter settingsConnectedAppsPresenter, jwe jwe) {
            this.a = settingsConnectedAppsPresenter;
            this.b = jwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            nin nin = (nin) this.a.getTarget();
            return new nig(nin != null ? nin.d() : null, this.a, this.b.a(), this.a.a, this.a.e);
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsConnectedAppsPresenter a;

        b(SettingsConnectedAppsPresenter settingsConnectedAppsPresenter) {
            this.a = settingsConnectedAppsPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.d.a((achg) ngr.a, true, true, null);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SettingsConnectedAppsPresenter.class), "clientsListPresenter", "getClientsListPresenter()Lcom/snap/loginkit/lib/ui/settings/clients/ConnectedAppClientsListPresenter;");
    }

    public SettingsConnectedAppsPresenter(zgb zgb, aipn<SnapKitHttpInterface> aipn, achb<zjm, zjk> achb, jwe jwe, Context context, nhp nhp) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "snapkitHttpInterface");
        akcr.b(achb, "navigationHost");
        akcr.b(jwe, "bitmapLoaderFactory");
        akcr.b(context, "context");
        akcr.b(nhp, "privacyExplainerGraphicDownloader");
        this.c = aipn;
        this.d = achb;
        this.e = context;
        this.f = nhp;
        this.b = ajxh.a(new a(this, jwe));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x009b in {3, 7, 9} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(defpackage.afud r6, int r7) {
        /*
        r5 = this;
        r0 = "client";
        defpackage.akcr.b(r6, r0);
        r0 = defpackage.ngq.a;
        r1 = new com.snap.loginkit.lib.ui.settings.apppermissions.AppPermissionsFragment;
        r1.<init>();
        r2 = new android.os.Bundle;
        r2.<init>();
        r3 = r6.a;
        r4 = "name";
        r2.putString(r4, r3);
        r3 = r6.d;
        r4 = "icon";
        r2.putString(r4, r3);
        r3 = r6.e;
        r4 = "clientId";
        r2.putString(r4, r3);
        r3 = "iconBasedColor";
        r2.putInt(r3, r7);
        r6 = r6.f;
        r7 = "client.scopesApproved";
        defpackage.akcr.a(r6, r7);
        r6 = (java.lang.Iterable) r6;
        r7 = new java.util.ArrayList;
        r3 = 10;
        r3 = defpackage.ajyn.a(r6, r3);
        r7.<init>(r3);
        r7 = (java.util.Collection) r7;
        r6 = r6.iterator();
        r3 = r6.hasNext();
        if (r3 == 0) goto L_0x005a;
        r3 = r6.next();
        r3 = (defpackage.afur) r3;
        r4 = new nib;
        r4.<init>(r3);
        r7.add(r4);
        goto L_0x0045;
        r7 = (java.util.List) r7;
        r7 = (java.util.Collection) r7;
        r6 = 0;
        r6 = new defpackage.nib[r6];
        r6 = r7.toArray(r6);
        if (r6 == 0) goto L_0x0093;
        r6 = (defpackage.nib[]) r6;
        r6 = (android.os.Parcelable[]) r6;
        r7 = "scopesApproved";
        r2.putParcelableArray(r7, r6);
        r1.setArguments(r2);
        r1 = (com.snap.ui.deck.MainPageFragment) r1;
        r6 = defpackage.acgv.a();
        r7 = defpackage.ngq.d;
        r6 = r6.a(r7);
        r6 = r6.a();
        r7 = new zjf;
        r7.<init>(r0, r1, r6);
        r6 = r5.d;
        r7 = (defpackage.achd) r7;
        r0 = defpackage.ngq.c;
        r1 = 0;
        r6.a(r7, r0, r1);
        return;
        r6 = new ajxt;
        r7 = "null cannot be cast to non-null type kotlin.Array<T>";
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.loginkit.lib.ui.settings.connectedapps.SettingsConnectedAppsPresenter.a(afud, int):void");
    }

    /* renamed from: a */
    public final void takeTarget(nin nin) {
        akcr.b(nin, "target");
        super.takeTarget(nin);
        nin.getLifecycle().a(this);
    }

    public final void dropTarget() {
        nin nin = (nin) getTarget();
        if (nin != null) {
            j lifecycle = nin.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }
}
