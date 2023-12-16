package org.upwork.prototype.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Scheduler Service
 *
 * @author prasadm
 * @since 03 Dec 2022
 */

@Service
public class SchedulerService implements ISchedulerService
{
    private static final Logger LOGGER = LoggerFactory.getLogger( SchedulerService.class );

    public void doSomething()
    {
        // TODO :: add your logic here
        LOGGER.info( ">>>>> Hello World <<<<<" );
    }
}
