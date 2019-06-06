package com.snap.lenses.app.data;

import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.alfq;

public interface LensesAssetsUploadingHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy(a = "/lens/blob/upload")
    ajdx<Object> uploadAssets(@akxk alfq alfq);
}
