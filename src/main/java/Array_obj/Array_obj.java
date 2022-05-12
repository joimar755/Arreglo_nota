package Array_obj;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array_obj {
    public static void main(String[] args) {
        // Persona p = new Persona();
        int opcion = 0;

        ArrayList<Persona> lista_persona = new ArrayList<Persona>();

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1.Ingresar Dato al Arraylist \n" +
                            "2.Consultar Datos \n" +
                            "3.Ingresar un datos en Posición X \n" +
                            "4.Listar_mujeres \n" +
                            "5.Listar_motores de edad \n" +
                            "6.Actualizar un registro\n" +
                            "7.Eliminar Toda la Lista\n" +
                            "8.Evaluar cuantas veces está repetido el Dato Buscado\n" +
                            "9.Separar Arraylist lista1 nombres 3 letras lista 2 diferentes\n" +
                            "10.Salir\n" +
                            "Ingresar La opcion [1 a 10]",
                    "Menú Arraylist", JOptionPane.QUESTION_MESSAGE));

            switch (opcion) {
                case 1:
                    String nom = JOptionPane.showInputDialog("Digite Nombre");
                    char gen = JOptionPane.showInputDialog("Digite Genero").charAt(0);
                    int ed = Integer.parseInt(JOptionPane.showInputDialog("Digite Edad"));
                    Persona regi = new Persona(nom, gen, ed);
                    lista_persona.add(regi);
                    // System.out.println(dato);
                    break;

                case 2:
                    if (lista_persona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista Vacia");
                    } else {
                        if (lista_persona.isEmpty()) {
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

                            for (int i = 0; i < lista_persona.size(); i++) {
                                JOptionPane.showMessageDialog(null, " " + i + " " + lista.get(i));
                            }
                        }

                    }
                    break;

                case 3:
                    int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite posicion"));
                    if (x <= lista_persona.size()) {
                        nom = JOptionPane.showInputDialog("Digite Nombre");
                        gen = JOptionPane.showInputDialog("Digite Genero").charAt(0);
                        ed = Integer.parseInt(JOptionPane.showInputDialog("Digite Edad"));

                        Persona regix = new Persona(nom, gen, ed);
                        lista_persona.add(x, regix);

                    } else {
                        JOptionPane.showMessageDialog(null, "x es mayor al tamaño de la lista");
                    }

                    break;

                case 4:
                    if (lista_persona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista Vacia");
                    } else {
                        int pos = 0;
                        String salida = "";
                        for (Persona elemento : lista_persona) {
                            if (elemento.getGenero() == 'F') {
                                salida = salida + pos + " ";
                                salida = salida + elemento;
                                salida = salida + "\n";
                                pos = pos + 1;
                            }
                        } // fin for
                        JOptionPane.showMessageDialog(null, "Datos del Arraylist \n" + salida);
                    } // fin si

                    break;

                case 5:
                    if (lista_persona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista Vacia");
                    } else {
                        int pos = 0;
                        String salida = "";
                        for (Persona elemento : lista_persona) {
                            if (elemento.getEdad() > 18) {
                                salida = salida + pos + " ";
                                salida = salida + elemento;
                                salida = salida + "\n";
                                pos = pos + 1;
                            }

                        } // fin for
                        JOptionPane.showMessageDialog(null, "Datos del Arraylist \n" + salida);
                    } // fin si

                    break;

                case 6:
                    String nomx;
                    char genx;
                    int edx;
                    x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite posición"));
                    if (x <= lista_persona.size()) {
                        JOptionPane.showMessageDialog(null, "El dato de posición " + x + " ES " + lista_persona.get(x));
                        int campo = Integer.parseInt(
                                JOptionPane.showInputDialog("Que Campo desea Actualizar 1. Nombre Genero 3 Edad "));
                        switch (campo) {
                            case 1:
                                nomx = JOptionPane.showInputDialog("Digite Nombre");
                                genx = lista_persona.get(x).getGenero();
                                edx = lista_persona.get(x).getEdad();

                                break;

                            case 2:
                                nomx = lista_persona.get(x).getNom();
                                genx = JOptionPane.showInputDialog("Digite Genero").charAt(0);
                                edx = listaPersona.get(x).getEdad();
                                break;

                            case 3:
                                nomx = listaPersona.get(x).getNom();
                                genx = listaPersona.get(x).getGenero();
                                edx = Integer.parseInt(JOptionPane.showInputDialog("Digite Edad"));

                                break;

                            default:
                                throw new AssertionError();
                        }

                        Persona regin = new Persona(nomx, genx, edx);
                        listaPersona.add(x, regin);

                    } else {

                        JOptionPane.showMessageDialog(null, "x es mayor al Tamaño");
                    }

                    break;

                case 7:
                    if (!lista_persona.isEmpty()) {
                        lista_persona.clear();
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista esta vacía");
                    }

                    break;

                case 8:
                    int cont = 0;
                    String datorep = JOptionPane.showInputDialog(null, "Digite dato a Buscar");
                    for (String elemento : lista_persona) {
                        if (elemento.equals(datorep)) {
                            cont = cont + 1;
                        }

                    }
                    JOptionPane.showMessageDialog(null, "El Dato esta repetido " + cont);
                    break;

                case 9:
                    for (String elemento : lista_persona) {
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
