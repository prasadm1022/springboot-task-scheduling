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
