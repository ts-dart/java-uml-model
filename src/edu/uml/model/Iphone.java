package edu.uml.model;

public class Iphone extends Telephone implements InternetBrowser, MusicPlayer{
	private boolean playingMusic = false;
	private String selectedMusic = "";
	private String currentPage = "";
	
	public Iphone() { super(); }
	
	public void displayPage() {
		System.out.println("Acessando a pagina "+this.currentPage);
	}
	
	public void addNewTab(String newTab) {
		System.out.println("Abrindo nova aba, acessando "+newTab);
	}
	
	public void updatePage() {
		System.out.println("Atulizando a pagina "+this.currentPage);
	}
	
	public void play() {
		System.out.println("Tocando a musica "+this.selectedMusic);
		this.playingMusic = true;
	}
	
	public void pause() {
		System.out.println("Pausando musica");
		this.playingMusic = false;
	}
	
	public void selectMusic(String music) {
		this.selectedMusic = music;
	}
}
