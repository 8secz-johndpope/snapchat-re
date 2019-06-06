package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.util.Log;
import defpackage.fu;
import defpackage.ie;
import defpackage.if;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class MediaControllerCompat {

    static class MediaControllerImplApi21 {
        final List<a> a;
        if b;

        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            /* Access modifiers changed, original: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                WeakReference weakReference = null;
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) weakReference.get();
                if (!(mediaControllerImplApi21 == null || bundle == null)) {
                    if ifVar;
                    IBinder a = fu.a(bundle, "android.support.v4.media.session.EXTRA_BINDER");
                    if (a == null) {
                        ifVar = weakReference;
                    } else {
                        IInterface queryLocalInterface = a.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        ifVar = (queryLocalInterface == null || !(queryLocalInterface instanceof if)) ? new defpackage.if.a.a(a) : (if) queryLocalInterface;
                    }
                    mediaControllerImplApi21.b = ifVar;
                    if (mediaControllerImplApi21.b != null) {
                        synchronized (mediaControllerImplApi21.a) {
                            for (a aVar : mediaControllerImplApi21.a) {
                                ie aVar2 = new a(aVar);
                                weakReference.put(aVar, aVar2);
                                aVar.a = true;
                                try {
                                    mediaControllerImplApi21.b.a(aVar2);
                                } catch (RemoteException e) {
                                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                                }
                            }
                            mediaControllerImplApi21.a.clear();
                        }
                    }
                }
            }
        }

        static class a extends b {
            a(a aVar) {
                super(aVar);
            }

            public final void a() {
                throw new AssertionError();
            }

            public final void a(Bundle bundle) {
                throw new AssertionError();
            }

            public final void a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public final void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            public final void a(CharSequence charSequence) {
                throw new AssertionError();
            }

            public final void a(List<QueueItem> list) {
                throw new AssertionError();
            }
        }
    }

    public static abstract class a implements DeathRecipient {
        boolean a;
        private final Object b;

        static class a implements defpackage.ig.a {
            private final WeakReference<a> a;

            a(a aVar) {
                this.a = new WeakReference(aVar);
            }

            public final void a() {
                this.a.get();
            }

            public final void a(int i, int i2, int i3, int i4, int i5) {
                if (((a) this.a.get()) != null) {
                    b bVar = new b(i, i2, i3, i4, i5);
                }
            }

            public final void a(Object obj) {
                Object obj2 = obj;
                a aVar = (a) this.a.get();
                if (aVar != null && !aVar.a && obj2 != null && VERSION.SDK_INT >= 21) {
                    List list;
                    PlaybackState playbackState = (PlaybackState) obj2;
                    List customActions = playbackState.getCustomActions();
                    Bundle bundle = null;
                    if (customActions != null) {
                        ArrayList arrayList = new ArrayList(customActions.size());
                        for (Object next : customActions) {
                            Object obj3;
                            if (next == null || VERSION.SDK_INT < 21) {
                                obj3 = null;
                            } else {
                                CustomAction customAction = (CustomAction) next;
                                obj3 = new PlaybackStateCompat.CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
                                obj3.a = next;
                            }
                            arrayList.add(obj3);
                        }
                        list = arrayList;
                    } else {
                        list = null;
                    }
                    if (VERSION.SDK_INT >= 22) {
                        bundle = playbackState.getExtras();
                    }
                    new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), list, playbackState.getActiveQueueItemId(), bundle).a = obj2;
                }
            }

            public final void a(List<?> list) {
                if (((a) this.a.get()) != null && list != null && VERSION.SDK_INT >= 21) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : list) {
                        Object obj;
                        if (next == null || VERSION.SDK_INT < 21) {
                            obj = null;
                        } else {
                            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) next;
                            obj = new QueueItem(next, MediaDescriptionCompat.a(queueItem.getDescription()), queueItem.getQueueId());
                        }
                        arrayList.add(obj);
                    }
                }
            }

            public final void b() {
                this.a.get();
            }

            public final void b(Object obj) {
                if (((a) this.a.get()) != null && obj != null && VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    ((MediaMetadata) obj).writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                    mediaMetadataCompat.a = obj;
                }
            }

            public final void c() {
                this.a.get();
            }

            public final void d() {
                this.a.get();
            }
        }

        static class b extends defpackage.ie.a {
            private final WeakReference<a> a;

            b(a aVar) {
                this.a = new WeakReference(aVar);
            }

            public void a() {
                this.a.get();
            }

            public final void a(int i) {
                if (((a) this.a.get()) != null) {
                    Integer.valueOf(i);
                }
            }

            public void a(Bundle bundle) {
                this.a.get();
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) {
                this.a.get();
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                if (((a) this.a.get()) != null && parcelableVolumeInfo != null) {
                    b bVar = new b(parcelableVolumeInfo.a, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e);
                }
            }

            public final void a(PlaybackStateCompat playbackStateCompat) {
                this.a.get();
            }

            public void a(CharSequence charSequence) {
                this.a.get();
            }

            public final void a(String str, Bundle bundle) {
                this.a.get();
            }

            public void a(List<QueueItem> list) {
                this.a.get();
            }

            public final void a(boolean z) {
            }

            public final void b() {
                this.a.get();
            }

            public final void b(int i) {
                if (((a) this.a.get()) != null) {
                    Integer.valueOf(i);
                }
            }

            public final void b(boolean z) {
                if (((a) this.a.get()) != null) {
                    Boolean.valueOf(z);
                }
            }
        }

        public a() {
            if (VERSION.SDK_INT >= 21) {
                this.b = new defpackage.ig.b(new a(this));
            } else {
                this.b = new b(this);
            }
        }
    }

    public static final class b {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;

        b(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }
}
