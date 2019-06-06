package android.support.v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.util.Log;
import defpackage.im;
import defpackage.iv;
import defpackage.je;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean a = Log.isLoggable("MBServiceCompat", 3);
    final iv<IBinder, b> b = new iv();
    b c;
    final g d = new g();

    public static final class a {
    }

    class b implements DeathRecipient {
        String a;
        Bundle b;
        e c;
        a d;
        HashMap<String, List<je<IBinder, Bundle>>> e = new HashMap();

        b() {
        }

        public final void binderDied() {
            MediaBrowserServiceCompat.this.d.post(new Runnable() {
                public final void run() {
                    MediaBrowserServiceCompat.this.b.remove(b.this.c.a());
                }
            });
        }
    }

    public static class c<T> {
        final Object a;
        boolean b;
        boolean c;
        int d;

        c(Object obj) {
            this.a = obj;
        }

        /* Access modifiers changed, original: 0000 */
        public void a() {
        }

        /* Access modifiers changed, original: 0000 */
        public void b() {
            StringBuilder stringBuilder = new StringBuilder("It is not supported to send an error for ");
            stringBuilder.append(this.a);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        public final void c() {
            if (this.b || this.c) {
                StringBuilder stringBuilder = new StringBuilder("sendResult() called when either sendResult() or sendError() had already been called for: ");
                stringBuilder.append(this.a);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.b = true;
            a();
        }

        /* Access modifiers changed, original: final */
        public final boolean d() {
            return this.b || this.c;
        }
    }

    class d {

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$1 */
        class AnonymousClass1 implements Runnable {
            private /* synthetic */ e a;
            private /* synthetic */ String b;
            private /* synthetic */ Bundle c;
            private /* synthetic */ int d;

            AnonymousClass1(e eVar, String str, Bundle bundle, int i) {
                this.a = eVar;
                this.b = str;
                this.c = bundle;
                this.d = i;
            }

            public final void run() {
                IBinder a = this.a.a();
                MediaBrowserServiceCompat.this.b.remove(a);
                b bVar = new b();
                bVar.a = this.b;
                bVar.b = this.c;
                bVar.c = this.a;
                bVar.d = MediaBrowserServiceCompat.this.a();
                String str = "MBServiceCompat";
                if (bVar.d == null) {
                    StringBuilder stringBuilder = new StringBuilder("No root for client ");
                    stringBuilder.append(this.b);
                    stringBuilder.append(" from service ");
                    stringBuilder.append(getClass().getName());
                    Log.i(str, stringBuilder.toString());
                    try {
                        this.a.b();
                        return;
                    } catch (RemoteException unused) {
                        stringBuilder = new StringBuilder("Calling onConnectFailed() failed. Ignoring. pkg=");
                        stringBuilder.append(this.b);
                        Log.w(str, stringBuilder.toString());
                        return;
                    }
                }
                try {
                    MediaBrowserServiceCompat.this.b.put(a, bVar);
                    a.linkToDeath(bVar, 0);
                } catch (RemoteException unused2) {
                    StringBuilder stringBuilder2 = new StringBuilder("Calling onConnect() failed. Dropping client. pkg=");
                    stringBuilder2.append(this.b);
                    Log.w(str, stringBuilder2.toString());
                    MediaBrowserServiceCompat.this.b.remove(a);
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$2 */
        class AnonymousClass2 implements Runnable {
            private /* synthetic */ e a;

            AnonymousClass2(e eVar) {
                this.a = eVar;
            }

            public final void run() {
                b bVar = (b) MediaBrowserServiceCompat.this.b.remove(this.a.a());
                if (bVar != null) {
                    bVar.c.a().unlinkToDeath(bVar, 0);
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$3 */
        class AnonymousClass3 implements Runnable {
            private /* synthetic */ e a;
            private /* synthetic */ String b;
            private /* synthetic */ IBinder c;
            private /* synthetic */ Bundle d;

            AnonymousClass3(e eVar, String str, IBinder iBinder, Bundle bundle) {
                this.a = eVar;
                this.b = str;
                this.c = iBinder;
                this.d = bundle;
            }

            public final void run() {
                b bVar = (b) MediaBrowserServiceCompat.this.b.get(this.a.a());
                if (bVar == null) {
                    StringBuilder stringBuilder = new StringBuilder("addSubscription for callback that isn't registered id=");
                    stringBuilder.append(this.b);
                    Log.w("MBServiceCompat", stringBuilder.toString());
                    return;
                }
                MediaBrowserServiceCompat.this.a(this.b, bVar, this.c, this.d);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$4 */
        class AnonymousClass4 implements Runnable {
            private /* synthetic */ e a;
            private /* synthetic */ String b;
            private /* synthetic */ IBinder c;

            AnonymousClass4(e eVar, String str, IBinder iBinder) {
                this.a = eVar;
                this.b = str;
                this.c = iBinder;
            }

            public final void run() {
                b bVar = (b) MediaBrowserServiceCompat.this.b.get(this.a.a());
                String str = "MBServiceCompat";
                StringBuilder stringBuilder;
                if (bVar == null) {
                    stringBuilder = new StringBuilder("removeSubscription for callback that isn't registered id=");
                    stringBuilder.append(this.b);
                    Log.w(str, stringBuilder.toString());
                    return;
                }
                if (!MediaBrowserServiceCompat.a(this.b, bVar, this.c)) {
                    stringBuilder = new StringBuilder("removeSubscription called for ");
                    stringBuilder.append(this.b);
                    stringBuilder.append(" which is not subscribed");
                    Log.w(str, stringBuilder.toString());
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$5 */
        class AnonymousClass5 implements Runnable {
            private /* synthetic */ e a;
            private /* synthetic */ String b;
            private /* synthetic */ im c;

            AnonymousClass5(e eVar, String str, im imVar) {
                this.a = eVar;
                this.b = str;
                this.c = imVar;
            }

            public final void run() {
                b bVar = (b) MediaBrowserServiceCompat.this.b.get(this.a.a());
                if (bVar == null) {
                    StringBuilder stringBuilder = new StringBuilder("getMediaItem for callback that isn't registered id=");
                    stringBuilder.append(this.b);
                    Log.w("MBServiceCompat", stringBuilder.toString());
                    return;
                }
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                String str = this.b;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, this.c);
                mediaBrowserServiceCompat.c = bVar;
                anonymousClass2.d = 2;
                anonymousClass2.c();
                mediaBrowserServiceCompat.c = null;
                if (!anonymousClass2.d()) {
                    throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(str)));
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$6 */
        class AnonymousClass6 implements Runnable {
            private /* synthetic */ e a;
            private /* synthetic */ Bundle b;

            AnonymousClass6(e eVar, Bundle bundle) {
                this.a = eVar;
                this.b = bundle;
            }

            public final void run() {
                IBinder a = this.a.a();
                MediaBrowserServiceCompat.this.b.remove(a);
                b bVar = new b();
                bVar.c = this.a;
                bVar.b = this.b;
                MediaBrowserServiceCompat.this.b.put(a, bVar);
                try {
                    a.linkToDeath(bVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$7 */
        class AnonymousClass7 implements Runnable {
            private /* synthetic */ e a;

            AnonymousClass7(e eVar) {
                this.a = eVar;
            }

            public final void run() {
                IBinder a = this.a.a();
                b bVar = (b) MediaBrowserServiceCompat.this.b.remove(a);
                if (bVar != null) {
                    a.unlinkToDeath(bVar, 0);
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$8 */
        class AnonymousClass8 implements Runnable {
            private /* synthetic */ e a;
            private /* synthetic */ String b;
            private /* synthetic */ Bundle c;
            private /* synthetic */ im d;

            AnonymousClass8(e eVar, String str, Bundle bundle, im imVar) {
                this.a = eVar;
                this.b = str;
                this.c = bundle;
                this.d = imVar;
            }

            public final void run() {
                b bVar = (b) MediaBrowserServiceCompat.this.b.get(this.a.a());
                if (bVar == null) {
                    StringBuilder stringBuilder = new StringBuilder("search for callback that isn't registered query=");
                    stringBuilder.append(this.b);
                    Log.w("MBServiceCompat", stringBuilder.toString());
                    return;
                }
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                String str = this.b;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(str, this.d);
                mediaBrowserServiceCompat.c = bVar;
                anonymousClass3.d = 4;
                anonymousClass3.c();
                mediaBrowserServiceCompat.c = null;
                if (!anonymousClass3.d()) {
                    throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(String.valueOf(str)));
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d$9 */
        class AnonymousClass9 implements Runnable {
            private /* synthetic */ e a;
            private /* synthetic */ String b;
            private /* synthetic */ Bundle c;
            private /* synthetic */ im d;

            AnonymousClass9(e eVar, String str, Bundle bundle, im imVar) {
                this.a = eVar;
                this.b = str;
                this.c = bundle;
                this.d = imVar;
            }

            public final void run() {
                b bVar = (b) MediaBrowserServiceCompat.this.b.get(this.a.a());
                if (bVar == null) {
                    StringBuilder stringBuilder = new StringBuilder("sendCustomAction for callback that isn't registered action=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", extras=");
                    stringBuilder.append(this.c);
                    Log.w("MBServiceCompat", stringBuilder.toString());
                    return;
                }
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                String str = this.b;
                Bundle bundle = this.c;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(str, this.d);
                mediaBrowserServiceCompat.c = bVar;
                StringBuilder stringBuilder2;
                if (anonymousClass4.b || anonymousClass4.c) {
                    stringBuilder2 = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
                    stringBuilder2.append(anonymousClass4.a);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                anonymousClass4.c = true;
                anonymousClass4.b();
                mediaBrowserServiceCompat.c = null;
                if (!anonymousClass4.d()) {
                    stringBuilder2 = new StringBuilder("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" extras=");
                    stringBuilder2.append(bundle);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
        }

        d() {
        }
    }

    interface e {
        IBinder a();

        void a(String str, List<MediaItem> list, Bundle bundle);

        void b();
    }

    final class g extends Handler {
        private final d a = new d();

        g() {
        }

        private void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:45:0x01ac in {3, 7, 8, 9, 13, 14, 15, 17, 19, 23, 24, 25, 27, 29, 31, 38, 39, 42, 44} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void handleMessage(android.os.Message r13) {
            /*
            r12 = this;
            r0 = r13.getData();
            r1 = r13.what;
            r2 = "data_callback_token";
            r3 = "data_root_hints";
            r4 = "data_result_receiver";
            r5 = "data_media_item_id";
            switch(r1) {
                case 1: goto L_0x0149;
                case 2: goto L_0x0133;
                case 3: goto L_0x010e;
                case 4: goto L_0x00f0;
                case 5: goto L_0x00c7;
                case 6: goto L_0x00ad;
                case 7: goto L_0x0097;
                case 8: goto L_0x0062;
                case 9: goto L_0x002f;
                default: goto L_0x0011;
            };
            r0 = new java.lang.StringBuilder;
            r1 = "Unhandled message: ";
            r0.<init>(r1);
            r0.append(r13);
            r1 = "\n  Service version: 2\n  Client version: ";
            r0.append(r1);
            r13 = r13.arg1;
            r0.append(r13);
            r13 = r0.toString();
            r0 = "MBServiceCompat";
            android.util.Log.w(r0, r13);
            return;
            r7 = r12.a;
            r1 = "data_custom_action";
            r9 = r0.getString(r1);
            r1 = "data_custom_action_extras";
            r10 = r0.getBundle(r1);
            r0 = r0.getParcelable(r4);
            r11 = r0;
            r11 = (defpackage.im) r11;
            r8 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r8.<init>(r13);
            r13 = android.text.TextUtils.isEmpty(r9);
            if (r13 != 0) goto L_0x0061;
            if (r11 != 0) goto L_0x0054;
            goto L_0x0061;
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r0 = new android.support.v4.media.MediaBrowserServiceCompat$d$9;
            r6 = r0;
            r6.<init>(r8, r9, r10, r11);
            r13.a(r0);
            return;
            r2 = r12.a;
            r1 = "data_search_query";
            r5 = r0.getString(r1);
            r1 = "data_search_extras";
            r6 = r0.getBundle(r1);
            r0 = r0.getParcelable(r4);
            r0 = (defpackage.im) r0;
            r3 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r3.<init>(r13);
            r13 = android.text.TextUtils.isEmpty(r5);
            if (r13 != 0) goto L_0x0096;
            if (r0 != 0) goto L_0x0086;
            goto L_0x0096;
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r7 = new android.support.v4.media.MediaBrowserServiceCompat$d$8;
            r1 = r7;
            r4 = r5;
            r5 = r6;
            r6 = r0;
            r1.<init>(r3, r4, r5, r6);
            r13.a(r7);
            return;
            r0 = r12.a;
            r1 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r1.<init>(r13);
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r2 = new android.support.v4.media.MediaBrowserServiceCompat$d$7;
            r2.<init>(r1);
            r13.a(r2);
            return;
            r1 = r12.a;
            r2 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r2.<init>(r13);
            r13 = r0.getBundle(r3);
            r0 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r0 = r0.d;
            r3 = new android.support.v4.media.MediaBrowserServiceCompat$d$6;
            r3.<init>(r2, r13);
            r0.a(r3);
            return;
            r1 = r12.a;
            r2 = r0.getString(r5);
            r0 = r0.getParcelable(r4);
            r0 = (defpackage.im) r0;
            r3 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r3.<init>(r13);
            r13 = android.text.TextUtils.isEmpty(r2);
            if (r13 != 0) goto L_0x00ef;
            if (r0 != 0) goto L_0x00e3;
            goto L_0x00ef;
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r4 = new android.support.v4.media.MediaBrowserServiceCompat$d$5;
            r4.<init>(r3, r2, r0);
            r13.a(r4);
            return;
            r1 = r12.a;
            r3 = r0.getString(r5);
            r0 = defpackage.fu.a(r0, r2);
            r2 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r2.<init>(r13);
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r4 = new android.support.v4.media.MediaBrowserServiceCompat$d$4;
            r4.<init>(r2, r3, r0);
            r13.a(r4);
            return;
            r6 = r12.a;
            r8 = r0.getString(r5);
            r9 = defpackage.fu.a(r0, r2);
            r1 = "data_options";
            r10 = r0.getBundle(r1);
            r7 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r7.<init>(r13);
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r0 = new android.support.v4.media.MediaBrowserServiceCompat$d$3;
            r5 = r0;
            r5.<init>(r7, r8, r9, r10);
            r13.a(r0);
            return;
            r0 = r12.a;
            r1 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r1.<init>(r13);
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r2 = new android.support.v4.media.MediaBrowserServiceCompat$d$2;
            r2.<init>(r1);
            r13.a(r2);
            return;
            r4 = r12.a;
            r1 = "data_package_name";
            r6 = r0.getString(r1);
            r1 = "data_calling_uid";
            r8 = r0.getInt(r1);
            r7 = r0.getBundle(r3);
            r5 = new android.support.v4.media.MediaBrowserServiceCompat$f;
            r13 = r13.replyTo;
            r5.<init>(r13);
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r0 = 0;
            if (r6 == 0) goto L_0x0180;
            r13 = r13.getPackageManager();
            r13 = r13.getPackagesForUid(r8);
            r1 = r13.length;
            r2 = 0;
            if (r2 >= r1) goto L_0x0180;
            r3 = r13[r2];
            r3 = r3.equals(r6);
            if (r3 == 0) goto L_0x017d;
            r0 = 1;
            goto L_0x0180;
            r2 = r2 + 1;
            goto L_0x0171;
            if (r0 == 0) goto L_0x0190;
            r13 = android.support.v4.media.MediaBrowserServiceCompat.this;
            r13 = r13.d;
            r0 = new android.support.v4.media.MediaBrowserServiceCompat$d$1;
            r3 = r0;
            r3.<init>(r5, r6, r7, r8);
            r13.a(r0);
            return;
            r13 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.StringBuilder;
            r1 = "Package/uid mismatch: uid=";
            r0.<init>(r1);
            r0.append(r8);
            r1 = " package=";
            r0.append(r1);
            r0.append(r6);
            r0 = r0.toString();
            r13.<init>(r0);
            throw r13;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat$g.handleMessage(android.os.Message):void");
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$1 */
    class AnonymousClass1 extends c<List<MediaItem>> {
        private /* synthetic */ b e;
        private /* synthetic */ String f;
        private /* synthetic */ Bundle g;

        AnonymousClass1(Object obj, b bVar, String str, Bundle bundle) {
            this.e = bVar;
            this.f = str;
            this.g = bundle;
            super(obj);
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ void a() {
            b bVar = MediaBrowserServiceCompat.this.b.get(this.e.c.a());
            b bVar2 = this.e;
            String str = "MBServiceCompat";
            StringBuilder stringBuilder;
            if (bVar != bVar2) {
                if (MediaBrowserServiceCompat.a) {
                    stringBuilder = new StringBuilder("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                    stringBuilder.append(this.e.a);
                    stringBuilder.append(" id=");
                    stringBuilder.append(this.f);
                    Log.d(str, stringBuilder.toString());
                }
                return;
            }
            try {
                bVar2.c.a(this.f, null, this.g);
            } catch (RemoteException unused) {
                stringBuilder = new StringBuilder("Calling onLoadChildren() failed for id=");
                stringBuilder.append(this.f);
                stringBuilder.append(" package=");
                stringBuilder.append(this.e.a);
                Log.w(str, stringBuilder.toString());
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$2 */
    class AnonymousClass2 extends c<MediaItem> {
        private /* synthetic */ im e;

        AnonymousClass2(Object obj, im imVar) {
            this.e = imVar;
            super(obj);
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ void a() {
            if ((this.d & 2) != 0) {
                this.e.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", null);
            this.e.b(0, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$3 */
    class AnonymousClass3 extends c<List<MediaItem>> {
        private /* synthetic */ im e;

        AnonymousClass3(Object obj, im imVar) {
            this.e = imVar;
            super(obj);
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ void a() {
            this.e.b(-1, null);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$4 */
    class AnonymousClass4 extends c<Bundle> {
        private /* synthetic */ im e;

        AnonymousClass4(Object obj, im imVar) {
            this.e = imVar;
            super(obj);
        }

        /* Access modifiers changed, original: final|synthetic */
        public final /* synthetic */ void a() {
            this.e.b(0, null);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            this.e.b(-1, null);
        }
    }

    static class f implements e {
        private Messenger a;

        f(Messenger messenger) {
            this.a = messenger;
        }

        private void a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }

        public final IBinder a() {
            return this.a.getBinder();
        }

        public final void a(String str, List<MediaItem> list, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            a(3, bundle2);
        }

        public final void b() {
            a(2, null);
        }
    }

    static boolean a(String str, b bVar, IBinder iBinder) {
        boolean z = false;
        if (iBinder == null) {
            return bVar.e.remove(str) != null;
        } else {
            List list = (List) bVar.e.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((je) it.next()).a) {
                        it.remove();
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.e.remove(str);
                }
            }
            return z;
        }
    }

    public abstract a a();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x00ae in {2, 10, 17, 18, 24, 28, 30, 33, 36, 38} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final void a(java.lang.String r11, android.support.v4.media.MediaBrowserServiceCompat.b r12, android.os.IBinder r13, android.os.Bundle r14) {
        /*
        r10 = this;
        r0 = r12.e;
        r0 = r0.get(r11);
        r0 = (java.util.List) r0;
        if (r0 != 0) goto L_0x000f;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r0.iterator();
        r2 = r1.hasNext();
        r3 = 1;
        if (r2 == 0) goto L_0x0068;
        r2 = r1.next();
        r2 = (defpackage.je) r2;
        r4 = r2.a;
        if (r13 != r4) goto L_0x0013;
        r2 = r2.b;
        r2 = (android.os.Bundle) r2;
        r4 = 0;
        if (r14 != r2) goto L_0x002c;
        goto L_0x0065;
        r5 = "android.media.browse.extra.PAGE_SIZE";
        r6 = "android.media.browse.extra.PAGE";
        r7 = -1;
        if (r14 != 0) goto L_0x0042;
        r6 = r2.getInt(r6, r7);
        if (r6 != r7) goto L_0x0040;
        r2 = r2.getInt(r5, r7);
        if (r2 != r7) goto L_0x0040;
        goto L_0x0065;
        r3 = 0;
        goto L_0x0065;
        if (r2 != 0) goto L_0x0051;
        r2 = r14.getInt(r6, r7);
        if (r2 != r7) goto L_0x0040;
        r2 = r14.getInt(r5, r7);
        if (r2 != r7) goto L_0x0040;
        goto L_0x0065;
        r8 = r14.getInt(r6, r7);
        r6 = r2.getInt(r6, r7);
        if (r8 != r6) goto L_0x0040;
        r6 = r14.getInt(r5, r7);
        r2 = r2.getInt(r5, r7);
        if (r6 != r2) goto L_0x0040;
        if (r3 == 0) goto L_0x0013;
        return;
        r1 = new je;
        r1.<init>(r13, r14);
        r0.add(r1);
        r13 = r12.e;
        r13.put(r11, r0);
        r13 = new android.support.v4.media.MediaBrowserServiceCompat$1;
        r4 = r13;
        r5 = r10;
        r6 = r11;
        r7 = r12;
        r8 = r11;
        r9 = r14;
        r4.<init>(r6, r7, r8, r9);
        r10.c = r12;
        if (r14 == 0) goto L_0x0086;
        r13.d = r3;
        r14 = 0;
        r10.c = r14;
        r13 = r13.d();
        if (r13 == 0) goto L_0x0090;
        return;
        r13 = new java.lang.IllegalStateException;
        r14 = new java.lang.StringBuilder;
        r0 = "onLoadChildren must call detach() or sendResult() before returning for package=";
        r14.<init>(r0);
        r12 = r12.a;
        r14.append(r12);
        r12 = " id=";
        r14.append(r12);
        r14.append(r11);
        r11 = r14.toString();
        r13.<init>(r11);
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat.a(java.lang.String, android.support.v4.media.MediaBrowserServiceCompat$b, android.os.IBinder, android.os.Bundle):void");
    }
}
