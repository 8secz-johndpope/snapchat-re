package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.service.media.MediaBrowserService.Result;
import android.util.Log;
import java.util.List;

final class MediaBrowserServiceCompatApi26 {

    static class a {
        private Result a;

        a(Result result) {
            this.a = result;
        }
    }

    static class MediaBrowserServiceAdaptor extends MediaBrowserServiceAdaptor {
        public void onLoadChildren(String str, Result<List<MediaItem>> result, Bundle bundle) {
            a aVar = new a(result);
        }
    }

    static {
        try {
            Result.class.getDeclaredField("mFlags").setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi26", e);
        }
    }
}
