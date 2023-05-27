package model;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("pokemonList")
public class Pokemon {
    @ExcelCellName("ID")
    private int ID;
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("NOMBRE JAPONES")
    private int nombreJapones;
    @ExcelCellName("ATK")
    private int atk;
    @ExcelCellName("DEF")
    private int def;
    @ExcelCellName("SP")
    private int sp;
    @ExcelCellName("SP DEF")
    private int sepDef;
    @ExcelCellName("CRIT")
    private int crit;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("ATRAPADO")
    private boolean atrapado;

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNombreJapones() {
        return nombreJapones;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSp() {
        return sp;
    }

    public int getSepDef() {
        return sepDef;
    }

    public int getCrit() {
        return crit;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isAtrapado() {
        return atrapado;
    }
}
