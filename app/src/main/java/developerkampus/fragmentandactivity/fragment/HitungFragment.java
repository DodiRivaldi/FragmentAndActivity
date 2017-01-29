package developerkampus.fragmentandactivity.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import developerkampus.fragmentandactivity.R;
import developerkampus.fragmentandactivity.activity.HasilActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HitungFragment extends Fragment {

    private Button btnHitung;
    private EditText edtAwal, edtAkhir;

    public HitungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_hitung, container, false);

        btnHitung = (Button) view.findViewById(R.id.btn_hitung);
        edtAkhir = (EditText) view.findViewById(R.id.edt_nilai_akhir);
        edtAwal = (EditText) view.findViewById(R.id.edt_nilai_awal);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String awal = edtAwal.getText().toString();
                String akhir = edtAkhir.getText().toString();

                String hasil = awal+akhir;

                Intent intent = new Intent(getContext(), HasilActivity.class);
                intent.putExtra("hasilnya",hasil);
                startActivity(intent);
            }
        });
        return view;
    }

}
