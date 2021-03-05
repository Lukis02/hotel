import datechooser.beans.DateChooserCombo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class hotel extends JFrame {
    private boolean reservas;
    public static Scanner sc = new Scanner(System.in);
    public static String clientes = sc.nextLine();
    private static JCheckBox doble, suite;
    private static JButton aceptar, reiniciar;
    private static DateChooserCombo Entrada;
    private static DateChooserCombo Salida;
    private static JSpinner habs;
    private SpinnerModel habitaciones = new SpinnerNumberModel(4, 4, 15, 1);

    public hotel() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 2));



        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 50, 50));
        Entrada = new DateChooserCombo();
        Salida = new DateChooserCombo();
        p1.add(Entrada, Salida);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4, 2));
        doble = new JCheckBox("Marque si el cliente desea una habitación doble");
        suite = new JCheckBox("Marque si el cliente desea una suite");
        p3.add(doble, suite);

        Entrada = new DateChooserCombo();
        Salida = new DateChooserCombo();
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 2));
        p2.add(Entrada, Salida);
        aceptar = new JButton("confirmar");
        reiniciar = new JButton("reiniciar");
        p2.add(reiniciar, aceptar);


        add(p1);
        add(p2);
        add(p3);
        p1.add(p2);

        setVisible(true);
        setSize(800, 600);
    }

    public static void main(String[] args) {
        hotel ht = new hotel();
        System.out.println(ht);
    }

    private class doble implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (doble.isSelected() == true) {

            }

            }
        }

        private class suite implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (suite.isSelected() == true) {

                }
            }

            private class aceptar implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (aceptar.isSelected() == true) {

                    }
                }

                private class reiniciar implements ActionListener {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (reiniciar.isSelected() == true) {

                        }
                    }
                }

            }
        }
    }


