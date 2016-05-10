package br.unifor.mimpreste.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import br.unifor.mimpreste.model.Pessoa;

/**
 * Created by bruno on 04/05/2016.
 */
public class PessoaDao extends GenericDao<Pessoa> {

    public PessoaDao(String tableName, Context context) {
        super(tableName, context);
    }

    @Override
    public ContentValues getContentValues(Pessoa obj) {
        return null;
    }

    @Override
    protected Pessoa createObjectFromCursor(Cursor cursor) {
        return null;
    }

}
