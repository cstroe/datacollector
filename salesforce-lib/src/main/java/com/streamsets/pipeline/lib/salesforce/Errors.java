/**
 * Copyright 2016 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.lib.salesforce;

import com.streamsets.pipeline.api.ErrorCode;
import com.streamsets.pipeline.api.GenerateResourceBundle;

@GenerateResourceBundle
public enum Errors implements ErrorCode {

  FORCE_00("A configuration is invalid because: {}"),
  FORCE_01("Error creating Bulk API job: {}"),
  FORCE_02("Error getting Bulk API batch info: {}"),
  FORCE_03("Batch failed: {}"),
  FORCE_04("Record read failed: {}"),
  FORCE_05("Get query result failed: {}"),
  FORCE_06("Can't find offset column in result header: {}"),
  FORCE_07("SOQL query must include '{}' in WHERE clause and in ORDER BY clause before other columns."),
  FORCE_08("Error querying SOAP API: {}"),
  FORCE_09("Streaming API Error: {}"),
  FORCE_10("Interrupted writing to entity queue: {}"),
  FORCE_11("Writing record id '{}' failed due to: {}"),
  FORCE_12("Invalid SObject name template expression '{}': {}"),
  FORCE_13("Error writing to Salesforce: {}"),
  FORCE_14("Failed to create delimited data generator : {}"),
  ;
  private final String msg;

  Errors(String msg) {
    this.msg = msg;
  }

  /** {@inheritDoc} */
  @Override
  public String getCode() {
    return name();
  }

  /** {@inheritDoc} */
  @Override
  public String getMessage() {
    return msg;
  }
}