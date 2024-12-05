/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentesnew;

import javax.swing.*;

public class ComponentesNew extends JFrame {
    private String[] lista = {"Bueno", "Malo", "Regular"}; // Arreglo para JComboBox
    
    private JTextArea textArea = new JTextArea();
    private ButtonGroup botonGrupo1 = new ButtonGroup();
    private JRadioButton radio1 = new JRadioButton();
    private JRadioButton radio2 = new JRadioButton();
    private JCheckBox check1 = new JCheckBox();
    private JCheckBox check2 = new JCheckBox();
    private JComboBox<String> combolista = new JComboBox<>(lista); // JComboBox con lista inicial

    public ComponentesNew() {
        setTitle("Copiar Pegar");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void AddComponentes(JPanel panel1) {
        // JTextArea
        textArea.setBounds(10, 20, 300, 100);
        panel1.add(textArea);
        
        // ButtonGroup y JRadioButton
        botonGrupo1.add(radio1);
        botonGrupo1.add(radio2);

        radio1.setBounds(10, 130, 80, 30);
        radio1.setText("Radio 1");
        panel1.add(radio1);

        radio2.setBounds(100, 130, 80, 30);
        radio2.setText("Radio 2");
        panel1.add(radio2);
        
        // JCheckBox
        check1.setBounds(10, 170, 80, 30); // Coordenadas especificadas
        check1.setText("Check 1");
        panel1.add(check1);

        check2.setBounds(100, 170, 80, 30); // Coordenadas nuevas
        check2.setText("Check 2");
        panel1.add(check2);

        // JComboBox
        combolista.setBounds(10, 210, 150, 30); // Coordenadas especificadas
        combolista.addItem("Excelente"); // Agregamos un elemento adicional
        panel1.add(combolista);
    }

    public static void main(String[] args) {
        ComponentesNew ventana = new ComponentesNew();
        
        JPanel panel1 = new JPanel(); // Contenedor para agrupar componentes
        panel1.setLayout(null); 
        ventana.getContentPane().add(panel1);

        ventana.AddComponentes(panel1);

        ventana.setVisible(true); // Mostramos la ventana
    }
}
