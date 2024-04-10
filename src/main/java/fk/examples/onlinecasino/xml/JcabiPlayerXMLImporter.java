package fk.examples.onlinecasino.xml;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;

import fk.examples.onlinecasino.model.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class JcabiPlayerXMLImporter {

    public static List<Player> importPlayers(String xmlFilePath) throws FileNotFoundException {
        List<Player> players = new ArrayList<>();
        XML xml = new XMLDocument(new File(xmlFilePath));
        
        List<XML> playerNodes = xml.nodes("/Players/Player");
        for (XML playerNode : playerNodes) {
            Player player = new Player(
                playerNode.xpath("@id").get(0),
                playerNode.xpath("FirstName/text()").get(0),
                playerNode.xpath("LastName/text()").get(0),
                Integer.parseInt(playerNode.xpath("Credit/text()").get(0)),
                playerNode.xpath("Email/text()").get(0),
                playerNode.xpath("Password/text()").get(0)
            );
            players.add(player);
        }

        return players;
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Player> players = importPlayers("players.xml");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}