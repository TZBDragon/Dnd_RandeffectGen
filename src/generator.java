import java.util.*;
@SuppressWarnings("unused")
public class generator{
	public static void main(String[] args) {
		rand_gen randn = new rand_gen();
		int rand = randn.generator(42);
		System.out.println(rand);
		int reroll = -1;
		while(rand == 42) {
			rand = randn.generator(42);
			reroll += 1;
			if(reroll == 10) {
				System.out.println("The game is over and everything has died please reroll players or end game/session");
			}
		}
		String firststring = target(rand);
		String secondString = generate(rand, randn);
		System.out.println(firststring + " " + secondString);
	}
	public static String target(int r) {
		String first = "";
		switch(r) {
		case 0: first = "The Caster"; break;
		case 1: first = "The Target"; break;
		case 2: first = "The Nearest Ally"; break;
		case 3: first = "The Nearest Enemy"; break;
		case 4: first = "A Random object belonging to caster "; break;
		case 5: first = "A Random object belonging to target "; break;
		case 6: first = "All objects belonging to caster "; break;
		case 7: first = "All objects belonging to target "; break;
		case 8: first = "The Nearest plant"; break;
		case 9: first = "The Nearest lake"; break;
		case 10: first = "The Nearest forest"; break;
		case 11: first = "The Nearest mountain"; break;
		case 12: first = "The Nearest man-made object"; break;
		case 13: first = "The Nearest tavern"; break;
		case 14: first = "The Nearest town"; break;
		case 15: first = "The Nearest village"; break;
		case 16: first = "The Nearest castle"; break;
		case 17: first = "The Nearest city"; break;
		case 18: first = "The Nearest Djinn(any kind)"; break;
		case 19: first = "The Nearest cult"; break;
		case 20: first = "The Nearest Religious order"; break;
		case 21: first = "The Nearest Lich"; break;
		case 22: first = "The Nearest Dragon"; break;
		case 23: first = "The Nearest Tribe"; break;
		case 24: first = "The Nearest Monk's Monastary"; break;
		case 25: first = "The Nearest Demon"; break;
		case 26: first = "The Nearest god(any kind)"; break;
		case 27: first = "The Nearest Paladin"; break;
		case 28: first = "The Nearest Thieves Guild"; break;
		case 29: first = "The Nearest Assassin's Guild"; break;
		case 30: first = "Everything in 10ft"; break;
		case 31: first = "Everything in 50ft"; break;
		case 32: first = "Everything in 100ft"; break;
		case 33: first = "Everything in 500ft"; break;
		case 34: first = "Everything in 1000ft"; break;
		case 35: first = "Everything in 1 mile"; break;
		case 36: first = "Everything in 10 miles"; break;
		case 37: first = "The Nearest Star"; break;
		case 38: first = "The Nearest Planet(not yours)"; break;
		case 39: first = "Your planet"; break;
		case 40: first = "The Nearest portal"; break;
		case 41: first = "The Nearest plane"; break;
		case 42: first = "You shouldn't see this"; break;
		default: first = "Error";break;
		}
		System.out.println(r +  ", "+ first);
		return first;
	}
	public static String generate(int a, rand_gen c) {
		
		String result = "";
		String[][] full = {
				/*Caster */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to fincaial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience"},
				/*target */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to fincaial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience"},
				/*Nearest ally */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to fincaial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience"},
				/*Nearest Enemy */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to fincaial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience"},
				/*Random object belonging to caster */{"","",""},
				/*Random object belonging to target*/{"","",""},
				/*All objects belonging to caster */{"","",""},
				/*All objects belonging to target  */{"","",""},
				/*Nearest plant */{"","",""},
				/*Nearest lake */{"","",""},
				/*Nearest Forest */{"","",""},
				/*Nearest mountain */{"","",""},
				/*Man-made object */{"","",""},
				/*Nearest tavern */{"","",""},
				/*Nearest town */{"","",""},
				/*Nearest village */{"","",""},
				/*Nearest Castle */{"","",""},
				/*NEarest City */{"","",""},
				/*Nearest Djinn */{"","",""},
				/*Nearest Cult */{"","",""},
				/*Nearest Religious order */{"","",""},
				/*Nearest Lich */{"","",""},
				/*Nearest Dragon */{"","",""},
				/*NEarest Tribe */{"","",""},
				/*Nearest Monk monastery */{"","",""},
				/*Nearest Demon */{"","",""},
				/*Nearest god(of any kind) */{"","",""},
				/*NEarest Paladin */{"","",""},
				/*Nearest Thieves Guild */{"","",""},
				/*Nearest Assassins GUild */{"","",""},
				/*Everything in 10ft */{"","",""},
				/*Everything in 50ft */{"","",""},
				/*Everything in 100ft */{"","",""},
				/*Everything in 500ft */{"","",""},
				/*Everything in 1000ft */{"","",""},
				/*Everything in 1 mile */{"","",""},
				/*Everything in 10 miles */{"","",""},
				/*Nearest Star */{"","",""},
				/*Nearest Planet (not yours) */{"","",""},
				/*Current Planet */{"","",""},
				/*Nearest Portal */{"","",""},
				/*Nearest plane */{"","",""},
				/*Reroll */{"If so then it is an error contact me at tbooraem@protonmail.com","If so then it is an error contact me at tbooraem@protonmail.com","If so then it is an error contact me at tbooraem@protonmail.com" }
		};
		int b = full[a].length;
		int d = c.generator(b);
		System.out.println(b + ", " + d);
		result = full[a][d];
		return result;
	}
}