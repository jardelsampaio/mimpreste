package br.unifor.mimpreste.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import br.unifor.mimpreste.R;
import br.unifor.mimpreste.dao.PessoaDao;
import br.unifor.mimpreste.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa p1 = new Pessoa("Bruno Lopes", "85 99999-9999", "bruno.lopes@unifor.br", "");
        Pessoa p2 = new Pessoa("Sicrano", "85 98765-1234", "sicrano@unifor.br", "");
        Pessoa p3 = new Pessoa("Beltrano", "85 91234-4321", "beltrano@unifor.br", "");

        PessoaDao pessoaDao = new PessoaDao(this);
        pessoaDao.insert(p1);
        pessoaDao.insert(p2);
        pessoaDao.insert(p3);

        List<Pessoa> pessoas = pessoaDao.findAll();
        for (Pessoa pessoa : pessoas) {
            Log.i("App", "ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome() + ", Telefone: " + pessoa.getTelefone());
        }


    }
}
