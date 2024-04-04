package fk.examples.onlinecasino;

import java.io.FileNotFoundException;

import fk.examples.onlinecasino.model.Player;
import fk.examples.onlinecasino.model.WheelOfFortune;
import fk.examples.onlinecasino.xml.JcabiPlayerXMLImporter;

public class OnlineCasinoUseCase {

	public static void main(String[] args) throws FileNotFoundException {
		Player player = JcabiPlayerXMLImporter.importPlayers("players.xml").get(0);
		WheelOfFortune wheeloffortune = new WheelOfFortune();

		while (player.getCredit() >= 100) {
			wheeloffortune.spin(player, 100);
		}
	}
}
