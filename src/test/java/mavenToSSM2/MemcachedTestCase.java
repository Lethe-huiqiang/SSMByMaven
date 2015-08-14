package mavenToSSM2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.mybatis.caches.memcached.MemcachedCache;

public final class MemcachedTestCase {
	private static final String DEFAULT_ID = "MEMCACHED";

    private MemcachedCache cache;

    @Before
    public void newCache() {
        cache = new MemcachedCache(DEFAULT_ID);
    }

    @Test
    public void shouldDemonstrateCopiesAreEqual() {
        for (int i = 0; i < 100; i++) {
            cache.putObject(i, i);
            assertEquals(i, cache.getObject(i));
        }
    }

    @Test
    public void shouldRemoveItemOnDemand() {
        cache.putObject(0, 0);
        assertNotNull(cache.getObject(0));
        cache.removeObject(0);
        Object o = cache.getObject(0);
        assertNull(o);
    }

    @Test
    public void shouldFlushAllItemsOnDemand() {
        for (int i = 0; i < 5; i++) {
            cache.putObject(i, i);
        }
        assertNotNull(cache.getObject(0));
        assertNotNull(cache.getObject(4));
        cache.clear();
        assertNull(cache.getObject(0));
        assertNull(cache.getObject(4));
    }

}
