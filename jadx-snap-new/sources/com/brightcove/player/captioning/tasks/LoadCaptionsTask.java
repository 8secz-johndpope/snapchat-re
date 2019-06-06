package com.brightcove.player.captioning.tasks;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.CaptionType;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.model.WebVTTDocument;
import java.io.InputStream;
import java.util.HashMap;

@ListensFor(events = {})
@Emits(events = {"didLoadClosedCaptions", "closedCaptioningError"})
public class LoadCaptionsTask extends AsyncTask<Uri, Void, Void> implements Component {
    private static final String c = "LoadCaptionsTask";
    TTMLDocument a;
    WebVTTDocument b;
    private EventEmitter d;
    private String e;
    private Exception f;
    private CaptionType g;
    private ContentResolver h;

    /* renamed from: com.brightcove.player.captioning.tasks.LoadCaptionsTask$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[CaptionType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.brightcove.player.media.CaptionType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.brightcove.player.media.CaptionType.WEBVTT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.brightcove.player.media.CaptionType.TTML;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.captioning.tasks.LoadCaptionsTask$AnonymousClass3.<clinit>():void");
        }
    }

    public interface ResponseStreamListener {
        void onStreamReady(InputStream inputStream);
    }

    public LoadCaptionsTask(EventEmitter eventEmitter, ContentResolver contentResolver, CaptionType captionType) {
        if (eventEmitter != null) {
            this.d = RegisteringEventEmitter.build(eventEmitter, LoadCaptionsTask.class);
            this.h = contentResolver;
            this.g = captionType;
            return;
        }
        throw new IllegalArgumentException("must provide an EventEmitter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A:{ExcHandler: IOException (e java.io.IOException), Splitter:B:9:0x0033} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0033, B:15:0x0046] */
    /* JADX WARNING: Missing block: B:17:0x0051, code skipped:
            r7 = e;
     */
    /* JADX WARNING: Missing block: B:18:0x0052, code skipped:
            r0 = "unexpected exception parsing WebVTT response";
     */
    /* JADX WARNING: Missing block: B:20:0x0057, code skipped:
            r7 = e;
     */
    /* JADX WARNING: Missing block: B:21:0x0058, code skipped:
            r6.e = r4;
     */
    private java.lang.Void a(android.net.Uri... r7) {
        /*
        r6 = this;
        r0 = r7.length;
        r1 = 1;
        if (r0 != r1) goto L_0x0060;
    L_0x0004:
        r0 = 0;
        r2 = r7[r0];
        if (r2 == 0) goto L_0x0060;
    L_0x0009:
        r2 = 0;
        r6.e = r2;
        r3 = com.brightcove.player.captioning.tasks.LoadCaptionsTask.AnonymousClass3.a;
        r4 = r6.g;
        r4 = r4.ordinal();
        r3 = r3[r4];
        r4 = "exception while issuing HTTP request";
        if (r3 == r1) goto L_0x0046;
    L_0x001a:
        r5 = 2;
        if (r3 == r5) goto L_0x0033;
    L_0x001d:
        r7 = c;
        r0 = new java.lang.StringBuilder;
        r1 = "Unexpected captions type: ";
        r0.<init>(r1);
        r1 = r6.g;
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.e(r7, r0);
        goto L_0x005f;
    L_0x0033:
        r7 = r7[r0];	 Catch:{ IOException -> 0x0057, XmlPullParserException -> 0x0042, Exception -> 0x003e }
        r0 = new com.brightcove.player.captioning.tasks.LoadCaptionsTask$2;	 Catch:{ IOException -> 0x0057, XmlPullParserException -> 0x0042, Exception -> 0x003e }
        r0.<init>();	 Catch:{ IOException -> 0x0057, XmlPullParserException -> 0x0042, Exception -> 0x003e }
        r6.a(r7, r0);	 Catch:{ IOException -> 0x0057, XmlPullParserException -> 0x0042, Exception -> 0x003e }
        goto L_0x005f;
    L_0x003e:
        r7 = move-exception;
        r0 = "unexpected exception parsing DFXP TTML response";
        goto L_0x0054;
    L_0x0042:
        r7 = move-exception;
        r0 = "exception parsing DFXP TTML response";
        goto L_0x0054;
    L_0x0046:
        r7 = r7[r0];	 Catch:{ IOException -> 0x0057, Exception -> 0x0051 }
        r0 = new com.brightcove.player.captioning.tasks.LoadCaptionsTask$1;	 Catch:{ IOException -> 0x0057, Exception -> 0x0051 }
        r0.<init>();	 Catch:{ IOException -> 0x0057, Exception -> 0x0051 }
        r6.a(r7, r0);	 Catch:{ IOException -> 0x0057, Exception -> 0x0051 }
        goto L_0x005f;
    L_0x0051:
        r7 = move-exception;
        r0 = "unexpected exception parsing WebVTT response";
    L_0x0054:
        r6.e = r0;
        goto L_0x005a;
    L_0x0057:
        r7 = move-exception;
        r6.e = r4;
    L_0x005a:
        r6.f = r7;
        r6.cancel(r1);
    L_0x005f:
        return r2;
    L_0x0060:
        r7 = new java.lang.IllegalArgumentException;
        r0 = "must provide a single URI argument";
        r7.<init>(r0);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.captioning.tasks.LoadCaptionsTask.a(android.net.Uri[]):java.lang.Void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    private void a(android.net.Uri r5, com.brightcove.player.captioning.tasks.LoadCaptionsTask.ResponseStreamListener r6) {
        /*
        r4 = this;
        if (r5 == 0) goto L_0x004e;
    L_0x0002:
        r0 = r4.h;	 Catch:{ FileNotFoundException -> 0x000c }
        r0 = r0.openInputStream(r5);	 Catch:{ FileNotFoundException -> 0x000c }
        r6.onStreamReady(r0);	 Catch:{ FileNotFoundException -> 0x000c }
        return;
    L_0x000c:
        r0 = new java.net.URI;
        r5 = r5.toString();
        r0.<init>(r5);
        r5 = r0.toURL();
        r0 = 0;
        r1 = c;
        r2 = new java.lang.StringBuilder;
        r3 = "issuing GET request: ";
        r2.<init>(r3);
        r3 = r5.toString();
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.d(r1, r2);
        r5 = r5.openConnection();	 Catch:{ all -> 0x0046 }
        r5 = (java.net.HttpURLConnection) r5;	 Catch:{ all -> 0x0046 }
        r0 = r5.getInputStream();	 Catch:{ all -> 0x0044 }
        r6.onStreamReady(r0);	 Catch:{ all -> 0x0044 }
        if (r5 == 0) goto L_0x0043;
    L_0x0040:
        r5.disconnect();
    L_0x0043:
        return;
    L_0x0044:
        r6 = move-exception;
        goto L_0x0048;
    L_0x0046:
        r6 = move-exception;
        r5 = r0;
    L_0x0048:
        if (r5 == 0) goto L_0x004d;
    L_0x004a:
        r5.disconnect();
    L_0x004d:
        throw r6;
    L_0x004e:
        r5 = new java.lang.IllegalArgumentException;
        r6 = "must provide a valid Uri";
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.captioning.tasks.LoadCaptionsTask.a(android.net.Uri, com.brightcove.player.captioning.tasks.LoadCaptionsTask$ResponseStreamListener):void");
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Uri[]) objArr);
    }

    /* Access modifiers changed, original: protected */
    public void onCancelled() {
        String str = this.e;
        if (str != null) {
            Log.e(c, str, this.f);
            HashMap hashMap = new HashMap();
            hashMap.put(Event.ERROR_MESSAGE, str);
            Exception exception = this.f;
            if (exception != null) {
                hashMap.put("error", exception);
            }
            this.d.emit(EventType.CLOSED_CAPTIONING_ERROR, hashMap);
        }
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ void onPostExecute(Object obj) {
        Object obj2;
        Object obj3;
        HashMap hashMap = new HashMap();
        if (this.g == CaptionType.TTML) {
            obj2 = this.a;
            if (obj2 != null) {
                obj3 = Event.TTML_DOCUMENT;
            }
            this.d.emit(EventType.DID_LOAD_CLOSED_CAPTIONS, hashMap);
        }
        if (this.g == CaptionType.WEBVTT) {
            obj2 = this.b;
            if (obj2 != null) {
                obj3 = Event.WEBVTT_DOCUMENT;
            }
        }
        this.d.emit(EventType.DID_LOAD_CLOSED_CAPTIONS, hashMap);
        hashMap.put(obj3, obj2);
        this.d.emit(EventType.DID_LOAD_CLOSED_CAPTIONS, hashMap);
    }
}
