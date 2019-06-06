package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbt;

final class zzyh implements OnClickListener {
    private /* synthetic */ String zzclo;
    private /* synthetic */ String zzclp;
    private /* synthetic */ zzyg zzclq;

    zzyh(zzyg zzyg, String str, String str2) {
        this.zzclq = zzyg;
        this.zzclo = str;
        this.zzclp = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.zzclq.mContext.getSystemService("download");
        try {
            String str = this.zzclo;
            String str2 = this.zzclp;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzbt.zzen().zza(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzclq.zzbm("Could not store picture.");
        }
    }
}
