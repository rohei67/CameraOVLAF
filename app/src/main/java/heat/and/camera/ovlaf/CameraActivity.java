package heat.and.camera.ovlaf;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.ViewGroup.LayoutParams;
import heat.and.camera.ovlaf.R;

public class CameraActivity extends Activity {
    private CameraView cameraView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cameraView = new CameraView(this);
        setContentView(cameraView);
        LayoutParams params=new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
        addContentView(new CameraOvlView(this), params);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        cameraView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        cameraView.onPause();
    }
}