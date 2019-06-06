package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.internal.zzce;
import com.google.android.gms.common.api.internal.zzdh;
import com.google.android.gms.common.api.internal.zzm;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzcyg;
import com.google.android.gms.internal.zzcyj;
import com.google.android.gms.internal.zzcyk;
import defpackage.iv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class GoogleApiClient {
    private static final Set<GoogleApiClient> zzfsv = Collections.newSetFromMap(new WeakHashMap());

    public static final class Builder {
        private final Context mContext;
        private Looper zzalj;
        private String zzehh;
        private Account zzeho;
        private final Set<Scope> zzfsw = new HashSet();
        private final Set<Scope> zzfsx = new HashSet();
        private int zzfsy;
        private View zzfsz;
        private String zzfta;
        private final Map<Api<?>, zzt> zzftb = new iv();
        private final Map<Api<?>, ApiOptions> zzftc = new iv();
        private zzce zzftd;
        private int zzfte = -1;
        private OnConnectionFailedListener zzftf;
        private GoogleApiAvailability zzftg = GoogleApiAvailability.getInstance();
        private zza<? extends zzcyj, zzcyk> zzfth = zzcyg.zzegv;
        private final ArrayList<ConnectionCallbacks> zzfti = new ArrayList();
        private final ArrayList<OnConnectionFailedListener> zzftj = new ArrayList();
        private boolean zzftk = false;

        public Builder(Context context) {
            this.mContext = context;
            this.zzalj = context.getMainLooper();
            this.zzehh = context.getPackageName();
            this.zzfta = context.getClass().getName();
        }

        public final Builder addApi(Api<? extends NotRequiredOptions> api) {
            zzbq.checkNotNull(api, "Api must not be null");
            this.zzftc.put(api, null);
            List zzr = api.zzahk().zzr(null);
            this.zzfsx.addAll(zzr);
            this.zzfsw.addAll(zzr);
            return this;
        }

        public final <O extends HasOptions> Builder addApi(Api<O> api, O o) {
            zzbq.checkNotNull(api, "Api must not be null");
            zzbq.checkNotNull(o, "Null options are not permitted for this Api");
            this.zzftc.put(api, o);
            List zzr = api.zzahk().zzr(o);
            this.zzfsx.addAll(zzr);
            this.zzfsw.addAll(zzr);
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x0170 in {5, 6, 10, 11, 12, 16, 18, 23, 24, 25, 27, 35, 36, 40} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final com.google.android.gms.common.api.GoogleApiClient build() {
            /*
            r22 = this;
            r1 = r22;
            r0 = r1.zzftc;
            r0 = r0.isEmpty();
            r2 = 1;
            r0 = r0 ^ r2;
            r3 = "must call addApi() to add at least one API";
            com.google.android.gms.common.internal.zzbq.checkArgument(r0, r3);
            r0 = r22.zzaic();
            r3 = 0;
            r11 = r0.zzamh();
            r12 = new iv;
            r12.<init>();
            r14 = new iv;
            r14.<init>();
            r15 = new java.util.ArrayList;
            r15.<init>();
            r4 = r1.zzftc;
            r4 = r4.keySet();
            r13 = r4.iterator();
            r16 = 0;
            r17 = 0;
            r4 = r13.hasNext();
            if (r4 == 0) goto L_0x00cb;
            r4 = r13.next();
            r10 = r4;
            r10 = (com.google.android.gms.common.api.Api) r10;
            r4 = r1.zzftc;
            r18 = r4.get(r10);
            r4 = r11.get(r10);
            if (r4 == 0) goto L_0x0050;
            r4 = 1;
            goto L_0x0051;
            r4 = 0;
            r5 = java.lang.Boolean.valueOf(r4);
            r12.put(r10, r5);
            r9 = new com.google.android.gms.common.api.internal.zzt;
            r9.<init>(r10, r4);
            r15.add(r9);
            r19 = r10.zzahl();
            r5 = r1.mContext;
            r6 = r1.zzalj;
            r4 = r19;
            r7 = r0;
            r8 = r18;
            r20 = r9;
            r21 = r10;
            r10 = r20;
            r4 = r4.zza(r5, r6, r7, r8, r9, r10);
            r5 = r21.zzahm();
            r14.put(r5, r4);
            r5 = r19.getPriority();
            if (r5 != r2) goto L_0x008b;
            if (r18 == 0) goto L_0x0088;
            r5 = 1;
            goto L_0x0089;
            r5 = 0;
            r17 = r5;
            r4 = r4.zzacn();
            if (r4 == 0) goto L_0x0035;
            if (r3 != 0) goto L_0x0096;
            r3 = r21;
            goto L_0x0035;
            r0 = new java.lang.IllegalStateException;
            r2 = r21.getName();
            r3 = r3.getName();
            r4 = java.lang.String.valueOf(r2);
            r4 = r4.length();
            r4 = r4 + 21;
            r5 = java.lang.String.valueOf(r3);
            r5 = r5.length();
            r4 = r4 + r5;
            r5 = new java.lang.StringBuilder;
            r5.<init>(r4);
            r5.append(r2);
            r2 = " cannot be used with ";
            r5.append(r2);
            r5.append(r3);
            r2 = r5.toString();
            r0.<init>(r2);
            throw r0;
            if (r3 == 0) goto L_0x0123;
            if (r17 != 0) goto L_0x00f9;
            r4 = r1.zzeho;
            if (r4 != 0) goto L_0x00d5;
            r4 = 1;
            goto L_0x00d6;
            r4 = 0;
            r5 = new java.lang.Object[r2];
            r6 = r3.getName();
            r5[r16] = r6;
            r6 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead";
            com.google.android.gms.common.internal.zzbq.zza(r4, r6, r5);
            r4 = r1.zzfsw;
            r5 = r1.zzfsx;
            r4 = r4.equals(r5);
            r5 = new java.lang.Object[r2];
            r3 = r3.getName();
            r5[r16] = r3;
            r3 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.";
            com.google.android.gms.common.internal.zzbq.zza(r4, r3, r5);
            goto L_0x0123;
            r0 = new java.lang.IllegalStateException;
            r2 = r3.getName();
            r3 = java.lang.String.valueOf(r2);
            r3 = r3.length();
            r3 = r3 + 82;
            r4 = new java.lang.StringBuilder;
            r4.<init>(r3);
            r3 = "With using ";
            r4.append(r3);
            r4.append(r2);
            r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder";
            r4.append(r2);
            r2 = r4.toString();
            r0.<init>(r2);
            throw r0;
            r3 = r14.values();
            r16 = com.google.android.gms.common.api.internal.zzba.zza(r3, r2);
            r2 = new com.google.android.gms.common.api.internal.zzba;
            r5 = r1.mContext;
            r6 = new java.util.concurrent.locks.ReentrantLock;
            r6.<init>();
            r7 = r1.zzalj;
            r9 = r1.zzftg;
            r10 = r1.zzfth;
            r3 = r1.zzfti;
            r13 = r1.zzftj;
            r11 = r1.zzfte;
            r18 = 0;
            r4 = r2;
            r8 = r0;
            r0 = r11;
            r11 = r12;
            r12 = r3;
            r3 = r15;
            r15 = r0;
            r17 = r3;
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
            r3 = com.google.android.gms.common.api.GoogleApiClient.zzfsv;
            monitor-enter(r3);
            r0 = com.google.android.gms.common.api.GoogleApiClient.zzfsv;	 Catch:{ all -> 0x016d }
            r0.add(r2);	 Catch:{ all -> 0x016d }
            monitor-exit(r3);	 Catch:{ all -> 0x016d }
            r0 = r1.zzfte;
            if (r0 < 0) goto L_0x016c;
            r0 = r1.zzftd;
            r0 = com.google.android.gms.common.api.internal.zzi.zza(r0);
            r3 = r1.zzfte;
            r4 = r1.zzftf;
            r0.zza(r3, r2, r4);
            return r2;
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x016d }
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient$Builder.build():com.google.android.gms.common.api.GoogleApiClient");
        }

        public final Builder setHandler(Handler handler) {
            zzbq.checkNotNull(handler, "Handler must not be null");
            this.zzalj = handler.getLooper();
            return this;
        }

        public final zzr zzaic() {
            zzcyk zzcyk = zzcyk.zzklp;
            if (this.zzftc.containsKey(zzcyg.API)) {
                zzcyk = (zzcyk) this.zzftc.get(zzcyg.API);
            }
            return new zzr(this.zzeho, this.zzfsw, this.zzftb, this.zzfsy, this.zzfsz, this.zzehh, this.zzfta, zzcyk);
        }
    }

    public interface ConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isConnected();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public <C extends zze> C zza(zzc<C> zzc) {
        throw new UnsupportedOperationException();
    }

    public void zza(zzdh zzdh) {
        throw new UnsupportedOperationException();
    }

    public void zzb(zzdh zzdh) {
        throw new UnsupportedOperationException();
    }

    public <A extends zzb, R extends Result, T extends zzm<R, A>> T zzd(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends zzb, T extends zzm<? extends Result, A>> T zze(T t) {
        throw new UnsupportedOperationException();
    }
}
