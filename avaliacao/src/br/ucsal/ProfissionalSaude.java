package br.ucsal;

import java.util.Date;

//herança
public class ProfissionalSaude extends Pessoa{
    private String  Tipo;
    private String Especialidade;
    private int QtdAtendimentos;
    
    //Construtor
    public ProfissionalSaude(int id, String nome, int contato, String Tipo, String Especialidade, String string, String string2, int i, Date date, boolean b) {
        super(id, nome, contato);
        this.Tipo = Tipo;
        this.Especialidade = Especialidade;
    }

  //Getters e Setters para acessar e modificar os atributos encapsulados.
	public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }



    public String getEspecialidade() {
        return Especialidade;
    }
    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }


	public int getQtdAtendimentos() {
		return QtdAtendimentos;
	}
	public void setQtdAtendimentos(int qtdAtendimentos) {
		QtdAtendimentos = qtdAtendimentos;
	}


	
	}



    
