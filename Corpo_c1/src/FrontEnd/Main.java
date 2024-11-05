/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Conexao;
import BackEnd.SQL_Table_Creator;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class Main extends javax.swing.JFrame {

    private Conexao c;
    public Main() {
        initComponents();
        this.c = new Conexao();
        setDados();
    }
    
    private SQL_Table_Creator Table_Creator = null;
    
    private void setDados()
    {
        DefaultTableModel d = (DefaultTableModel) grdAluno.getModel();
        
        while(d.getRowCount()>0)
        {
            d.removeRow(0);
        }
        
        this.c.setResultSet("SELECT * FROM Aluno ORDER BY Matricula");
        try
        {
            if(this.c.getResultSet().first())
            {
                do
                {
                Object[] Linha = {
                    this.c.getResultSet().getString("Matricula"),
                    this.c.getResultSet().getString("Nome"),
                    this.c.getResultSet().getString("Celular")
                };
                
                d.addRow(Linha);
                }
                while(this.c.getResultSet().next());
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, e, "Erro SQL", HEIGHT);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Tabela_Alunos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdAluno = new javax.swing.JTable();
        Label_Nome = new javax.swing.JLabel();
        Aluno_Nome = new javax.swing.JTextField();
        Label_Celular = new javax.swing.JLabel();
        Aluno_Celular = new javax.swing.JFormattedTextField();
        Inserir_Aluno = new javax.swing.JButton();
        Panel_Criar_Tabela = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdTabela = new javax.swing.JTable();
        Label_Nome1 = new javax.swing.JLabel();
        Nome_Tabela = new javax.swing.JTextField();
        Button_Criar_Tabela = new javax.swing.JButton();
        AdicionarColuna = new javax.swing.JButton();
        Not_Null = new javax.swing.JCheckBox();
        Auto_Increment = new javax.swing.JCheckBox();
        Datatype = new javax.swing.JComboBox<>();
        Label_Datatype = new javax.swing.JLabel();
        Nome_Coluna = new javax.swing.JTextField();
        Label_Nome_Coluna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        grdAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(grdAluno);

        Label_Nome.setText("Nome");

        Label_Celular.setText("Celular");

        try {
            Aluno_Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Inserir_Aluno.setText("Inserir");
        Inserir_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserir_AlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tabela_AlunosLayout = new javax.swing.GroupLayout(Tabela_Alunos);
        Tabela_Alunos.setLayout(Tabela_AlunosLayout);
        Tabela_AlunosLayout.setHorizontalGroup(
            Tabela_AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tabela_AlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aluno_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Celular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aluno_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Inserir_Aluno)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(Tabela_AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tabela_AlunosLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Tabela_AlunosLayout.setVerticalGroup(
            Tabela_AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tabela_AlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tabela_AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nome)
                    .addComponent(Aluno_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Celular)
                    .addComponent(Aluno_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inserir_Aluno))
                .addContainerGap(666, Short.MAX_VALUE))
            .addGroup(Tabela_AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tabela_AlunosLayout.createSequentialGroup()
                    .addContainerGap(61, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Aluno", Tabela_Alunos);

        grdTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(149, 154, 160), new java.awt.Color(174, 177, 179)));
        grdTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Column Name", "Datatype", "Not Null", "Auto Increment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(grdTabela);

        Label_Nome1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_Nome1.setText("Nome");

        Nome_Tabela.setText("Nome_Tabela");

        Button_Criar_Tabela.setText("Criar Tabela");

        AdicionarColuna.setText("Adicionar Coluna");
        AdicionarColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarColunaActionPerformed(evt);
            }
        });

        Not_Null.setText("Not Null");

        Auto_Increment.setText("Auto Increment");

        Datatype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Integer", "String", "Float", "Date" }));

        Label_Datatype.setText("Datatype");

        Label_Nome_Coluna.setText("Nome Coluna");

        javax.swing.GroupLayout Panel_Criar_TabelaLayout = new javax.swing.GroupLayout(Panel_Criar_Tabela);
        Panel_Criar_Tabela.setLayout(Panel_Criar_TabelaLayout);
        Panel_Criar_TabelaLayout.setHorizontalGroup(
            Panel_Criar_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Criar_TabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Criar_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_Coluna)
                    .addComponent(Label_Nome_Coluna)
                    .addGroup(Panel_Criar_TabelaLayout.createSequentialGroup()
                        .addComponent(Label_Nome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nome_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Criar_Tabela)))
                .addGap(18, 18, 18)
                .addGroup(Panel_Criar_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Datatype)
                    .addGroup(Panel_Criar_TabelaLayout.createSequentialGroup()
                        .addComponent(Datatype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Not_Null)
                        .addGap(18, 18, 18)
                        .addComponent(Auto_Increment)))
                .addGap(18, 18, 18)
                .addComponent(AdicionarColuna))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        Panel_Criar_TabelaLayout.setVerticalGroup(
            Panel_Criar_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Criar_TabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_Criar_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nome1)
                    .addComponent(Nome_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Criar_Tabela))
                .addGap(50, 50, 50)
                .addGroup(Panel_Criar_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Datatype)
                    .addComponent(Label_Nome_Coluna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_Criar_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdicionarColuna)
                    .addComponent(Not_Null)
                    .addComponent(Auto_Increment)
                    .addComponent(Datatype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome_Coluna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Criar Tabela", Panel_Criar_Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inserir_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserir_AlunoActionPerformed
        c.SQLExecute("INSERT INTO Aluno (Nome,Celular)" +
                "VALUES ("+ "'" + Aluno_Nome.getText() + "'" +" , "
                + "'" + Aluno_Celular.getText() + "'" + ")");
        setDados();
    }//GEN-LAST:event_Inserir_AlunoActionPerformed

    private void AdicionarColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarColunaActionPerformed
        if(Table_Creator == null)
        {
            Table_Creator = new SQL_Table_Creator(Nome_Tabela.getText());
        }
        Table_Creator.Add_Field(Nome_Coluna.getText(), Datatype.getSelectedItem().toString(), Not_Null.isSelected(), Auto_Increment.isSelected());
    }//GEN-LAST:event_AdicionarColunaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarColuna;
    private javax.swing.JFormattedTextField Aluno_Celular;
    private javax.swing.JTextField Aluno_Nome;
    private javax.swing.JCheckBox Auto_Increment;
    private javax.swing.JButton Button_Criar_Tabela;
    private javax.swing.JComboBox<String> Datatype;
    private javax.swing.JButton Inserir_Aluno;
    private javax.swing.JLabel Label_Celular;
    private javax.swing.JLabel Label_Datatype;
    private javax.swing.JLabel Label_Nome;
    private javax.swing.JLabel Label_Nome1;
    private javax.swing.JLabel Label_Nome_Coluna;
    private javax.swing.JTextField Nome_Coluna;
    private javax.swing.JTextField Nome_Tabela;
    private javax.swing.JCheckBox Not_Null;
    private javax.swing.JPanel Panel_Criar_Tabela;
    private javax.swing.JPanel Tabela_Alunos;
    private javax.swing.JTable grdAluno;
    private javax.swing.JTable grdTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}