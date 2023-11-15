package view;

import br.edu.fateczl.arvore.ArvoreInt.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt arv = new ArvoreInt();
		int [] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		
		for (int i : vetor) {
			arv.insert(i);
		}
		
		try {
			arv.prefixSearch();
			arv.infixSearch();
			arv.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
