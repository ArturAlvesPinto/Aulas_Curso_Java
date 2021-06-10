package aula2;

public class UsaMedico {

	public static void main(String[] args) {
		
		Medico medico01 = new Medico();
		medico01.setNome("João Jose");
		medico01.setCrm("CRM-9876");
		System.out.println(medico01);
		
		MedicoCirurgiao medico02 = new MedicoCirurgiao();
		medico02.setNome("Maiara Maria");
		medico02.setCrm("CRM-4321");
		medico02.setTipoCirurgia("Neuro-Ciruagia");
		medico02.setQtdCirurgia(14);
		System.out.println(medico02);
		
		MedicoOrtopedista medico03 = new MedicoOrtopedista();
		medico03.setNome("Alberto Arnaldo");
		medico03.setCrm("CRM-6497");
		medico03.setTipoOrtopedia("Infantil");
		medico03.setNumPacientes(38);
		System.out.println(medico03);
		
		MedicoFono medico04 = new MedicoFono();
		medico04.setNome("Teresa Tamara");
		medico04.setCrm("CRM-9843");
		medico04.setTurno("Manhã");
		medico04.setTempoTrabalho("25 anos");
		medico04.setQtdHosprtaisTrabalhdos(3);
		System.out.println(medico04);
		System.out.println(medico04.getQtdHosprtaisTrabalhdos()); // Este é o modo como deve ser chamado o atributo static da class
		
		MedicoFono medico05 = new MedicoFono();
		medico05.setNome("Rosa Rosaria");
		medico05.setCrm("CRM-6547");
		medico05.setTurno("Tarde");
		medico05.setTempoTrabalho("12 anos");
		medico05.qtdHosprtaisTrabalhdos = 25; // Outro exemplo de chamada.
		System.out.println(medico05);
		System.out.println(medico05.qtdHosprtaisTrabalhdos); //Neste caso não pode ter o private na frente, para que fique acessível.
		
	}
}
