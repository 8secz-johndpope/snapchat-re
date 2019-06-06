package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import java.util.List;

final class MediaBrowserServiceCompatApi21 {

    static class MediaBrowserServiceAdaptor extends MediaBrowserService {
        public BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
            }
            c cVar = null;
            a a = cVar.a();
            return a == null ? cVar : new BrowserRoot(a.a, a.b);
        }

        public void onLoadChildren(String str, Result<List<MediaItem>> result) {
            b bVar = new b(result);
        }
    }

    static class a {
        final String a;
        final Bundle b;
    }

    static class b<T> {
        private Result a;

        b(Result result) {
            this.a = result;
        }
    }

    public interface c {
        a a();
    }
}
