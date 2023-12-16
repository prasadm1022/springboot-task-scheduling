package org.upwork.prototype.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.upwork.prototype.util.ResponseWrapper;

/**
 * Scheduler REST Controller
 *
 * @author prasadm
 * @since 03 Dec 2022
 */

@RequestMapping( "/v1/scheduler" )
public interface IScheduleController
{
    @PostMapping( produces = MediaType.APPLICATION_JSON_VALUE )
    ResponseEntity<ResponseWrapper<Void>> runScheduledJob();
}
