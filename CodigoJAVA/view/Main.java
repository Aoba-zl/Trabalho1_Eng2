package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	private int alturaCampos = 20;
	private JPanel contentPane;
	private JTextField tf_c_proprietario_nome, tf_c_apartamento_Propietario;
	private JTabbedPane tabbedPane, tabbedPane_1, tabbedPane_2;
	private JPanel p_inicio, p_cadastrar, p_c_proprietario, p_c_apartamento, p_c_itens, p_lancamentos;
	private JPanel p_l_apartamento, p_l_condominio, p_l_manterDespesas, p_l_excluirDespesas, p_calcularCondominio;
	private JLabel lbl_msgInicio_boas_vindas, lbl_msgInicio_logadocomo, lbl_c_proprietario_CPF, lbl_c_proprietario_nome;
	private JLabel lbl_c_proprietario_telefone, lbl_c_itens_Item, lbl_c_itens_Referencia;
	private JLabel lbl_c_apartamento_Proprietario, lbl_c_apartamento_TipoOcupacao, lbl_c_apartamento_Numero, lbl_c_apartamento_QtddQuartos;
	private JFormattedTextField ftf_c_proprietario_telefone, ftf_c_proprietario_CPF;
	private JFormattedTextField ftf_c_apartamento_Numero, ftf_c_apartamento_QtddQuartos, ftf_c_itens_Item, ftf_c_itens_Referencia;
	private JButton btn_c_proprietario_buscarCPF, btn_c_proprietario_Salvar, btn_c_apartamento_Salvar, btn_c_itens_Salvar;
	private JComboBox cbox_c_apartamento_Tipo;
	private JLabel lbl_l_apto_Despesa;
	private JLabel lbl_l_apto_DtGeracao;
	private JLabel lbl_l_apto_Valor;
	private JLabel lbl_l_apto_DtVencimento;
	private JTextField tf_l_apto_Despesa;
	private JTextField tf_l_apto_DtGeracao;
	private JTextField tf_l_apto_Valor;
	private JTextField tf_l_apto_DtVencimento;
	private JButton btn_l_apto_BuscarDespesa;
	private JButton btn_l_apto_Salvar;
	private JLabel lbl_l_despesa_Despesa;
	private JLabel lbl_l_despesa_DtGeracao;
	private JLabel lbl_l_despesa_Valor;
	private JLabel lbl_l_despesa_DtVencimento;
	private JTextField tf_l_despesa_Despesa;
	private JTextField tf_l_despesa_DtGeracao;
	private JTextField tf_l_despesa_Valor;
	private JTextField tf_l_despesa_DtVencimento;
	private JButton btn_l_despesa_BuscarDespesa;
	private JButton btn_l_despesa_Salvar;
	private JLabel lbl_l_despesa_Apartamento;
	private JTextField tf_l_despesa_Apto;
	private JButton btn_l_despesa_BuscarApto;
	private JLabel lbl_l_manterDespesas_Despesa;
	private JLabel lbl_l_manterDespesas_Tipo;
	private JLabel lbl_l_manterDespesas_TipoFixo;
	private JLabel lbl_l_manterDespesas_TipoVariavel;
	private JLabel lbl_l_manterDespesas_Valor;
	private JTextField tf_l_manterDespesas_Valor;
	private JTextField tf_l_manterDespesas_Despesa;
	private JLabel lbl_l_excluir_Despesa;
	private JTextField tf_l_excluir_Despesa;
	private JButton btn_l_excluir_Buscar;
	private JButton btn_l_excluir_Excluir;
	private JLabel lbl_calcular_NQuartos;
	private JLabel lbl_calcular_TotalDespesas;
	private JTextField tf_calcular_NQuartos;
	private JTextField tf_calcular_TotalDespesas;
	private JButton btn_calcular_CalcularCondominio;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	void setElementos()
	{
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		setTabInicio();
		setTabCadastro();
		setTabLancamento();
		setTabCalculoCondominio();
	}	
	void setTabInicio()
	{
		p_inicio = new JPanel();
		tabbedPane.addTab("Início", null, p_inicio, null);
		p_inicio.setLayout(null);
		
		lbl_msgInicio_boas_vindas = new JLabel("Seja bem-vinde ao sistema de Gerenciamento de Contas do Condomínio!");
		lbl_msgInicio_boas_vindas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_msgInicio_boas_vindas.setBounds(10, 11, 500, 33);
		p_inicio.add(lbl_msgInicio_boas_vindas);
		
		lbl_msgInicio_logadocomo = new JLabel("Você está logade com SÍNDICA");
		lbl_msgInicio_logadocomo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_msgInicio_logadocomo.setBounds(10, 66, 500, 27);
		p_inicio.add(lbl_msgInicio_logadocomo);
	}
	
	void setTabCadastro()
	{
		p_cadastrar = new JPanel();
		tabbedPane.addTab("Cadastrar/Atualizar dados", null, p_cadastrar, null);
		p_cadastrar.setLayout(new BorderLayout(0, 0));
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		p_cadastrar.add(tabbedPane_1, BorderLayout.CENTER);
		setTabCadastroProprietario();
		setTabCadastroApartamento();
		setTabCadastroItensCondominio();
	}
	void setTabCadastroProprietario()
	{
		p_c_proprietario = new JPanel();
		tabbedPane_1.addTab("Proprietário", null, p_c_proprietario, null);
		p_c_proprietario.setLayout(null);
		
		setTabCadastroProprietarioLabels();
		
		ftf_c_proprietario_CPF = new JFormattedTextField();
		ftf_c_proprietario_CPF.setBounds(80, 30, 110, alturaCampos);
		p_c_proprietario.add(ftf_c_proprietario_CPF);
		
		btn_c_proprietario_buscarCPF = new JButton("Buscar");
		btn_c_proprietario_buscarCPF.setBounds(200, 30, 110, alturaCampos);
		p_c_proprietario.add(btn_c_proprietario_buscarCPF);

		tf_c_proprietario_nome = new JTextField();
		tf_c_proprietario_nome.setBounds(80, 60, 110, alturaCampos);
		p_c_proprietario.add(tf_c_proprietario_nome);
		tf_c_proprietario_nome.setColumns(10);
		
		ftf_c_proprietario_telefone = new JFormattedTextField();
		ftf_c_proprietario_telefone.setBounds(80, 90, 110, alturaCampos);
		p_c_proprietario.add(ftf_c_proprietario_telefone);
		
		btn_c_proprietario_Salvar = new JButton("Salvar");
		btn_c_proprietario_Salvar.setBounds(400, 145, 90, alturaCampos);
		p_c_proprietario.add(btn_c_proprietario_Salvar);
	}
	void setTabCadastroProprietarioLabels()
	{
		lbl_c_proprietario_CPF = new JLabel("CPF:");
		lbl_c_proprietario_CPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_c_proprietario_CPF.setBounds(10, 30, 60, 15);
		p_c_proprietario.add(lbl_c_proprietario_CPF);
		
		lbl_c_proprietario_nome = new JLabel("Nome:");
		lbl_c_proprietario_nome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_c_proprietario_nome.setBounds(10, 60, 60, 15);
		p_c_proprietario.add(lbl_c_proprietario_nome);
		
		lbl_c_proprietario_telefone = new JLabel("Telefone:");
		lbl_c_proprietario_telefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_c_proprietario_telefone.setBounds(10, 90, 60, 15);
		p_c_proprietario.add(lbl_c_proprietario_telefone);
	}
	void setTabCadastroApartamento()
	{
		p_c_apartamento = new JPanel();
		tabbedPane_1.addTab("Apartamento", null, p_c_apartamento, null);
		p_c_apartamento.setLayout(null);
		
		setTabCadastroApartamentoLabels();
		
		btn_c_apartamento_Salvar = new JButton("Salvar");
		btn_c_apartamento_Salvar.setBounds(400, 145, 90, alturaCampos);
		p_c_apartamento.add(btn_c_apartamento_Salvar);
		
		tf_c_apartamento_Propietario = new JTextField();
		tf_c_apartamento_Propietario.setBounds(140, 30, 110, alturaCampos);
		p_c_apartamento.add(tf_c_apartamento_Propietario);
		tf_c_apartamento_Propietario.setColumns(10);
		
		cbox_c_apartamento_Tipo = new JComboBox();
		cbox_c_apartamento_Tipo.setBounds(140, 60, 110, 22);
		p_c_apartamento.add(cbox_c_apartamento_Tipo);
		
		ftf_c_apartamento_Numero = new JFormattedTextField();
		ftf_c_apartamento_Numero.setBounds(140, 90, 110, alturaCampos);
		p_c_apartamento.add(ftf_c_apartamento_Numero);
		
		ftf_c_apartamento_QtddQuartos = new JFormattedTextField();
		ftf_c_apartamento_QtddQuartos.setBounds(140, 120, 110, alturaCampos);
		p_c_apartamento.add(ftf_c_apartamento_QtddQuartos);
	}
	void setTabCadastroApartamentoLabels()
	{
		lbl_c_apartamento_Proprietario = new JLabel("Proprietário:");
		lbl_c_apartamento_Proprietario.setBounds(10, 30, 125, 15);
		p_c_apartamento.add(lbl_c_apartamento_Proprietario);
		
		lbl_c_apartamento_TipoOcupacao = new JLabel("Tipo de Ocupação:");
		lbl_c_apartamento_TipoOcupacao.setBounds(10, 60, 125, 15);
		p_c_apartamento.add(lbl_c_apartamento_TipoOcupacao);
		
		lbl_c_apartamento_Numero = new JLabel("Número:");
		lbl_c_apartamento_Numero.setBounds(10, 90, 125, 15);
		p_c_apartamento.add(lbl_c_apartamento_Numero);
		
		lbl_c_apartamento_QtddQuartos = new JLabel("Quantidade de Quartos:");
		lbl_c_apartamento_QtddQuartos.setBounds(10, 120, 125, 15);
		p_c_apartamento.add(lbl_c_apartamento_QtddQuartos);		
	}
	void setTabCadastroItensCondominio()
	{
		p_c_itens = new JPanel();
		tabbedPane_1.addTab("Itens do Condomínio", null, p_c_itens, null);
		p_c_itens.setLayout(null);
		
		setTabCadastroItensCondominioLabels();
		
		ftf_c_itens_Item = new JFormattedTextField();
		ftf_c_itens_Item.setBounds(85, 30, 110, alturaCampos);
		p_c_itens.add(ftf_c_itens_Item);
		
		ftf_c_itens_Referencia = new JFormattedTextField();
		ftf_c_itens_Referencia.setBounds(85, 60, 110, alturaCampos);
		p_c_itens.add(ftf_c_itens_Referencia);
		
		btn_c_itens_Salvar = new JButton("Salvar");
		btn_c_itens_Salvar.setBounds(400, 145, 90, alturaCampos);
		p_c_itens.add(btn_c_itens_Salvar);		
	}
	void setTabCadastroItensCondominioLabels()
	{
		lbl_c_itens_Item = new JLabel("Item:");
		lbl_c_itens_Item.setBounds(10, 30, 46, 14);
		p_c_itens.add(lbl_c_itens_Item);
		
		lbl_c_itens_Referencia = new JLabel("Referência:");
		lbl_c_itens_Referencia.setBounds(10, 60, 64, 14);
		p_c_itens.add(lbl_c_itens_Referencia);
	}
	
	void setTabLancamento()
	{
		p_lancamentos = new JPanel();
		tabbedPane.addTab("Lançamentos", null, p_lancamentos, null);
		p_lancamentos.setLayout(new BorderLayout(0, 0));
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		p_lancamentos.add(tabbedPane_2, BorderLayout.CENTER);
		
		setTabLancamentoApartamento();
		setTabLancamentoCondominio();
		setTabLancamentoCriaDespesa();
		setTabLancamentoExcluiDespesa();
	}
	void setTabLancamentoApartamento()
	{
		p_l_apartamento = new JPanel();
		tabbedPane_2.addTab("por Apartemento", null, p_l_apartamento, null);
		p_l_apartamento.setLayout(null);
		
		setTabLancamentoApartamentoLabels();

		tf_l_apto_Despesa = new JTextField();
		tf_l_apto_Despesa.setBounds(100, 30, 90, alturaCampos);
		p_l_apartamento.add(tf_l_apto_Despesa);
		tf_l_apto_Despesa.setColumns(10);
		
		tf_l_apto_DtGeracao = new JTextField();
		tf_l_apto_DtGeracao.setBounds(100, 60, 90, alturaCampos);
		p_l_apartamento.add(tf_l_apto_DtGeracao);
		tf_l_apto_DtGeracao.setColumns(10);
		
		tf_l_apto_Valor = new JTextField();
		tf_l_apto_Valor.setBounds(375, 30, 90, alturaCampos);
		p_l_apartamento.add(tf_l_apto_Valor);
		tf_l_apto_Valor.setColumns(10);
		
		tf_l_apto_DtVencimento = new JTextField();
		tf_l_apto_DtVencimento.setBounds(375, 60, 90, alturaCampos);
		p_l_apartamento.add(tf_l_apto_DtVencimento);
		tf_l_apto_DtVencimento.setColumns(10);
		
		btn_l_apto_BuscarDespesa = new JButton("Buscar");
		btn_l_apto_BuscarDespesa.setBounds(195, 30, 65, 20);
		p_l_apartamento.add(btn_l_apto_BuscarDespesa);
		
		btn_l_apto_Salvar = new JButton("Salvar");
		btn_l_apto_Salvar.setBounds(400, 145, 90, alturaCampos);
		p_l_apartamento.add(btn_l_apto_Salvar);
	}
	void setTabLancamentoApartamentoLabels()
	{
		lbl_l_apto_Despesa = new JLabel("Despesa:");
		lbl_l_apto_Despesa.setBounds(10, 30, 80, 15);
		p_l_apartamento.add(lbl_l_apto_Despesa);
		
		lbl_l_apto_DtGeracao = new JLabel("Data Geração:");
		lbl_l_apto_DtGeracao.setBounds(10, 60, 80, 15);
		p_l_apartamento.add(lbl_l_apto_DtGeracao);
		
		lbl_l_apto_Valor = new JLabel("Valor:");
		lbl_l_apto_Valor.setBounds(270, 30, 90, 15);
		p_l_apartamento.add(lbl_l_apto_Valor);
		
		lbl_l_apto_DtVencimento = new JLabel("Data Vencimento:");
		lbl_l_apto_DtVencimento.setBounds(270, 60, 105, 15);
		p_l_apartamento.add(lbl_l_apto_DtVencimento);
	}
	void setTabLancamentoCondominio()
	{
		int despesa_y = 60;
		p_l_condominio = new JPanel();
		tabbedPane_2.addTab("do Condomínio", null, p_l_condominio, null);
		p_l_condominio.setLayout(null);
		
		setTabLancamentoCondominioLabels();
		
		tf_l_despesa_Despesa = new JTextField();
		tf_l_despesa_Despesa.setColumns(10);
		tf_l_despesa_Despesa.setBounds(100, despesa_y, 90, alturaCampos);
		p_l_condominio.add(tf_l_despesa_Despesa);
		
		tf_l_despesa_DtGeracao = new JTextField();
		tf_l_despesa_DtGeracao.setColumns(10);
		tf_l_despesa_DtGeracao.setBounds(100, despesa_y+30, 90, alturaCampos);
		p_l_condominio.add(tf_l_despesa_DtGeracao);
		
		tf_l_despesa_Valor = new JTextField();
		tf_l_despesa_Valor.setColumns(10);
		tf_l_despesa_Valor.setBounds(373, 60, 90, alturaCampos);
		p_l_condominio.add(tf_l_despesa_Valor);
		
		tf_l_despesa_DtVencimento = new JTextField();
		tf_l_despesa_DtVencimento.setColumns(10);
		tf_l_despesa_DtVencimento.setBounds(373, 90, 90, alturaCampos);
		p_l_condominio.add(tf_l_despesa_DtVencimento);
		
		btn_l_despesa_BuscarDespesa = new JButton("Buscar");
		btn_l_despesa_BuscarDespesa.setBounds(195, despesa_y, 65, alturaCampos);
		p_l_condominio.add(btn_l_despesa_BuscarDespesa);
		
		btn_l_despesa_Salvar = new JButton("Salvar");
		btn_l_despesa_Salvar.setBounds(400, 145, 90, alturaCampos);
		p_l_condominio.add(btn_l_despesa_Salvar);
		
		tf_l_despesa_Apto = new JTextField();
		tf_l_despesa_Apto.setBounds(100, 30, 120, alturaCampos);
		p_l_condominio.add(tf_l_despesa_Apto);
		tf_l_despesa_Apto.setColumns(10);
		
		btn_l_despesa_BuscarApto = new JButton("Buscar");
		btn_l_despesa_BuscarApto.setBounds(220, 30, 90, alturaCampos);
		p_l_condominio.add(btn_l_despesa_BuscarApto);
		
	}
	void setTabLancamentoCondominioLabels()
	{
		int despesa_y = 60;

		lbl_l_despesa_Apartamento = new JLabel("Apartamento:");
		lbl_l_despesa_Apartamento.setBounds(10, despesa_y-30, 90, 15);
		p_l_condominio.add(lbl_l_despesa_Apartamento);
		
		lbl_l_despesa_Despesa = new JLabel("Despesa:");
		lbl_l_despesa_Despesa.setBounds(10, despesa_y, 80, 15);
		p_l_condominio.add(lbl_l_despesa_Despesa);
		
		lbl_l_despesa_DtGeracao = new JLabel("Data Geração:");
		lbl_l_despesa_DtGeracao.setBounds(10, despesa_y+30, 80, 15);
		p_l_condominio.add(lbl_l_despesa_DtGeracao);
		
		lbl_l_despesa_Valor = new JLabel("Valor:");
		lbl_l_despesa_Valor.setBounds(270, despesa_y, 90, 15);
		p_l_condominio.add(lbl_l_despesa_Valor);
		
		lbl_l_despesa_DtVencimento = new JLabel("Data Vencimento:");
		lbl_l_despesa_DtVencimento.setBounds(270, 90, 105, 15);
		p_l_condominio.add(lbl_l_despesa_DtVencimento);
	}
	void setTabLancamentoCriaDespesa()
	{
		p_l_manterDespesas = new JPanel();
		tabbedPane_2.addTab("Criar/Atualizar Despesas", null, p_l_manterDespesas, null);
		p_l_manterDespesas.setLayout(null);
		
		setTabLancamentoCriaDespesaLabels();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(60, 85, 30, 25);
		p_l_manterDespesas.add(rdbtnNewRadioButton);
		
		JRadioButton rbtn_l_manterDespesas_Variavel = new JRadioButton("");
		rbtn_l_manterDespesas_Variavel.setBounds(60, 115, 30, 25);
		p_l_manterDespesas.add(rbtn_l_manterDespesas_Variavel);
		
		tf_l_manterDespesas_Valor = new JTextField();
		tf_l_manterDespesas_Valor.setBounds(140, 90, 60, 20);
		p_l_manterDespesas.add(tf_l_manterDespesas_Valor);
		tf_l_manterDespesas_Valor.setColumns(10);
		
		JButton btn_l_manterDespesas_Salvar = new JButton("Salvar");
		btn_l_manterDespesas_Salvar.setBounds(400, 145, 90, 20);
		p_l_manterDespesas.add(btn_l_manterDespesas_Salvar);
		
		tf_l_manterDespesas_Despesa = new JTextField();
		tf_l_manterDespesas_Despesa.setBounds(60, 30, 100, 20);
		p_l_manterDespesas.add(tf_l_manterDespesas_Despesa);
		tf_l_manterDespesas_Despesa.setColumns(10);
		
		JButton btn_l_manterDespesas_BuscaDespesa = new JButton("Buscar");
		btn_l_manterDespesas_BuscaDespesa.setBounds(165, 30, 80, 20);
		p_l_manterDespesas.add(btn_l_manterDespesas_BuscaDespesa);
	}
	void setTabLancamentoCriaDespesaLabels()
	{
		lbl_l_manterDespesas_Despesa = new JLabel("Despesa:");
		lbl_l_manterDespesas_Despesa.setBounds(10, 30, 45, 15);
		p_l_manterDespesas.add(lbl_l_manterDespesas_Despesa);
		
		lbl_l_manterDespesas_Tipo = new JLabel("Tipo");
		lbl_l_manterDespesas_Tipo.setBounds(10, 60, 45, 15);
		p_l_manterDespesas.add(lbl_l_manterDespesas_Tipo);
		
		lbl_l_manterDespesas_TipoFixo = new JLabel("Fixo");
		lbl_l_manterDespesas_TipoFixo.setBounds(10, 90, 45, 15);
		p_l_manterDespesas.add(lbl_l_manterDespesas_TipoFixo);
		
		lbl_l_manterDespesas_TipoVariavel = new JLabel("Variavel");
		lbl_l_manterDespesas_TipoVariavel.setBounds(10, 120, 45, 15);
		p_l_manterDespesas.add(lbl_l_manterDespesas_TipoVariavel);
		
		lbl_l_manterDespesas_Valor = new JLabel("Valor:");
		lbl_l_manterDespesas_Valor.setBounds(100, 90, 40, 15);
		p_l_manterDespesas.add(lbl_l_manterDespesas_Valor);
	}
	void setTabLancamentoExcluiDespesa()
	{
		p_l_excluirDespesas = new JPanel();
		tabbedPane_2.addTab("Excluir Despesas", null, p_l_excluirDespesas, null);
		p_l_excluirDespesas.setLayout(null);
		
		lbl_l_excluir_Despesa = new JLabel("Despesa:");
		lbl_l_excluir_Despesa.setBounds(10, 50, 60, 15);
		p_l_excluirDespesas.add(lbl_l_excluir_Despesa);
		
		tf_l_excluir_Despesa = new JTextField();
		tf_l_excluir_Despesa.setBounds(74, 50, 150, 20);
		p_l_excluirDespesas.add(tf_l_excluir_Despesa);
		tf_l_excluir_Despesa.setColumns(10);
		
		btn_l_excluir_Buscar = new JButton("Buscar");
		btn_l_excluir_Buscar.setBounds(234, 50, 70, 20);
		p_l_excluirDespesas.add(btn_l_excluir_Buscar);
		
		btn_l_excluir_Excluir = new JButton("Excluir");
		btn_l_excluir_Excluir.setBounds(400, 145, 90, 20);
		p_l_excluirDespesas.add(btn_l_excluir_Excluir);
		
		
	}
	
	void setTabCalculoCondominio()
	{
		p_calcularCondominio = new JPanel();
		tabbedPane.addTab("Calcular Condomínio", null, p_calcularCondominio, null);
		p_calcularCondominio.setLayout(null);
		
		lbl_calcular_NQuartos = new JLabel("Número Total de Quartos");
		lbl_calcular_NQuartos.setBounds(48, 30, 130, 15);
		p_calcularCondominio.add(lbl_calcular_NQuartos);
		
		lbl_calcular_TotalDespesas = new JLabel("Total de Despesas");
		lbl_calcular_TotalDespesas.setBounds(269, 30, 130, 15);
		p_calcularCondominio.add(lbl_calcular_TotalDespesas);
		
		tf_calcular_NQuartos = new JTextField();
		tf_calcular_NQuartos.setBounds(48, 60, 120, 20);
		p_calcularCondominio.add(tf_calcular_NQuartos);
		tf_calcular_NQuartos.setColumns(10);
		
		tf_calcular_TotalDespesas = new JTextField();
		tf_calcular_TotalDespesas.setBounds(269, 60, 94, 20);
		p_calcularCondominio.add(tf_calcular_TotalDespesas);
		tf_calcular_TotalDespesas.setColumns(10);
		
		btn_calcular_CalcularCondominio = new JButton("Calcular Condomínio e Gerar Boleto");
		btn_calcular_CalcularCondominio.setBounds(149, 145, 232, 20);
		p_calcularCondominio.add(btn_calcular_CalcularCondominio);
	}
	
	
	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setElementos();

		
		
		
	}
}
