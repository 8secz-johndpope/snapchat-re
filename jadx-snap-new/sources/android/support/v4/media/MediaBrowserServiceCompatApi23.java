package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.service.media.MediaBrowserService.Result;

final class MediaBrowserServiceCompatApi23 {

    static class MediaBrowserServiceAdaptor extends MediaBrowserServiceAdaptor {
        public void onLoadItem(String str, Result<MediaItem> result) {
            b bVar = new b(result);
        }
    }
}
