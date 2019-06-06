package com.snap.core.db;

import defpackage.ainn;
import defpackage.ainp;

interface AndroidStatement extends ainp {
    void close();

    void execute();

    ainn executeQuery();
}
