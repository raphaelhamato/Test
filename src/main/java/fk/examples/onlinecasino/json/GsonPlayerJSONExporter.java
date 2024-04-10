package fk.examples.onlinecasino.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fk.examples.onlinecasino.model.Player;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GsonPlayerJSONExporter {
    public static void exportPlayers(List<Player> players, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(players);

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}