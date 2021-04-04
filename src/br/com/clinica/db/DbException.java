package br.com.clinica.db;

public class DbException  extends RuntimeException{

    public DbException(String msg){
        super(msg);
    }
}
