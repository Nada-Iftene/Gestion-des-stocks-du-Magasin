import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Stock extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField idField;
	private JTextField codeField;
	private JTextField nomField;
	private JTextField fournisseurField;
	private JTextField prixField;
	private JTextField suppField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stock frame = new Stock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion des stocks du Magasin");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(170, 11, 426, 54);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 86, 799, 109);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Code_produit", "Nom_produit", "Fournisseur", "Prix"
			}
		));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		

		JLabel lblCodeDeProduit = new JLabel("Code de produit :");
		lblCodeDeProduit.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodeDeProduit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCodeDeProduit.setBounds(12, 321, 123, 20);
		contentPane.add(lblCodeDeProduit);
		
		JLabel lblNomDeProduit = new JLabel("Nom de produit :");
		lblNomDeProduit.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomDeProduit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomDeProduit.setBounds(12, 352, 123, 20);
		contentPane.add(lblNomDeProduit);
		
		JLabel lblFournisseur = new JLabel("Fournisseur :");
		lblFournisseur.setHorizontalAlignment(SwingConstants.CENTER);
		lblFournisseur.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFournisseur.setBounds(12, 383, 123, 20);
		contentPane.add(lblFournisseur);
		
		JLabel lblPrix = new JLabel("Prix :");
		lblPrix.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrix.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrix.setBounds(12, 414, 123, 20);
		contentPane.add(lblPrix);
		
		codeField = new JTextField();
		codeField.setColumns(10);
		codeField.setBounds(164, 322, 155, 20);
		contentPane.add(codeField);
		
		nomField = new JTextField();
		nomField.setColumns(10);
		nomField.setBounds(164, 353, 155, 20);
		contentPane.add(nomField);
		
		fournisseurField = new JTextField();
		fournisseurField.setColumns(10);
		fournisseurField.setBounds(164, 384, 155, 20);
		contentPane.add(fournisseurField);
		
		prixField = new JTextField();
		prixField.setColumns(10);
		prixField.setBounds(164, 415, 155, 20);
		contentPane.add(prixField);
		
		suppField = new JTextField();
		suppField.setColumns(10);
		suppField.setBounds(621, 353, 155, 20);
		contentPane.add(suppField);
		
		JLabel lblCodeDeProduit_1 = new JLabel("Code de produit :");
		lblCodeDeProduit_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodeDeProduit_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCodeDeProduit_1.setBounds(473, 356, 123, 20);
		contentPane.add(lblCodeDeProduit_1);
		
		
		
		JLabel lblPrixTotale = new JLabel("Prix totale :");
		lblPrixTotale.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixTotale.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrixTotale.setBounds(520, 228, 123, 20);
		contentPane.add(lblPrixTotale);
		
		JLabel totalelabel = new JLabel("00.00");
		totalelabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalelabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		totalelabel.setBounds(653, 226, 123, 20);
		contentPane.add(totalelabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 290, 123, 20);
		contentPane.add(lblNewLabel_1);
		
		idField = new JTextField();
		idField.setBounds(164, 291, 155, 20);
		contentPane.add(idField);
		idField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ide = Integer.valueOf(idField.getText());
				int cd = Integer.valueOf(codeField.getText());
				float pri = Float.valueOf(prixField.getText());
				
				Produit pr = new Produit(ide,cd,nomField.getText(),fournisseurField.getText(),pri);
				
				Object [] o = {pr.getId(),pr.getCode(),pr.getNom(),pr.getFournisseur(),pr.getPrix()};
				
				model.addRow(o);
				
				idField.setText("");
				codeField.setText("");
				prixField.setText("");
				nomField.setText("");
				fournisseurField.setText("");
				
				/*for(int i=0;i<model.getRowCount();i++){
					float a= model.getValueAt(i, 4)+;
					totalelabel.setText("");
				}*/
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 217, 149, 31);
		contentPane.add(btnNewButton);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mod = model.getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString();
				ModifFram mf = new ModifFram(mod,model,table.getSelectedRow(),table.getSelectedColumn());
				mf.setVisible(true);
				
			}
		});
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModifier.setBounds(170, 218, 149, 31);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index=0;
				boolean found= false;
				for (int i=0;i< model.getRowCount();i++){
					if (suppField.getText().matches(model.getValueAt(i, 1).toString())){
						index=i;
						found = true;
					}
					
				}
				if(found==true){
				model.removeRow(index);
				}
				
				
			}
		});
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSupprimer.setBounds(573, 400, 149, 31);
		contentPane.add(btnSupprimer);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = 0;
				for(int i=0;i<model.getRowCount();i++){
					float b= Float.valueOf(model.getValueAt(i, 4).toString() );
					a = a + b;
				}
				String c = String.valueOf(a);
				totalelabel.setText(c);
			}
		});
		btnRefresh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRefresh.setBounds(329, 217, 149, 31);
		contentPane.add(btnRefresh);
		
	}
}

