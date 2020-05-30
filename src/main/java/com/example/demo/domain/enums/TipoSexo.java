package com.example.demo.domain.enums;

public enum TipoSexo {
	
	MACHO(1, "Macho"), FEMEA(2, "Femea");
	
	private int cod;
	private String descricao;

	private TipoSexo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoSexo toEnum(Integer cod) {
		if (cod == null)
			return null;

		for (TipoSexo c : TipoSexo.values()) {
			if (cod.equals(c.getCod()))
				return c;
		}

		throw new IllegalArgumentException("Código inválido: " + cod);

	}

}
