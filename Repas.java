class Repas{

	private int numero;
	private LocalDate date;

	public Repas(int numero,LocalDate date){
		this.numero=numero;
		this.date=date;
	}

	public void getNumero(){
		return this.numero;
	}
	public int setNumero(){
		this.numero=numero;
		return numero;
	}

}
