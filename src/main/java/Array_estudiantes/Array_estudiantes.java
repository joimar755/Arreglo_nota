package Array_estudiantes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array_estudiantes {
    private static final String Estudiantes = null;

    public static void main(String[] args) {
        // Persona p = new Persona();
        int opcion = 0;

        ArrayList<Estudiantes> lista_Estudiantes = new ArrayList<Estudiantes>();

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.Adicionar Estudiante \n" +
                            "2.Mostrar todos los estudiantes \n" +
                            "3.Mostrar el estudiante x \n" +
                            "4.Cambiar la nota estudiante x \n" +
                            "5.Eliminar estudiante x \n" +
                            "6.Eliminar toda la lista\n" +
                            "7.Mostrar lo estudiantes con 3 letras\n" +
                            "8.Generar lista1 y lista2 con notas ganadas y perdidas\n" +
                            "9.Mostrar Notas por una asignatura x\n" +
                            "10.Salir\n" +
                            "Ingresar La opcion [1 a 10]",
                    "Menú Arraylist", JOptionPane.QUESTION_MESSAGE));

            switch (opcion) {
                case 1:
                    int x; // Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision"));

                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo"));
                    String nom = JOptionPane.showInputDialog("Digite Estudiante");
                    String materia = JOptionPane.showInputDialog("Digite Materia");
                    float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite nota"));
                    Estudiantes regi = new Estudiantes(codigo, nom, materia, nota);
                    lista_Estudiantes.add(regi);
                    // System.out.println(dato);
                    // int dato = Integer.parseInt(
                    // JOptionPane.showInputDialog(null, "digite opcion 1 para adicionar"));

                    break;

                case 2:
                    if (lista_Estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista Vacia");
                    } else {
                        if (lista_Estudiantes.isEmpty()) {
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

                            for (int i = 0; i < lista_Estudiantes.size(); i++) {
                                JOptionPane.showMessageDialog(null, " " + i + " " + lista_Estudiantes.get(i));
                            }
                        }

                    }
                    break;

                case 3:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista_Estudiantes.size()) {
                        JOptionPane.showMessageDialog(null,
                                "El dato de posicion " + x + " ES " + lista_Estudiantes.get(x));
                    } else {

                        JOptionPane.showMessageDialog(null, "x es mayor al Tamaño");
                    }
                    /*
                     * int x = Integer.parseInt(JOptionPane.showInputDialog(null,
                     * "Digite posicion"));
                     * if (x <= lista_Estudiantes.size()) {
                     * codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo"));
                     * nom = JOptionPane.showInputDialog("Digite Estudiante");
                     * materia = JOptionPane.showInputDialog("Digite Materia");
                     * nota = Float.parseFloat(JOptionPane.showInputDialog("Digite nota"));
                     * Estudiantes regix = new Estudiantes(codigo, nom, materia, nota);
                     * lista_Estudiantes.add(x, regix);
                     * 
                     * } else {
                     * JOptionPane.showMessageDialog(null, "x es mayor al tamaño de la lista");
                     * }
                     * 
                     * break;
                     */

                case 4:
                    int codigox;
                    String nomx;
                    String materiax;
                    float notax;

                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista_Estudiantes.size()) {

                        JOptionPane.showMessageDialog(null,
                                "El dato de posición " + x + " ES " + lista_Estudiantes.get(x));
                        // actualizar tiempo real
                        notax = lista_Estudiantes.get(x).getNota();
                        codigox = lista_Estudiantes.get(x).getCodigo();
                        nomx = lista_Estudiantes.get(x).getNombre();
                        materiax = lista_Estudiantes.get(x).getMateria();
                        // dato a actulizar
                        notax = Float.parseFloat(
                                JOptionPane.showInputDialog("digite nota" /* + lista_Estudiantes.get(x).getNota()) */));

                        Estudiantes regin = new Estudiantes(codigox, nomx, materiax, notax);
                        lista_Estudiantes.add(x, regin);
                    } else {
                        JOptionPane.showMessageDialog(null, "x es mayor al Tamaño");

                    }

                    break;
                /*
                 * if (lista_Estudiantes.isEmpty()) {
                 * JOptionPane.showMessageDialog(null, "Lista Vacia");
                 * } else {
                 * int pos = 0;
                 * String salida = "";
                 * for (Estudiantes elemento : lista_Estudiantes) {
                 * if (elemento.getMateria() == ) {
                 * salida = salida + pos + " ";
                 * salida = salida + elemento;
                 * salida = salida + "\n";
                 * pos = pos + 1;
                 * }
                 * } // fin for
                 * JOptionPane.showMessageDialog(null, "Datos del Arraylist \n" + salida);
                 * } // fin si
                 * 
                 * break;
                 */

                case 5:
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite pocision "));
                    if (x <= lista_Estudiantes.size()) {
                        lista_Estudiantes.remove(x);
                        JOptionPane.showMessageDialog(null, "el estudiante fue removido");
                    } else {
                        JOptionPane.showMessageDialog(null, "el estudiante no  fue removido");

                    }
                    break;
                /*
                 * if (lista_Estudiantes.isEmpty()) {
                 * JOptionPane.showMessageDialog(null, "Lista Vacia");
                 * } else {
                 * int pos = 0;
                 * String salida = "";
                 * for (Estudiantes elemento : lista_Estudiantes) {
                 * if (elemento.getNota() > 3.0) {
                 * salida = salida + pos + " ";
                 * salida = salida + elemento;
                 * salida = salida + "\n";
                 * pos = pos + 1;
                 * }
                 * 
                 * } // fin for
                 * JOptionPane.showMessageDialog(null, "Datos del Arraylist \n" + salida);
                 * } // fin si
                 * 
                 * break;
                 */
                case 6:
                    if (!lista_Estudiantes.isEmpty()) {
                        lista_Estudiantes.clear();
                    } else {
                        JOptionPane.showMessageDialog(null, "lista esta vacia");

                    }

                    break;
                case 7:
                    for (Estudiantes estudiante : lista_Estudiantes) {
                        if (estudiante.getNombre().length() == 3) {
                            lista_Estudiantes.add(estudiante);
                        }
                    }

                    System.out.println("Lista 1 con 3 letras " + lista_Estudiantes);

                    break;

                case 8:
                    for (Estudiantes estudiante : lista_Estudiantes) {
                        if (estudiante.equals() {
                            lista_Estudiantes.add(estudiante);
                        }
                    }

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
