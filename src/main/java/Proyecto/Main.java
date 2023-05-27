package Proyecto;

import Utilities.Logs;
import data.DataGiver;

public class Main {
    public static void main(String[] args) {
        final var ID = 9;
        final var dataGiver = DataGiver.getByID(ID);
        Logs.info(dataGiver.getNombre());
    }
}
