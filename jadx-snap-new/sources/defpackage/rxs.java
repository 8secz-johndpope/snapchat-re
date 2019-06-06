package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: rxs */
public final class rxs implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(rxp.CDN_CONFIG_RULES, "CdnClientConfigRules.CdnClientConfigRulesList");
            builder.put(rxp.REQUEST_ROUTING_RULES, "routingRules.RequestRoutingRulesList");
            builder.put(rxp.BOLT_NETWORK_RULES, "CdnClientConfigRules.BoltNetworkRules");
            this.a = builder.build();
        }
        return this.a;
    }
}
