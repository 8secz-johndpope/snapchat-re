package com.brightcove.player.display.tasks;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.HttpService;
import com.brightcove.player.util.ErrorUtil;
import java.lang.ref.WeakReference;
import java.net.URI;

@ListensFor(events = {})
@Emits(events = {"didSetVideoStill"})
public class LoadImageTask extends AsyncTask<URI, Void, Bitmap> implements Component {
    public static final String TAG = "LoadImageTask";
    private EventEmitter a;
    private HttpService b;
    private final WeakReference<ImageView> c;
    private String d;
    private int e = 17301532;

    public LoadImageTask(ImageView imageView, EventEmitter eventEmitter) {
        if (imageView == null || eventEmitter == null) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.IMAGE_VIEW_AND_EVENT_EMITTER_REQUIRED));
        }
        this.a = RegisteringEventEmitter.build(eventEmitter, LoadImageTask.class);
        this.c = new WeakReference(imageView);
        this.b = new HttpService();
    }

    @SuppressLint({"NewApi"})
    private static int a(Bitmap bitmap) {
        try {
            return bitmap.getByteCount();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A:{Catch:{ Exception -> 0x005a }} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A:{Catch:{ Exception -> 0x005a }} */
    private android.graphics.Bitmap a(java.net.URI... r7) {
        /*
        r6 = this;
        if (r7 == 0) goto L_0x0071;
    L_0x0002:
        r0 = r7.length;
        if (r0 == 0) goto L_0x0071;
    L_0x0005:
        r0 = 0;
        r1 = r7[r0];
        if (r1 == 0) goto L_0x0071;
    L_0x000a:
        r1 = 0;
        r2 = r7[r0];	 Catch:{ Exception -> 0x005a }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x005a }
        r4 = 13;
        if (r3 < r4) goto L_0x0045;
    L_0x0013:
        r3 = r6.c;	 Catch:{ Exception -> 0x005a }
        r3 = r3.get();	 Catch:{ Exception -> 0x005a }
        r3 = (android.widget.ImageView) r3;	 Catch:{ Exception -> 0x005a }
        if (r3 == 0) goto L_0x0039;
    L_0x001d:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x005a }
        r5 = 17;
        if (r4 < r5) goto L_0x0028;
    L_0x0023:
        r3 = r3.getDisplay();	 Catch:{ Exception -> 0x005a }
        goto L_0x003a;
    L_0x0028:
        r3 = r3.getContext();	 Catch:{ Exception -> 0x005a }
        r4 = "window";
        r3 = r3.getSystemService(r4);	 Catch:{ Exception -> 0x005a }
        r3 = (android.view.WindowManager) r3;	 Catch:{ Exception -> 0x005a }
        r3 = r3.getDefaultDisplay();	 Catch:{ Exception -> 0x005a }
        goto L_0x003a;
    L_0x0039:
        r3 = r1;
    L_0x003a:
        if (r3 == 0) goto L_0x0045;
    L_0x003c:
        r4 = new android.graphics.Point;	 Catch:{ Exception -> 0x005a }
        r4.<init>();	 Catch:{ Exception -> 0x005a }
        r3.getSize(r4);	 Catch:{ Exception -> 0x005a }
        goto L_0x0046;
    L_0x0045:
        r4 = r1;
    L_0x0046:
        if (r4 == 0) goto L_0x0053;
    L_0x0048:
        r3 = r6.b;	 Catch:{ Exception -> 0x005a }
        r5 = r4.x;	 Catch:{ Exception -> 0x005a }
        r4 = r4.y;	 Catch:{ Exception -> 0x005a }
        r1 = r3.doImageGetRequest(r2, r5, r4);	 Catch:{ Exception -> 0x005a }
        goto L_0x0070;
    L_0x0053:
        r3 = r6.b;	 Catch:{ Exception -> 0x005a }
        r1 = r3.doImageGetRequest(r2);	 Catch:{ Exception -> 0x005a }
        goto L_0x0070;
    L_0x005a:
        r2 = move-exception;
        r3 = TAG;
        r4 = new java.lang.StringBuilder;
        r5 = "error encountered in loading image: ";
        r4.<init>(r5);
        r7 = r7[r0];
        r4.append(r7);
        r7 = r4.toString();
        android.util.Log.e(r3, r7, r2);
    L_0x0070:
        return r1;
    L_0x0071:
        r7 = new java.lang.IllegalArgumentException;
        r0 = "urlRequired";
        r0 = com.brightcove.player.util.ErrorUtil.getMessage(r0);
        r7.<init>(r0);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.display.tasks.LoadImageTask.a(java.net.URI[]):android.graphics.Bitmap");
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((URI[]) objArr);
    }

    public String getSuccessEventType() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (VERSION.SDK_INT >= 12 && bitmap != null) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("onPostExecute: byte count = ");
            stringBuilder.append(a(bitmap));
            Log.v(str, stringBuilder.toString());
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(0);
                imageView.requestLayout();
                String str2 = this.d;
                if (str2 != null) {
                    this.a.emit(str2);
                    return;
                }
            }
            imageView.setImageResource(this.e);
        }
    }

    public void setSuccessEventType(String str) {
        this.d = str;
    }
}
