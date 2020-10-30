package com.vmware.tanzu.gemfire.session;

import org.springframework.context.annotation.Configuration;

import org.springframework.data.gemfire.config.annotation.EnableLogging;
import org.springframework.session.data.gemfire.config.annotation.web.http.EnableGemFireHttpSession;

@EnableGemFireHttpSession(poolName = "DEFAULT",regionName = "ClusteredSpringSessions")
@EnableLogging(logLevel = "info")
@Configuration
public class CloudCacheConfig {
}
