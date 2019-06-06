package com.google.protobuf.nano;

import java.util.HashMap;
import java.util.Map;

public final class MapFactories {
    private static volatile MapFactory mapFactory = new DefaultMapFactory();

    public interface MapFactory {
        <K, V> Map<K, V> forMap(Map<K, V> map);
    }

    static class DefaultMapFactory implements MapFactory {
        private DefaultMapFactory() {
        }

        /* synthetic */ DefaultMapFactory(AnonymousClass1 anonymousClass1) {
            this();
        }

        public <K, V> Map<K, V> forMap(Map<K, V> map) {
            return map == null ? new HashMap() : map;
        }
    }

    private MapFactories() {
    }

    public static MapFactory getMapFactory() {
        return mapFactory;
    }

    static void setMapFactory(MapFactory mapFactory) {
        mapFactory = mapFactory;
    }
}
