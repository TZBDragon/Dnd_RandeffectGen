import java.util.*;
@SuppressWarnings("unused")
public class generator{
	public static void main(String[] args) {
		rand_gen randn = new rand_gen();
		int rand = randn.generator(43);
		System.out.println(rand);
		String[][] full = {
				/*Caster */{"","",""},
				/*target */{},
				/*Nearest ally */{},
				/*Nearest Enemy */{},
				/*Random object belonging to caster */{},
				/*Random object belonging to target*/{},
				/*All objects belonging to caster */{},
				/*All objects belonging to target  */{},
				/*Nearest plant */{},
				/*Nearest lake */{},
				/*Nearest Forest */{},
				/*Nearest mountain */{},
				/*Man-made object */{},
				/*Nearest tavern */{},
				/*Nearest town */{},
				/*Nearest village */{},
				/*Nearest Castle */{},
				/*NEarest City */{},
				/*Nearest Djinn */{},
				/*Nearest Cult */{},
				/*Nearest Religious order */{},
				/*Nearest Lich */{},
				/*Nearest Dragon */{},
				/*NEarest Tribe */{},
				/*Nearest Monk monastery */{},
				/*Nearest Demon */{},
				/*Nearest god(of any kind) */{},
				/*NEarest Paladin */{},
				/*Nearest Thieves Guild */{},
				/*Nearest Assassins GUild */{},
				/*Everything in 10ft */{},
				/*Everything in 50ft */{},
				/*Everything in 100ft */{},
				/*Everything in 500ft */{},
				/*Everything in 1000ft */{},
				/*Everything in 1 mile */{},
				/*Everything in 10 miles */{},
				/*Nearest Star */{},
				/*Nearest Planet (not yours) */{},
				/*Current Planet */{},
				/*Nearest Portal */{},
				/*Nearest plane */{},
				/*Reroll */{},
		};
	}
}