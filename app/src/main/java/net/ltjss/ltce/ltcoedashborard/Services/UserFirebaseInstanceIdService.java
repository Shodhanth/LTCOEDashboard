package net.ltjss.ltce.ltcoedashborard.Services;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Varun on 20/12/16.
 */
public class UserFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = UserFirebaseInstanceIdService.class.getSimpleName();

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "onTokenRefresh: " + token);
    }
}
