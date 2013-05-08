/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author beirith
 */
public class Calculadora extends javax.swing.JPanel implements java.beans.Customizer {

    private final int MAX_INPUT_LENGTH = 20;
    private final int INPUT_MODE = 0;
    private final int RESULT_MODE = 1;
    private final int ERROR_MODE = 2;
    private int displayMode;
    private boolean clearOnNextDigit, percent, calcPanelVisible;
    private double lastNumber, valor;
    private String lastOperator;
    private JButton jbnButtons[];
    private JPanel jplMaster, jplBackSpace, jplControl;
    private Object bean;

    public Calculadora() {
        initComponents();
        defineButtons();

    }

    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jTextFieldVisor = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonSubtracao = new javax.swing.JButton();
        jButtonPorcentagem = new javax.swing.JButton();
        jButtonSoma = new javax.swing.JButton();
        jButtonDecimal = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jlbOutput = new javax.swing.JLabel();

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonMultiplicacao.setText("*");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonDivisao.setText("/");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonSubtracao.setText("-");
        jButtonSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonPorcentagem.setText("%");
        jButtonPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonSoma.setText("+");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonDecimal.setText(".");
        jButtonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClicado(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldVisor)
                        .addGap(18, 18, 18)
                        .addComponent(jlbOutput))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButtonDivisao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButtonMultiplicacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButtonSubtracao))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(jButtonPorcentagem)
                    .addComponent(jButtonSoma)
                    .addComponent(jButtonDecimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgual)
                    .addComponent(jButtonLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void defineButtons() {
        jbnButtons = new JButton[18];

        // Criar botoes numericos
        jButton0 = new JButton("0");
        jButton1 = new JButton("1");
        jButton2 = new JButton("2");
        jButton3 = new JButton("3");
        jButton4 = new JButton("4");
        jButton5 = new JButton("5");
        jButton6 = new JButton("6");
        jButton7 = new JButton("7");
        jButton8 = new JButton("8");
        jButton9 = new JButton("9");

        jbnButtons[0] = jButton0;
        jbnButtons[1] = jButton1;
        jbnButtons[2] = jButton2;
        jbnButtons[3] = jButton3;
        jbnButtons[4] = jButton4;
        jbnButtons[5] = jButton5;
        jbnButtons[6] = jButton6;
        jbnButtons[7] = jButton7;
        jbnButtons[8] = jButton8;
        jbnButtons[9] = jButton9;

        // Criar botoes de operacao
        jButtonDecimal = new JButton(".");
        jButtonIgual = new JButton("=");
        jButtonDivisao = new JButton("/");
        jButtonMultiplicacao = new JButton("*");
        jButtonSubtracao = new JButton("-");
        jButtonSoma = new JButton("+");
        jButtonPorcentagem = new JButton("%");
        jButtonLimpar = new JButton("Limpar");

        jbnButtons[10] = jButtonDecimal;
        jbnButtons[11] = jButtonIgual;
        jbnButtons[12] = jButtonDivisao;
        jbnButtons[13] = jButtonMultiplicacao;
        jbnButtons[14] = jButtonSubtracao;
        jbnButtons[15] = jButtonSoma;
        jbnButtons[16] = jButtonPorcentagem;
        jbnButtons[17] = jButtonLimpar;
    }

    public void setDisplayString(String s) {
        jTextFieldVisor.setText(s);
    }

    public String getDisplayString() {
        return jTextFieldVisor.getText();
    }

    public void addDigitToDisplay(int digit) {
        if (clearOnNextDigit) {
            setDisplayString("");
        }

        String inputString = getDisplayString();

        if (inputString.indexOf("0") == 0) {
            inputString = inputString.substring(1);
        }

        if ((!inputString.equals("0") || digit > 0) && inputString.length() < MAX_INPUT_LENGTH) {
            setDisplayString(inputString + digit);
        }


        displayMode = INPUT_MODE;
        clearOnNextDigit = false;
    }

    public void addDecimalPoint() {
        displayMode = INPUT_MODE;

        if (clearOnNextDigit) {
            setDisplayString("");
        }

        String inputString = getDisplayString();

        // If the input string already contains a decimal point, don't
        //  do anything to it.
        if (inputString.indexOf(".") < 0) {
            setDisplayString(new String(inputString + "."));
        }
    }

    public void clearAll() {
        setDisplayString("0");
        lastOperator = "0";
        lastNumber = 0;
        displayMode = INPUT_MODE;
        clearOnNextDigit = true;
    }

    public double getNumberInDisplay() {
        String input = jTextFieldVisor.getText();
        return Double.parseDouble(input);
    }

    public void processOperator(String op) {
        if (displayMode != ERROR_MODE) {
            double numberInDisplay = getNumberInDisplay();

            if (!lastOperator.equals("0")) {
                double result = processLastOperator();
                displayResult(result);
                lastNumber = result;

            } else {
                lastNumber = numberInDisplay;
            }

            clearOnNextDigit = true;
            lastOperator = op;
        }
    }

    public double processLastOperator() {
        double result = 0;
        double numberInDisplay = getNumberInDisplay();

        if (lastOperator.equals("/")) {
            if (numberInDisplay == 0) {
                JOptionPane.showMessageDialog(null, "Exeção: Divisão por zero!");
            }

            result = lastNumber / numberInDisplay;
        }

        if (lastOperator.equals("*")) {
            result = lastNumber * numberInDisplay;
        }

        if (lastOperator.equals("-")) {
            result = lastNumber - numberInDisplay;
        }

        if (lastOperator.equals("+")) {
            result = lastNumber + numberInDisplay;
        }

        return result;
    }

    void processEquals() {
        double result = 0;

        if (displayMode != ERROR_MODE) {
            result = processLastOperator();
            displayResult(result);
            lastOperator = "0";
        }
    }

    public void displayResult(double result) {
        setDisplayString(Double.toString(result));
        lastNumber = result;
        displayMode = RESULT_MODE;
        clearOnNextDigit = true;
    }

    private void botaoClicado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClicado
        double result = 0;
        for (int i = 0; i < jbnButtons.length; i++) {
            if (evt.getSource() == jbnButtons[i]) {
                switch (i) {
                    case 0:
                        addDigitToDisplay(i);
                        break;

                    case 1:
                        addDigitToDisplay(i);
                        break;

                    case 2:
                        addDigitToDisplay(i);
                        break;

                    case 3:
                        addDigitToDisplay(i);
                        break;

                    case 4:
                        addDigitToDisplay(i);
                        break;

                    case 5:
                        addDigitToDisplay(i);
                        break;

                    case 6:
                        addDigitToDisplay(i);
                        break;

                    case 7:
                        addDigitToDisplay(i);
                        break;

                    case 8:
                        addDigitToDisplay(i);
                        break;

                    case 9:
                        addDigitToDisplay(i);
                        break;


                    case 10:	// decimal
                        addDecimalPoint();
                        break;

                    case 11:	// igual
                        processEquals();
                        break;

                    case 12:	// divisao
                        processOperator("/");
                        break;

                    case 13:	// multiplicacao
                        processOperator("*");
                        break;

                    case 14:	// subtracao
                        processOperator("-");
                        break;

                    case 15:	// soma
                        processOperator("+");
                        break;

                    case 16:	// %
                        if (displayMode != ERROR_MODE) {
                            try {
                                result = getNumberInDisplay() / 100;
                                displayResult(result);
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Entrada inválida!");
                                displayMode = ERROR_MODE;
                            }
                        }
                        break;

                    case 17:	// Limpar
                        clearAll();
                        break;
                }
            }
        }
    }//GEN-LAST:event_botaoClicado
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDecimal;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonPorcentagem;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtracao;
    private javax.swing.JTextField jTextFieldVisor;
    private javax.swing.JLabel jlbOutput;
    // End of variables declaration//GEN-END:variables
}
