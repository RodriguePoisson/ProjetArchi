package controller;

import dao.I_ProduitDAO;
import dao.ProduitDAO;
import entite.I_Catalogue;
import entite.I_Produit;
import entite.Produit;

public class AjouterProduitController
{

	private I_ProduitDAO produit_dao;
	public AjouterProduitController()
	{
		produit_dao = new ProduitDAO();
	}
	
	public void ajouterProduit(String nom_produit,float prix_ht_produit,int quantite_en_stock_produit,I_Catalogue catalogue)
	{
		I_Produit produit_a_ajouter = new Produit(nom_produit,prix_ht_produit,quantite_en_stock_produit);
		produit_dao.createProduit(produit_a_ajouter);
		catalogue.addProduit(produit_a_ajouter);
	}
}
