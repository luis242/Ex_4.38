package br.edu.ifsp.spo.lp1a3.sp301309x.cap4;

public class Descriptografar {
	
	int numero;
	int d1;
	int d2;
	int d3;
	int d4;
	
	public Descriptografar (int d1, int d2, int d3, int d4) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
	}
	
	public int getNumero() {
        return numero;
    }
	
	public int getD1() {
        return d1;
    }
	
	public int getD2() {
        return d2;
    }
	
	public int getD3() {
        return d3;
    }
	
	public int getD4() {
        return d4;
    }
	
	public void setNumero(int numero) {
        this.numero = numero;
    }
	
	public void setD1(int d1) {
        this.d1 = d1;
    }
	
	public void setD2(int d2) {
        this.d2 = d2;
    }
	
	public void setD3(int d3) {
        this.d3 = d3;
    }
	
	public void setD4(int d4) {
        this.d4 = d4;
    }
	
	public int Pdigito() {
		this.d1 = d1 +3;
		if(this.d1 >= 10.00) {
			d1 = d1 - 10;
		}
		return d1;
	}
	
	public int Qdigito() {
		this.d4 = d4 + 3;
		if(this.d4 >= 10.00) {
			d4 = d4 - 10;
		}
		return d4;
	}
	
	public int Tdigito() {
		this.d3 = d3  + 3;
		if(this.d3 >= 10.00) {
			d3 = d3 - 10;
		}
		return d3;
	}
	
	public int Sdigito() {
		this.d2 = d2  + 3;
		if(this.d2 >= 10.00) {
			d2 = d2 - 10;
		}
		return d2;
	}
	
	public void Troca1() {
		int aux;
		
		aux = this.d1;
		d1 = this.d3;
		d3 = aux;
		
		aux = this.d2;
		d2 = this.d4;
		d4 = aux;
	}

}
