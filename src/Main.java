/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author catspajamas
 */
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            cadastroVIEW view = new cadastroVIEW();
            view.setVisible(true);
            view.setDefaultCloseOperation(cadastroVIEW.EXIT_ON_CLOSE);
        });
    }
}

