/*
 * Copyright 2023 Prasad Madusanka Basnayaka
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
