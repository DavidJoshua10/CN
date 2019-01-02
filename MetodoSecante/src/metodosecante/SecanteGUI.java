package metodosecante;


import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.math.plot.Plot2DPanel;
import org.nfunk.jep.JEP;

/**
 *
 * @author davi
 */
public class SecanteGUI extends javax.swing.JFrame {
    
   Plot2DPanel grafico = new Plot2DPanel(); /* Criação da variável "grafico" para
fazer a chamado para o gráfico. */    
    /**
     * Creates new form SecanteGUI
     */
    public SecanteGUI() {
       initComponents();
       this.setLocationRelativeTo(null);
       grafico.setBounds(35, 250, 570, 400);
       add(grafico);
       setTitle("Método da Secante");
       setIconImage(new ImageIcon(getClass().getResource("/Imagens/Computador.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabelfuncao = new javax.swing.JLabel();
        jLabelx0 = new javax.swing.JLabel();
        jLabelx1 = new javax.swing.JLabel();
        jLabelRaiz = new javax.swing.JLabel();
        jLabelErro = new javax.swing.JLabel();
        jLabelMaxIter = new javax.swing.JLabel();
        funcao = new javax.swing.JTextField();
        x0 = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        raiz = new javax.swing.JTextField();
        erro = new javax.swing.JTextField();
        maxiter = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        inserirdados = new javax.swing.JButton();
        limpardados = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imprimeIteracoes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        numIteracoes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelfuncao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelfuncao.setText("Função:");

        jLabelx0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelx0.setText("X0:");

        jLabelx1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelx1.setText("X1:");

        jLabelRaiz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRaiz.setText("Raíz:");

        jLabelErro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelErro.setText("Erro:");

        jLabelMaxIter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMaxIter.setText("Max:");

        funcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoActionPerformed(evt);
            }
        });

        x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x0ActionPerformed(evt);
            }
        });

        raiz.setEditable(false);
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        erro.setEditable(false);
        erro.setText("1e-3");

        maxiter.setEditable(false);
        maxiter.setText("100");
        maxiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxiterActionPerformed(evt);
            }
        });

        calcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Computador.png"))); // NOI18N
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        inserirdados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inserirdados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/InsertData.png"))); // NOI18N
        inserirdados.setText("Inserir Dados");
        inserirdados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirdadosActionPerformed(evt);
            }
        });

        limpardados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        limpardados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RemoveData.png"))); // NOI18N
        limpardados.setText("Limpar Dados");
        limpardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpardadosActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exit.png"))); // NOI18N
        sair.setText("Sair");
        sair.setMaximumSize(new java.awt.Dimension(171, 58));
        sair.setMinimumSize(new java.awt.Dimension(171, 58));
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRaiz)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelfuncao)
                            .addComponent(jLabelx0, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelErro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelx1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabelMaxIter, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(funcao)
                            .addComponent(x0)
                            .addComponent(x1)
                            .addComponent(erro)
                            .addComponent(maxiter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inserirdados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limpardados, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelfuncao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelx0)
                            .addComponent(x0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelx1)
                            .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelErro)
                            .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMaxIter)
                            .addComponent(maxiter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRaiz))
                        .addContainerGap(387, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inserirdados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpardados, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        imprimeIteracoes.setColumns(20);
        imprimeIteracoes.setRows(5);
        jScrollPane1.setViewportView(imprimeIteracoes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Número de Iterações:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numIteracoes)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numIteracoes)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.getAccessibleContext().setAccessibleName("Autor: Davi Josue Palmas ");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x0ActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raizActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void limpardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpardadosActionPerformed
       funcao.setText(" "); // Limpa os dados do campo Função;
       x0.setText(" "); // Limpa os dados do campo X0;
       x1.setText(" "); // Limpa os dados do campo X1;
       raiz.setText(" "); // Limpa os dados do campo raiz
    }//GEN-LAST:event_limpardadosActionPerformed

    private void inserirdadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirdadosActionPerformed
       panel.setEnabled(true); // Habilita o painel;
       jLabelfuncao.setEnabled(true);
       funcao.setEnabled(true); // Habilita campo para inserir uma função;
       jLabelx0.setEnabled(true);
       x0.setEnabled(true); // Habilita campo para inserir parâmetro "x0";
       jLabelx1.setEnabled(true);
       x1.setEnabled(true); // Habilita campo para inserir parâmetro "x1";
       calcular.setEnabled(true); // Habilita botão calcular;
       limpardados.setEnabled(true); // Habilita botão limpar dados
    }//GEN-LAST:event_inserirdadosActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
       Secante m = new Secante();
        m.apagarIteracoes();// nós chamamos o método que apaga todos os elementos da última iteração
        try {
            JEP j = new JEP();
            j.addStandardConstants();
            j.addStandardFunctions();


            String def = funcao.getText();

            j.parseExpression(x0.getText());// conversão da expressão inserida no campo x0
            double lx0 = j.getValue();

            j.parseExpression(x1.getText());// conversão da expressão inserida no campo x1
            double lx1 = j.getValue();

            j.parseExpression(erro.getText());// conversão da expressão inserida no campo tolerancia
            double tolerancia = j.getValue();

            int ln = Integer.parseInt(maxiter.getText());// conversão da expressão inserida no campo de máximo de iterações

            Funcao f = new Funcao(def);
            Secante s = new Secante();
            double r = s.raiz(f, lx0, lx1, ln, tolerancia);
            raiz.setText(Double.toString(r));

            // representação gráfica da função 
            // Matrizes usadas para armazenar uma partição em um intervalo no qual a função digitada é definida
            double x[] = new double[200];
            double y[] = new double[200];

            double xi = lx0-10;// variável usada para pontos dentro da partição
            for (int i = 0; i < 200; i++) {
                x[i] = xi + i * 0.1; // nós armazenamos valores xi que serão avaliados na função digitada, ou seja f (xi)

                JEP funcionx_h = new JEP();
                funcionx_h.addStandardFunctions(); // adiciona as funções matemáticas
                funcionx_h.addStandardConstants(); // adiciona as constantes matemáticas
                funcionx_h.setImplicitMul(true);
                funcionx_h.addVariable("x", x[i]);// nós avaliamos a função inserida no ponto xi
                // obtém o resultado de avaliar a expressão
                funcionx_h.parseExpression(def); // etapa da expressão a ser avaliada
                String inde=Double.toString(funcionx_h.getValue());// variável usada para representar assíntotas no gráfico de f(x)
                        if ( inde.equals("NaN") || inde.equals("-Infinity") || inde.equals("Infinity") ) {
                            
                        }else  {
                            y[i] = funcionx_h.getValue();// nós armazenamos o valor f(xi) na matriz e
                        }

            }
            grafico.addLegend("SOUTH");
            grafico.removeAllPlots(); // apagar o grafico anterior
            grafico.addLinePlot(def, x, y);// aderimos ao gráfico o nome da função para rencontrar a raiz e os pontos que serão utilizados para obter o grafo f (x)


            numIteracoes.setText("");
            imprimeIteracoes.setText("");
            ArrayList iteracoes = new ArrayList();
            iteracoes = Secante.getIteracoes();
            numIteracoes.setText(Integer.toString(iteracoes.size() - 1));// mostra o número de iterações realizadas
            // mostra todas as iterações feitas
            for (int i = 1; i < iteracoes.size(); i++) {

                imprimeIteracoes.append("x" + (i + 1) + "=" + iteracoes.get(i) + "\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO NA LEITURA DE DADOS","Mensagem de erro",JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_calcularActionPerformed

    private void funcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoActionPerformed
       funcao = new JTextField(12);
       funcao.setHorizontalAlignment(funcao.RIGHT);
    }//GEN-LAST:event_funcaoActionPerformed

    private void maxiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxiterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxiterActionPerformed

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
            java.util.logging.Logger.getLogger(SecanteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecanteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecanteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecanteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecanteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JTextField erro;
    private javax.swing.JTextField funcao;
    private javax.swing.JTextArea imprimeIteracoes;
    private javax.swing.JButton inserirdados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelErro;
    private javax.swing.JLabel jLabelMaxIter;
    private javax.swing.JLabel jLabelRaiz;
    private javax.swing.JLabel jLabelfuncao;
    private javax.swing.JLabel jLabelx0;
    private javax.swing.JLabel jLabelx1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpardados;
    private javax.swing.JTextField maxiter;
    private javax.swing.JTextField numIteracoes;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField raiz;
    private javax.swing.JButton sair;
    private javax.swing.JTextField x0;
    private javax.swing.JTextField x1;
    // End of variables declaration//GEN-END:variables
}
