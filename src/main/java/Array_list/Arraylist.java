package Array_list;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Arraylist {
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista1 = new ArrayList<String>();
        ArrayList<String> lista2 = new ArrayList<String>();
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
                                JOptionPane.showMessageDialog(null, " " + i + " " + lista.get(i));
                            }
                        }

                    }
                    break;

                case 3:
                    int x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista.size()) {
                        dato = JOptionPane.showInputDialog(null, "digite dato a agregar");
                        lista.add(x, dato);
                    } else {
                        JOptionPane.showMessageDialog(null, "x es mayor al tamaño de la lista");
                    }

                    break;

                case 4:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista.size()) {
                        JOptionPane.showMessageDialog(null, "El dato de posicion " + x + " ES " + lista.get(x));
                    } else {

                        JOptionPane.showMessageDialog(null, "x es mayor al Tamaño");
                    }

                    break;

                case 5:
                    String datobus = JOptionPane.showInputDialog(null, "Digite dato a Buscar");
                    if (lista.contains(datobus)) {
                        JOptionPane.showMessageDialog(null, "El dato encontrado en la posición"
                                + lista.indexOf(datobus) + " ES " + lista.get(lista.indexOf(datobus)));
                    } else {
                        JOptionPane.showMessageDialog(null, "Dato buscado no encontrado");
                    }

                    break;

                case 6:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite posición"));
                    if (x <= lista.size()) {
                        lista.remove(x);
                        JOptionPane.showMessageDialog(null, "El dato de posición " + x + " FuE Removido");

                    } else {
                        JOptionPane.showMessageDialog(null, "x es mayor al Tamaño");
                    }

                    break;

                case 7:
                    if (!lista.isEmpty()) {
                        lista.clear();
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista esta vacía");
                    }

                    break;

                case 8:
                    int cont = 0;
                    String datorep = JOptionPane.showInputDialog(null, "Digite dato a Buscar");
                    for (String elemento : lista) {
                        if (elemento.equals(datorep)) {
                            cont = cont + 1;
                        }

                    }
                    JOptionPane.showMessageDialog(null, "El Dato esta repetido " + cont);
                    break;

                case 9:
                    for (String elemento : lista) {
                        if (elemento.length() == 3) {
                            lista1.add(elemento);
                        } else {
                            lista2.add(elemento);
                        }
                    }

                    System.out.println("Lista 1 con 3 letras " + lista1);
                    System.out.println("Lista 2 con más 3 letras " + lista2);

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
