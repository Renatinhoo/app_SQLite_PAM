package com.example.appsqlite.db

import android.database.sqlite.SQLiteOpenHelper

class DBHelper (context: Context, factory: SQLiteDatabase.CursorFactory?) :
        SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION)
{
            companion object{
                private val DATABASE_NAME = "appSQLite"
                private val DATABASE_VERSION = 1
                val TABLE_NAME = "CadastroPessoa"
                val ID_COL ="10"
                val NAME_COL = "nome"
                val END_COL = "endereco"
                val BAR_COL = "bairro"
                val CEP_COL = "cep"
            }
        }