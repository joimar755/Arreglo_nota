package Array_list;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arraylist {
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<String> lista = new ArrayList<String>();
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.Ingresar Dato al Arraylist \n" +
                            "2.Consultar Datos \n" +
                            "3.Ingresar un datos en Posición X \n" +
                            "4.Mostrar Elemento Posición X \n" +
                            "5.Comprobar si un Dato x está en el Arraylist \n" +
                            "6.Eliminar elemento Posición X del Arraylist\n" +
                            "7.Eliminar Toda la Lista\n" +
                            "8.Evaluar cuantas veces está repetido el Dato Buscado\n" +
                            "9.Separar Arraylist lista1 nombres 3 letras lista 2 diferentes\n" +
                            "10.Salir\n" +
                            "Ingresar La opcion [1 a 10]",
                    "Menú Arraylist", JOptionPane.QUESTION_MESSAGE));

            switch (opcion) {
                case 1:
                    String dato = JOptionPane.showInputDialog(null, "digite datos");
                    lista.add(dato);
                    // System.out.println(dato);
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista Vacia");
                    } else {
                        if (lista.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Lista Vacia");
                        } else {
                            /*
                             * int pos = 0;
                             * String salida = "";
                             * for (String elemento : lista) {
                             * salida = salida + pos + " ";
                             * salida = salida + elemento;
                             * salida = salida + "\n";
                             * pos++;
                             * } // fin for
                             * JOptionPane.showMessageDialog(null, "Datos del Arraylist \n" + salida);
                             */

                            for (int i = 0; i < lista.size(); i++) {
                                JOptionPane.showMessageDialog(null, null + "" + lista.get(i));
                            }
                        }

                    }
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:
                    break;

                case 9:

                    break;

                case 10:
                    System.exit(0);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida\n", "Error Opcion",
                            JOptionPane.WARNING_MESSAGE);
            }

        } while (opcion != 10);

    }
}
