package com.snap.core.db;

import defpackage.akco;

public final class DataConsumptionModel {
    private static final String CREATE_TABLE = CREATE_TABLE;
    public static final Companion Companion = new Companion();
    private static final String FETCHBEGINTIMESTAMP = FETCHBEGINTIMESTAMP;
    private static final String FIRSTACCESSEDTIMESTAMP = FIRSTACCESSEDTIMESTAMP;
    private static final String TABLE_NAME = TABLE_NAME;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final String getCREATE_TABLE() {
            return DataConsumptionModel.CREATE_TABLE;
        }

        public final String getFETCHBEGINTIMESTAMP() {
            return DataConsumptionModel.FETCHBEGINTIMESTAMP;
        }

        public final String getFIRSTACCESSEDTIMESTAMP() {
            return DataConsumptionModel.FIRSTACCESSEDTIMESTAMP;
        }

        public final String getTABLE_NAME() {
            return DataConsumptionModel.TABLE_NAME;
        }
    }
}
