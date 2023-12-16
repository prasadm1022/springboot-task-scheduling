package org.upwork.prototype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.upwork.prototype.service.ISchedulerService;
import org.upwork.prototype.util.Response;
import org.upwork.prototype.util.ResponseError;
import org.upwork.prototype.util.ResponseUtil;
import org.upwork.prototype.util.ResponseWrapper;

/**
 * Scheduler REST Controller
 *
 * @author prasadm
 * @since 03 Dec 2022
 */

@RestController
public class ScheduleController implements IScheduleController
{
    @Autowired
    private ISchedulerService schedulerService;

    @Override
    public ResponseEntity<ResponseWrapper<Void>> runScheduledJob()
    {
        try
        {
            schedulerService.doSomething();
            return ResponseUtil.wrap( new Response<>() );
        }
        catch( ResponseError ex )
        {
            return ResponseUtil.wrap( ex );
        }
    }
}
