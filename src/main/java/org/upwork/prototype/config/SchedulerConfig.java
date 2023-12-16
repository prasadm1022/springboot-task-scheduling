package org.upwork.prototype.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.upwork.prototype.service.ISchedulerService;

/**
 * Schedule Configurations
 *
 * @author prasadm
 * @since 14 June 2022
 */

@Configuration
@EnableScheduling
@Profile( "scheduler" )
public class SchedulerConfig
{
    private static final Logger LOGGER = LoggerFactory.getLogger( SchedulerConfig.class );

    @Autowired
    private ISchedulerService schedulerService;

    @Async
    @Scheduled( cron = "${cron.frequency}" )
    public void executeTask()
    {
        try
        {
            schedulerService.doSomething();
        }
        catch( Exception ex )
        {
            LOGGER.error( ex.getMessage(), ex );
        }
    }
}
