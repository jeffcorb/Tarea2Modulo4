package data;

import Utilities.Logs;
import com.poiji.bind.Poiji;
import model.Pokemon;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/test/resources/data/pokemonList.xlsx";

    public static List<Pokemon> getPokemon() {
        Logs.debug("Reading Pokemon List from excel");
        return Poiji.fromExcel(new File(excelPath), Pokemon.class);
    }
}
