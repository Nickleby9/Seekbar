package hilay.edu.moreevents;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar seekBarR;
    private SeekBar seekBarG;
    private SeekBar seekBarB;
    int r = 0, g = 0, b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarR = (SeekBar) findViewById(R.id.sbR);
        seekBarG = (SeekBar) findViewById(R.id.sbG);
        seekBarB = (SeekBar) findViewById(R.id.sbB);

        seekBarR.setOnSeekBarChangeListener(this);
        seekBarG.setOnSeekBarChangeListener(this);
        seekBarB.setOnSeekBarChangeListener(this);
    }


    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        TextView textView = (TextView) findViewById(R.id.textView);
        r = seekBarR.getProgress();
        g = seekBarG.getProgress();
        b = seekBarB.getProgress();
        textView.setTextColor(Color.rgb(r, g, b));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}

