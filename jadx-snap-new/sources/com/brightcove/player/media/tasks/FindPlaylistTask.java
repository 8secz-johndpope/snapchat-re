package com.brightcove.player.media.tasks;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.MediaService;
import java.util.Map;

@Deprecated
public class FindPlaylistTask extends FindMediaTask {
    public FindPlaylistTask(EventEmitter eventEmitter, Event event, String str, Map<String, String> map) {
        super(eventEmitter, event, str, map);
    }

    public void findPlaylistById(String str) {
        executeWithCommand(MediaService.FIND_PLAYLIST_BY_ID, MediaService.PLAYLIST_ID, str);
    }

    public void findPlaylistByReferenceId(String str) {
        executeWithCommand(MediaService.FIND_PLAYLIST_BY_REFERENCE_ID, MediaService.REFERENCE_ID, str);
    }

    /* Access modifiers changed, original: protected|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    public /* synthetic */ void onPostExecute(java.lang.Object r7) {
        /*
        r6 = this;
        r7 = (org.json.JSONObject) r7;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
        r2 = 1;
        if (r7 != 0) goto L_0x001f;
    L_0x000b:
        r7 = "mediaRequestNoResults";
        r7 = com.brightcove.player.util.ErrorUtil.getMessage(r7);
        r2 = new java.lang.Object[r2];
        r3 = r6.b;
        r2[r1] = r3;
    L_0x0017:
        r7 = java.lang.String.format(r7, r2);
        r0.add(r7);
        goto L_0x0064;
    L_0x001f:
        r3 = "error";
        r4 = r7.isNull(r3);
        r5 = "mediaRequestInvalidJSON";
        if (r4 != 0) goto L_0x003c;
    L_0x0029:
        r7 = r7.getString(r3);	 Catch:{ JSONException -> 0x0031 }
        r0.add(r7);	 Catch:{ JSONException -> 0x0031 }
        goto L_0x0064;
    L_0x0031:
        r7 = com.brightcove.player.util.ErrorUtil.getMessage(r5);
        r2 = new java.lang.Object[r2];
        r3 = r6.b;
        r2[r1] = r3;
        goto L_0x0017;
    L_0x003c:
        r3 = r6.a;	 Catch:{ JSONException -> 0x0059, IllegalArgumentException -> 0x004c }
        r7 = com.brightcove.player.media.MediaService.buildPlaylistFromJSON(r7, r3, r0);	 Catch:{ JSONException -> 0x0059, IllegalArgumentException -> 0x004c }
        r3 = r6.c;	 Catch:{ JSONException -> 0x0059, IllegalArgumentException -> 0x004c }
        r3 = r3.properties;	 Catch:{ JSONException -> 0x0059, IllegalArgumentException -> 0x004c }
        r4 = "playlist";
        r3.put(r4, r7);	 Catch:{ JSONException -> 0x0059, IllegalArgumentException -> 0x004c }
        goto L_0x0064;
    L_0x004c:
        r7 = "mediaRequestNoJSON";
        r7 = com.brightcove.player.util.ErrorUtil.getMessage(r7);
        r2 = new java.lang.Object[r2];
        r3 = r6.b;
        r2[r1] = r3;
        goto L_0x0017;
    L_0x0059:
        r7 = com.brightcove.player.util.ErrorUtil.getMessage(r5);
        r2 = new java.lang.Object[r2];
        r3 = r6.b;
        r2[r1] = r3;
        goto L_0x0017;
    L_0x0064:
        r7 = r0.isEmpty();
        if (r7 != 0) goto L_0x0073;
    L_0x006a:
        r7 = r6.c;
        r7 = r7.properties;
        r1 = "errors";
        r7.put(r1, r0);
    L_0x0073:
        r7 = r6.a;
        r0 = r6.c;
        r7.respond(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.tasks.FindPlaylistTask.onPostExecute(java.lang.Object):void");
    }
}
