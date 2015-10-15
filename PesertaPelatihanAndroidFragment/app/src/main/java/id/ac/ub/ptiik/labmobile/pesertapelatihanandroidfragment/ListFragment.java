package id.ac.ub.ptiik.labmobile.pesertapelatihanandroidfragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {

    Peserta peserta = new Peserta();
    ArrayList<Peserta> newListPeserta = new ArrayList<Peserta>();
    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);



        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.user1);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.user2);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.user1);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.user2);

        newListPeserta.add(new Peserta("Jonie Sowinski","2011","wnulilalbab@gmail.com",bitmap1));
        newListPeserta.add(new Peserta("Joana Dunnington","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Lashaunda Seagraves","2011","wnulilalbab@gmail.com",bitmap3));
        newListPeserta.add(new Peserta("Jenny Fulmore","2011","wnulilalbab@gmail.com",bitmap4));
        newListPeserta.add(new Peserta("Lidia Esslinger","2011","wnulilalbab@gmail.com",bitmap3));
        newListPeserta.add(new Peserta("Sarai Diblasi","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Janine Francia","2011","wnulilalbab@gmail.com",bitmap4));
        newListPeserta.add(new Peserta("Lesha Brownlow","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Bobby Gravley","2011","wnulilalbab@gmail.com",bitmap1));
        newListPeserta.add(new Peserta("Miquel Alsup","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Casie Koller","2011","wnulilalbab@gmail.com",bitmap3));
        newListPeserta.add(new Peserta("Cammie Swoope","2011","wnulilalbab@gmail.com",bitmap1));
        newListPeserta.add(new Peserta("Jeramy Bookout","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Steffanie Student","2011","wnulilalbab@gmail.com",bitmap4));
        newListPeserta.add(new Peserta("Tajuana Barcomb","2011","wnulilalbab@gmail.com",bitmap1));



        ListView listPeserta = (ListView) view.findViewById(R.id.listView);

        PesertaAdapter adapter = new PesertaAdapter(getActivity(), newListPeserta);
        listPeserta.setAdapter(adapter);
        listPeserta.setOnItemClickListener(this);

        /*int nilai = 0;
        changeDetail(nilai);*/

        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        changeDetail(position);
    }

    private void changeDetail(int position){
        DetilFragment detilFragment = (DetilFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        detilFragment.changeDetail(newListPeserta.get(position));
    }
}
