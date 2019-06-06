package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: bkz */
public class bkz implements blv {
    private final Context a;
    private final bnd<bnf> b;
    private final int c;
    private final long d;

    public bkz(Context context) {
        this(context, (byte) 0);
    }

    private bkz(Context context, byte b) {
        this(context, 0);
    }

    @Deprecated
    private bkz(Context context, char c) {
        this.a = context;
        this.c = 0;
        this.d = 5000;
        this.b = null;
    }

    /* Access modifiers changed, original: protected */
    public void a(Context context, bnd<bnf> bnd, long j, Handler handler, bzx bzx, int i, ArrayList<bls> arrayList) {
        int i2 = i;
        ArrayList<bls> arrayList2 = arrayList;
        arrayList2.add(new bzu(context, bqm.a, 5000, bnd, handler, bzx));
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (bls) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, bzx.class, Integer.TYPE}).newInstance(new Object[]{Boolean.TRUE, Long.valueOf(5000), handler, bzx, Integer.valueOf(50)}));
                Log.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
    }

    public final bls[] a(Handler handler, bzx bzx, bmg bmg, bvh bvh, bqu bqu, bnd<bnf> bnd) {
        BroadcastReceiver broadcastReceiver = bnd == null ? null : bnd;
        ArrayList arrayList = new ArrayList();
        a(this.a, broadcastReceiver, 5000, handler, bzx, 0, arrayList);
        Context context = this.a;
        bmf[] bmfArr = new bmf[0];
        bqm bqm = bqm.a;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        bme bme = (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? bme.a : new bme(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
        arrayList.add(new bmo(context, bqm, broadcastReceiver, false, handler, bmg, bme, bmfArr));
        arrayList.add(new bvi(bvh, handler.getLooper()));
        arrayList.add(new bqv(bqu, handler.getLooper()));
        return (bls[]) arrayList.toArray(new bls[arrayList.size()]);
    }
}
