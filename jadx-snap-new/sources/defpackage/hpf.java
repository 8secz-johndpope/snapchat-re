package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StorySnapModel;
import defpackage.sbm.a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@ftr(a = "discover_thumb/*/#/#")
/* renamed from: hpf */
public final class hpf extends ggm {
    private final Map<String, String> a = ajzl.a(new ajxm("__xsc_local__media_type", "thumbnails"));
    private final hpe b;
    private final gee c;

    public hpf(hpe hpe, gee gee) {
        akcr.b(hpe, "discoverFeedThumbnailContentType");
        akcr.b(gee, "contentManager");
        this.b = hpe;
        this.c = gee;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        gew gew;
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        Set<rzg> set3 = set;
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object obj = (String) uri.getPathSegments().get(1);
        int parseInt = Integer.parseInt((String) uri.getPathSegments().get(2));
        int parseInt2 = Integer.parseInt((String) uri.getPathSegments().get(3));
        String str = "mediaKey";
        Object queryParameter = uri.getQueryParameter(str);
        Object queryParameter2 = uri.getQueryParameter("mediaIv");
        ghm c = gii.c(new ggh("null".equals(queryParameter) ? null : queryParameter, queryParameter2).b(), null, 2);
        akcr.a(obj, "url");
        if (akgc.a((CharSequence) obj, (CharSequence) "bq/auth_story_thumbnail", false)) {
            akcr.a(queryParameter, str);
            akcr.a(queryParameter2, "iv");
            gfl gfl = c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(queryParameter);
            stringBuilder.append('~');
            stringBuilder.append(parseInt);
            stringBuilder.append('~');
            stringBuilder.append(parseInt2);
            String stringBuilder2 = stringBuilder.toString();
            Builder buildUpon = Uri.parse(obj).buildUpon();
            buildUpon.appendQueryParameter("width", String.valueOf(parseInt));
            buildUpon.appendQueryParameter("height", String.valueOf(parseInt2));
            buildUpon.appendQueryParameter(str, queryParameter);
            buildUpon.appendQueryParameter(StorySnapModel.THUMBNAILIV, queryParameter2);
            queryParameter2 = buildUpon.build().toString();
            akcr.a(queryParameter2, "Uri.parse(url).buildUpon…              .toString()");
            a aVar = new a(queryParameter2, sac.POST);
            afdo afdo = new afdo();
            afdo.a = Collections.singletonList(queryParameter);
            gew = new gew(stringBuilder2, aVar.b(new gma(afdo)).c(this.a).e(), null, gfl, this.b, set, set2, 268);
        } else {
            gew gew2 = new gew(obj, new a(obj, sac.GET).c(this.a).e(), null, c, this.b, set, set2, 268);
        }
        queryParameter2 = this.c.a(gew).a(z);
        akcr.a(queryParameter2, "contentManager.submit(re…tResult(closeOnTerminate)");
        return queryParameter2;
    }
}
