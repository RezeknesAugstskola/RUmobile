import app.z0nen.Service.HttpRequestCompletedEvent;
import app.z0nen.Service.StoreRequest;

/**
 * Created by imants123456qwe on 30.12.2015
 * qwqweqweW
 */
public final class DataRequestCompletedEvent extends HttpRequestCompletedEvent {
    public DataRequestCompletedEvent(StoreRequest storeRequest) {
        super(storeRequest);
    }
}
