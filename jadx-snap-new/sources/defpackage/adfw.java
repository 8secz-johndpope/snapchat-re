package defpackage;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import com.google.common.collect.Sets;
import defpackage.abmh.a;
import java.util.Collection;

/* renamed from: adfw */
public final class adfw implements abmh {
    private static abpo<abmh> g = new 1();
    final adga a;
    final Collection<MediaPlayer> b;
    final kpc c;
    kom d;
    kom e;
    adfv f;
    private final abmi h;

    /* renamed from: adfw$1 */
    static class 1 extends abpo<abmh> {
        1() {
        }

        public final /* synthetic */ Object a() {
            return new adfw();
        }
    }

    /* renamed from: adfw$2 */
    class 2 implements OnCompletionListener {
        2() {
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            adfw.this.b.remove(mediaPlayer);
            mediaPlayer.release();
            adfw.this.c.a(adfw.this.e);
            adfw.this.e = null;
        }
    }

    private adfw() {
        this.b = Sets.newConcurrentHashSet();
        this.a = new adga();
        this.h = new abmi();
        this.c = kpf.a();
    }

    /* synthetic */ adfw(byte b) {
        this();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0047 */
    private static defpackage.adfv a(defpackage.abmh.a r8, boolean r9) {
        /*
        r6 = new absr;
        r0 = java.lang.String.valueOf(r8);
        r1 = "FRAMEWORK_JINGLE: ";
        r0 = r1.concat(r0);
        r6.<init>(r0);
        r7 = r8.b();
        r6.setAudioStreamType(r7);
        r6.setLooping(r9);
        r9 = com.snapchat.android.framework.misc.AppContext.get();
        r9 = r9.getResources();
        r0 = r8.a();
        r9 = r9.openRawResourceFd(r0);
        r1 = r9.getFileDescriptor();	 Catch:{ IOException -> 0x0047, all -> 0x0042 }
        r2 = r9.getStartOffset();	 Catch:{ IOException -> 0x0047, all -> 0x0042 }
        r4 = r9.getLength();	 Catch:{ IOException -> 0x0047, all -> 0x0042 }
        r0 = r6;
        r0.setDataSource(r1, r2, r4);	 Catch:{ IOException -> 0x0047, all -> 0x0042 }
        r9.close();	 Catch:{ IOException -> 0x003c }
    L_0x003c:
        r9 = new adfv;
        r9.<init>(r6, r8, r7);
        return r9;
    L_0x0042:
        r8 = move-exception;
        r9.close();	 Catch:{ IOException -> 0x0046 }
    L_0x0046:
        throw r8;
    L_0x0047:
        r9.close();	 Catch:{ IOException -> 0x004a }
    L_0x004a:
        r8 = 0;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfw.a(abmh$a, boolean):adfv");
    }

    public static abmh b() {
        return (abmh) g.get();
    }

    public final synchronized void a() {
        this.h.a();
        adfv adfv = this.f;
        this.f = null;
        if (adfv != null) {
            adfv.d();
            this.c.a(this.d);
            this.d = null;
        }
        adga adga = this.a;
        adga.a = false;
        adga.a((Activity) adga.d.get());
    }

    public final void a(int i) {
        adga adga = this.a;
        adga.c = i;
        adga.a((Activity) adga.d.get());
    }

    public final void a(a aVar) {
        try {
            final adfv a = adfw.a(aVar, false);
            if (a != null) {
                this.e = this.c.a(new kor(koj.PLAYING, adfa.a.callsite("MediaPlayerJingleService"), new kox(kox.a.AUDIO_DECODER, (byte) 0)));
                a.a.setOnCompletionListener(new 2());
                this.b.add(a.a);
                a.a(new OnPreparedListener() {
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        a.a(1.0f);
                        a.b();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public final void a(Activity activity) {
        this.a.a(activity);
    }

    /* JADX WARNING: Missing block: B:23:0x0045, code skipped:
            return;
     */
    public final synchronized void b(final defpackage.abmh.a r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f;	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x001b;
    L_0x0005:
        r0 = r3.f;	 Catch:{ all -> 0x0048 }
        r0 = r0.b;	 Catch:{ all -> 0x0048 }
        r0 = r0.equals(r4);	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x001b;
    L_0x000f:
        r0 = r3.f;	 Catch:{ all -> 0x0048 }
        r0 = r0.c;	 Catch:{ all -> 0x0048 }
        r1 = r4.b();	 Catch:{ all -> 0x0048 }
        if (r0 != r1) goto L_0x001b;
    L_0x0019:
        monitor-exit(r3);
        return;
    L_0x001b:
        r3.a();	 Catch:{ all -> 0x0048 }
        r0 = 1;
        r0 = defpackage.adfw.a(r4, r0);	 Catch:{ Exception -> 0x0046 }
        if (r0 != 0) goto L_0x0027;
    L_0x0025:
        monitor-exit(r3);
        return;
    L_0x0027:
        r3.f = r0;	 Catch:{ Exception -> 0x0046 }
        r1 = new adfw$4;	 Catch:{ Exception -> 0x0046 }
        r1.<init>(r4);	 Catch:{ Exception -> 0x0046 }
        r0.a(r1);	 Catch:{ Exception -> 0x0046 }
        r0 = r4.c();	 Catch:{ Exception -> 0x0046 }
        if (r0 == 0) goto L_0x0044;
    L_0x0037:
        r0 = r3.h;	 Catch:{ Exception -> 0x0046 }
        r4 = r4.c();	 Catch:{ Exception -> 0x0046 }
        r1 = r4.longValue();	 Catch:{ Exception -> 0x0046 }
        r0.a(r1);	 Catch:{ Exception -> 0x0046 }
    L_0x0044:
        monitor-exit(r3);
        return;
    L_0x0046:
        monitor-exit(r3);
        return;
    L_0x0048:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfw.b(abmh$a):void");
    }
}
