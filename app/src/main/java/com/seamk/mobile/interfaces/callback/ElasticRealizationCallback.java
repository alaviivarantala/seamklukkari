package com.seamk.mobile.interfaces.callback;

import com.seamk.mobile.elasticsearch.ElasticRealization;

/**
 * Created by Juha Ala-Rantala on 17.3.2018.
 */

public interface ElasticRealizationCallback {
    void onSuccess(ElasticRealization elasticRealization);
    void onFailure(Throwable throwable);
}
