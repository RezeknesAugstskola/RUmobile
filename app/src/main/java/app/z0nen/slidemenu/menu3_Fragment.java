package app.z0nen.slidemenu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Z0NEN on 10/22/2014.
 */
public class menu3_Fragment extends Fragment implements OnClickListener{
    Button button;

    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.login, container, false);
        Button buttonSayHi = (Button) rootview.findViewById(R.id.loginBtn);
        buttonSayHi.setOnClickListener(this);
        return rootview;
    }
    @Override
    public void onClick(View v) {

        //fragmentTwo = new FragmentTwo();

      //  fragmentTransaction.replace(R.id.frameLayoutFragmentContainer, fragmentTwo);
       // fragmentTransaction.addToBackStack(null);

        //fragmentTransaction.commit();
       //kods loginam //

    }
}
