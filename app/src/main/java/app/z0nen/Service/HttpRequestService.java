package app.z0nen.Service;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class HttpRequestService extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "app.z0nen.menu.action.FOO";
    private static final String ACTION_BAZ = "app.z0nen.menu.action.BAZ";

    private static final String ACTION_LAISLOGIN = "app.z0nen.menu.action.LAISLOGIN";
    private static final String ACTION_MOBSWITCHER = "app.z0nen.menu.action.MOBSWITCHER";


    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "app.z0nen.menu.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "app.z0nen.menu.extra.PARAM2";

    private static final String EXTRA_URL = "app.z0nen.menu.extra.URL";
    private static final String EXTRA_LOGIN = "app.z0nen.menu.extra.LOGIN";
    private static final String EXTRA_PASSWORD = "app.z0nen.menu.extra.PASSWORD";
    private static final String EXTRA_SESSION = "app.z0nen.menu.extra.SESSION";
    private static final String EXTRA_RAID = "app.z0nen.menu.extra.EXTRA_RAID";


    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, HttpRequestService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);

        context.startService(intent);
    }

    public static void startActionLaislogin(Context context, String url, String login, String password, String raid) {
        Intent intent = new Intent(context, HttpRequestService.class);
        intent.setAction(ACTION_LAISLOGIN);
        intent.putExtra(EXTRA_URL, url);
        intent.putExtra(EXTRA_LOGIN, login);
        intent.putExtra(EXTRA_PASSWORD, password);
        intent.putExtra(EXTRA_RAID, raid);

        context.startService(intent);
    }

    public static void startActionMobswitchrer(Context context, String url, String session , String raid) {
        Intent intent = new Intent(context, HttpRequestService.class);
        intent.setAction(ACTION_MOBSWITCHER);
        intent.putExtra(EXTRA_URL, url);
        intent.putExtra(EXTRA_SESSION, session);
        intent.putExtra(EXTRA_RAID, raid);

        context.startService(intent);
    }







    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, HttpRequestService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    public HttpRequestService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FOO.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionFoo(param1, param2);
            } else if (ACTION_BAZ.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionBaz(param1, param2);
            }
            else if (ACTION_LAISLOGIN.equals(action)) {
                final String url = intent.getStringExtra(EXTRA_URL);
                final String password = intent.getStringExtra(EXTRA_PASSWORD);
                final String login = intent.getStringExtra(EXTRA_LOGIN);
                final String raid = intent.getStringExtra(EXTRA_RAID);
                handleActionLaislogin(url, password, login, raid );
            }
            else if (ACTION_MOBSWITCHER.equals(action)) {
                final String url = intent.getStringExtra(EXTRA_URL);
                final String login = intent.getStringExtra(EXTRA_LOGIN);
                final String session = intent.getStringExtra(EXTRA_SESSION);
                final String raid = intent.getStringExtra(EXTRA_RAID);
                handleActionMobswitcher(url, login, session, raid );
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }


    private void handleActionLaislogin(String url, String login, String password, String raid) {
        String requestUrl;
requestUrl = url + "?p_login=" +login + "&password=&p_pwd="+ password+ "&p_au=R" ;
       //throw new UnsupportedOperationException("Not yet implemented");
    }
    private void handleActionMobswitcher(String url, String login, String session, String raid ) {
      String requestUrl;
        requestUrl = url + "?p_login=" +login + "&p_sessionkey="+ session+ "&p_au=R" ;
        //throw new UnsupportedOperationException("Not yet implemented");
    }


}
