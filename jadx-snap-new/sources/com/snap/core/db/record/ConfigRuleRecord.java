package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.MessageNanoColumnAdapter;
import com.snap.core.db.column.MessageNanoColumnAdapter.ProtoFactory;
import com.snap.core.db.record.ConfigRuleModel.Factory;
import defpackage.acbz;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class ConfigRuleRecord implements ConfigRuleModel {
    public static final Factory<ConfigRuleRecord> FACTORY;
    public static final ainw<ConfigRuleRecord> MAPPER;
    private static final String TAG = "ConfigRecord";
    public static final ainu<acbz, byte[]> configColumnAdapter = new MessageNanoColumnAdapter(configResultFactory, TAG);
    private static final ProtoFactory<acbz> configResultFactory = -$$Lambda$W-Yw4HSljANBOVA5j-JO-UHQbX4.INSTANCE;

    static {
        Factory factory = new Factory(-$$Lambda$gui_6va7AiOpi1wzkQqdQGyLtm0.INSTANCE, configColumnAdapter);
        FACTORY = factory;
        MAPPER = factory.selectConfigRulesByConfigIdMapper();
    }
}
