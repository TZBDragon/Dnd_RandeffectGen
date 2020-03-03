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
				/*Caster */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has their teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. Everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to financial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience", "gains a wish", "is healed as if by greater restoration"},
				/*target */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has their teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. Everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to financial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience","gains a wish", "is healed as if by greater restoration"},
				/*Nearest ally */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has their teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. Everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to financial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience","gains a wish", "is healed as if by greater restoration"},
				/*Nearest Enemy */{"turns to stone","bursts into flame","gains 10d6 gold","gains 10d8 gold","gains 10d10 gold","gains 10d100 gold", "loses their teeth", "ages 5d4 years", "de-ages 5d4 years", "ages 5d8 years", "de-ages 5d8 years", "has their teeth turn into gold", "dies on a failed con save(10)", "can ignite things at will", "turns ethereal for 1d10 turns or ten minutes", "is teleported to the astral plane","is teleported to the fire plane","is teleported to the air plane","is teleported to the earth plane","is teleported to the water plane","explodes. Everyone in a 15ft radius must make a dex save(14) or suffer 6d8 damage", "turns into ice", "is constantly moist", "gains +2 in stat of choice", "gets a -2 in stat of choice", "suffers from onset dementia", "has truesight up to 60ft", "is blind", "experiences Mesothelioma and may be entitled to financial compensation", "recovers all health", "gains 2d8 health permanantly", "loses all health", "loses 2d8 health permanantly", "loses a proficency of their choice", "gains a proficency of their choice", "levels up", "has zero experience","gains a wish", "is healed as if by greater restoration"},
				/*Random object belonging to caster */{" turns to dust"," turns to ice"," explodes dealing 5d8 damage to eveyone in a 10ft radius","turns into pure gold", "appears at the owners home", "shrinks by half", "doubles in size", "turns to glass", "gains sentience", "does +1 damage to anything it hits", "increases in temperature by 5d10 degrees fahrenheit", "decreases in temperature by 5d10 degrees fahrenheit", "does 1d4 fire damage", "does 1d4 cold damage", "is poisonous", "is replaced by an identical item of lower value", "is replaced by an identical item of greater value", "loses magical properties if it has it","gains magical properties", "turns into lead", "becomes the most teasured item(s) of the owner", "is replaced by an item of signifigant value", "becomes edible", "becomes desireable to all those around", "turns into a mini-kobold", "turns into a mini-young dragon","lose all friction"},
				/*Random object belonging to target*/{" turns to dust"," turns to ice"," explodes dealing 5d8 damage to eveyone in a 10ft radius","turns into pure gold", "appears at the owners home", "shrinks by half", "doubles in size", "turns to glass", "gains sentience", "does +1 damage to anything it hits", "increases in temperature by 5d10 degrees fahrenheit", "decreases in temperature by 5d10 degrees fahrenheit", "does 1d4 fire damage", "does 1d4 cold damage", "is poisonous", "is replaced by an identical item of lower value", "is replaced by an identical item of greater value", "loses magical properties if it has it","gains magical properties", "turns into lead", "becomes the most teasured item(s) of the owner", "is replaced by an item of signifigant value", "becomes edible", "becomes desireable to all those around", "turns into a mini-kobold", "turns into a mini-young dragon","lose all friction"},
				/*All objects belonging to caster */{" turns to dust"," turns to ice"," explodes dealing 5d8 damage to eveyone in a 10ft radius","turns into pure gold", "appears at the owners home", "shrinks by half", "doubles in size", "turns to glass", "gains sentience", "does +1 damage to anything it hits", "increases in temperature by 5d10 degrees fahrenheit", "decreases in temperature by 5d10 degrees fahrenheit", "does 1d4 fire damage", "does 1d4 cold damage", "is poisonous", "is replaced by an identical item of lower value", "is replaced by an identical item of greater value", "loses magical properties if it has it","gains magical properties", "turns into lead", "becomes the most teasured item(s) of the owner", "is replaced by an item of signifigant value", "becomes edible", "become desireable to all those around","lose all friction"},
				/*All objects belonging to target  */{" turns to dust"," turns to ice"," explodes dealing 5d8 damage to eveyone in a 10ft radius","turns into pure gold", "appears at the owners home", "shrinks by half", "doubles in size", "turns to glass", "gains sentience", "does +1 damage to anything it hits", "increases in temperature by 5d10 degrees fahrenheit", "decreases in temperature by 5d10 degrees fahrenheit", "does 1d4 fire damage", "does 1d4 cold damage", "is poisonous", "is replaced by an identical item of lower value", "is replaced by an identical item of greater value", "loses magical properties if it has it","gains magical properties", "turns into lead", "becomes the most teasured item(s) of the owner", "is replaced by an item of signifigant value", "becomes edible", "become desireable to all those around", "lose all friction"},
				/*Nearest plant */{"Turns into a gnoll","turns into a zombie","grows to biggest possible size", "gains sentience", "turns to ice", "turns to dust", "leeches 2d8 HP from caster", "bursts into flame", "becomes and ent", "dies", "grows edible fruits", "becomes luminescent", "turns to gold", "turns to stone", "has a crisis of faith/existence", "grows a face", "turns invisible", "ages 100d100", "grows fruit poisonous to the casters race", "grows fruit only edible to the caster", "grows fruit only edible to the casters race"},
				/*Nearest lake */{"is filled with sulfuric acid","is poisoned with cyanide","heals all who drink it by 5d4 HP", "has gold ore appear in it", "drains", "is filled with lava", " de-ages all who drink it by 4d4 years(once)", "ages all who drink it by 4d4 years(once)", "has a magical item at the bottom", "grants immortality to the first being that drinks from it", "tastes like strawberries", "turns red", "turns green", "deals 2d4 poison damage to those who drink from it", "loses half its water", "overflows", "has a kraken live in it", "has an aboleth make it its home", "gains islands in the center", "expands by double its size"},
				/*Nearest Forest */{"catches fire","leaks into the feywild","leaks into the shadowfell", "is infested by wolves", "is infested with dryads", "disappears", "turns to stone", "grows rapidy", "has half of its plants gain sentience", "turns to silver", "has all its trees double in size", "causes all who enter to be lost forever", "gains a hatred for the casters race", "blooms with fruit", "becomes twisted and dark"},
				/*Nearest mountain */{"disappears","gets up and walks away at 5d10 m/s"," turns into valuable gems", "has dwarves move in", "has a dragon move in", "gains precious metals", "is dark and imposing", "becomes a volcano", "grows to twice its size", "has a fortress on top", "is made of glass", "has a magic dungeon", "has a portal to the fire plane", "has a portal to the shadowfell", "has an evil wizrd tower atop it"},
				/*Man-made object */{"turns to dust","turns to gold","is blessed by a god", "gains sentience", "turns into glass", "turns into steel", "emits unearthly screams", "drops 8d4 diamonds worth 500gp every full moon", "becomes twisted and grotesque", "kills those who come within 10ft on a failed con save(10)", "increases in weight by quadruple", "is a portal to the feywild", "grants a wish to the first being that touches it", "falls", "turns all who touch it to stone", "forces those who touch it to make a sanity save or suffer madness", "becomes the god of the nearest civilizaion and gains powers as such"},
				/*Nearest tavern */{"has a brawl break out"," gains a +50 to its buisness rolls for the next 5d8 tendays","burns down", "has all plate and cupware turn to gold", "turns to glass", "turns to silver wih gold accents", "gets a -50 on all buisness rolls for the next 5d8 tendays", "has all its beer go sour", "gets  a shipment of valuable spirits", "is haunted by a strange being", "gains a + 25 to its buisness rolls for the next 5d8 tendays ", "gets a -25 to its buisness rolls for the next 5d8 tendays "},
				/*Nearest town */{"","",""},
				/*Nearest village */{"","",""},
				/*Nearest Castle */{"","",""},
				/*NEarest City */{"","",""},
				/*Nearest Djinn */{"","",""},
				/*Nearest Cult */{"","",""},
				/*Nearest Religious order */{"","",""},
				/*Nearest Lich */{"","",""},
				/*Nearest Dragon */{"wants to add the caster to their hoard","wants to add the target to their hoard","will grant the caster a favor"},
				/*NEarest Tribe */{"","",""},
				/*Nearest Monk monastery */{"","",""},
				/*Nearest Demon */{"","",""},
				/*Nearest god(of any kind) */{"grants a favour to the caster","despises the target","wants the target to worship them"},
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