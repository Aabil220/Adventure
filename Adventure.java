package game;

import java.util.Scanner;
import java.util.Random;

class Alien {
	int hp;
	int attackDamage;
	int biteDamage;
	int scratchDamage;
}

class Goblin {
	int hp;
	int attackDamage;
	int steal;
	int escape;
	int scratchDamage;
}

class Player {
	int playerHealth;
	int alienDefeat;
	int slashDamage;
	int attackDamage;
	int healthPotion;
	int attackUpgrade;
	int slashUpgrade;
	int healthUpgrade;
	int cbDamage1;
	int cbDamage2;
	int cbUpgrade;
}

class Items {
	int healthPotions;
}

// t = tutorial, c = choice, d = dialogue options
//assigned vars = c1, d1, d2, f1, f2. t1

public class Adventure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		Alien alien1 = new Alien();
		Player player1 = new Player();
		Items items1 = new Items();

		int computerInt;
		int computerInt2;
		String computerPlay;
		computerInt = generator.nextInt(3) + 1;
		player1.playerHealth = 1500;
		player1.alienDefeat = 0;
		player1.slashDamage = 300;
		player1.attackDamage = 400;
		player1.cbDamage1 = 200;
		player1.cbDamage2 = 400;
		player1.healthPotion = 0;
		player1.attackUpgrade = 100;
		player1.slashUpgrade = 100;
		player1.healthUpgrade = 200;
		alien1.hp = 1000;
		alien1.attackDamage = 300;
		alien1.biteDamage = 200;
		alien1.scratchDamage = 500;
		items1.healthPotions = 1;

		System.out.println(
				"You wake up, hearing the sound of an monsterous growling. You step out of your tent to find an Alien right outside your tent.");
		System.out.println(
				"With no memory of how you got there, you find your sword in its usual sheath and pick it up to fight.");
		System.out.println(
				"You notice a man, in a lab coat on the floor with the alien creeping towards him. Both him and the Alien notice you.");
		while (alien1.hp > 1 || player1.playerHealth > 1) {
			if (alien1.hp > 1 && player1.playerHealth > 1) {
				System.out.println("Alien Charges. He has " + alien1.hp + ".");
				System.out.println("Do you want to Attack, Slash, or Run??");
				String f1 = scan.nextLine();
				switch (f1) {
				case "Attack":
					System.out.println("You have hurt the alien.");
					alien1.hp = alien1.hp - player1.attackDamage;
					if (alien1.hp > 1 && player1.playerHealth > 1)
						alien1.hp = player1.alienDefeat;
					System.out.println("Alien Strength: " + alien1.hp);
					break;
				case "Slash":
					System.out.println("You have hurt the alien.");
					alien1.hp = alien1.hp - player1.slashDamage;
					if (alien1.hp < 0)
						alien1.hp = player1.alienDefeat;
					System.out.println("Alien Strength: " + alien1.hp);
					break;
				case "Run":
					System.out.println("You have escaped the alien.");
					alien1.hp = player1.alienDefeat;
					System.out.println("The Alien seems to go to another location. The old man seems to be ok.");
					break;
				default:
					System.out.println("Please enter a Viable option.");
				}

			}
			if (alien1.hp < 1) {
				System.out.println("You have defeated the alien");
				break;
			}
			if (player1.playerHealth > 1 && alien1.hp > 1) {
				if (computerInt == 1) {
					computerPlay = "Attack";
					System.out.println("You have been hurt. Alien used Attack.");
					player1.playerHealth = player1.playerHealth - alien1.attackDamage;
					System.out.println("Your health is now at: " + player1.playerHealth);
				} else if (computerInt == 2) {
					computerPlay = "Bite";
					System.out.println("You have been hurt. Alien used bite.");
					player1.playerHealth = player1.playerHealth - alien1.biteDamage;
					System.out.println("Your health is now at: " + player1.playerHealth);
				} else if (computerInt == 3) {
					computerPlay = "Scratch";
					System.out.println("You have been hurt. Alien used Scratch.");
					player1.playerHealth = player1.playerHealth - alien1.scratchDamage;
					System.out.println("Your health is now at: " + player1.playerHealth);
				}
				if (player1.playerHealth < 1) {
					System.out.println("You are dead.");
				}
			}

		}

		System.out.println("Professeor: Why hello! Thank you For saving me kind sir. What's your name, oh great hero?");
		System.out.println("Please enter your name.");
		String name = scan.nextLine();
		System.out.println("Professor: Why hello " + name + "! What brings you around.");
		System.out.println("Choose a dialogue option.");
		System.out.println("A) I can't seem the remember...");
		System.out.println("B) What's your care with me? Let me venture to-Wait where am I?");
		System.out.println("C) Leave me alone.");
		String d1 = scan.nextLine();
		switch (d1) {
		case "A":
			System.out.println(
					"Professor: How do you not know?? You're only in the greatest place known to man, Techtropolis");
			break;
		case "B":
			System.out.println("Professor: Why I care. But you are here, in Techtropolis");
			break;
		case "C":
			System.out.println("Professor: Hmph. Why let me see some way to help you.");
			break;
		default:
			System.out.println("Professor: That's not a choice");
			break;
		}
		System.out.println("Professor: Why don't you follow me! To my laboratory!");
		System.out.println("Would you like to follow the professor. Select A for yes and B for no.");
		alien1.hp = 1000;
		String c1 = scan.nextLine();
		switch (c1) {
		case "A":
			System.out.println("Professor: Splendid let us continue.");
			computerInt2 = generator.nextInt(2) + 1;
			if (computerInt2 == 1) {
				break;
			} else if (computerInt2 == 2) {
				while (alien1.hp > 1 || player1.playerHealth > 1) {
					if (alien1.hp > 1 && player1.playerHealth > 1) {
						System.out.println("Alien Charges. He has " + alien1.hp + ".");
						System.out.println("Do you want to Attack, Slash, or Run??");
						String f2 = scan.nextLine();
						switch (f2) {
						case "Attack":
							System.out.println("You have hurt the alien.");
							alien1.hp = alien1.hp - player1.attackDamage;
							if (alien1.hp > 1 && player1.playerHealth > 1)
								alien1.hp = player1.alienDefeat;
							System.out.println("Alien Strength: " + alien1.hp);
							break;
						case "Slash":
							System.out.println("You have hurt the alien.");
							alien1.hp = alien1.hp - player1.slashDamage;
							if (alien1.hp < 0)
								alien1.hp = player1.alienDefeat;
							System.out.println("Alien Strength: " + alien1.hp);
							break;
						case "Run":
							System.out.println("You have escaped the alien.");
							alien1.hp = player1.alienDefeat;
							break;
						default:
							System.out.println("Please enter a Viable option.");
						}

					}
					if (alien1.hp < 1) {
						System.out.println("You have defeated the alien");
						break;
					}
					if (player1.playerHealth > 1 && alien1.hp > 1) {
						if (computerInt == 1) {
							computerPlay = "Attack";
							System.out.println("You have been hurt. Alien used Attack.");
							player1.playerHealth = player1.playerHealth - alien1.attackDamage;
							System.out.println("Your health is now at: " + player1.playerHealth);
						} else if (computerInt == 2) {
							computerPlay = "Bite";
							System.out.println("You have been hurt. Alien used bite.");
							player1.playerHealth = player1.playerHealth - alien1.biteDamage;
							System.out.println("Your health is now at: " + player1.playerHealth);
						} else if (computerInt == 3) {
							computerPlay = "Scratch";
							System.out.println("You have been hurt. Alien used Scratch.");
							player1.playerHealth = player1.playerHealth - alien1.scratchDamage;
							System.out.println("Your health is now at: " + player1.playerHealth);
						}
						if (player1.playerHealth < 1) {
							System.out.println("You are dead.");
						}
					}

				}
			}
			System.out.println(
					"You approach the Laboratory. Inside you see a Metal Bottle with the words 'Health Potion.' You grab it.");
			System.out.println("You have gained: 1 Health Potion.");
			player1.healthPotion = player1.healthPotion + items1.healthPotions;
			System.out.println("You now have " + player1.healthPotion + " Potion.");
			System.out.println("Would you like a tutorial on Health Potions?");
			System.out.println("Yes Or No?");
			String t1 = scan.nextLine();
			switch (t1) {
			case "Yes":
				System.out.println(
						"Health potions help you regain health. One potion gives you 500 health. You may use a potion as a turn in any battle.");
				break;
			case "No":
				break;
			} 
			System.out.println(
					"Professor: How do you like it? It's all mine, passed on by my father. Anyways I'd like to return the favor you did for me by saving me. Anything you want.");
			System.out.println("The professor asks you for a favor. You have a few choices. You can:");
			System.out.println("A) Ask him to upgrade your sword. +100 Attack and Slash damage");
			System.out.println("B) Ask him for armor. +200 Health");
			String d2 = scan.nextLine();
			switch (d2) {
			case "A":
				System.out.println("Professer: Upgrade? Why I shall.");
				player1.attackDamage = player1.attackDamage + player1.attackUpgrade;
				player1.slashDamage = player1.slashDamage + player1.slashUpgrade;
				System.out.println("Attack Damage: " + player1.attackDamage);
				System.out.println("Slash Damage: " + player1.slashDamage);
				System.out.println("Professor: Hey! While I was upgrading your sword, I came across this crossbolt and thought you might've wanted it.");
				System.out.println("You have gained: Crossbolt. These can cause up to 400 damage if lucky and at least 200.");
				break;
			case "B":
				System.out.println("Professor: Upgrade? Why I shall.");
				player1.playerHealth = player1.playerHealth + player1.healthUpgrade;
				System.out.println("Health: " + player1.playerHealth);
				System.out.println("Professor: Hey! While I was making your armor, I came across this crossbolt and thought you might've wanted it.");
				System.out.println("You have gained: Crossbolt. These can cause up to 400 damage if lucky and at least 200.");
				break;			
			}
			
			break;
		case "B":
			System.out.println("Hmph. Fine go venture Techtropolips on your own then.");
		}

	}
}

Psuedocode:

“You go out to the city and are on the hunt for Mr. Eliott, your old mentor.”
“You find an old warehouse. Inside you find a creature scrambling around. He seems to have a health potion and you can A) kill him and steal it or B) you can trade him food for it. If you trade food, you may lose some attack damage. Choose Scenario A or B?”
	String c2 = scan.nextLine();
Player1.healthDamage1 = 600
	switch(c2) {
		case “A”:
			“You shoot your crossbow at the Goblin and hit 					him. However, he was in a group so 4 attack you at once. You manage to defeat them, but you take 600 damage.
	player1.playerHealth = player1.playerHealth -  player1.healthDamage1
		case “B”:
			“He gives you the health potion in trade for food. You have gained
}

Narrative: TBD

