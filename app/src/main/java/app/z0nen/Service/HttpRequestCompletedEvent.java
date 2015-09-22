package app.z0nen.Service;

import schopp.roland.allroundrobot.app.Entities.StoreRequest;

/**
 * Created by arniskl on 30.12.2015..
 */
public abstract class HttpRequestCompletedEvent {
    private StoreRequest storeRequest;
    public HttpRequestCompletedEvent(StoreRequest storeRequest)
    {
        this.storeRequest = storeRequest;
    }
    public StoreRequest getStoreRequest()
    {
        return storeRequest;
    }
}
