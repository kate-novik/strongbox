package org.carlspring.strongbox.service;

import org.apache.http.pool.PoolStats;

import javax.ws.rs.client.Client;

/**
 * @author korest
 */
public interface ProxyRepositoryConnectionPoolConfigurationService
{

    Client getClient();

    void setMaxTotal(int max);

    void setDefaultMaxPerRepository(int defaultMax);

    int getDefaultMaxPerRepository();

    void setMaxPerRepository(String repository, int max);

    PoolStats getTotalStats();

    PoolStats getPoolStats(String repository);

    void shutdown();
}
