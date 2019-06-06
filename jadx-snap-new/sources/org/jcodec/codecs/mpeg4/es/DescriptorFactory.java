package org.jcodec.codecs.mpeg4.es;

import java.util.HashMap;
import java.util.Map;

public class DescriptorFactory implements IDescriptorFactory {
    static DescriptorFactory factory = new DescriptorFactory();
    private static Map<Integer, Class<? extends Descriptor>> map;

    static {
        HashMap hashMap = new HashMap();
        map = hashMap;
        hashMap.put(Integer.valueOf(ES.tag()), ES.class);
        map.put(Integer.valueOf(SL.tag()), SL.class);
        map.put(Integer.valueOf(DecoderConfig.tag()), DecoderConfig.class);
        map.put(Integer.valueOf(DecoderSpecific.tag()), DecoderSpecific.class);
    }

    public static IDescriptorFactory getInstance() {
        return factory;
    }

    public Class<? extends Descriptor> byTag(int i) {
        return (Class) map.get(Integer.valueOf(i));
    }
}
