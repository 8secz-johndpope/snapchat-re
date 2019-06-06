package com.coremedia.iso.boxes;

import defpackage.aqo;

public interface FullBox extends aqo {
    int getFlags();

    int getVersion();

    void setFlags(int i);

    void setVersion(int i);
}
