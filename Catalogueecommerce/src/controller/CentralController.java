package controller;

import java.util.ArrayList;
import java.util.List;

import dao.I_ProduitDAO;
import dao.ProduitDAO;
import entite.Catalogue;
import entite.I_Catalogue;
import entite.I_Produit;

public class CentralController 
{
	private I_Catalogue catalogue;
	private I_ProduitDAO produit_dao;
	private AjouterProduitController ajouter_produit_controller;
	public CentralController()
	{
		this.catalogue = new Catalogue();
		this.produit_dao = new ProduitDAO();
		List <I_Produit> tous_les_produits_du_catalogue = this.produit_dao.getAllProduits();
		this.catalogue.addProduits(tous_les_produits_du_catalogue);
	}
	
	public void ajouterProduit(String nom_produit,float prix_ht_produit,int quantite_en_stock)
	{
		this.ajouter_produit_controller.ajouterProduit(nom_produit, prix_ht_produit, quantite_en_stock,this.catalogue);
	}
}
