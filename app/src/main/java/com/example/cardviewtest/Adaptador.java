package com.example.cardviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderAdaptador> {

    ArrayList<Contacto> listaContactos;

    public Adaptador(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    @NonNull
    @Override
    public ViewHolderAdaptador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacto_layout, null, false);
        return new ViewHolderAdaptador(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdaptador holder, int position) {
        //aquí llenamos la lista!!
        holder.nombre.setText(listaContactos.get(position).getNombre());
        holder.texto.setText(listaContactos.get(position).getTexto());
        holder.foto.setImageResource(listaContactos.get(position).getFoto());


    }

    @Override
    public int getItemCount() { //entregar la cantidad de contactos que tenemos
        return listaContactos.size();
    }

    public class ViewHolderAdaptador extends RecyclerView.ViewHolder {
        //aquí hacemos referencia a los elementos gráficos
        TextView nombre, texto;
        ImageView foto;
        public ViewHolderAdaptador(@NonNull View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.nombre_item);
            texto = (TextView)itemView.findViewById(R.id.texto_item);
            foto = (ImageView) itemView.findViewById(R.id.foto_item);
        }
    }
}
