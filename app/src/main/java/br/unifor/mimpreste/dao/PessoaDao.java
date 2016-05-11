package br.unifor.mimpreste.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import br.unifor.mimpreste.model.Pessoa;

/**
 * Created by bruno on 04/05/2016.
 */
public class PessoaDao extends GenericDao<Pessoa> {

    private static final String TABLE_PESSOA = "pessoas";

    public PessoaDao(Context context) {
        super(TABLE_PESSOA, context);
    }

    @Override
    public ContentValues getContentValues(Pessoa obj) {
        ContentValues values = new ContentValues();

        if(obj.getId() !=null){
            values.put("_id", obj.getId());
        }

        values.put("nome", obj.getNome());
        values.put("telefone", obj.getTelefone());
        values.put("email", obj.getEmail());
        values.put("foto", obj.getFoto());
        return values;
    }

    @Override
    protected Pessoa createObjectFromCursor(Cursor cursor) {

        int id = cursor.getInt(cursor.getColumnIndex("_id"));
        String nome = cursor.getString(cursor.getColumnIndex("nome"));
        String telefone = cursor.getString(cursor.getColumnIndex("telefone"));
        String email = cursor.getString(cursor.getColumnIndex("email"));
        String foto = cursor.getString(cursor.getColumnIndex("foto"));

        Pessoa pessoa = new Pessoa(id, nome, telefone, email, foto);

        return pessoa;
    }

}
