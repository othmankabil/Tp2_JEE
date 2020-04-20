package Emsi.Maarif;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import Emsi.Maarif.dao.CategorieRepository;
import Emsi.Maarif.dao.ProduitRepository;
import Emsi.Maarif.entities.Categorie;
import Emsi.Maarif.entities.Produit;

@SpringBootApplication
public class Tp2JpaHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(Tp2JpaHibernateApplication.class, args);
		ProduitRepository ProduitsRep= ctx.getBean(ProduitRepository.class);
		CategorieRepository categorieRep = ctx.getBean(CategorieRepository.class);
		
		
		Categorie c1 = new Categorie("Categorie Test 1");
		Categorie c2 = new Categorie("Categorie test 2");
		categorieRep.save(c1);
		categorieRep.save(c2);
		
		Produit p1 = new Produit("P1",500,10,c1);
		Produit p2 = new Produit("P111",345,18,c1);
		Produit p3 = new Produit("P2",641,144,c2);
		Produit p4 = new Produit("P21453",5477,13,c2);
		ProduitsRep.save(p1);
		ProduitsRep.save(p2);
		ProduitsRep.save(p3);
		ProduitsRep.save(p4);
		
		List<Produit> produits = ProduitsRep.findAll();
		for(Produit p : produits)
		{
			System.out.println(p);
		}
				
	}

}
