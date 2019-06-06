package com.brightcove.player.render;

import android.content.Context;
import android.util.Log;
import defpackage.bhe;
import defpackage.bhh;
import defpackage.bhn;
import defpackage.bhn.a;
import defpackage.bhq;
import java.util.ArrayList;

public class HLSPeakBitrateTrackSelector implements bhn {
    static final String a = "HLSPeakBitrateTrackSelector";
    int b;
    private Context c;
    private bhe d;

    public HLSPeakBitrateTrackSelector(Context context, int i) {
        this.c = context;
        this.b = i;
        this.d = bhe.a(context);
    }

    public void selectTracks(bhh bhh, final a aVar) {
        this.d.selectTracks(bhh, new a() {
            public final void a(bhh bhh, bhq bhq) {
                aVar.a(bhh, bhq);
            }

            public final void a(bhh bhh, bhq[] bhqArr) {
                ArrayList arrayList = new ArrayList();
                bhq bhq = null;
                for (bhq bhq2 : bhqArr) {
                    if (bhq2.b.d <= HLSPeakBitrateTrackSelector.this.b) {
                        arrayList.add(bhq2);
                    }
                    if (bhq == null || bhq2.b.d < bhq.b.d) {
                        bhq = bhq2;
                    }
                }
                if (!arrayList.isEmpty()) {
                    aVar.a(bhh, (bhq[]) arrayList.toArray(new bhq[0]));
                } else if (bhq != null) {
                    String str = HLSPeakBitrateTrackSelector.a;
                    StringBuilder stringBuilder = new StringBuilder("All variants are higher than the peak bitrate: ");
                    stringBuilder.append(HLSPeakBitrateTrackSelector.this.b);
                    Log.w(str, stringBuilder.toString());
                    aVar.a(bhh, new bhq[]{bhq});
                } else {
                    String str2 = HLSPeakBitrateTrackSelector.a;
                    StringBuilder stringBuilder2 = new StringBuilder("Unable to select tracks below the peak bitrate: ");
                    stringBuilder2.append(HLSPeakBitrateTrackSelector.this.b);
                    Log.e(str2, stringBuilder2.toString());
                    aVar.a(bhh, bhqArr);
                }
            }
        });
    }
}
