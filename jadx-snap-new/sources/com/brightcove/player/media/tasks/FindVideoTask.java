package com.brightcove.player.media.tasks;

import com.brightcove.player.event.Component;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.media.MediaService;
import java.util.Map;

@ListensFor(events = {})
@Emits(events = {})
@Deprecated
public class FindVideoTask extends FindMediaTask implements Component {
    public FindVideoTask(EventEmitter eventEmitter, Event event, String str, Map<String, String> map) {
        super(eventEmitter, event, str, map);
    }

    public void findVideoById(String str) {
        executeWithCommand(MediaService.FIND_VIDEO_BY_ID, MediaService.VIDEO_ID, str);
    }

    public void findVideoByReferenceId(String str) {
        executeWithCommand(MediaService.FIND_VIDEO_BY_REFERENCE_ID, MediaService.REFERENCE_ID, str);
    }

    /* Access modifiers changed, original: protected|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0091  */
    public /* synthetic */ void onPostExecute(java.lang.Object r7) {
        /*
        r6 = this;
        r7 = (org.json.JSONObject) r7;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = r6.b;
        r3 = "catalogUrl";
        r1.put(r3, r2);
        r2 = java.lang.System.currentTimeMillis();
        r4 = r6.d;
        r2 = r2 - r4;
        r2 = java.lang.Long.valueOf(r2);
        r3 = "responseTimeMs";
        r1.put(r3, r2);
        r2 = r6.a;
        r3 = "analyticsCatalogResponse";
        r2.emit(r3, r1);
        if (r7 != 0) goto L_0x0040;
    L_0x002c:
        r7 = new java.lang.StringBuilder;
        r1 = "No data was found that matched your request. ";
        r7.<init>(r1);
        r1 = r6.b;
        r7.append(r1);
        r7 = r7.toString();
    L_0x003c:
        r0.add(r7);
        goto L_0x008b;
    L_0x0040:
        r1 = "error";
        r2 = r7.isNull(r1);
        r3 = "mediaRequestInvalidJSON";
        r4 = 0;
        r5 = 1;
        if (r2 != 0) goto L_0x005f;
    L_0x004c:
        r7 = r7.getString(r1);	 Catch:{ JSONException -> 0x0054 }
        r0.add(r7);	 Catch:{ JSONException -> 0x0054 }
        goto L_0x008b;
    L_0x0054:
        r7 = com.brightcove.player.util.ErrorUtil.getMessage(r3);
        r1 = new java.lang.Object[r5];
        r2 = r6.b;
        r1[r4] = r2;
        goto L_0x0086;
    L_0x005f:
        r1 = r6.a;	 Catch:{ JSONException -> 0x007c, IllegalArgumentException -> 0x006f }
        r7 = com.brightcove.player.media.MediaService.buildVideoFromJSON(r7, r1, r0);	 Catch:{ JSONException -> 0x007c, IllegalArgumentException -> 0x006f }
        r1 = r6.c;	 Catch:{ JSONException -> 0x007c, IllegalArgumentException -> 0x006f }
        r1 = r1.properties;	 Catch:{ JSONException -> 0x007c, IllegalArgumentException -> 0x006f }
        r2 = "video";
        r1.put(r2, r7);	 Catch:{ JSONException -> 0x007c, IllegalArgumentException -> 0x006f }
        goto L_0x008b;
    L_0x006f:
        r7 = "mediaRequestNoJSON";
        r7 = com.brightcove.player.util.ErrorUtil.getMessage(r7);
        r1 = new java.lang.Object[r5];
        r2 = r6.b;
        r1[r4] = r2;
        goto L_0x0086;
    L_0x007c:
        r7 = com.brightcove.player.util.ErrorUtil.getMessage(r3);
        r1 = new java.lang.Object[r5];
        r2 = r6.b;
        r1[r4] = r2;
    L_0x0086:
        r7 = java.lang.String.format(r7, r1);
        goto L_0x003c;
    L_0x008b:
        r7 = r0.isEmpty();
        if (r7 != 0) goto L_0x009a;
    L_0x0091:
        r7 = r6.c;
        r7 = r7.properties;
        r1 = "errors";
        r7.put(r1, r0);
    L_0x009a:
        r7 = r6.a;
        r0 = r6.c;
        r7.respond(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.tasks.FindVideoTask.onPostExecute(java.lang.Object):void");
    }
}
