package id.ac.ub.ptiik.labmobile.pesertapelatihanandroidfragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class DetilFragment extends ListFragment {

    ImageView foto;
    TextView nama;
    TextView angkatan;
    TextView email;
    TextView facebook;
    TextView instagram;
    TextView twitter;
    TextView path;
    TextView line;
    TextView bbm;
    TextView whatsapp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_detil, container, false);

        //identification
        foto = (ImageView) view.findViewById(R.id.foto1);
        nama = (TextView) view.findViewById(R.id.nama);
        angkatan = (TextView) view.findViewById(R.id.angkatan);
        email = (TextView) view.findViewById(R.id.email);
        facebook = (TextView) view.findViewById(R.id.facebook);
        instagram = (TextView) view.findViewById(R.id.instagram);
        twitter = (TextView) view.findViewById(R.id.twitter);
        path = (TextView) view.findViewById(R.id.path);
        line = (TextView) view.findViewById(R.id.line);
        bbm = (TextView) view.findViewById(R.id.bbm);
        whatsapp = (TextView) view.findViewById(R.id.whatsapp);

        return  view;

    }

    public void changeDetail(Peserta peserta){
        if (peserta !=null){
            nama.setText(peserta.nama);
            angkatan.setText(peserta.angkatan);
            email.setText(peserta.email);
            facebook.setText(peserta.facebook);
            twitter.setText(peserta.twitter);
            instagram.setText(peserta.instagram);
            path.setText(peserta.path);
            bbm.setText(peserta.bbm);
            whatsapp.setText(peserta.whatsapp);
            line.setText(peserta.line);
            foto.setImageBitmap(peserta.foto);
        }
    }

}
