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

package org.upwork.prototype.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prasadm
 * @since 29 May 2022
 */

public class Error
{
    private long code;
    private String message;
    private String details;
    private List<String> errors;

    public Error()
    {
        errors = new ArrayList<>();
    }

    public long getCode()
    {
        return code;
    }

    public void setCode( long code )
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

    public String getDetails()
    {
        return details;
    }

    public void setDetails( String details )
    {
        this.details = details;
    }

    public List<String> getErrors()
    {
        return errors;
    }

    public void setErrors( List<String> errors )
    {
        this.errors = errors;
    }
}
