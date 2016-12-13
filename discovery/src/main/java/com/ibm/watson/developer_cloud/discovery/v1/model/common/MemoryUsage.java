/**
 * Copyright 2016 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.watson.developer_cloud.discovery.v1.model.common;

import static com.ibm.watson.developer_cloud.discovery.v1.model.common.CommonManager.*;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * @author apturgeo
 */
public class MemoryUsage extends GenericModel {
    @SerializedName(USED_BYTES)
    private Long usedBytes;
    @SerializedName(TOTAL_BYTES)
    private Long totalBytes;
    @SerializedName(USED)
    private String used;
    @SerializedName(TOTAL)
    private String total;
    @SerializedName(PERCENT_USED)
    private Double percentUsed;

    public Long getUsedBytes() {
        return usedBytes;
    }

    public Long getTotalBytes() {
        return totalBytes;
    }

    public String getUsed() {
        return used;
    }

    public String getTotal() {
        return total;
    }

    public Double getPercentUsed() {
        return percentUsed;
    }
}
