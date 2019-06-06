package com.brightcove.player.edge;

import com.brightcove.player.event.Component;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import defpackage.ya;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@ListensFor(events = {})
@Emits(events = {})
public class GetVideoTask extends ya implements Component {
    private VideoListener f;
    private long g;

    static {
        GetVideoTask.class.getSimpleName();
    }

    public GetVideoTask(EventEmitter eventEmitter, String str, Map<String, String> map, String str2, String str3) {
        super(eventEmitter, str, map, str2, str3);
    }

    private void a(URI uri) {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.CATALOG_URL, uri);
        this.a.emit(EventType.ANALYTICS_CATALOG_REQUEST, hashMap);
        this.g = System.currentTimeMillis();
    }

    public void getById(String str, VideoListener videoListener) {
        this.f = videoListener;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append("/accounts/");
            stringBuilder.append(this.c);
            stringBuilder.append("/videos/");
            stringBuilder.append(str);
            execute(new URI[]{new URI(stringBuilder.toString())});
            a(r4);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void getByReferenceId(String str, VideoListener videoListener) {
        this.f = videoListener;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b);
            stringBuilder.append("/accounts/");
            stringBuilder.append(this.c);
            stringBuilder.append("/videos/ref:");
            stringBuilder.append(str);
            execute(new URI[]{new URI(stringBuilder.toString())});
            a(r4);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /* Access modifiers changed, original: protected|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    public /* synthetic */ void onPostExecute(java.lang.Object r7) {
        /*
        r6 = this;
        r0 = "message";
        r7 = (org.json.JSONObject) r7;
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = r6.d;
        r3 = "catalogUrl";
        r1.put(r3, r2);
        r2 = java.lang.System.currentTimeMillis();
        r4 = r6.g;
        r2 = r2 - r4;
        r2 = java.lang.Long.valueOf(r2);
        r3 = "responseTimeMs";
        r1.put(r3, r2);
        r2 = r6.a;
        r3 = "analyticsCatalogResponse";
        r2.emit(r3, r1);
        if (r7 == 0) goto L_0x0086;
    L_0x0029:
        r2 = 0;
        r3 = 1;
        r4 = "error_code";
        r4 = r7.isNull(r4);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        if (r4 != 0) goto L_0x0054;
    L_0x0033:
        r1.clear();	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r4 = java.util.Collections.emptySet();	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r6.a(r7, r1, r4);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r4 = r6.a;	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r5 = "error";
        r4.emit(r5, r1);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r1 = r7.isNull(r0);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        if (r1 != 0) goto L_0x009b;
    L_0x004a:
        r7 = r7.getString(r0);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r0 = r6.f;	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r0.onError(r7);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        goto L_0x009b;
    L_0x0054:
        r7 = r6.b(r7);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r0 = r6.f;	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        r0.onVideo(r7);	 Catch:{ JSONException -> 0x006c, IllegalArgumentException -> 0x005e }
        goto L_0x009b;
    L_0x005e:
        r7 = move-exception;
        r0 = "mediaRequestNoJSON";
        r0 = com.brightcove.player.util.ErrorUtil.getMessage(r0);
        r1 = new java.lang.Object[r3];
        r3 = r6.d;
        r1[r2] = r3;
        goto L_0x0079;
    L_0x006c:
        r7 = move-exception;
        r0 = "mediaRequestInvalidJSON";
        r0 = com.brightcove.player.util.ErrorUtil.getMessage(r0);
        r1 = new java.lang.Object[r3];
        r3 = r6.d;
        r1[r2] = r3;
    L_0x0079:
        r0 = java.lang.String.format(r0, r1);
        r1 = r6.e;
        r1.add(r0);
        r6.a(r0, r7);
        goto L_0x009b;
    L_0x0086:
        r7 = r6.e;
        r0 = new java.lang.StringBuilder;
        r1 = "No data was found that matched your request: ";
        r0.<init>(r1);
        r1 = r6.d;
        r0.append(r1);
        r0 = r0.toString();
        r7.add(r0);
    L_0x009b:
        r7 = r6.e;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x00bb;
    L_0x00a3:
        r7 = r6.e;
        r7 = r7.iterator();
    L_0x00a9:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00bb;
    L_0x00af:
        r0 = r7.next();
        r0 = (java.lang.String) r0;
        r1 = r6.f;
        r1.onError(r0);
        goto L_0x00a9;
    L_0x00bb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.edge.GetVideoTask.onPostExecute(java.lang.Object):void");
    }
}
